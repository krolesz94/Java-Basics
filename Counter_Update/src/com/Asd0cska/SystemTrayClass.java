package com.Asd0cska;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;


public class SystemTrayClass {

    static TrayIcon trayIcon;
    final SystemTray tray = SystemTray.getSystemTray();

    private boolean isActive;

    boolean state = false;
    CheckboxMenuItem task = new CheckboxMenuItem("Task", state);

    public SystemTrayClass(){
        show();
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void show() {
        if (!SystemTray.isSupported()) {
            System.exit(0);
        }

        trayIcon = new TrayIcon(CreateIcon("/res/notebook.png", "Icon"));
        trayIcon.setToolTip("Counter v2.1");

        try{
            tray.add(trayIcon);
        } catch (AWTException e){
            e.printStackTrace();
        }

        final PopupMenu menu = new PopupMenu();


        task.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                isActive = true;
                if (e.getStateChange() == ItemEvent.SELECTED){
//                    TaskReminder taskReminder = new TaskReminder();
                    System.out.println("Checked");
                }else {
                    System.out.println("Dechecked");
                    isActive = false;
                }
            }
        });

        MenuItem counter = new MenuItem("Counter");
        counter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counterActionPerformed(evt);
            }
        });

        MenuItem stopWatch = new MenuItem("Stop Watch");
        stopWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopWatchActionPerformed(evt);
            }
        });

        MenuItem about = new MenuItem("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        MenuItem exit = new MenuItem("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        menu.add(task);
        menu.add(counter);
        menu.add(stopWatch);
        menu.add(about);
        menu.addSeparator();
        menu.add(exit);


        trayIcon.setPopupMenu(menu);


    }

    protected static Image CreateIcon(String path, String desc) {
        URL imageURL = SystemTrayClass.class.getResource(path);
        return (new ImageIcon(imageURL, desc)).getImage();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {

        int confirmed = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit the program?",
                "Exit Program",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (confirmed == JOptionPane.YES_OPTION) {
            tray.remove(trayIcon);
            System.exit(0);
        }
    }

    private void counterActionPerformed(java.awt.event.ActionEvent evt) {
        Counter counter = new Counter();
        counter.setVisible(true);
    }

    private void stopWatchActionPerformed(java.awt.event.ActionEvent evt) {
        Timer timer = new Timer();
        timer.setVisible(true);
    }

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Operation helper v2.1 \nAuthor by: \nKancsal Roland");
    }

    public static void main(String[] args){
        SystemTrayClass tray = new SystemTrayClass();
    }
}
