package com.ExecutionLab.frames;

import com.ExecutionLab.utils.Generic;
import com.ExecutionLab.utils.GlobalConstants;
import com.ExecutionLab.utils.SQLLite;

import javax.swing.*;
import java.awt.event.MouseEvent;

/**
 *
 * @author bharat.vatrapu@gmail.com
 *
 */

public class CreateProjectParams extends javax.swing.JPanel {


    DefaultListModel  paramListmodel= new DefaultListModel();
    /**
     * Creates new form DashBoard
     */
    public CreateProjectParams() {
        initComponents();
        System.out.println("Project::"+GlobalConstants.Project_Name);
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        txtCreateProject = new javax.swing.JLabel();
        iconCreateProject = new javax.swing.JLabel();
        panelCreateProject = new javax.swing.JPanel();
        panelParameters = new javax.swing.JPanel();
        txtParameter = new javax.swing.JLabel();
        edtParameter = new javax.swing.JTextField();
        btnAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listParameters = new javax.swing.JList<>();
        btnRemove = new javax.swing.JLabel();
        btnModify = new javax.swing.JLabel();
        panelImage = new javax.swing.JPanel();
        imagePromo = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
       // setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txtCreateProject.setFont(new java.awt.Font("Arial", 1, 24));
        txtCreateProject.setForeground(new java.awt.Color(102, 0, 102));
        txtCreateProject.setText("Project Params Setup  ");

        iconCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Engineering_32px.png")));

        panelCreateProject.setBackground(new java.awt.Color(153, 204, 255));
        panelCreateProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        panelParameters.setBackground(new java.awt.Color(153, 204, 255));
        panelParameters.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project based parameters", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtParameter.setFont(new java.awt.Font("Verdana", 1, 14));
        txtParameter.setText("Parameter: ");

        edtParameter.setBackground(new java.awt.Color(132, 213, 243));
        edtParameter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        btnAdd.setFont(new java.awt.Font("Tahoma", 3, 11));
        btnAdd.setForeground(new java.awt.Color(0, 51, 204));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_Property_32px.png")));
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(MouseEvent evt) {
                btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
            }
            public void mouseClicked(MouseEvent e) {
                btnAddActionPerformed();
            }
        });

        listParameters.setBackground(new java.awt.Color(132, 213, 243));
        listParameters.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameters", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 153)));
        jScrollPane1.setViewportView(listParameters);

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Minus_32px.png")));
        btnRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(MouseEvent evt) {
                btnRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
            }
            public void mouseClicked(MouseEvent e) {
                btnRemoveActionPerformed();
            }
        });
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_Property_32px.png")));
        btnModify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        btnModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnModify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(MouseEvent evt) {
                btnModify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
            }
            public void mouseClicked(MouseEvent e) {
                btnModifyActionPerformed();
            }
        });
        javax.swing.GroupLayout panelParametersLayout = new javax.swing.GroupLayout(panelParameters);
        panelParameters.setLayout(panelParametersLayout);
        panelParametersLayout.setHorizontalGroup(
                panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelParametersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelParametersLayout.createSequentialGroup()
                                                .addComponent(txtParameter)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelParametersLayout.createSequentialGroup()
                                                                .addComponent(btnAdd)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnRemove)
                                                                .addGap(61, 61, 61)
                                                                .addComponent(btnModify)
                                                                .addGap(40, 40, 40))
                                                        .addComponent(edtParameter))))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelParametersLayout.setVerticalGroup(
                panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelParametersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtParameter)
                                        .addComponent(edtParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnRemove)
                                        .addComponent(btnAdd)
                                        .addComponent(btnModify))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelImage.setBackground(new java.awt.Color(153, 204, 255));
        panelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        imagePromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create_project.jpg")));

        javax.swing.GroupLayout panelImageLayout = new javax.swing.GroupLayout(panelImage);
        panelImage.setLayout(panelImageLayout);
        panelImageLayout.setHorizontalGroup(
                panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 277, Short.MAX_VALUE)
                        .addGroup(panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelImageLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(imagePromo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(24, Short.MAX_VALUE)))
        );
        panelImageLayout.setVerticalGroup(
                panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelImageLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(imagePromo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(54, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelCreateProjectLayout = new javax.swing.GroupLayout(panelCreateProject);
        panelCreateProject.setLayout(panelCreateProjectLayout);
        panelCreateProjectLayout.setHorizontalGroup(
                panelCreateProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCreateProjectLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panelParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelCreateProjectLayout.setVerticalGroup(
                panelCreateProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCreateProjectLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panelCreateProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelParameters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Arrow_Pointing_Left_48px.png")));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Arrow_Pointing_Right_52px.png")));
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(MouseEvent evt) {
                btnNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
            }
            public void mouseClicked(MouseEvent e) {
                btnNextActionPerformed();
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelCreateProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBack)
                                                .addGap(208, 208, 208)
                                                .addComponent(iconCreateProject)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCreateProject)))
                                .addContainerGap(21, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(367, 367, 367))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtCreateProject)
                                                .addComponent(iconCreateProject)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelCreateProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public void btnAddActionPerformed(){
        boolean flag = true;
        if (edtParameter.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter Parameter");
            flag=false;
            return;
        }
        if(flag) {
            paramListmodel.addElement(edtParameter.getText());
            listParameters.setModel(paramListmodel);
            listParameters.setSelectedIndex(0);
            edtParameter.setText("");
        }
    }

    public void btnRemoveActionPerformed(){
        paramListmodel.removeElement(listParameters.getSelectedValue());
    }

    public void btnModifyActionPerformed(){
        if(listParameters.getSelectedValue().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Select Param");
        }else {
            edtParameter.setText(listParameters.getSelectedValue());
            paramListmodel.removeElement(listParameters.getSelectedValue());
        }
    }



    public void btnCreateProjectActionPerformed(){
        // SQLLite.createProjectstable(GlobalConstants.PROJECTS_SQL_TABLE);
        //SQLLite.insertProjectsTable(1,edtAccountName.getText(),edtProjectName.getText(),rbSEMaven.getText(),edtProjectPath.getText());
        SQLLite.select();
    }
    public void btnNextActionPerformed(){
        boolean flag=true;
        if (listParameters.getModel().getSize() > 0) {
            if(SQLLite.tableExists(GlobalConstants.tblPROJECTPARAMS)) {

                for (int i = 0; i < listParameters.getModel().getSize(); i++) {
                    SQLLite.insertProjectParamsTable(GlobalConstants.Project_Name, listParameters.getModel().getElementAt(i).toString());
                }
            } else{
              SQLLite.createProjectstable(GlobalConstants.PROJECTPARAMS_SQL_TABLE);
              for (int i = 0; i < listParameters.getModel().getSize(); i++) {
                   SQLLite.insertProjectParamsTable(GlobalConstants.Project_Name, listParameters.getModel().getElementAt(i).toString());
              }
            }
        } else {
            flag = false;
        }

        if(flag){
          //  GlobalConstants.Project_Name = edtProjectName.getText();
            Main.projectParameterValuesSetup_frame();
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnModify;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnRemove;
    private javax.swing.JTextField edtParameter;
    private javax.swing.JLabel iconCreateProject;
    private javax.swing.JLabel imagePromo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listParameters;
    private javax.swing.JPanel panelCreateProject;
    private javax.swing.JPanel panelImage;
    private javax.swing.JPanel panelParameters;
    private javax.swing.JLabel txtCreateProject;
    private javax.swing.JLabel txtParameter;
    // End of variables declaration
}

