package com.ExecutionLab.frames;


/**
 *
 * @author bharat.vatrapu@gmail.com
 */

public class MobileExecution extends javax.swing.JPanel {

    /**
     * Creates new form DashBoard
     */
    public MobileExecution() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        txtExecutionLabHeader = new javax.swing.JLabel();
        iconMobile = new javax.swing.JLabel();
        panelGeneralParams = new javax.swing.JPanel();
        txtService = new javax.swing.JLabel();
        rbWeb = new javax.swing.JRadioButton();
        rbNativeApp = new javax.swing.JRadioButton();
        rbHybridApp = new javax.swing.JRadioButton();
        txtSuiteXmlFile = new javax.swing.JLabel();
        cbSuitexml = new javax.swing.JComboBox<>();
        btnEditSuitexml = new javax.swing.JLabel();
        txtMobileOS = new javax.swing.JLabel();
        rbAndroid = new javax.swing.JRadioButton();
        iconAndroid = new javax.swing.JLabel();
        rbiOS = new javax.swing.JRadioButton();
        iconiOS = new javax.swing.JLabel();
        txtNetwork = new javax.swing.JLabel();
        rbCloud = new javax.swing.JRadioButton();
        iconCloud = new javax.swing.JLabel();
        rbLocal = new javax.swing.JRadioButton();
        iconLocal = new javax.swing.JLabel();
        txtAndroid = new javax.swing.JLabel();
        txtiOS = new javax.swing.JLabel();
        txtCloud = new javax.swing.JLabel();
        txtLocal = new javax.swing.JLabel();
        checkAllParamsfromProject = new javax.swing.JCheckBox();
        txtProjectPath = new javax.swing.JLabel();
        edtProjectPath = new javax.swing.JTextField();
        btnChooseProjectpath = new javax.swing.JLabel();
        panelProjectbasedParams = new javax.swing.JPanel();
        txtParams = new javax.swing.JLabel();
        cbParameters = new javax.swing.JComboBox<>();
        txtValue = new javax.swing.JLabel();
        cbValue = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listparamValues = new javax.swing.JList<>();
        btnRun = new javax.swing.JLabel();
        btnStop = new javax.swing.JLabel();
        panelAdditionalSettings = new javax.swing.JPanel();
        btnCommandLog = new javax.swing.JLabel();
        btnLogHistory = new javax.swing.JLabel();
        btnAddQueue = new javax.swing.JLabel();
        btnScehedule = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        //setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        txtExecutionLabHeader.setFont(new java.awt.Font("Arial", 1, 24));
        txtExecutionLabHeader.setForeground(new java.awt.Color(102, 0, 102));
        txtExecutionLabHeader.setText("Execution Lab ");

        iconMobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Mobile_32px.png")));

        panelGeneralParams.setBackground(new java.awt.Color(153, 204, 255));
        panelGeneralParams.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General Params", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtService.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtService.setText("Service :");

        rbWeb.setBackground(new java.awt.Color(153, 204, 255));
        rbWeb.setFont(new java.awt.Font("Tahoma", 1, 11));
        rbWeb.setText("Web");

        rbNativeApp.setBackground(new java.awt.Color(153, 204, 255));
        rbNativeApp.setFont(new java.awt.Font("Tahoma", 1, 11));
        rbNativeApp.setText("Native App");

