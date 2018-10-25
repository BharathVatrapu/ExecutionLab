package com.ExecutionLab.frames;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author bharat.vatrapu@gmail.com
 */

public class AddValues extends javax.swing.JFrame {

    DefaultListModel  paramValueListmodel= new DefaultListModel();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddValues().setVisible(true);
            }
        });
    }
    /**
     * Creates new form AddValues
     */
    public AddValues() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panelAddValus = new javax.swing.JPanel();
        cbParameters = new javax.swing.JComboBox<>();
        edtparamValue = new javax.swing.JTextField();
        btnAddValue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listparamValues = new javax.swing.JList<>();
        btnSave = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnRemove = new javax.swing.JLabel();
        btnModify = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);
        setUndecorated(true);

        setBackground(new java.awt.Color(153, 204, 255));

        panelAddValus.setBackground(new java.awt.Color(153, 204, 255));
        panelAddValus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        cbParameters.setBackground(new java.awt.Color(132, 213, 243));
        cbParameters.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        edtparamValue.setBackground(new java.awt.Color(132, 213, 243));
        edtparamValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        btnAddValue.setFont(new java.awt.Font("Tahoma", 3, 11));
        btnAddValue.setForeground(new java.awt.Color(0, 51, 204));
        btnAddValue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_Property_32px.png")));
        btnAddValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnAddValue.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnAddActionPerformed();
            }
        });
        listparamValues.setBackground(new java.awt.Color(132, 213, 243));
        listparamValues.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Param Values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 153)));
        jScrollPane1.setViewportView(listparamValues);

        btnSave.setFont(new java.awt.Font("Tahoma", 3, 12));
        btnSave.setForeground(new java.awt.Color(0, 51, 204));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save_32px.png")));
        btnSave.setText("  Save   ");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnClose.setFont(new java.awt.Font("Tahoma", 3, 12));
        btnClose.setForeground(new java.awt.Color(204, 0, 0));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_32px.png")));
        btnClose.setText("  Close   ");
        btnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnClose.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                close();
            }
        });

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Minus_32px.png")));
        btnRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnRemove.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnRemoveActionPerformed();
            }
        });
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_Property_32px.png")));
        btnModify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnModify.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnModifyActionPerformed();
            }
        });

        javax.swing.GroupLayout panelAddValusLayout = new javax.swing.GroupLayout(panelAddValus);
        panelAddValus.setLayout(panelAddValusLayout);
        panelAddValusLayout.setHorizontalGroup(
                panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAddValusLayout.createSequentialGroup()
                                .addGroup(panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelAddValusLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelAddValusLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(btnSave)
                                                .addGap(65, 65, 65)
                                                .addComponent(btnClose))
                                        .addGroup(panelAddValusLayout.createSequentialGroup()
                                                .addGroup(panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelAddValusLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(cbParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panelAddValusLayout.createSequentialGroup()
                                                                .addGap(53, 53, 53)
                                                                .addComponent(btnAddValue)))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(edtparamValue, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddValusLayout.createSequentialGroup()
                                                                .addComponent(btnRemove)
                                                                .addGap(36, 36, 36)
                                                                .addComponent(btnModify)
                                                                .addGap(59, 59, 59)))))
                                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelAddValusLayout.setVerticalGroup(
                panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAddValusLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(edtparamValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAddValue)
                                        .addComponent(btnRemove)
                                        .addComponent(btnModify))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelAddValusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSave)
                                        .addComponent(btnClose))
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelAddValus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelAddValus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void close(){
        setVisible(false);
        dispose();

    }

    public void btnAddActionPerformed(){
        boolean flag = true;
        if (edtparamValue.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter Parameter");
            flag=false;
            return;
        }
        if(flag) {
            paramValueListmodel.addElement(edtparamValue.getText());
            listparamValues.setModel(paramValueListmodel);
            listparamValues.setSelectedIndex(0);
            edtparamValue.setText("");
        }
    }

    public void btnRemoveActionPerformed(){
        paramValueListmodel.removeElement(listparamValues.getSelectedValue());
    }

    public void btnModifyActionPerformed(){
        if(listparamValues.getSelectedValue().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Select Param");
        }else {
            edtparamValue.setText(listparamValues.getSelectedValue());
            paramValueListmodel.removeElement(listparamValues.getSelectedValue());
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel btnAddValue;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnModify;
    private javax.swing.JLabel btnRemove;
    private javax.swing.JLabel btnSave;
    private javax.swing.JComboBox<String> cbParameters;
    private javax.swing.JTextField edtparamValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listparamValues;
    private javax.swing.JPanel panelAddValus;
    // End of variables declaration
}


