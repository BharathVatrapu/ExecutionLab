package com.ExecutionLab.tables;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DashboardTableModel extends AbstractTableModel {
    private final List<DashboardTable> executionList;

    private final String[] columnNames = new String[] {
            "Select", "Name", "Date of Execution"
    };
    private final Class[] columnClass = new Class[] {
            Boolean.class, String.class,String.class
    };

    public DashboardTableModel(List<DashboardTable> executionList)
    {
        this.executionList = executionList;
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
        return executionList.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)    {
        DashboardTable row = executionList.get(rowIndex);
        if(0 == columnIndex) {
            return row.isselectName();
        }
        else if(1 == columnIndex) {
            return row.getName();
        }
       else if(2 == columnIndex){
            return row.getDateofExecution();
        }
        return null;
    }
}
