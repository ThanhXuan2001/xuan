
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
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
public class thucpham extends javax.swing.JFrame {

    /**
     * Creates new form thucpham
     */
    public thucpham() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThucan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bntSua = new javax.swing.JButton();
        bntXoa = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        bntNew = new javax.swing.JButton();
        bntTim = new javax.swing.JButton();
        bntThem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/5-removebg-preview.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ THỨC ĂN");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/8-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblThucan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153), 3));
        tblThucan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "     MÃ ID", "TÊM SẢN PHẨM", "      SỐ LƯỢNG", "     GIÁ THÀNH"
            }
        ));
        jScrollPane1.setViewportView(tblThucan);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("TÊN SẢN PHẨM");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("SỐ LƯỢNG");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("GIÁ THÀNH");

        txtTen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        txtGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        txtSoluong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

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

        jToggleButton1.setBackground(new java.awt.Color(255, 204, 153));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("THỐNG KÊ");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
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

        bntTim.setBackground(new java.awt.Color(255, 204, 153));
        bntTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntTim.setText("TÌM");
        bntTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTimActionPerformed(evt);
            }
        });

        bntThem.setBackground(new java.awt.Color(255, 204, 153));
        bntThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntThem.setText("THÊM ");
        bntThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntNew)
                            .addComponent(jToggleButton1)
                            .addComponent(bntThem))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat)
                            .addComponent(bntTim)
                            .addComponent(bntSua)
                            .addComponent(bntXoa))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntTim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(bntThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntNew)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(txtTen)
                    .addComponent(txtSoluong)
                    .addComponent(txtGia))
                .addGap(0, 72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void showDuLieu() {
      try {
      tblThucan.removeAll();
      String header[] = {"ID", "TÊN SẢN PHẨM", "SỐ LUỌNG", "GIÁ"};
      DefaultTableModel model = new DefaultTableModel(header, 0);
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, user, password);
      String sql = " select *from qlta";
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
         tblThucan.setModel(model);
        tblThucan.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
              //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             if (tblThucan.getSelectedRow()>= 0){
                 txtId.setText(tblThucan.getValueAt(tblThucan.getSelectedRow(), 0)+"");
                 txtTen.setText(tblThucan.getValueAt(tblThucan.getSelectedRow(), 1)+"");
                 txtSoluong.setText(tblThucan.getValueAt(tblThucan.getSelectedRow(), 2)+"");
                 txtGia.setText(tblThucan.getValueAt(tblThucan.getSelectedRow(), 3)+"");
        
     }
             
             }
         } ); 
         
      }catch(Exception e){
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
          String sql =" select* from qlta where  ID=?";
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
             JOptionPane.showMessageDialog(this," KHÔNG ĐỂ THÔNG TIN TRỐNG")  ;
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
           String sql = "insert into qlta(ID,TENSANPHAM,SOLUONG,GIA) values (?,?,?,?)";
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setString(1,txtId.getText());
           ps.setString(2,txtTen.getText());
           ps.setString(3,txtSoluong.getText());
           ps.setString(4,txtGia.getText());
           int n=ps.executeUpdate();
          if(n!=0){
            JOptionPane.showMessageDialog(this,"ĐÃ THÊM ")  ;
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
      int position = tblThucan.getSelectedRow();
        String data = tblThucan.getModel().getValueAt(position, 0).toString();
        try{
          
            Connection con = DriverManager.getConnection(url, user, password);
            String sql = " delete from qlta where ID = ? ";
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, data);
            ps.executeUpdate();
            showDuLieu();
            xoa();
            JOptionPane.showMessageDialog(null, "ĐÃ XÓA");
        }
        catch(SQLException e){
          e.printStackTrace();
}           
    }//GEN-LAST:event_bntXoaActionPerformed
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      showDuLieu();
    }//GEN-LAST:event_formComponentShown

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

        
    private void bntSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaActionPerformed
       int position = tblThucan.getSelectedRow();
        String data = tblThucan.getModel().getValueAt(position, 0).toString();
        try{
           Class.forName(driver);
           Connection con = DriverManager.getConnection(url, user, password);
           String xoa = " delete from qlta where ID = ? ";
            PreparedStatement pst= con.prepareStatement(xoa);
            pst.setString(1, data);
            pst.executeUpdate();
           
           String sql = "insert into qlta(ID,TENSANPHAM,SOLUONG,GIA) values (?,?,?,?)";
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

    private void bntTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTimActionPerformed
 try{
     Class.forName(driver);
     Connection con = DriverManager.getConnection(url, user, password);
     String sql = "select*from qlta ";
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
  tblThucan.setModel(mdl);
   
 }
    catch (Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_bntTimActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try{
     Class.forName(driver);
     Connection con = DriverManager.getConnection(url, user, password);
     String sql = "select*from qlta where Soluong < 10 ";
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
  tblThucan.setModel(mdl);
     
     
     }
    catch (Exception e){
           e.printStackTrace();
       }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(thucpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(thucpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(thucpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(thucpham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new thucpham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNew;
    private javax.swing.JButton bntSua;
    private javax.swing.JButton bntThem;
    private javax.swing.JButton bntTim;
    private javax.swing.JButton bntXoa;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblThucan;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
