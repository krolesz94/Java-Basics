package com.Asd0cska;


import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class Counter extends javax.swing.JFrame {

    //Declaring variables
    private javax.swing.JButton but_Show;
    private javax.swing.JMenu jMenu1; //File
    private javax.swing.JMenu jMenu2; //Edit
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1; //Exit
    private javax.swing.JMenuItem jMenuItem2; //Load
    private javax.swing.JMenuItem jMenuItem3; //Save
    private javax.swing.JMenuItem jMenuItem4; //Create file
    private javax.swing.JMenuItem jMenuItem5; //Timer
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_Hours;
    private javax.swing.JLabel lb_Minutes;
    private javax.swing.JLabel lb_Seconds;
    private javax.swing.JLabel lb_Sum;
    private javax.swing.JLabel lb_Description;
    private javax.swing.JList<String> ll_MinutesList;
    private javax.swing.JList<String> ll_SecondsList;
    private javax.swing.JTextField tf_HoursText;
    private javax.swing.JTextField tf_Description;

    int currentHours = 0;
    int currentMinutes;
    int currentSeconds;
    int oldHours;
    int oldMinutes;
    int oldSeconds;
    int newHours;
    int newMinutes;
    int newSeconds;

    String hoursString;
    String minutesString;
    String secondsString;
    private String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator + "Counter" + File.separator;

    //Create constructor
    public Counter() {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2); //Center of the display

        initComponents();

        lb_Hours.setText("Hours");
        lb_Minutes.setText("Minutes");
        lb_Seconds.setText("Seconds");
        lb_Sum.setText("");

        but_Show.setText("Submit");

        ll_MinutesList.setSelectedIndex(0);
        ll_SecondsList.setSelectedIndex(0);

        File file = new File(path + "Counter.txt");

        if (!file.exists()){
            lb_Sum.setText("00:00:00");
        } else {
            loadData();
        }
    }

    public String getPath() {
        return path;
    }

    public int getOldHours() {
        return oldHours;
    }

    public int getOldMinutes() {
        return oldMinutes;
    }

    public int getOldSeconds() {
        return oldSeconds;
    }

    //Define JFrame and set Button, Menu Items, Labels and List including the contents
    private void initComponents() {

        but_Show = new javax.swing.JButton();

        lb_Minutes = new javax.swing.JLabel();
        lb_Seconds = new javax.swing.JLabel();
        lb_Hours = new javax.swing.JLabel();
        lb_Sum = new javax.swing.JLabel();
        lb_Description = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();

        ll_MinutesList = new javax.swing.JList<>();
        ll_SecondsList = new javax.swing.JList<>();

        tf_HoursText = new javax.swing.JTextField();
        tf_Description = new javax.swing.JTextField();

        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Counter");
        setResizable(false);
        setUndecorated(true);
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);

        but_Show.setText("jButton1");
        but_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_ShowActionPerformed(evt);
            }
        });

        lb_Minutes.setText("jLabel1");

        lb_Seconds.setText("jLabel2");

        lb_Hours.setText("jLabel3");

        lb_Description.setText("Title");

        ll_MinutesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ll_MinutesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ll_MinutesList);

        ll_SecondsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ll_SecondsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ll_SecondsList);

        tf_HoursText.setText("0");
        tf_Description.setText("UnNamed");

        lb_Sum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Sum.setText("jLabel4");
        lb_Sum.setToolTipText("Summary of spent hours");

        jMenu1.setText("File");

        jMenuItem4.setText("Create file");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Load");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setText("Timer");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });

        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 46, Short.MAX_VALUE)
                                .addComponent(but_Show)
                                .addGap(41, 41, 41))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lb_Sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lb_Hours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lb_Minutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lb_Seconds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(lb_Description, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                                        .addComponent(tf_HoursText)
                                                        .addComponent(tf_Description))))
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tf_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lb_Description))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_Hours)
                                        .addComponent(tf_HoursText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(lb_Minutes, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(lb_Seconds, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lb_Sum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(but_Show)
                                .addGap(25, 25, 25))
        );


        pack();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {

        int confirmed = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit the program?",
                "Exit Program",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if (confirmed == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        loadData();
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        saveData();
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt){
        createFile();
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt){
        Counter counter = new Counter();
        counter.setVisible(false);

        Timer timer = new Timer();
        timer.setVisible(true);
    }

    private void but_ShowActionPerformed(java.awt.event.ActionEvent evt) {

        //loadData();
        try {
            if (tf_HoursText.getText() == null) {
                currentHours = 0;
            } else {
                currentHours = parseInt(tf_HoursText.getText());
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "You can use only numbers", "Wrong input", JOptionPane.WARNING_MESSAGE);
        }

        currentMinutes = ll_MinutesList.getSelectedIndex();
        currentSeconds = ll_SecondsList.getSelectedIndex();

        currentHours += oldHours;
        currentMinutes += oldMinutes;
        currentSeconds += oldSeconds;

        if(currentMinutes >= 60) {
            currentHours += 1;
            currentMinutes = 0;
        }

        if(currentSeconds >= 60 ) {
            currentMinutes += 1;
            currentSeconds = 0;
        }

        hoursString = String.valueOf(currentHours);
        minutesString = String.valueOf(currentMinutes);
        secondsString = String.valueOf(currentSeconds);

       lb_Sum.setText(currentHours + ":" + currentMinutes + ":" +currentSeconds);

        //saveData();
    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Counter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Counter().setVisible(true);
            }
        });
    }

    //Store data into txt
    public void saveData () {

        newHours = currentHours;
        newMinutes = currentMinutes;
        newSeconds = currentSeconds;

        String newHoursText;
        String newMinutesText;
        String newSecondsText;

        if (newHours < 10){
            newHoursText = "0" + newHours;
        } else {
            newHoursText = String.valueOf(newHours);
        }

        if (newMinutes < 10) {
            newMinutesText = "0" + newMinutes;
        } else {
            newMinutesText = String.valueOf(newMinutes);
        }

        if (newSeconds < 10) {
            newSecondsText = "0" + newSeconds;
        } else {
            newSecondsText = String.valueOf(newSeconds);
        }

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());

        String content = newHoursText + ":" + newMinutesText + ":" + newSecondsText + " - " + tf_Description.getText() + " | " + formatter.format(date);

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter out = null;

        try {
            fw = new FileWriter(path + "Counter.txt", true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            out.println(content);

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null)
                out.close();
        }
    }

    public void loadData(){

        String fileName = path + "Counter.txt";

        StringBuilder contentBuilder = new StringBuilder();

        String lastLine = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
                lastLine = sCurrentLine;
            }

            if (!lastLine.substring(0, 2).trim().equals(null) || !lastLine.substring(0, 2).trim().equals("00")) {
                oldHours = parseInt(lastLine.substring(0, 2).trim());
            } else {
                oldHours = 0;
            }

            if (!lastLine.substring(3, 5).trim().equals(null) || !lastLine.substring(3, 5).trim().equals("00")){
                oldMinutes = parseInt(lastLine.substring(3, 5).trim());
            } else {
                oldMinutes = 0;
            }

            if (!lastLine.substring(6, 8).trim().equals(null) || !lastLine.substring(6, 8).trim().equals("00")){
                oldSeconds = parseInt(lastLine.substring(6, 8).trim());
            } else {
                oldSeconds = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(newHours + ":" + newMinutes + ":" + newSeconds);
        lb_Sum.setText(newHours + ":" + newMinutes + ":" + newSeconds);
    }

    public void createFile (){
        File customDir = new File(path);
        File file = new File(path + "Counter.txt");

        String content = "00:00:00";

        FileOutputStream fop = null;

        if (customDir.exists()){
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()){
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        try {
            fop = new FileOutputStream(file);

            if (!file.exists())
                file.createNewFile();

            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);

            fop.flush();
            fop.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
