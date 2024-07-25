/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import pack1.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.*;

/**
 *
 * @author Windows 10 Pro
 */
public class ThongKe extends javax.swing.JPanel {
    final String header[] = {"Mã Hàng", "Ten Hàng", "Đơn Gía", "Số Lượng"};
    final String headerThongKe[] = {"Mã đơn hàng","Ngày tạo","Loại đơn hàng","Số Lượng"};
    final String headerHoaDon[] ={"Mã Hàng", "Ten Hàng",  "Số Lượng","Đơn Gía","Thành Tiền"};       
    final DefaultTableModel tb = new NonEditableTableModel(header, 0); 
    final DefaultTableModel tbThongKe = new NonEditableTableModel(headerThongKe, 0); 
    final DefaultTableModel tbHoaDon = new NonEditableTableModel(headerHoaDon, 0); 
    DBConnect db = new DBConnect();
    Connection conn;
    String tk;
    ArrayList<HangDb> arr = new ArrayList();
    /**
     * Creates new form ThongKe1
     */
    public ThongKe(String tk) {
        this.tk=tk;
        initComponents();
        LoadBang(tk);
    }
    
    public void Settk(String tk){
        this.tk=tk;
    }
    
    
    public void LoadBang(String tk){
        try {
            conn = db.getConnection();
            int number;
            Vector row;
            String sql;
            sql = "select MaHang,TenHang,DonGia,SoLuong from Hang where maKho = '"+tk + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {        
                    row.addElement(rs.getString(i));
                    
                }
                tb.addRow(row);
                TableTimKiem.setModel(tb);
               
              
            }
        } catch (Exception e) {
        }
        TableTimKiem.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try{
                    if(TableTimKiem.getSelectedRow()>=0){
                        conn = db.getConnection();    
                        String mahang = (String) TableTimKiem.getValueAt(TableTimKiem.getSelectedRow(), 0).toString();
                        String sql = "select DongHoaDon.maHoaDon,NgayLap,LoaiHD,SoLuong from (HoaDon inner join DongHoaDon on HoaDon.maHoaDon = DongHoaDon.maHoaDon) where DongHoaDon.maKho ='" + tk + "' and maHang = '" + mahang +"'" ;
                        Statement st = conn.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        ResultSetMetaData metadata = rs.getMetaData();
                        int number = metadata.getColumnCount();
                        tbThongKe.setRowCount(0);
                        while (rs.next()) {
                            Vector row = new Vector();
                            for (int i = 1; i <= number; i++) {        
                                row.addElement(rs.getString(i));

                            }
                            tbThongKe.addRow(row);

                        }
                        TableDongHoaDon.setModel(tbThongKe);
                        st.close();
                        rs.close();
                        conn.close();
                    }
                    
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
            
    }
    
    public void LoadDataToTable(){
        DefaultTableModel model = (DefaultTableModel) TableTimKiem.getModel();
        model.setRowCount(0);
        
        for(int i = 0; i < arr.size(); i++){
            Vector v = new Vector();
            v.add(arr.get(i).getMaHang());
            v.add(arr.get(i).getTenHang());
            v.add(arr.get(i).getDonGia());
            v.add(arr.get(i).getSoLuong());
            model.addRow(v);
        }
        TableTimKiem.setModel(model);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTimKiem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TimKiem_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDongHoaDon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TimKiemHD_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableHoaDon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_tongHD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tenkh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_diachi = new javax.swing.JTextField();

        setBackground(new java.awt.Color(246, 246, 174));

        TableTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TableTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã hàng", "Tên hàng", "Số lượng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTimKiem.setRowHeight(30);
        TableTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTimKiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTimKiem);

        jLabel1.setText("Sản phẩm : ");

