package com.Asd0cska;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer extends javax.swing.JFrame{

    private javax.swing.JButton but_Reset;
    private javax.swing.JButton but_Start;
    private javax.swing.JButton but_Stop;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel lb_swDescription;
    private javax.swing.JLabel lb_swHours;
    private javax.swing.JLabel lb_swMinutes;
    private javax.swing.JLabel lb_swSeconds;
    private javax.swing.JTextField tf_swDescription;

    private static int milliseconds = 0;
    private static int seconds = 0;
    private static int minutes = 0;
    private static int hours = 0;

    private static boolean state = true;

    private String path;

    int storeHours;
    int storeMinutes;
    int storeSeconds;

    public Timer () {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2); //Center of the display

        initComponents();
    }

    public void setPath(String path) {
        this.path = path;
    }

    private void initComponents() {

        lb_swHours = new javax.swing.JLabel();
        lb_swMinutes = new javax.swing.JLabel();
        lb_swSeconds = new javax.swing.JLabel();
        lb_swDescription = new javax.swing.JLabel();

        but_Start = new javax.swing.JButton();
        but_Stop = new javax.swing.JButton();
        but_Reset = new javax.swing.JButton();

        tf_swDescription = new javax.swing.JTextField();

        jMenuBar = new javax.swing.JMenuBar();

        jMenu1 = new javax.swing.JMenu(); //File
        jMenu2 = new javax.swing.JMenu(); //Edit

        jMenuItem1 = new javax.swing.JMenuItem(); //Exit
        jMenuItem2 = new javax.swing.JMenuItem(); //Counter
        jMenuItem3 = new javax.swing.JMenuItem(); //Save

        setTitle("Timer");
        setResizable(false);
        setUndecorated(true);
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);

        lb_swHours.setFont(new java.awt.Font("Magneto", 0, 36));
        lb_swHours.setText("00 : ");

        lb_swMinutes.setFont(new java.awt.Font("Magneto", 0, 36));
        lb_swMinutes.setText("00 : ");

        lb_swSeconds.setFont(new java.awt.Font("Magneto", 0, 36));
        lb_swSeconds.setText("00 ");

        but_Start.setFont(new java.awt.Font("Serif", 0, 18));
        but_Start.setText("Start");
        but_Start.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_StartActionPerformed(evt);
            }
        });

        but_Stop.setFont(new java.awt.Font("Serif",0,18));
        but_Stop.setText("Stop");
        but_Stop.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                but_StopActionPerformed(evt);
            }
        });

        but_Reset.setFont(new java.awt.Font("Serif", 0,18));
        but_Reset.setText("Reset");
        but_Reset.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                but_ResetActionPerformed(evt);
            }
        });

        lb_swDescription.setText("Title");

        tf_swDescription.setText("UnNamed");

        jMenu1.setText("File");

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem1.setText("Counter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar.add(jMenu2);
        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lb_swHours)
                                                        .addComponent(but_Start))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lb_swMinutes)
                                                        .addComponent(but_Stop))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(but_Reset)
                                                        .addComponent(lb_swSeconds)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lb_swDescription)
                                                .addGap(27, 27, 27)
                                                .addComponent(tf_swDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_swDescription)
                                        .addComponent(tf_swDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_swHours, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lb_swMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lb_swSeconds, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(but_Start)
                                        .addComponent(but_Stop)
                                        .addComponent(but_Reset))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        pack();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        Counter counter = new Counter();
        counter.setVisible(true);

        Timer timer = new Timer();
        timer.setVisible(false);
        dispose();
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt){
        Counter counter = new Counter();
        path = counter.getPath();

        counter.loadData();

        int newHours = counter.getOldHours() + hours;
        int newMinutes = counter.getOldMinutes() + minutes;
        int newSeconds = counter.getOldSeconds() + seconds;

        if (newSeconds > 60) {
            newSeconds = 0;
            newMinutes++;
        }

        if (newMinutes > 60) {
            newMinutes = 0;
            newHours++;
        }

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

        String content =  newHoursText + ":" + newMinutesText + ":" + newSecondsText + " - " + tf_swDescription.getText() + " | " + formatter.format(date) + "\n";

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

    private void but_StartActionPerformed(java.awt.event.ActionEvent evt) {
        state = true;

        Thread t = new Thread(){
            public void run(){
                for (;;){
                    if (state == true){
                        try{
                            sleep(1);

                            if (milliseconds > 1000) {
                                milliseconds = 0;
                                seconds++;
                            }

                            if (seconds > 60){
                                seconds = 0;
                                minutes++;
                            }

                            if (minutes > 60){
                                minutes = 0;
                                hours++;
                            }

                            milliseconds++;

                            if (seconds < 10){
                                lb_swSeconds.setText("0" + seconds + "");
                            } else {
                                lb_swSeconds.setText(seconds + "");
                            }

                            if (minutes < 10){
                                lb_swMinutes.setText("0" + minutes + " : ");
                            } else {
                                lb_swMinutes.setText(minutes + " : ");
                            }

                            if (hours < 10){
                                lb_swHours.setText("0" + hours + " : ");
                            } else {
                                lb_swHours.setText(hours + " : ");
                            }



                        } catch (Exception e){

                        }
                    } else {
                        break;
                    }
                }
            }
        };

        t.start();
    }

    private void but_StopActionPerformed(java.awt.event.ActionEvent evt) {
        state = false;

        storeHours = hours;
        storeMinutes = minutes;
        storeSeconds = seconds;
    }

    private void but_ResetActionPerformed(java.awt.event.ActionEvent evt) {
        state = false;

        milliseconds = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;

        lb_swHours.setText("00 : ");
        lb_swMinutes.setText("00 : ");
        lb_swSeconds.setText("00");
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
                new Timer().setVisible(true);
            }
        });
    }

}
