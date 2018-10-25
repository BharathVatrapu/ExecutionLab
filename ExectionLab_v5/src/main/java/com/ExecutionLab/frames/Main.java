package com.ExecutionLab.frames;

import com.ExecutionLab.utils.Generic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author bharat.vatrapu@gmail.com
 *
 */
public class Main extends javax.swing.JFrame {

    GridBagLayout gridBagLayout = new GridBagLayout();
    static Dashboard dashboard;
    static SelectPlatform selectPlatform;
    static Projects projects;
    static DesktopExecution desktopExecution;
    static MobileExecution mobileExecution;
    static CreateProject createProject;
    static CreateProjectParams createProjectParams;
    static CreateProjectParamValues createProjectParamValues;


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        dashboard = new Dashboard();
        projects = new Projects();
        desktopExecution = new DesktopExecution();
        mobileExecution = new MobileExecution();
        createProject = new CreateProject();
        createProjectParams = new CreateProjectParams();
        createProjectParamValues = new CreateProjectParamValues();

        panleMainHome.setLayout(gridBagLayout);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        panleMainHome.add(dashboard,c);
        c.gridx = 0;
        c.gridy = 0;
        panleMainHome.add(projects,c);
        c.gridx = 0;
        c.gridy = 0;
        panleMainHome.add(desktopExecution,c);
        c.gridx = 0;
        c.gridy = 0;
        panleMainHome.add(mobileExecution,c);
        c.gridx = 0;
        c.gridy = 0;
        panleMainHome.add(createProject,c);
        c.gridx = 0;
        c.gridy = 0;
        panleMainHome.add(createProjectParams,c);
        c.gridx = 0;
        c.gridy = 0;
        panleMainHome.add(createProjectParamValues,c);

