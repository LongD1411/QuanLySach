/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import Model.TaiKhoan;
import Model.ThongKe;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author HP
 */
public class TableThongKe extends AbstractTableModel {
    private String name[] = {"Mã số thống kê","Mã sách","Ngày thống kê","Số lượng tồn"};
    private Class classes[] = {String.class,String.class,String.class,Integer.class};
    
    private ArrayList<ThongKe> list = new ArrayList<ThongKe>();
    
    public TableThongKe(ArrayList<ThongKe> ds){
        this.list = ds;
    } 
    @Override
    public int getRowCount() {
        return this.list.size(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColumnName(int i){
        return this.name[i];
    }
    @Override
    public int getColumnCount() {
        return this.name.length;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return list.get(row).getMaTK();
            case 1: return list.get(row).getMaSach();
             case 2: return list.get(row).getNgayTK();
              case 3: return list.get(row).getSoLuongTon();
            default: return false;
        }
    }
}
