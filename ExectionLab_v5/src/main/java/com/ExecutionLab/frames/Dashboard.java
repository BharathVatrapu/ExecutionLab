package com.ExecutionLab.frames;

/**
 *
 * @author bharat.vatrapu@gmail.com
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form DashBoard
     */
    public Dashboard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        panelTotalCount = new javax.swing.JPanel();
        txtTotal = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        panelPassCount = new javax.swing.JPanel();
        txtPass = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        panelFaileCount = new javax.swing.JPanel();
        txtFail = new javax.swing.JLabel();
        lbFail = new javax.swing.JLabel();
        panelSkippedCount = new javax.swing.JPanel();
        txtSkp = new javax.swing.JLabel();
        lbSkip = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTestNgReports = new javax.swing.JTable();
        piechart_pannel = new javax.swing.JPanel();
        btnOpenReport = new javax.swing.JLabel();
        btndeleteReport = new javax.swing.JLabel();
        lbDashboardText = new javax.swing.JLabel();
        lbDashboardLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        panelTotalCount.setBackground(new java.awt.Color(58, 132, 195));

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 28));
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setText("200");

        lbTotal.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbTotal.setText("# Total");

        javax.swing.GroupLayout panelTotalCountLayout = new javax.swing.GroupLayout(panelTotalCount);
        panelTotalCount.setLayout(panelTotalCountLayout);
        panelTotalCountLayout.setHorizontalGroup(
                panelTotalCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTotalCountLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTotal)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalCountLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        panelTotalCountLayout.setVerticalGroup(
                panelTotalCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTotalCountLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTotal)
                                .addContainerGap())
        );

        panelPassCount.setBackground(new java.awt.Color(92, 181, 91));

        txtPass.setFont(new java.awt.Font("Tahoma", 1, 28));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setText("200");

        lbPass.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbPass.setText("# Pass");

        javax.swing.GroupLayout panelPassCountLayout = new javax.swing.GroupLayout(panelPassCount);
        panelPassCount.setLayout(panelPassCountLayout);
        panelPassCountLayout.setHorizontalGroup(
                panelPassCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPassCountLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelPassCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelPassCountLayout.createSequentialGroup()
                                                .addComponent(txtPass)
                                                .addGap(0, 8, Short.MAX_VALUE))
                                        .addComponent(lbPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        panelPassCountLayout.setVerticalGroup(
                panelPassCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPassCountLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPass)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFaileCount.setBackground(new java.awt.Color(215, 83, 78));

        txtFail.setFont(new java.awt.Font("Tahoma", 1, 28));
        txtFail.setForeground(new java.awt.Color(255, 255, 255));
        txtFail.setText("200");

        lbFail.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbFail.setText("# Fail");

        javax.swing.GroupLayout panelFaileCountLayout = new javax.swing.GroupLayout(panelFaileCount);
        panelFaileCount.setLayout(panelFaileCountLayout);
        panelFaileCountLayout.setHorizontalGroup(
                panelFaileCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFaileCountLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelFaileCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelFaileCountLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lbFail))
                                        .addComponent(txtFail))
                                .addGap(27, 27, 27))
        );
        panelFaileCountLayout.setVerticalGroup(
                panelFaileCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFaileCountLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtFail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbFail)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSkippedCount.setBackground(new java.awt.Color(238, 172, 76));

        txtSkp.setFont(new java.awt.Font("Tahoma", 1, 28));
        txtSkp.setForeground(new java.awt.Color(255, 255, 255));
        txtSkp.setText("200");

        lbSkip.setFont(new java.awt.Font("Tahoma", 1, 14));
        lbSkip.setText("# Skip");

        javax.swing.GroupLayout panelSkippedCountLayout = new javax.swing.GroupLayout(panelSkippedCount);
        panelSkippedCount.setLayout(panelSkippedCountLayout);
        panelSkippedCountLayout.setHorizontalGroup(
                panelSkippedCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSkippedCountLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addGroup(panelSkippedCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbSkip)
                                        .addComponent(txtSkp))
                                .addContainerGap())
        );
        panelSkippedCountLayout.setVerticalGroup(
                panelSkippedCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSkippedCountLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSkp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSkip)
                                .addGap(17, 17, 17))
        );

        tblTestNgReports.setBackground(new java.awt.Color(153, 204, 255));
        tblTestNgReports.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTestNgReports.setSelectionBackground(new java.awt.Color(153, 0, 153));
        jScrollPane1.setViewportView(tblTestNgReports);

        piechart_pannel.setBackground(new java.awt.Color(153, 204, 255));
        piechart_pannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout piechart_pannelLayout = new javax.swing.GroupLayout(piechart_pannel);
        piechart_pannel.setLayout(piechart_pannelLayout);
        piechart_pannelLayout.setHorizontalGroup(
                piechart_pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 249, Short.MAX_VALUE)
        );
        piechart_pannelLayout.setVerticalGroup(
                piechart_pannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 213, Short.MAX_VALUE)
        );

        btnOpenReport.setFont(new java.awt.Font("Tahoma", 1, 14));
        btnOpenReport.setForeground(new java.awt.Color(102, 0, 102));
        btnOpenReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Open_in_Browser_32px.png")));
        btnOpenReport.setText("Open Report");
        btnOpenReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btndeleteReport.setFont(new java.awt.Font("Tahoma", 1, 14));
        btndeleteReport.setForeground(new java.awt.Color(102, 0, 102));
        btndeleteReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete_Document_32px.png")));
        btndeleteReport.setText("Delete Report");
        btndeleteReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        lbDashboardText.setFont(new java.awt.Font("Arial", 1, 24));
        lbDashboardText.setForeground(new java.awt.Color(102, 0, 102));
        lbDashboardText.setText("  Dashboard");

        lbDashboardLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Presentation_32px.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addComponent(btnOpenReport, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(btndeleteReport, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(piechart_pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(panelTotalCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(40, 40, 40)
                                                                .addComponent(panelPassCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(48, 48, 48)
                                                                .addComponent(panelFaileCount, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(45, 45, 45)
                                                                .addComponent(panelSkippedCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(305, 305, 305)
                                                .addComponent(lbDashboardLogo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbDashboardText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbDashboardLogo)
                                        .addComponent(lbDashboardText))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(panelTotalCount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelPassCount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(panelFaileCount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(piechart_pannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnOpenReport)
                                                        .addComponent(btndeleteReport)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(panelSkippedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel btnOpenReport;
    private javax.swing.JLabel btndeleteReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDashboardLogo;
    private javax.swing.JLabel lbDashboardText;
    private javax.swing.JLabel lbFail;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbSkip;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel panelFaileCount;
    private javax.swing.JPanel panelPassCount;
    private javax.swing.JPanel panelSkippedCount;
    private javax.swing.JPanel panelTotalCount;
    private javax.swing.JPanel piechart_pannel;
    private javax.swing.JTable tblTestNgReports;
    private javax.swing.JLabel txtFail;
    private javax.swing.JLabel txtPass;
    private javax.swing.JLabel txtSkp;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration
}

