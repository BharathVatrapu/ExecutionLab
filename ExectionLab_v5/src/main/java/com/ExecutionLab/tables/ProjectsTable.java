package com.ExecutionLab.tables;

public class ProjectsTable {

    private int sNo;
    private String accountName;
    private String projectName;
    private String projectType;
    private String projectPath;


    public ProjectsTable(int sno, String account, String project,String type,String path){
        this.sNo = sno;
        this.accountName = account;
        this.projectName = project;
        this.projectType = type;
        this.projectPath = path;
    }


    public int getsNo() {
        return sNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectType(){
        return projectType;
    }
    public String getProjectPath() {
        return projectPath;
    }
}
