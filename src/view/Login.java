
package view;

import java.sql.*;
import javax.swing.JOptionPane;
import pack1.DBConnect;

public class Login extends javax.swing.JFrame {
    String tk="";

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }
  
    public Login(String tk) {
        initComponents();
        TaiKhoan_txt.setText(tk);
    }
    public Login() {
        initComponents();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TaiKhoan_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MatKhau_txt = new javax.swing.JPasswordField();
        Login_but = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(246, 246, 174));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setBackground(new java.awt.Color(248, 188, 30));
        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 140, 131));
        jLabel6.setText("HELLO,let's get started");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("copyright © company name All rights reserved");

        jLabel4.setText("Chưa có tài khoản ? ");

        jButton2.setBackground(new java.awt.Color(255, 183, 39));
        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("Đăng ký");
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton2FocusLost(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel8)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addGap(85, 85, 85))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 410, 500);

        Left.setBackground(new java.awt.Color(25, 174, 144));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(246, 246, 174));
        jLabel1.setText("Đăng Nhập");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tài Khoản");

        TaiKhoan_txt.setBackground(new java.awt.Color(25, 174, 144));
        TaiKhoan_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TaiKhoan_txt.setForeground(new java.awt.Color(255, 255, 255));
        TaiKhoan_txt.setBorder(null);
        TaiKhoan_txt.setDisabledTextColor(new java.awt.Color(246, 246, 174));
        TaiKhoan_txt.setSelectedTextColor(new java.awt.Color(246, 246, 174));
        TaiKhoan_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaiKhoan_txtActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu");

        MatKhau_txt.setBackground(new java.awt.Color(25, 174, 144));
        MatKhau_txt.setForeground(new java.awt.Color(255, 255, 255));
        MatKhau_txt.setBorder(null);
        MatKhau_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatKhau_txtActionPerformed(evt);
            }
        });

        Login_but.setBackground(new java.awt.Color(255, 93, 42));
        Login_but.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Login_but.setForeground(new java.awt.Color(255, 255, 255));
        Login_but.setText("Đăng Nhập");
        Login_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_butActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(246, 246, 174));

        jSeparator2.setForeground(new java.awt.Color(246, 246, 174));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(MatKhau_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Login_but, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(TaiKhoan_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))
                        .addGap(90, 90, 90))))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TaiKhoan_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MatKhau_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(Login_but, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jPanel1.add(Left);
        Left.setBounds(410, 0, 456, 556);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int cf = JOptionPane.showConfirmDialog(this, "Ban Co Phai Chu Kho Khong", "ThongBao!",JOptionPane.YES_NO_OPTION);            
            if (cf == JOptionPane.YES_OPTION) {
                XacNhan XacNhanFrame = new XacNhan();
                XacNhanFrame.setVisible(true);
                XacNhanFrame.pack();
                XacNhanFrame.setLocationRelativeTo(null); 
                this.dispose();
            } 
       /* SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null); 
        this.dispose();*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Login_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_butActionPerformed
        // TODO add your handling code here:
        DBConnect cn = new DBConnect();
        Connection c = null;
        try {
            c = cn.getConnection();
            String sql = "select * from Nguoidung where taikhoan=? and matkhau=?";
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1, TaiKhoan_txt.getText());
            String tk = TaiKhoan_txt.getText();
            pst.setString(2, MatKhau_txt.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                this.setVisible(false);
                MainJFrame m1 = new MainJFrame(tk);
                m1.setVisible(true);
                
               
                
                
            }else{
                JOptionPane.showMessageDialog(this, "SaiTaiKhoanHoacMatKhau");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_Login_butActionPerformed

    private void jButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2FocusLost

    private void TaiKhoan_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaiKhoan_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaiKhoan_txtActionPerformed

    private void MatKhau_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatKhau_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatKhau_txtActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JButton Login_but;
    private javax.swing.JPasswordField MatKhau_txt;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField TaiKhoan_txt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
