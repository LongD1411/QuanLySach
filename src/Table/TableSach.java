/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import Model.HoaDonNhap;
import Model.Sach;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class TableSach extends AbstractTableModel{
    private String name[] = {"Mã sách","Tên sách","Thể loại","Nhà xuất bản","Số trang","Độ tuổi"};
    private Class classes[] = {String.class, String.class, String.class, String.class, Integer.class, String.class};
    
    private ArrayList<Sach> list = new ArrayList<Sach>();
    
    public TableSach(ArrayList<Sach> ds){
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
            case 0: return list.get(row).getMaSach();
            case 1: return list.get(row).getTenSach();
            case 2: return list.get(row).getTheLoai();
            case 3: return list.get(row).getNhaXB();
            case 4: return list.get(row).getSoTrang();
            case 5: return list.get(row).getDoTuoi();
            default: return false;
        }
    }
}
