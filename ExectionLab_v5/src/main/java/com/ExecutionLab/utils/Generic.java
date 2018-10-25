package com.ExecutionLab.utils;


import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;

/**
 *
 * @author bharat.vatrapu@gmail.com
 */

public class Generic {

    public void close(javax.swing.JFrame frame){
        frame.setVisible(false);
        frame.dispose();
    }

    public static String getDate(){
        String DateNow=null;
        try {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            DateNow = dateFormat.format(date);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return DateNow;
    }

    public static String choosePath(){
        String strPath = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose Path");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            strPath = chooser.getSelectedFile().toString();
        } else {
            JOptionPane.showMessageDialog(null,"Select Project Directory Path only!");
        }
        return strPath;
    }

    public static void openEXEfile(String filePath){
        try {
            Process p = Runtime.getRuntime().exec(new String[] {filePath});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSelectedRadioButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            System.out.println("testbg::"+button.getText());
            if (button.isSelected()) {
                return button.getText().toString();
            }
        }
        return null;
    }

    public static void initSetup(){
        createTables();
        createNewFolder(GlobalConstants.SETUP_FOLDER_PATH, GlobalConstants.ROOT_FOLDER);
        createNewFolder(GlobalConstants.ROOT_FOLDER_PATH, GlobalConstants.PROJECTS_FOLDER);
        createNewFile(GlobalConstants.ROOT_FOLDER_PATH+"/Bharath.txt");
    }
    public static void createTables(){
        if(!SQLLite.tableExists(GlobalConstants.tblPROJECTS)) {
            SQLLite.createProjectstable(GlobalConstants.PROJECTS_SQL_TABLE);
        }
        if(!SQLLite.tableExists(GlobalConstants.tblPROJECTPARAMS)){
            SQLLite.createProjectstable(GlobalConstants.PROJECTPARAMS_SQL_TABLE);
        }
        if(!SQLLite.tableExists(GlobalConstants.tblPROJECTPARAMVALUES)){
            SQLLite.createProjectstable(GlobalConstants.PROJECTPARAMVALUES_SQL_TABLE);
        }
    }

    public static void createNewFolder(String folderPath, String folderName) {

        String strfolderPath = folderPath+ "\\" +folderName;
        File file = new File(strfolderPath);
        if (!file.exists()) {
            file.mkdir();
        }

    }
    public static void createNewFile(String filePath) {

        File strFileExists;
        strFileExists = new File(filePath);
        boolean exists = strFileExists.exists();
        if(!exists) {
            try {
                //String desktopPath = System.getProperty("user.home") + "\\Desktop";
                File file = new File(filePath);
                if (file.createNewFile()) {
                    System.out.println("File is created!");
                } else {
                    System.out.println("File already exists.");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static boolean verifyFileExist(String filePath) {
        File strFileExists;
        strFileExists = new File(filePath);
        boolean exists = strFileExists.exists();
        return exists;
    }
}
