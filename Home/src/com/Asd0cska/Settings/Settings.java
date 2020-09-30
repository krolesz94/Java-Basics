package com.Asd0cska.Settings;

import com.Asd0cska.Home.Home;

import javax.swing.*;

public class Settings extends javax.swing.JFrame {

    private javax.swing.JRadioButton Celsius;
    private javax.swing.JComboBox City;
    private javax.swing.JRadioButton Fahrenheit;
    private javax.swing.JLabel SaveBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    private String location;
    private String unitDegree;

    public Settings() {
        initComponents();
        location = "Budapest";
        unitDegree = "c";
    }

    private void initComponents() {

        SaveBt = new javax.swing.JLabel();
        City = new javax.swing.JComboBox();
        Celsius = new javax.swing.JRadioButton();
        Fahrenheit = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(690, 450));
        setMinimumSize(new java.awt.Dimension(690, 450));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(690, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SaveBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/saveBtn.png"))); // NOI18N
        SaveBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBtMouseExited(evt);
            }

            public void mousePressed(java.awt.event.MouseEvent evt) {
                SaveBtMousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SaveBtMouseReleased(evt);
            }
        });
        getContentPane().add(SaveBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 210, -1));

        City.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        City.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Budapest", "Bukarest", "Bécs"}));
        getContentPane().add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 280, 60));

        Celsius.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/Cel.png"))); // NOI18N
        Celsius.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CelsiusMouseClicked(evt);
            }
        });
        getContentPane().add(Celsius, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        Fahrenheit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/Far.png"))); // NOI18N
        Fahrenheit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FahrenheitMouseClicked(evt);
            }
        });
        getContentPane().add(Fahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/closeBtn.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/minimizeBtn.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/window.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 702, -1));

        pack();
        setLocationRelativeTo(null);
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        this.setState(this.ICONIFIED);
    }

    private void CelsiusMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Celsius Option Selected", "Option Clicked"
                , JOptionPane.WARNING_MESSAGE);
        this.unitDegree = "c";
    }

    private void FahrenheitMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(null, "Fahrenheit Option Selected", "Option Clicked"
                , JOptionPane.WARNING_MESSAGE);
        this.unitDegree = "f";
    }

    private void SaveBtMouseEntered(java.awt.event.MouseEvent evt) {
        SaveBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/saveBtnHover.png")));
    }

    private void SaveBtMouseExited(java.awt.event.MouseEvent evt) {
        SaveBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/saveBtn.png")));
    }

    private void SaveBtMousePressed(java.awt.event.MouseEvent evt) {
        SaveBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/saveBtnPressed.png")));
    }

    private void SaveBtMouseReleased(java.awt.event.MouseEvent evt) {
        SaveBt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Settings/saveBtn.png")));
    }

    private void SaveBtMouseClicked(java.awt.event.MouseEvent evt) {
        this.location = City.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, "Settings are now updated.");
        Home home = new Home();
        home.changeLocation(this.location);
        home.changeUnitDegrees(this.unitDegree);
        home.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }
}



