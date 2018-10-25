package com.ExecutionLab.tables;

public class DashboardTable {

    private boolean selectName;
    private String name;
    private String dateofExecution;


    public DashboardTable(boolean selectName, String name, String dateofExecution){
        this.name = name;
        this.selectName = selectName;
        this.dateofExecution = dateofExecution;
    }


    public String getName() {
        return name;
    }
    public String getDateofExecution(){
        return dateofExecution;
    }

    public boolean isselectName()
    {
        return selectName;
    }

    public void setselectName(boolean select)
    {
        this.selectName = select;
    }
}