        rbHybridApp.setBackground(new java.awt.Color(153, 204, 255));
        rbHybridApp.setFont(new java.awt.Font("Tahoma", 1, 11));
        rbHybridApp.setText("Hybrid App");
        rbHybridApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHybridAppActionPerformed(evt);
            }
        });

        txtSuiteXmlFile.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtSuiteXmlFile.setText("Suite Xml file: ");

        cbSuitexml.setBackground(new java.awt.Color(132, 213, 243));
        cbSuitexml.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnEditSuitexml.setFont(new java.awt.Font("Tahoma", 3, 11));
        btnEditSuitexml.setForeground(new java.awt.Color(0, 51, 204));
        btnEditSuitexml.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit_Property_26px.png")));
        btnEditSuitexml.setText("  Edit Suite xml       ");
        btnEditSuitexml.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        txtMobileOS.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtMobileOS.setText("Mobile OS: ");

        rbAndroid.setBackground(new java.awt.Color(153, 204, 255));
        rbAndroid.setFont(new java.awt.Font("Tahoma", 1, 11));

        iconAndroid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Android_OS_26px.png")));

        rbiOS.setBackground(new java.awt.Color(153, 204, 255));
        rbiOS.setFont(new java.awt.Font("Tahoma", 1, 11));

        iconiOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iOS_Logo_26px.png")));

        txtNetwork.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtNetwork.setText("Netowrk:");

        rbCloud.setBackground(new java.awt.Color(153, 204, 255));
        rbCloud.setFont(new java.awt.Font("Tahoma", 1, 11));

        iconCloud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/OneDrive_26px.png")));

        rbLocal.setBackground(new java.awt.Color(153, 204, 255));
        rbLocal.setFont(new java.awt.Font("Tahoma", 1, 11));

        iconLocal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Connected_26px.png")));

        txtAndroid.setText("Android");

        txtiOS.setText("iOS");

        txtCloud.setText("Cloud");

        txtLocal.setText("Local");

        javax.swing.GroupLayout panelGeneralParamsLayout = new javax.swing.GroupLayout(panelGeneralParams);
        panelGeneralParams.setLayout(panelGeneralParamsLayout);
        panelGeneralParamsLayout.setHorizontalGroup(
                panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                                .addComponent(txtService)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(rbWeb)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(rbNativeApp)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(rbHybridApp))
                                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                                .addComponent(txtSuiteXmlFile)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cbSuitexml, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(btnEditSuitexml)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                .addComponent(txtMobileOS)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbAndroid)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                                .addComponent(iconAndroid)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(rbiOS))
                                                        .addComponent(txtAndroid))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                                .addComponent(iconiOS)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtNetwork)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rbCloud))
                                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                                .addComponent(txtiOS)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                                .addComponent(iconCloud)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(rbLocal)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(iconLocal))
                                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                                .addComponent(txtCloud)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtLocal)
                                                                .addGap(10, 10, 10)))))
                                .addContainerGap())
        );
        panelGeneralParamsLayout.setVerticalGroup(
                panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtService)
                                        .addComponent(rbWeb)
                                        .addComponent(rbNativeApp)
                                        .addComponent(rbHybridApp))
                                .addGap(18, 18, 18)
                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addComponent(txtMobileOS))
                                                .addComponent(iconAndroid))
                                        .addComponent(rbAndroid)
                                        .addComponent(rbiOS)
                                        .addComponent(iconiOS)
                                        .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addComponent(txtNetwork))
                                                .addComponent(iconCloud))
                                        .addComponent(rbCloud)
                                        .addComponent(iconLocal)
                                        .addComponent(rbLocal))
                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtAndroid)
                                                        .addComponent(txtiOS)))
                                        .addGroup(panelGeneralParamsLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCloud)
                                                        .addComponent(txtLocal))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(panelGeneralParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSuiteXmlFile)
                                        .addComponent(cbSuitexml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEditSuitexml))
                                .addGap(16, 16, 16))
        );

        checkAllParamsfromProject.setBackground(new java.awt.Color(153, 204, 255));
        checkAllParamsfromProject.setText("All params from project base");

        txtProjectPath.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtProjectPath.setText("Project path:");

        edtProjectPath.setBackground(new java.awt.Color(132, 213, 243));
        edtProjectPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        btnChooseProjectpath.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnChooseProjectpath.setForeground(new java.awt.Color(102, 0, 153));
        btnChooseProjectpath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Open_18px.png")));
        btnChooseProjectpath.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));

        panelProjectbasedParams.setBackground(new java.awt.Color(153, 204, 255));
        panelProjectbasedParams.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project based Params", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtParams.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtParams.setText("Param: ");

        cbParameters.setBackground(new java.awt.Color(132, 213, 243));
        cbParameters.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        txtValue.setFont(new java.awt.Font("Tahoma", 1, 14));
        txtValue.setText("Value: ");

        cbValue.setBackground(new java.awt.Color(132, 213, 243));
        cbValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnAdd.setFont(new java.awt.Font("Tahoma", 3, 11));
        btnAdd.setForeground(new java.awt.Color(0, 51, 204));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_Property_18px.png")));
        btnAdd.setText("  Add       ");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        listparamValues.setBackground(new java.awt.Color(132, 213, 243));
        listparamValues.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Param - Values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 0, 153)));
        jScrollPane1.setViewportView(listparamValues);

        javax.swing.GroupLayout panelProjectbasedParamsLayout = new javax.swing.GroupLayout(panelProjectbasedParams);
        panelProjectbasedParams.setLayout(panelProjectbasedParamsLayout);
        panelProjectbasedParamsLayout.setHorizontalGroup(
                panelProjectbasedParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelProjectbasedParamsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelProjectbasedParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelProjectbasedParamsLayout.createSequentialGroup()
                                                .addComponent(txtParams)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelProjectbasedParamsLayout.createSequentialGroup()
                                                .addComponent(txtValue)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelProjectbasedParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProjectbasedParamsLayout.createSequentialGroup()
                                                                .addComponent(btnAdd)
                                                                .addGap(50, 50, 50)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
        );
        panelProjectbasedParamsLayout.setVerticalGroup(
                panelProjectbasedParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelProjectbasedParamsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelProjectbasedParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelProjectbasedParamsLayout.createSequentialGroup()
                                                .addGroup(panelProjectbasedParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtParams)
                                                        .addComponent(cbParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(panelProjectbasedParamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtValue)
                                                        .addComponent(cbValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAdd))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
        );

        btnRun.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnRun.setForeground(new java.awt.Color(0, 0, 204));
        btnRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Run_Command_52px.png")));
        btnRun.setText("  Run       ");
        btnRun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnStop.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnStop.setForeground(new java.awt.Color(255, 87, 34));
        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Manual_52px.png")));
        btnStop.setText("  Stop      ");
        btnStop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        panelAdditionalSettings.setBackground(new java.awt.Color(153, 204, 255));
        panelAdditionalSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Additional Settings", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnCommandLog.setFont(new java.awt.Font("Tahoma", 1, 10));
        btnCommandLog.setIcon(new javax.swing.ImageIcon("D:\\Bharath_Workspace\\NetBeans\\ExectionLab_v5.0\\executionlab\\icons\\Matrix_Desktop_32px.png"));
        btnCommandLog.setText("Command Log  ");
        btnCommandLog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnLogHistory.setFont(new java.awt.Font("Tahoma", 1, 10));
        btnLogHistory.setIcon(new javax.swing.ImageIcon("D:\\Bharath_Workspace\\NetBeans\\ExectionLab_v5.0\\executionlab\\icons\\Time_Machine_32px.png"));
        btnLogHistory.setText("Log History    ");
        btnLogHistory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnAddQueue.setFont(new java.awt.Font("Tahoma", 1, 10));
        btnAddQueue.setIcon(new javax.swing.ImageIcon("D:\\Bharath_Workspace\\NetBeans\\ExectionLab_v5.0\\executionlab\\icons\\Queue_32px.png"));
        btnAddQueue.setText("  Add Queue   ");
        btnAddQueue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnScehedule.setFont(new java.awt.Font("Tahoma", 1, 10));
        btnScehedule.setIcon(new javax.swing.ImageIcon("D:\\Bharath_Workspace\\NetBeans\\ExectionLab_v5.0\\executionlab\\icons\\Calendar_Plus_32px.png"));
        btnScehedule.setText("  Schedule    ");
        btnScehedule.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));

        javax.swing.GroupLayout panelAdditionalSettingsLayout = new javax.swing.GroupLayout(panelAdditionalSettings);
        panelAdditionalSettings.setLayout(panelAdditionalSettingsLayout);
        panelAdditionalSettingsLayout.setHorizontalGroup(
                panelAdditionalSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAdditionalSettingsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelAdditionalSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCommandLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLogHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddQueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnScehedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAdditionalSettingsLayout.setVerticalGroup(
                panelAdditionalSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAdditionalSettingsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCommandLog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnScehedule)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(btnAddQueue)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(btnRun)
                                                .addGap(126, 126, 126)
                                                .addComponent(btnStop))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(iconMobile)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtExecutionLabHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(txtProjectPath)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(edtProjectPath, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(btnChooseProjectpath)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(checkAllParamsfromProject))
                                                                .addComponent(panelGeneralParams, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(panelProjectbasedParams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(panelAdditionalSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(iconMobile)
                                        .addComponent(txtExecutionLabHeader))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panelGeneralParams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(checkAllParamsfromProject)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtProjectPath)
                                                                .addComponent(edtProjectPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btnChooseProjectpath))
                                                .addGap(18, 18, 18)
                                                .addComponent(panelProjectbasedParams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panelAdditionalSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRun)
                                        .addComponent(btnStop))
                                .addContainerGap())
        );
    }// </editor-fold>

    private void rbHybridAppActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnAddQueue;
    private javax.swing.JLabel btnChooseProjectpath;
    private javax.swing.JLabel btnCommandLog;
    private javax.swing.JLabel btnEditSuitexml;
    private javax.swing.JLabel btnLogHistory;
    private javax.swing.JLabel btnRun;
    private javax.swing.JLabel btnScehedule;
    private javax.swing.JLabel btnStop;
    private javax.swing.JComboBox<String> cbParameters;
    private javax.swing.JComboBox<String> cbSuitexml;
    private javax.swing.JComboBox<String> cbValue;
    private javax.swing.JCheckBox checkAllParamsfromProject;
    private javax.swing.JTextField edtProjectPath;
    private javax.swing.JLabel iconAndroid;
    private javax.swing.JLabel iconCloud;
    private javax.swing.JLabel iconLocal;
    private javax.swing.JLabel iconMobile;
    private javax.swing.JLabel iconiOS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listparamValues;
    private javax.swing.JPanel panelAdditionalSettings;
    private javax.swing.JPanel panelGeneralParams;
    private javax.swing.JPanel panelProjectbasedParams;
    private javax.swing.JRadioButton rbAndroid;
    private javax.swing.JRadioButton rbCloud;
    private javax.swing.JRadioButton rbHybridApp;
    private javax.swing.JRadioButton rbLocal;
    private javax.swing.JRadioButton rbNativeApp;
    private javax.swing.JRadioButton rbWeb;
    private javax.swing.JRadioButton rbiOS;
    private javax.swing.JLabel txtAndroid;
    private javax.swing.JLabel txtCloud;
    private javax.swing.JLabel txtExecutionLabHeader;
    private javax.swing.JLabel txtLocal;
    private javax.swing.JLabel txtMobileOS;
    private javax.swing.JLabel txtNetwork;
    private javax.swing.JLabel txtParams;
    private javax.swing.JLabel txtProjectPath;
    private javax.swing.JLabel txtService;
    private javax.swing.JLabel txtSuiteXmlFile;
    private javax.swing.JLabel txtValue;
    private javax.swing.JLabel txtiOS;
    // End of variables declaration
}