        TimKiem_txt.setForeground(new java.awt.Color(140, 140, 140));
        TimKiem_txt.setText("tìm kiếm");
        TimKiem_txt.setToolTipText("tìm kiếm");
        TimKiem_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimKiem_txtMouseClicked(evt);
            }
        });
        TimKiem_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiem_txtKeyReleased(evt);
            }
        });

        TableDongHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableDongHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã đơn hàng", "Ngày tạo", "Loại đơn hàng", "Số lượng"
            }
        ));
        TableDongHoaDon.setRowHeight(30);
        jScrollPane2.setViewportView(TableDongHoaDon);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiem_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiem_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Mặt Hàng", jPanel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hóa Đơn: ");

        TimKiemHD_txt.setForeground(new java.awt.Color(140, 140, 140));
        TimKiemHD_txt.setToolTipText("tìm kiếm");
        TimKiemHD_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimKiemHD_txtMouseClicked(evt);
            }
        });
        TimKiemHD_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemHD_txtActionPerformed(evt);
            }
        });
        TimKiemHD_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiemHD_txtKeyReleased(evt);
            }
        });

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TableHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hàng", "Tên Hàng", "Số Lượng ", "Đơn Giá ", "Thành Tiền"
            }
        ));
        TableHoaDon.setRowHeight(30);
        jScrollPane3.setViewportView(TableHoaDon);
        if (TableHoaDon.getColumnModel().getColumnCount() > 0) {
            TableHoaDon.getColumnModel().getColumn(0).setMinWidth(150);
            TableHoaDon.getColumnModel().getColumn(0).setMaxWidth(150);
            TableHoaDon.getColumnModel().getColumn(2).setMinWidth(150);
            TableHoaDon.getColumnModel().getColumn(2).setMaxWidth(150);
            TableHoaDon.getColumnModel().getColumn(3).setMinWidth(150);
            TableHoaDon.getColumnModel().getColumn(3).setMaxWidth(150);
            TableHoaDon.getColumnModel().getColumn(4).setMinWidth(250);
            TableHoaDon.getColumnModel().getColumn(4).setMaxWidth(250);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tổng giá trị : ");

        txt_tongHD.setEditable(false);
        txt_tongHD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên khách hàng");

        txt_tenkh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tenkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenkhActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SĐT");

        txt_sdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Địa chỉ");

        txt_diachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TimKiemHD_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_tenkh))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tongHD, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txt_sdt)))
                    .addComponent(txt_diachi))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TimKiemHD_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_tongHD))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tenkh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_sdt)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hóa Đơn", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TableTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTimKiemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableTimKiemMouseClicked

    private void TimKiem_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimKiem_txtMouseClicked
        // TODO add your handling code here:
        TimKiem_txt.setText("");
    }//GEN-LAST:event_TimKiem_txtMouseClicked

    private void TimKiem_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiem_txtKeyReleased
        // TODO add your handling code here:
        arr.clear();
        long Gia = 0;
        try {
            conn = db.getConnection();
            if (TimKiem_txt.getText().isEmpty()){
                Gia = 0;
            }else if(TimKiem_txt.getText().chars().allMatch(Character::isDigit)){
                Gia = Long.parseLong(TimKiem_txt.getText());
            }
            String sql = "select * from Hang where (tenHang like N'%" + TimKiem_txt.getText() + "%' "
            + "or donGia="+ Gia + " or maHang like '%" + TimKiem_txt.getText()+"%') and maKho ='" + tk + "'" ;
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String maHang = rs.getString("MaHang");
                String tenHang = rs.getString("TenHang");
                long donGia = rs.getLong("DonGia");
                int soLuong = rs.getInt("SoLuong");
                HangDb book = new HangDb(maHang, tenHang, donGia, soLuong);
                arr.add(book);

            }
            conn.close();
            LoadDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_TimKiem_txtKeyReleased

    private void TimKiemHD_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimKiemHD_txtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemHD_txtMouseClicked

    private void TimKiemHD_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiemHD_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemHD_txtKeyReleased

    private void TimKiemHD_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemHD_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemHD_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            long TongHD = 0;
            String mahd = TimKiemHD_txt.getText();
            // TODO add your handling code here:
            conn = db.getConnection();
            int number;
            Vector row;
            String sql;
            sql ="select tenKh,sdt,diachi from HoaDon inner join KhachHang on HoaDon.MaKh = KhachHang.MaKh where MaHoaDon ='" + mahd +"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String tenkh = rs.getString(1);
                String sdt = rs.getString(2);
                String diachi = rs.getString(3);
                txt_tenkh.setText(tenkh);
                txt_sdt.setText(sdt);
                txt_diachi.setText(diachi);
            }
            
            sql = "select MaHang,TenHang,SoLuong,DonGia,ThanhTien from DongHoaDon where maKho = '"+tk + "'and maHoaDon ='" + mahd +"'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tbHoaDon.setRowCount(0);
            
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {        
                    row.addElement(rs.getString(i));
                }
                
                tbHoaDon.addRow(row);
            }
            TableHoaDon.setModel(tbHoaDon);
            for(int i=0;i<TableHoaDon.getRowCount();i++){
                String GiaHang = (String) TableHoaDon.getValueAt(i, 4).toString();
                long a =Long.parseLong(GiaHang); //convert
                TongHD +=a ;
                
            }
            String a = String.valueOf(TongHD);
            txt_tongHD.setText(a);
            
        } catch (SQLException ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_tenkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenkhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenkhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableDongHoaDon;
    private javax.swing.JTable TableHoaDon;
    private javax.swing.JTable TableTimKiem;
    private javax.swing.JTextField TimKiemHD_txt;
    private javax.swing.JTextField TimKiem_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tenkh;
    private javax.swing.JTextField txt_tongHD;
    // End of variables declaration//GEN-END:variables
}