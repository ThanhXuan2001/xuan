
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThanhXuan
 */
public class phukien extends javax.swing.JFrame {

    /**
     * Creates new form phukien
     */
   
    public phukien()  {
        initComponents();
        this.setLocationRelativeTo(null); 
       
    }
    String driver = "com.mysql.cj.jdbc.Driver";
       String url = "jdbc:mysql://localhost:3306/chomeo";
       String user = "root";
       String password = "";
       Statement st;
       ResultSet rs;
       private String header[] = {"ID", "TÊN SẢN PHẨM", "SỐ LUỌNG", "GIÁ"};
       private DefaultTableModel mdl = new DefaultTableModel(header, 0);
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblphukien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bntSua = new javax.swing.JButton();
        bntXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        bntNew = new javax.swing.JButton();
        tim = new javax.swing.JButton();
        bntThem = new javax.swing.JButton();
        thongke = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/4-removebg-preview.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ PHỤ KIỆN");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/phukien-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        tblphukien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153), 3));
        tblphukien.setForeground(new java.awt.Color(51, 51, 51));
        tblphukien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "       ID", "TÊN SẢN PHẨM", "    SỐ LƯỢNG", "     GIÁ THÀNH"
            }
        ));
        jScrollPane1.setViewportView(tblphukien);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("TÊN SẢN PHẨM");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("SỐ LƯỢNG");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("GIÁ THÀNH");

        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        txtSoluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        txtTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        txtGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        bntSua.setBackground(new java.awt.Color(255, 204, 153));
        bntSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntSua.setText("SỬA");
        bntSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSuaActionPerformed(evt);
            }
        });

        bntXoa.setBackground(new java.awt.Color(255, 204, 153));
        bntXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntXoa.setText("XÓA");
        bntXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(255, 204, 153));
        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        bntNew.setBackground(new java.awt.Color(255, 204, 153));
        bntNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntNew.setText("QUAY LẠI");
        bntNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNewActionPerformed(evt);
            }
        });

        tim.setBackground(new java.awt.Color(255, 204, 153));
        tim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tim.setText("TÌM");
        tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timActionPerformed(evt);
            }
        });

        bntThem.setBackground(new java.awt.Color(255, 204, 153));
        bntThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntThem.setText("THÊM");
        bntThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemActionPerformed(evt);
            }
        });

        thongke.setBackground(new java.awt.Color(255, 204, 153));
        thongke.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thongke.setText("THỐNG KÊ");
        thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntSua)
                    .addComponent(bntXoa)
                    .addComponent(btnThoat)
                    .addComponent(bntNew)
                    .addComponent(tim)
                    .addComponent(bntThem)
                    .addComponent(thongke))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntXoa)
                .addGap(11, 11, 11)
                .addComponent(bntSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tim)
                .addGap(18, 18, 18)
                .addComponent(bntThem)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addGap(18, 18, 18)
                .addComponent(thongke)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(bntNew)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(61, 61, 61)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void showDuLieu() {
      try {
      tblphukien.removeAll();
     String header[] = {"ID", "TÊN SẢN PHẨM", "SỐ LUỌNG", "GIÁ"};
     DefaultTableModel model = new DefaultTableModel(header, 0);
      Connection con = DriverManager.getConnection(url, user, password);
      String sql = " select *from qlpk";
      PreparedStatement ps= con.prepareStatement(sql);
      rs =ps.executeQuery();
      
       while(rs.next()){
           Vector vector = new Vector();
           vector.add(rs.getString("ID"));
           vector.add(rs.getString("TENSANPHAM"));
           vector.add(rs.getString("SOLUONG"));
           vector.add(rs.getString("GIA"));
           model.addRow(vector);
      }
         tblphukien.setModel(model);
         
       tblphukien.setModel(model);
        tblphukien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
              //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             if (tblphukien.getSelectedRow()>= 0){
                 txtId.setText(tblphukien.getValueAt(tblphukien.getSelectedRow(), 0)+"");
                 txtTen.setText(tblphukien.getValueAt(tblphukien.getSelectedRow(), 1)+"");
                 txtSoluong.setText(tblphukien.getValueAt(tblphukien.getSelectedRow(), 2)+"");
                 txtGia.setText(tblphukien.getValueAt(tblphukien.getSelectedRow(), 3)+"");
        
     }
             
             }
         } ); 
         
      }catch(SQLException e){
          e.printStackTrace();
      }
  }
   public void xoa(){
       txtId.setText("");
       txtGia.setText("");
       txtTen.setText("");
       txtSoluong.setText("");
   }
  private boolean checkID (){
       try{
          Class.forName(driver);
          Connection con = DriverManager.getConnection(url, user, password);
          String sql =" select* from qlpk where  ID=?";
          PreparedStatement ps= con.prepareCall(sql);
           ps.setString(1,txtId.getText());
           rs = ps.executeQuery();
           while(rs.next()){
            return true; }
           }
       catch (Exception e){
           e.printStackTrace();
       }
       return false;
  }
    private void bntThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemActionPerformed
         if(txtId.getText().equals("")||txtTen.getText().equals("")||txtSoluong.equals("")||txtGia.equals("")){
             JOptionPane.showMessageDialog(this,"KHÔNG ĐỂ THÔNG TIN TRỐNG")  ;
             return;
           }
        if(checkID()== true){
             JOptionPane.showMessageDialog(this,"MÃ ID ĐÃ TỒN TẠI")  ;
             txtId.requestFocus();
             return;
        }
        else{
        
         try{
           Class.forName(driver);
           Connection con = DriverManager.getConnection(url, user, password);
           String sql = "insert into qlpk(ID,TENSANPHAM,SOLUONG,GIA) values (?,?,?,?)";
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setString(1,txtId.getText());
           ps.setString(2,txtTen.getText());
           ps.setString(3,txtSoluong.getText());
           ps.setString(4,txtGia.getText());
           int n=ps.executeUpdate();
           if(n!=0){
            JOptionPane.showMessageDialog(this,"ĐÃ THÊM")  ;
              showDuLieu();
              xoa();
            } 
           
       } catch (Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bntThemActionPerformed
}
    private void bntXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaActionPerformed
       if(txtId.getText().equals("")||txtTen.getText().equals("")||txtSoluong.equals("")||txtGia.equals("")){
             JOptionPane.showMessageDialog(this,"KHÔNG ĐỂ THÔNG TIN TRỐNG")  ;
             return;}
        int dk = JOptionPane.showConfirmDialog(null, " BẠN CÓ MUỐN XÓA", " XÓA ", JOptionPane.YES_NO_OPTION);
       if( dk != JOptionPane.YES_OPTION ){
           return ;}
      int position;
        position = tblphukien.getSelectedRow();
        String data = tblphukien.getModel().getValueAt(position, 0).toString();
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = " delete from qlpk where ID = ? ";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, data);
            ps.executeUpdate();
            showDuLieu();
            xoa();
            JOptionPane.showMessageDialog(null, "ĐÃ XÓA");
        }catch(Exception e){
          e.printStackTrace();
}      
    }//GEN-LAST:event_bntXoaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        showDuLieu();
    }//GEN-LAST:event_formComponentShown

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void bntSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaActionPerformed
       int position = tblphukien.getSelectedRow();
        String data = tblphukien.getModel().getValueAt(position, 0).toString();
        try{
           Class.forName(driver);
           Connection con = DriverManager.getConnection(url, user, password);
           String xoa = " delete from qlpk where ID = ? ";
            PreparedStatement pst= con.prepareStatement(xoa);
            pst.setString(1, data);
            pst.executeUpdate();
           
           String sql = "insert into qlpk(ID,TENSANPHAM,SOLUONG,GIA) values (?,?,?,?)";
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setString(1,txtId.getText());
           ps.setString(2,txtTen.getText());
           ps.setString(3,txtSoluong.getText());
           ps.setString(4,txtGia.getText());
           int n=ps.executeUpdate();
          
            showDuLieu();
            xoa();
       } catch (Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bntSuaActionPerformed

    private void bntNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNewActionPerformed
       xoa();
       showDuLieu();
    }//GEN-LAST:event_bntNewActionPerformed

    private void timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timActionPerformed
    try{
     Class.forName(driver);
     Connection con = DriverManager.getConnection(url, user, password);
     String sql = "select*from qlpk ";
  if (txtId.getText().length() > 0) {
          sql = sql + " where ID like '%" + txtId.getText() + "%'";
   }  
  if (txtTen.getText().length() > 0) {
          sql = sql + " where TENSANPHAM like '%" + txtTen.getText() + "%'";
   }  
  if (txtSoluong.getText().length() > 0) {
          sql = sql + " where SOLUONG like '%" + txtSoluong.getText() + "%'";
   }
  if (txtGia.getText().length() > 0) {
          sql = sql + " where GIA like '%" + txtGia.getText() + "%'";
   }
     st = con.createStatement();
     rs = st.executeQuery(sql);
     mdl.setRowCount(0);
     if (rs.isBeforeFirst() == false) {
         JOptionPane.showMessageDialog(this, "KHÔNG TÌM THẤY!");
           return;
 }
    
     while (rs.next()) {
     Vector  data = new Vector();
        data.add(rs.getString("ID"));
        data.add(rs.getString("TENSANPHAM"));
        data.add(rs.getString("SOLUONG"));
        data.add(rs.getString("GIA"));
        mdl.addRow(data);
   }
  tblphukien.setModel(mdl);
   
 }
    catch (Exception e){
           e.printStackTrace();
       }
    
      

    }//GEN-LAST:event_timActionPerformed

    private void thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkeActionPerformed
       try{
     Class.forName(driver);
     Connection con = DriverManager.getConnection(url, user, password);
     String sql = "select*from qlpk where Soluong < 10 ";
     st = con.createStatement();
     rs = st.executeQuery(sql);
     mdl.setRowCount(0);
     
     while (rs.next()) {
     Vector  data = new Vector();
        data.add(rs.getString("ID"));
        data.add(rs.getString("TENSANPHAM"));
        data.add(rs.getString("SOLUONG"));
        data.add(rs.getString("GIA"));
        mdl.addRow(data);
   }
  tblphukien.setModel(mdl);
     
     
     }
    catch (Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_thongkeActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(phukien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(phukien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(phukien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(phukien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new phukien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNew;
    private javax.swing.JButton bntSua;
    private javax.swing.JButton bntThem;
    private javax.swing.JButton bntXoa;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblphukien;
    private javax.swing.JButton thongke;
    private javax.swing.JButton tim;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
