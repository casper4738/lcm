/*
 *  Author : fa
 *  Email  : casperadam91@gmail.com
 *  Blog   : fandy-alfa.blogspot.com
 *  IDE    : netbeans 7.2.x
 *  NOTEOOK ACER ASPIRE 4738
 */
package lcm.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import lcm.Plate;

/**
 *
 * @author fa
 */
public class TableModelResult extends AbstractTableModel {

    private List<Plate> list = new ArrayList<>();

    public TableModelResult() {
    }

    public void setList(List<Plate> list) {
        this.list = list;
        Collections.sort(list, new Comparator<Plate>() {

            @Override
            public int compare(Plate o1, Plate o2) {
                return o1.getPlate() - o2.getPlate();
            }
        });
    }

    public boolean add(Plate e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public Plate update(int index, Plate e) {
        try {
            return list.set(index, e);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Plate remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public Plate get(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getPlate()+1;
            case 1:
                return list.get(rowIndex).getType().toUpperCase();
            case 2:
                return list.get(rowIndex).getAnswer().toString().toUpperCase();
            case 3:
                return list.get(rowIndex).getCorrect();
            case 4:
                return list.get(rowIndex).isResult();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "PLATE";
            case 1:
                return "TYPE";
            case 2:
                return "ANSWER";
            case 3:
                return "CORRECT";
            case 4:
                return "RESULT";
            default:
                return null;
        }
    }

}