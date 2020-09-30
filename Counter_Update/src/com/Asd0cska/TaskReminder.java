package com.Asd0cska;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskReminder {

    static String name = "";
    static String time = "";
    static String task1 = "";
    static String task2 = "";
    static String task3 = "";
    static String task4 = "";

    static SystemTrayClass systemTrayClass = new SystemTrayClass();
    static boolean isActive = systemTrayClass.isActive();

    public TaskReminder() {
        do {
            readXMLFile();
        } while (systemTrayClass.isActive());
    }

    public static void main(String[] args) {
        //
    }

    public static void readXMLFile(){
        while(isActive){

            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            Date date = new Date();

            try{
                File xmlFile = new File("C:\\Users\\RolandKancsal\\IdeaProjects\\Java-Projects\\Counter\\src\\res\\tasks.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);

                doc.getDocumentElement().normalize();

                System.out.println("Title: " + doc.getDocumentElement().getNodeName());

                NodeList nList = doc.getElementsByTagName("task");
                System.out.println("--------------------------------");

                for (int temp = 0; temp < nList.getLength(); temp++) {

                    Node nNode = nList.item(temp);

                    System.out.println("\nCurrent Task: " + nNode.getNodeName());

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;

                        if (eElement.getElementsByTagName("time").item(0).getTextContent() == dateFormat.format(date)) {
                            name = eElement.getElementsByTagName("name").item(0).getTextContent();
                            time = eElement.getElementsByTagName("time").item(0).getTextContent();

                            if (!eElement.getElementsByTagName("subtask1").item(0).getTextContent().equals("")) {
                                task1 = "- " + eElement.getElementsByTagName("subtask1").item(0).getTextContent() + "\n";

                                if (!eElement.getElementsByTagName("subtask2").item(0).getTextContent().equals("")) {
                                    task2 = task1 + "- " + eElement.getElementsByTagName("subtask2").item(0).getTextContent() + "\n";
                                } else {
                                    task1 = "- " + eElement.getElementsByTagName("subtask1").item(0).getTextContent() + "\n";
                                }

                                if (!eElement.getElementsByTagName("subtask3").item(0).getTextContent().equals("")) {
                                    task3 = task2 + "- " + eElement.getElementsByTagName("subtask3").item(0).getTextContent() + "\n";
                                } else {
                                    task2 = task1 + "- " + eElement.getElementsByTagName("subtask2").item(0).getTextContent() + "\n";
                                }

                                if (!eElement.getElementsByTagName("subtask4").item(0).getTextContent().equals("")) {
                                    task4 = task3 + "- " + eElement.getElementsByTagName("subtask4").item(0).getTextContent();
                                    System.out.println(task4);
                                } else {
                                    task3 = task2 + "- " + eElement.getElementsByTagName("subtask3").item(0).getTextContent() + "\n";
                                }
                            }
                        }
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
