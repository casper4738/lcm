/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm.component;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author casper
 */
public class TableCellRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        boolean bool = (boolean) value;
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        if(bool) {
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcm/resources/Check.png")));
        } else {
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lcm/resources/Delete.png")));
        }
        return label;
    }
    
}
