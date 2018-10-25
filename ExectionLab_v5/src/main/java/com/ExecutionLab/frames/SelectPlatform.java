package com.ExecutionLab.frames;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author bharat.vatrapu@gmail.com
 */
public class SelectPlatform extends javax.swing.JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectPlatform().setVisible(true);
            }
        });
    }


    /**
     * Creates new form SelectPlatform
     */
    public SelectPlatform() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        txtSelectPlatformHeader = new javax.swing.JLabel();
        rbDesktop = new javax.swing.JRadioButton();
        iconDesktop = new javax.swing.JLabel();
        txtDesktop = new javax.swing.JLabel();
        rbMobile = new javax.swing.JRadioButton();
        iconMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JLabel();
        panelNext = new javax.swing.JPanel();
        btnNext = new javax.swing.JLabel();
        btnHeaderClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);
        setUndecorated(true);

        panelMain.setBackground(new java.awt.Color(255, 255, 204));

        txtSelectPlatformHeader.setFont(new java.awt.Font("Segoe UI", 1, 12));
        txtSelectPlatformHeader.setForeground(new java.awt.Color(102, 0, 102));
        txtSelectPlatformHeader.setText("Select Platform");

        rbDesktop.setBackground(new java.awt.Color(255, 255, 204));
        rbDesktop.setMaximumSize(new java.awt.Dimension(40, 40));
        rbDesktop.setMinimumSize(new java.awt.Dimension(40, 40));

        iconDesktop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Windows_Client_48px.png")));

        txtDesktop.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtDesktop.setForeground(new java.awt.Color(102, 0, 153));
        txtDesktop.setText("Desktop");

        rbMobile.setBackground(new java.awt.Color(255, 255, 204));
        rbMobile.setMaximumSize(new java.awt.Dimension(40, 40));
        rbMobile.setMinimumSize(new java.awt.Dimension(40, 40));

        iconMobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Mobile_48px.png")));

        txtMobile.setFont(new java.awt.Font("Tahoma", 1, 11));
        txtMobile.setForeground(new java.awt.Color(102, 0, 153));
        txtMobile.setText("  Mobile  ");

        panelNext.setBackground(new java.awt.Color(24, 34, 56));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Forward_48px.png")));
        btnNext.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnNextActionPerformed();
            }
        });

        btnHeaderClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close_Window_20px.png")));
        btnHeaderClose.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                close();
            }
        });

        javax.swing.GroupLayout panelNextLayout = new javax.swing.GroupLayout(panelNext);
        panelNext.setLayout(panelNextLayout);
        panelNextLayout.setHorizontalGroup(
                panelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelNextLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnHeaderClose))
        );
        panelNextLayout.setVerticalGroup(
                panelNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNextLayout.createSequentialGroup()
                                .addComponent(btnHeaderClose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
                panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDesktop)
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addComponent(rbDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(iconDesktop)))
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(txtSelectPlatformHeader)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                                .addComponent(rbMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtMobile)
                                                        .addComponent(iconMobile))
                                                .addGap(68, 68, 68)))
                                .addComponent(panelNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMainLayout.setVerticalGroup(
                panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(rbDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(iconDesktop))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDesktop)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtSelectPlatformHeader)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelMainLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(rbMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                                .addComponent(iconMobile)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMobile)
                                                .addGap(54, 54, 54))))
                        .addComponent(panelNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void close(){
        setVisible(false);
        dispose();
        new Main().setVisible(true);
    }
    public void btnNextActionPerformed(){
        Main main = new Main();
        setVisible(false);
        dispose();
        main.desktopExecutionLab();
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel btnHeaderClose;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel iconDesktop;
    private javax.swing.JLabel iconMobile;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelNext;
    private javax.swing.JRadioButton rbDesktop;
    private javax.swing.JRadioButton rbMobile;
    private javax.swing.JLabel txtDesktop;
    private javax.swing.JLabel txtMobile;
    private javax.swing.JLabel txtSelectPlatformHeader;
    // End of variables declaration
}

