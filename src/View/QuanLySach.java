/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Connect.ConnectionDatabase;
import Model.Sach;
import Table.TableHDNhap;
import Table.TableSach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class QuanLySach extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    DefaultTableModel hd = null;
    ArrayList<Sach> ds = new ArrayList<>();

    /**
     * Creates new form QuanLyHoaDon
     */
    public void laySach() {
        String sql = "select * from Sach";

        Connection conn = new ConnectionDatabase().getConn();
        Statement stm;
        try {
            stm = (Statement) conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String maSach = rs.getString("maSach");
                String tenSach = rs.getString("tenSach");
                String nhaXB = rs.getString("nhaXuatBan");
                String theLoai = rs.getString("theLoai");
                int soTrang = rs.getInt("soTrang");
                String dotuoi = rs.getString("doTuoi");
                Sach sach = new Sach(maSach, tenSach, nhaXB, theLoai, soTrang, dotuoi);
                ds.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadTable() {
        jtblSach.setModel(new TableSach(ds));
    }

    public QuanLySach() {
        initComponents();
        laySach();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblSach = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtfMaSach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfTenSach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfSoTrang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbtnThem = new javax.swing.JButton();
        jbtnSua = new javax.swing.JButton();
        jbtnXoa = new javax.swing.JButton();
        jbtnTmKiem = new javax.swing.JButton();
        jcmbNhaXuatBan = new javax.swing.JComboBox<>();
        jbtnQuayLai = new javax.swing.JButton();
        jcmbTheLoai = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcmbDoTuoi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("QUẢN LÝ SÁCH");

        jtblSach.setBackground(new java.awt.Color(102, 255, 102));
        jtblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Nhà xuất bản", "Thể loại", "Số trang", "Độ tuổi"
            }
        ));
        jScrollPane1.setViewportView(jtblSach);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã sách:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên sách:");

        jtfTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTenSachActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Thể loại:");

        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nhà xuất bản:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Số trang:");

        jbtnThem.setBackground(new java.awt.Color(102, 255, 102));
        jbtnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnThem.setText("Thêm");
        jbtnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThemActionPerformed(evt);
            }
        });

        jbtnSua.setBackground(new java.awt.Color(102, 255, 102));
        jbtnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnSua.setText("Sửa");
        jbtnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSuaActionPerformed(evt);
            }
        });

        jbtnXoa.setBackground(new java.awt.Color(102, 255, 102));
        jbtnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnXoa.setText("Xóa");
        jbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaActionPerformed(evt);
            }
        });

        jbtnTmKiem.setBackground(new java.awt.Color(102, 255, 102));
        jbtnTmKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnTmKiem.setText("Tìm kiếm");
        jbtnTmKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnTmKiemMouseClicked(evt);
            }
        });

        jcmbNhaXuatBan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcmbNhaXuatBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kim Đồng", "Bình Minh", "Giáo Dục", "Thiếu Niên" }));
        jcmbNhaXuatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbNhaXuatBanActionPerformed(evt);
            }
        });

        jbtnQuayLai.setBackground(new java.awt.Color(102, 255, 102));
        jbtnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnQuayLai.setText("Quay lại");
        jbtnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQuayLaiActionPerformed(evt);
            }
        });

        jcmbTheLoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcmbTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cổ tích", "Trinh thám", "Truyện ma", "Hành động", "Tình cảm" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Lứa tuổi:");

        jcmbDoTuoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcmbDoTuoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thiếu nhi", "Mấu giáo", "Tuổi mới lớn", "Người lớn" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmbDoTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcmbNhaXuatBan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfSoTrang, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmbTheLoai, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfMaSach, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfTenSach, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel5))
                                    .addComponent(jbtnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtnTmKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jbtnQuayLai)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnQuayLai))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jbtnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTmKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jcmbDoTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTenSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTenSachActionPerformed

    private void jbtnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuayLaiActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnQuayLaiActionPerformed

    private void jbtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThemActionPerformed
        String sql = "Insert into  Sach values (?,?,?,?,?,?)";
        Connection conn = new ConnectionDatabase().getConn();
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jtfMaSach.getText());
            pst.setString(2, jtfTenSach.getText());
            pst.setString(4, (String) jcmbTheLoai.getSelectedItem());
            pst.setString(3, (String) jcmbNhaXuatBan.getSelectedItem());
            pst.setInt(5, Integer.valueOf(jtfSoTrang.getText()));
            pst.setString(6, (String) jcmbDoTuoi.getSelectedItem());
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã có mã sách,nhập mã khác");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Nhập thiếu dữ liệu");
        }
        ds.clear();
        laySach();
        loadTable();
    }//GEN-LAST:event_jbtnThemActionPerformed

    private void jbtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSuaActionPerformed
        String sql = "Update  Sach set tenSach=? ,nhaXuatBan=? ,theLoai=? ,soTrang=?, doTuoi=? where maSach=?";
        Connection conn = new ConnectionDatabase().getConn();
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jtfTenSach.getText());
            pst.setString(6, jtfMaSach.getText());
            pst.setString(3, (String) jcmbTheLoai.getSelectedItem());
            pst.setString(2, (String) jcmbNhaXuatBan.getSelectedItem());
            pst.setInt(4, Integer.valueOf(jtfSoTrang.getText()));
            pst.setString(5, (String) jcmbDoTuoi.getSelectedItem());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
        ds.clear();
        laySach();
        loadTable();
    }//GEN-LAST:event_jbtnSuaActionPerformed

    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
        String sql = "Delete  Sach where maSach=?";
        Connection conn = new ConnectionDatabase().getConn();
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jtfMaSach.getText());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
        ds.clear();
        laySach();
        loadTable();
    }//GEN-LAST:event_jbtnXoaActionPerformed

    private void jbtnTmKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnTmKiemMouseClicked
        // TODO add your handling code here:
        ArrayList<Sach> timKiem = new ArrayList<>();
        for (Sach s : ds) {
            if (jtfMaSach.getText().equals(s.getMaSach())) {
                timKiem.add(s);
                jtfSoTrang.setText(String.valueOf(s.getSoTrang()));
                jtfTenSach.setText(s.getTenSach());
                for (int i = 0; i < jcmbNhaXuatBan.getItemCount(); i++) {
                    if (jcmbNhaXuatBan.getItemAt(i).toString().equals(s.getNhaXB())) {
                        System.out.println(s.getNhaXB());
                        jcmbNhaXuatBan.setSelectedIndex(i);
                        break;
                    }
                }
                for (int i = 0; i < jcmbDoTuoi.getItemCount(); i++) {
                    if (jcmbDoTuoi.getItemAt(i).toString().equals(s.getDoTuoi())) {
                        System.out.println(s.getNhaXB());
                        jcmbDoTuoi.setSelectedIndex(i);
                        break;
                    }
                }
                for (int i = 0; i < jcmbTheLoai.getItemCount(); i++) {
                    if (jcmbTheLoai.getItemAt(i).toString().equals(s.getTheLoai())) {
                        System.out.println(s.getNhaXB());
                        jcmbTheLoai.setSelectedIndex(i);
                        break;
                    }
                }
            }
            jtblSach.setModel(new TableSach(timKiem));
        }
    }//GEN-LAST:event_jbtnTmKiemMouseClicked

    private void jcmbNhaXuatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbNhaXuatBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbNhaXuatBanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnQuayLai;
    private javax.swing.JButton jbtnSua;
    private javax.swing.JButton jbtnThem;
    private javax.swing.JButton jbtnTmKiem;
    private javax.swing.JButton jbtnXoa;
    private javax.swing.JComboBox<String> jcmbDoTuoi;
    private javax.swing.JComboBox<String> jcmbNhaXuatBan;
    private javax.swing.JComboBox<String> jcmbTheLoai;
    private javax.swing.JTable jtblSach;
    private javax.swing.JTextField jtfMaSach;
    private javax.swing.JTextField jtfSoTrang;
    private javax.swing.JTextField jtfTenSach;
    // End of variables declaration//GEN-END:variables
}
