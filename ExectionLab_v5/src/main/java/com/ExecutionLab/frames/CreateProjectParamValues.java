package com.ExecutionLab.frames;


import com.ExecutionLab.utils.GlobalConstants;
import com.ExecutionLab.utils.SQLLite;

import java.awt.event.MouseEvent;

public class CreateProjectParamValues extends javax.swing.JPanel {

    /**
     * Creates new form DashBoard
     */
    public CreateProjectParamValues() {
        initComponents();
        loadBannersinList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        txtCreateProject = new javax.swing.JLabel();
        iconCreateProject = new javax.swing.JLabel();
        panelCreateProject = new javax.swing.JPanel();
        panelParameters = new javax.swing.JPanel();
        btnAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listParameters = new javax.swing.JList<>();
        btnRemove = new javax.swing.JLabel();
        btnModify = new javax.swing.JLabel();
        cbParameters = new javax.swing.JComboBox<>();
        edtparamValue = new javax.swing.JTextField();
        panelImage = new javax.swing.JPanel();
        imagePromo = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        btnFinish = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txtCreateProject.setFont(new java.awt.Font("Arial", 1, 24));
        txtCreateProject.setForeground(new java.awt.Color(102, 0, 102));
        txtCreateProject.setText("Project Param Values Setup  ");

        iconCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Engineering_32px.png")));

        panelCreateProject.setBackground(new java.awt.Color(153, 204, 255));
        panelCreateProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        panelParameters.setBackground(new java.awt.Color(153, 204, 255));
        panelParameters.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project based parameter values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnAdd.setFont(new java.awt.Font("Tahoma", 3, 11));
        btnAdd.setForeground(new java.awt.Color(0, 51, 204));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_Property_32px.png")));
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        listParameters.setBackground(new java.awt.Color(132, 213, 243));
        listParameters.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parameter Values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 153)));
        jScrollPane1.setViewportView(listParameters);

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Minus_32px.png")));
        btnRemove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_Property_32px.png")));
        btnModify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        cbParameters.setBackground(new java.awt.Color(132, 213, 243));
        cbParameters.setFont(new java.awt.Font("Tahoma", 0, 12));
        cbParameters.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        edtparamValue.setBackground(new java.awt.Color(132, 213, 243));
        edtparamValue.setFont(new java.awt.Font("Tahoma", 0, 12));
        edtparamValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout panelParametersLayout = new javax.swing.GroupLayout(panelParameters);
        panelParameters.setLayout(panelParametersLayout);
        panelParametersLayout.setHorizontalGroup(
                panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelParametersLayout.createSequentialGroup()
                                .addGroup(panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelParametersLayout.createSequentialGroup()
                                                .addComponent(cbParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(edtparamValue, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelParametersLayout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(btnAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnRemove)
                                                .addGap(52, 52, 52)
                                                .addComponent(btnModify)
                                                .addGap(15, 15, 15)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelParametersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelParametersLayout.setVerticalGroup(
                panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelParametersLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(edtparamValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnRemove)
                                        .addComponent(btnAdd)
                                        .addComponent(btnModify))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE))
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

        btnFinish.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btnFinish.setForeground(new java.awt.Color(51, 153, 0));
        btnFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Task_Completed_32px.png")));
        btnFinish.setText("Finish");
        btnFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 0)));
        btnFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(MouseEvent evt) {
                btnFinish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
            }
            public void mouseClicked(MouseEvent e) {
                btnFinishActionPerformed();
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
                                                .addGap(158, 158, 158)
                                                .addComponent(iconCreateProject)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCreateProject)))
                                .addContainerGap(21, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(btnFinish)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public void btnFinishActionPerformed(){
        boolean flag=true;
        if (listParameters.getModel().getSize() > 0) {
            if(SQLLite.tableExists(GlobalConstants.tblPROJECTPARAMVALUES)) {
                for (int i = 0; i < listParameters.getModel().getSize(); i++) {
                    SQLLite.insertProjectParamValuesTable(GlobalConstants.Project_Name, cbParameters.getSelectedItem().toString(),listParameters.getModel().getElementAt(i).toString());
                }
            } else{
                SQLLite.createProjectstable(GlobalConstants.PROJECTPARAMS_SQL_TABLE);
                for (int i = 0; i < listParameters.getModel().getSize(); i++) {
                    SQLLite.insertProjectParamValuesTable(GlobalConstants.Project_Name, cbParameters.getSelectedItem().toString(), listParameters.getModel().getElementAt(i).toString());
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
    public void loadBannersinList(){


        String[] listparams = SQLLite.selectProjectParams(GlobalConstants.Project_Name);
        cbParameters.removeAllItems();
        for (int i = 0; i < listparams.length; i++) {

            cbParameters.addItem(listparams[i]);
        }
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnModify;
    private javax.swing.JLabel btnFinish;
    private javax.swing.JLabel btnRemove;
    private javax.swing.JComboBox<String> cbParameters;
    private javax.swing.JTextField edtparamValue;
    private javax.swing.JLabel iconCreateProject;
    private javax.swing.JLabel imagePromo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listParameters;
    private javax.swing.JPanel panelCreateProject;
    private javax.swing.JPanel panelImage;
    private javax.swing.JPanel panelParameters;
    private javax.swing.JLabel txtCreateProject;
    // End of variables declaration
}