package com.ExecutionLab.tables;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ProjectsTableModel extends AbstractTableModel {
    private final List<ProjectsTable> projectsLit;

    private final String[] columnNames = new String[] {
            "sNo", "Account", "Project", "Type", "Path"
    };
    private final Class[] columnClass = new Class[] {
            Boolean.class, String.class,String.class
    };

    public ProjectsTableModel(List<ProjectsTable> projectsList)
    {
        this.projectsLit = projectsList;
    }

    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {

        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        return projectsLit.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)    {
        ProjectsTable row = projectsLit.get(rowIndex);
        if(0 == columnIndex) {
            return row.getsNo();
        }
        else if(1 == columnIndex) {
            return row.getAccountName();
        }
       else if(2 == columnIndex){
            return row.getProjectName();
        }
        else if(3 == columnIndex){
            return row.getProjectType();
        }
        else if(4 == columnIndex){
            return row.getProjectPath();
        }

        return null;
    }
}
