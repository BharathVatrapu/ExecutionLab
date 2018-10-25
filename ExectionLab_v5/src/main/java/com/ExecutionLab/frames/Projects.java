package com.ExecutionLab.frames;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author bharat.vatrapu@gmail.com
 */
public class Projects extends javax.swing.JPanel {

    CreateProject createProject;

    /**
     * Creates new form DashBoard
     */
    public Projects() {
        initComponents();
        createProject = new CreateProject();

    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        txtProjectsHeader = new javax.swing.JLabel();
        iconProject = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProjects = new javax.swing.JTable();
        panelButtons = new javax.swing.JPanel();
        btnCreateProject = new javax.swing.JLabel();
        btnModifyProject = new javax.swing.JLabel();
        btnDeleteProject = new javax.swing.JLabel();
        btnSelectProject = new javax.swing.JLabel();
        txtSelectedProject = new javax.swing.JLabel();
        dynamicSelectedProject = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txtProjectsHeader.setFont(new java.awt.Font("Arial", 1, 24));
        txtProjectsHeader.setForeground(new java.awt.Color(102, 0, 102));
        txtProjectsHeader.setText("Projects ");

        iconProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Project_32px.png")));

        tblProjects.setBackground(new java.awt.Color(153, 204, 255));
        tblProjects.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tblProjects.setSelectionBackground(new java.awt.Color(153, 0, 153));
        jScrollPane1.setViewportView(tblProjects);

        panelButtons.setBackground(new java.awt.Color(153, 204, 255));
        panelButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnCreateProject.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnCreateProject.setForeground(new java.awt.Color(102, 0, 102));
        btnCreateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_New_32px.png")));
        btnCreateProject.setText("Create Project");
        btnCreateProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnCreateProject.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnCreateProjectActionPerformed();
            }
        });
        btnCreateProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCreateProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCreateProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
            }
        });

        btnModifyProject.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnModifyProject.setForeground(new java.awt.Color(102, 0, 102));
        btnModifyProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_File_32px.png")));
        btnModifyProject.setText("Modify Project");
        btnModifyProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnModifyProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifyProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModifyProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
            }
        });

        btnDeleteProject.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnDeleteProject.setForeground(new java.awt.Color(102, 0, 102));
        btnDeleteProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash_Can_32px.png")));
        btnDeleteProject.setText("Delete Project");
        btnDeleteProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        btnDeleteProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
            }
        });
        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
                panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelButtonsLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnDeleteProject, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnModifyProject, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCreateProject, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelButtonsLayout.setVerticalGroup(
                panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelButtonsLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnCreateProject)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(btnModifyProject)
                                .addGap(52, 52, 52)
                                .addComponent(btnDeleteProject)
                                .addGap(49, 49, 49))
        );

        btnSelectProject.setFont(new java.awt.Font("Tahoma", 1, 17));
        btnSelectProject.setForeground(new java.awt.Color(0, 172, 193));
        btnSelectProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Select_32px.png")));
        btnSelectProject.setText("Select Project");
        btnSelectProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 172, 193)));
        btnSelectProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,0,102)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectProject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
            }
        });

        txtSelectedProject.setFont(new java.awt.Font("Segoe UI Historic", 1, 14));
        txtSelectedProject.setText("Selected Project: ");

        dynamicSelectedProject.setFont(new java.awt.Font("Segoe UI Historic", 1, 14));
        dynamicSelectedProject.setText("xxxxxxxxxxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(305, 305, 305)
                                                .addComponent(iconProject)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtProjectsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addComponent(txtSelectedProject)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dynamicSelectedProject))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(170, 170, 170)
                                                .addComponent(btnSelectProject, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iconProject)
                                        .addComponent(txtProjectsHeader))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSelectedProject)
                                        .addComponent(dynamicSelectedProject))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSelectProject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );
    }

    public void btnCreateProjectActionPerformed(){
        Main.projectSetup_frame();
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel btnCreateProject;
    private javax.swing.JLabel btnDeleteProject;
    private javax.swing.JLabel btnModifyProject;
    private javax.swing.JLabel btnSelectProject;
    private javax.swing.JLabel dynamicSelectedProject;
    private javax.swing.JLabel iconProject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JTable tblProjects;
    private javax.swing.JLabel txtProjectsHeader;
    private javax.swing.JLabel txtSelectedProject;
    // End of variables declaration
}

