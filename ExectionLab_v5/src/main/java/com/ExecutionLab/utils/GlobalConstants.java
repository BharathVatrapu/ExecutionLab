package com.ExecutionLab.utils;

import java.io.File;

public class GlobalConstants {

    public static String FS = File.separator;
    //Folder Names
    public static final String ROOT_FOLDER = "ExecutionLab_v5";
    public static String PROJECTS_FOLDER = "Projects";
    public static String PROJECT_NAME_FOLDER;
    public static String RESULTS_FOLDER = "Results";


    //Paths
    public static String SETUP_FOLDER_PATH = System.getProperty("user.home") +FS+"Documents";
    public static String ROOT_FOLDER_PATH = SETUP_FOLDER_PATH+FS+ROOT_FOLDER;
    public static String PROJECTS_FOLDER_PATH = ROOT_FOLDER_PATH+FS+PROJECTS_FOLDER;
    public static String RESULTS_FOLDER_PATH;

    public static String Project_Name;


    public static String tblPROJECTS = "PROJECTS";
    public static String tblPROJECTPARAMS = "PROJECTSPARAMS";
    public static String tblPROJECTPARAMVALUES = "PROJECTSPARAMVALUES";

    public static String PROJECTS_SQL_TABLE = "CREATE TABLE PROJECTS " +
            "(ACCOUNT_NAME TEXT NOT NULL," +
            " PROJECT_NAME TEXT NOT NULL," +
            " PROJECT_TYPE TEXT NOT NULL," +
            " PROJECT_PATH TEXT NOT NULL)";

    public static String PROJECTPARAMS_SQL_TABLE = "CREATE TABLE PROJECTSPARAMS " +
            "(PROJECT_NAME TEXT NOT NULL," +
            " PARAM_NAME TEXT NOT NULL)";

    public static String PROJECTPARAMVALUES_SQL_TABLE = "CREATE TABLE PROJECTSPARAMVALUES " +
            "(PROJECT_NAME TEXT NOT NULL," +
            " PARAM_NAME TEXT NOT NULL," +
            " PARAM_VALUE TEXT NOT NULL)";

}
