package com.Asd0cska.Home;

import com.Asd0cska.Settings.Settings;
import com.Asd0cska.Weatherconditions.Weather;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home extends javax.swing.JFrame{

    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel minimizeBtn;

    private String location;
    private String unitDegree;

    public Home() {
        initComponents();
        location = "Budapest";
        unitDegree = "c";
    }

    public void changeLocation(String newLocation) {
        this.location = newLocation;
    }

    public void changeUnitDegrees(String newUnitDegree) {
        this.unitDegree = newUnitDegree;
    }

    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(690, 450));
        setMinimumSize(new java.awt.Dimension(690, 450));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(690, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/weatherBtn.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/settingsBtn.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 180, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/closeBtn.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/minimizeBtn.png"))); // NOI18N
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/window.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        pack();
        setLocationRelativeTo(null);
    }

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
    }

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {
        this.setState(this.ICONIFIED);
    }

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/settingsBtnHover.png")));
    }

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("com/Asd0cska/Home/settingsBtn.png")));
    }

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/settingsBtnPressed.png")));
    }

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/settingsBtn.png")));
    }

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/weatherBtnHover.png")));
    }

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("com/Asd0cska/Home/weatherBtn.png")));
    }

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/weatherBtnPressed.png")));
    }

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Asd0cska/Home/weatherBtn.png")));
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        Settings settings = new Settings();
        settings.setVisible(true);
        this.dispose();
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        Weather weather = new Weather();
        weather.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(7600);
                    new Home().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