        dashboard.setVisible(false);
        projects.setVisible(false);
        desktopExecution.setVisible(false);
        mobileExecution.setVisible(false);
        createProject.setVisible(false);
        createProjectParams.setVisible(false);
        createProjectParamValues.setVisible(false);

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        panelHeader = new java.awt.Panel();
      //  jLabel1 = new javax.swing.JLabel();
        iconExecutionLab = new javax.swing.JLabel();
        txtExecutionLabHeader = new javax.swing.JLabel();
        txtHeaderDate = new javax.swing.JLabel();
        btnHeaderClose = new javax.swing.JLabel();
        edtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        txtProject = new javax.swing.JLabel();
        dynamicProject = new javax.swing.JLabel();
        panelSide = new java.awt.Panel();
        btnSideHome = new javax.swing.JLabel();
        btnSideSettings = new javax.swing.JLabel();
        btnSideUsers = new javax.swing.JLabel();
        btnSideOutlookmail = new javax.swing.JLabel();
        btnSideClose = new javax.swing.JLabel();
        btnSideSublimeText = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        btnQueue = new javax.swing.JLabel();
        btnSchedule = new javax.swing.JLabel();
        btnVoice = new javax.swing.JLabel();
        btnAddMobile = new javax.swing.JLabel();
        panelNavigation = new java.awt.Panel();
        btnDashboard = new javax.swing.JLabel();
        btnExecutionLab = new javax.swing.JLabel();
        btnProjects = new javax.swing.JLabel();
        btnExcelExecution = new javax.swing.JLabel();
        btnExtractor = new javax.swing.JLabel();
        panleMainHome = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);
        setUndecorated(true);

        panelHeader.setBackground(new java.awt.Color(63, 120, 208));

       // jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rocket_50px.png")));

        iconExecutionLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rocket_50px.png")));

        txtExecutionLabHeader.setFont(new java.awt.Font("Segoe UI", 1, 36));
        txtExecutionLabHeader.setForeground(new java.awt.Color(209, 196, 233));
        txtExecutionLabHeader.setText("Execution Lab");

        txtHeaderDate.setFont(new java.awt.Font("Verdana", 0, 12));
        txtHeaderDate.setForeground(new java.awt.Color(0, 255, 255));
        txtHeaderDate.setText(Generic.getDate());

        btnHeaderClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close_Window_20px.png")));
        btnHeaderClose.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                close();
            }
        });

        edtSearch.setBackground(new java.awt.Color(100, 181, 246));
        edtSearch.setToolTipText("");
        edtSearch.setBorder(null);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search_18px.png")));

        txtProject.setFont(new java.awt.Font("Verdana", 0, 14));
        txtProject.setForeground(new java.awt.Color(255, 255, 255));
        txtProject.setText("Project: ");

        dynamicProject.setFont(new java.awt.Font("Verdana", 0, 14));
        dynamicProject.setForeground(new java.awt.Color(255, 255, 255));
        dynamicProject.setText("xxxxxxxxxxxxxx");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
                panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addContainerGap()
                              //  .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(iconExecutionLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtExecutionLabHeader)
                                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelHeaderLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(edtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSearch)
                                                .addGap(26, 26, 26)
                                                .addComponent(btnHeaderClose))
                                        .addGroup(panelHeaderLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(txtProject)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dynamicProject)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtHeaderDate)
                                                .addGap(26, 26, 26))))
        );
        panelHeaderLayout.setVerticalGroup(
                panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSearch)
                                        .addComponent(edtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtHeaderDate)
                                        .addComponent(txtProject)
                                        .addComponent(dynamicProject))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                .addComponent(btnHeaderClose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtExecutionLabHeader)
                                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                                    //    .addComponent(jLabel1)
                                                        .addGap(38, 38, 38))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                                                        .addComponent(iconExecutionLab)
                                                        .addGap(23, 23, 23))))
                                .addGap(8, 8, 8))
        );

        panelSide.setBackground(new java.awt.Color(114, 168, 255));

        btnSideHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Home_28px.png")));

        btnSideSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gears_28px.png")));

        btnSideUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/User_28px.png")));

        btnSideOutlookmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Microsoft_Outlook_28px.png")));

        btnSideClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Shutdown_28px.png")));
        btnSideClose.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                close();
            }
        });

        btnSideSublimeText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sublime_Text_32px.png")));
        btnSideSublimeText.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openSublime();
            }
        });

        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/About_32px.png")));

        btnQueue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Queue_32px.png")));

        btnSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Schedule_32px.png")));

        btnVoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Voice_32px.png")));

        btnAddMobile.setIcon(new javax.swing.ImageIcon(getClass().getResource(("/icons/Mobile_32px.png"))));

        javax.swing.GroupLayout panelSideLayout = new javax.swing.GroupLayout(panelSide);
        panelSide.setLayout(panelSideLayout);
        panelSideLayout.setHorizontalGroup(
                panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSideHome)
                                        .addComponent(btnSideSettings)
                                        .addComponent(btnSideUsers)
                                        .addComponent(btnSideOutlookmail)
                                        .addComponent(btnSideClose)
                                        .addComponent(btnSideSublimeText)
                                        .addComponent(btnAbout)
                                        .addComponent(btnQueue)
                                        .addComponent(btnSchedule)
                                        .addComponent(btnVoice)
                                        .addComponent(btnAddMobile))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelSideLayout.setVerticalGroup(
                panelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSideHome)
                                .addGap(18, 18, 18)
                                .addComponent(btnSideSettings)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSideUsers)
                                .addGap(18, 18, 18)
                                .addComponent(btnSideOutlookmail)
                                .addGap(18, 18, 18)
                                .addComponent(btnSideSublimeText)
                                .addGap(18, 18, 18)
                                .addComponent(btnQueue)
                                .addGap(13, 13, 13)
                                .addComponent(btnSchedule)
                                .addGap(26, 26, 26)
                                .addComponent(btnVoice)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddMobile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAbout)
                                .addGap(18, 18, 18)
                                .addComponent(btnSideClose)
                                .addContainerGap())
        );

        panelNavigation.setBackground(new java.awt.Color(24, 34, 56));

        btnDashboard.setFont(new java.awt.Font("Verdana", 1, 12));
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Presentation_32px.png")));
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209,196,233)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
            }
        });
        btnDashboard.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnDashboardActionPerformed();
            }
        });


        btnExecutionLab.setFont(new java.awt.Font("Verdana", 1, 12));
        btnExecutionLab.setForeground(new java.awt.Color(255, 255, 255));
        btnExecutionLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Services_32px.png")));
        btnExecutionLab.setText("Execution Lab");
        btnExecutionLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btnExecutionLab.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnExecutionLabActionPerformed();
            }
        });
        btnExecutionLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExecutionLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209,196,233)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExecutionLab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
            }
        });

        btnProjects.setFont(new java.awt.Font("Verdana", 1, 12));
        btnProjects.setForeground(new java.awt.Color(255, 255, 255));
        btnProjects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Project_32px.png")));
        btnProjects.setText("Projects");
        btnProjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btnProjects.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                btnProjectsActionPerformed();
            }
        });
        btnProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209,196,233)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProjects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
            }
        });

        btnExcelExecution.setFont(new java.awt.Font("Verdana", 1, 12));
        btnExcelExecution.setForeground(new java.awt.Color(255, 255, 255));
        btnExcelExecution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Microsoft_Excel_32px.png")));
        btnExcelExecution.setText("Execution");
        btnExcelExecution.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btnExcelExecution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcelExecution.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209,196,233)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcelExecution.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
            }
        });
        btnExtractor.setFont(new java.awt.Font("Verdana", 1, 12));
        btnExtractor.setForeground(new java.awt.Color(255, 255, 255));
        btnExtractor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sensor_32px.png")));
        btnExtractor.setText("Dom Xtractor");
        btnExtractor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btnExtractor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExtractor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209,196,233)));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExtractor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
            }
        });


        javax.swing.GroupLayout panelNavigationLayout = new javax.swing.GroupLayout(panelNavigation);
        panelNavigation.setLayout(panelNavigationLayout);
        panelNavigationLayout.setHorizontalGroup(
                panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNavigationLayout.createSequentialGroup()
                                .addGroup(panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnProjects, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExecutionLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(btnExcelExecution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExtractor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNavigationLayout.setVerticalGroup(
                panelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelNavigationLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExecutionLab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcelExecution, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExtractor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panleMainHome.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout panleMainHomeLayout = new javax.swing.GroupLayout(panleMainHome);
        panleMainHome.setLayout(panleMainHomeLayout);
        panleMainHomeLayout.setHorizontalGroup(
                panleMainHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 977, Short.MAX_VALUE)
        );
        panleMainHomeLayout.setVerticalGroup(
                panleMainHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 534, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(panelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(panleMainHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(panelSide, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelNavigation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panleMainHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void close(){
        setVisible(false);
        dispose();
    }
    public void btnDashboardActionPerformed(){
        dashboard.setVisible(true);
        projects.setVisible(false);
    }
    public void btnExecutionLabActionPerformed(){
        dashboard.setVisible(false);
        projects.setVisible(false);
        desktopExecution.setVisible(false);
        mobileExecution.setVisible(false);
        setVisible(false);
        new SelectPlatform().setVisible(true);

    }
    public static void btnProjectsActionPerformed(){
        dashboard.setVisible(false);
        projects.setVisible(true);
        desktopExecution.setVisible(false);
        mobileExecution.setVisible(false);
        createProject.setVisible(false);
    }

    public void desktopExecutionLab(){
        dashboard.setVisible(false);
        projects.setVisible(false);
        desktopExecution.setVisible(true);
        mobileExecution.setVisible(false);
    }
    public void mobileExecutionLab(){
        dashboard.setVisible(false);
        projects.setVisible(false);
        desktopExecution.setVisible(false);
        mobileExecution.setVisible(true);
    }
    public static void projectSetup_frame(){
        dashboard.setVisible(false);
        projects.setVisible(false);
        desktopExecution.setVisible(false);
        mobileExecution.setVisible(false);
        createProject.setVisible(true);
    }

    public static void projectParametersSetup_frame(){
        dashboard.setVisible(false);
        projects.setVisible(false);
        desktopExecution.setVisible(false);
        mobileExecution.setVisible(false);
        createProject.setVisible(false);
        createProjectParams.setVisible(true);
    }
    public static void projectParameterValuesSetup_frame(){
        dashboard.setVisible(false);
        projects.setVisible(false);
        desktopExecution.setVisible(false);
        mobileExecution.setVisible(false);
        createProject.setVisible(false);
        createProjectParams.setVisible(false);
        createProjectParamValues.setVisible(true);
    }

    public void openSublime(){
        Generic.openEXEfile(System.getProperty("user.dir")+"/src/main/java/com/ExecutionLab/softwares/SublimeText/sublime_text.exe".toString());
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnAddMobile;
    private javax.swing.JLabel btnDashboard;
    private javax.swing.JLabel btnExcelExecution;
    private javax.swing.JLabel btnExecutionLab;
    private javax.swing.JLabel btnExtractor;
    private javax.swing.JLabel btnHeaderClose;
    private javax.swing.JLabel btnProjects;
    private javax.swing.JLabel btnQueue;
    private javax.swing.JLabel btnSchedule;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnSideClose;
    private javax.swing.JLabel btnSideHome;
    private javax.swing.JLabel btnSideOutlookmail;
    private javax.swing.JLabel btnSideSettings;
    private javax.swing.JLabel btnSideSublimeText;
    private javax.swing.JLabel btnSideUsers;
    private javax.swing.JLabel btnVoice;
    private javax.swing.JLabel dynamicProject;
    private javax.swing.JTextField edtSearch;
    private javax.swing.JLabel iconExecutionLab;
    //private javax.swing.JLabel jLabel1;
    private java.awt.Panel panelHeader;
    private java.awt.Panel panelNavigation;
    private java.awt.Panel panelSide;
    private java.awt.Panel panleMainHome;
    private javax.swing.JLabel txtExecutionLabHeader;
    private javax.swing.JLabel txtHeaderDate;
    private javax.swing.JLabel txtProject;


    // End of variables declaration
}

