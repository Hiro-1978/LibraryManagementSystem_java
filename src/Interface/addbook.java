package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class addbook extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public addbook() {
        initComponents();
        conn = DBConnect.connect();
        autoId();
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbmid = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbnickname = new javax.swing.JLabel();
        lbbirth = new javax.swing.JLabel();
        lbgen = new javax.swing.JLabel();
        lbaddress = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        lbmtype = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtpub = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtbcode = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        cbbtype = new javax.swing.JComboBox();
        cbbcat = new javax.swing.JComboBox();
        txtdate = new com.toedter.calendar.JDateChooser();
        btnadd = new javax.swing.JButton();
        btncl = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbook = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("หน้าเพิ่มหนังสือ");
        setMaximumSize(new java.awt.Dimension(970, 530));
        setMinimumSize(new java.awt.Dimension(970, 530));
        setPreferredSize(new java.awt.Dimension(970, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kanit", 3, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setText("เพิ่มหนังสือ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 240, 70));

        lbmid.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbmid.setForeground(new java.awt.Color(143, 60, 16));
        lbmid.setText("รหัสหนังสือ");
        jPanel1.add(lbmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 40));

        lbname.setFont(new java.awt.Font("Tahoma", 3, 16));
        lbname.setForeground(new java.awt.Color(143, 60, 16));
        lbname.setText("ชื่อหนังสือ");
        jPanel1.add(lbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 100, 40));

        lbnickname.setFont(new java.awt.Font("Tahoma", 3, 16));
        lbnickname.setForeground(new java.awt.Color(143, 60, 16));
        lbnickname.setText("บาร์โค้ด");
        jPanel1.add(lbnickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 40));

        lbbirth.setFont(new java.awt.Font("Tahoma", 3, 16));
        lbbirth.setForeground(new java.awt.Color(143, 60, 16));
        lbbirth.setText("วันที่รับเข้า");
        jPanel1.add(lbbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 100, 40));

        lbgen.setFont(new java.awt.Font("Tahoma", 3, 16));
        lbgen.setForeground(new java.awt.Color(143, 60, 16));
        lbgen.setText("หมวดหมู่");
        jPanel1.add(lbgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, 40));

        lbaddress.setFont(new java.awt.Font("Tahoma", 3, 16));
        lbaddress.setForeground(new java.awt.Color(143, 60, 16));
        lbaddress.setText("สำนักพิมพ์");
        jPanel1.add(lbaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, -1));

        lbemail.setFont(new java.awt.Font("Tahoma", 3, 16));
        lbemail.setForeground(new java.awt.Color(143, 60, 16));
        lbemail.setText("ราคา (บาท)");
        jPanel1.add(lbemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 100, 20));

        lbmtype.setFont(new java.awt.Font("Tahoma", 3, 16));
        lbmtype.setForeground(new java.awt.Color(143, 60, 16));
        lbmtype.setText("ประเภทสื่อ");
        jPanel1.add(lbmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 20));

        txtbid.setEditable(false);
        txtbid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbid.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 100, 30));

        txtpub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpub.setPreferredSize(new java.awt.Dimension(69, 30));
        jPanel1.add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 150, -1));

        txtbname.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 320, 30));

        txtbcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtbcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 150, 30));

        txtprice.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 90, 30));

        cbbtype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbtype.setForeground(new java.awt.Color(143, 60, 16));
        cbbtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ระบุประเภท", "หนังสือ", "DVD", " " }));
        jPanel1.add(cbbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 30));

        cbbcat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbcat.setForeground(new java.awt.Color(143, 60, 16));
        cbbcat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ระบุหมวดหมู่", "บริหารธุรกิจ", "การตลาด", "สังคมศาสตร์", "ภาษาศาสตร์", "วิทยาศาสตร์", "วิทยาศาสตร์ประยุคต์", "ศิลปและการบันเทิง", "วรรณคดี", "ประวัติศาสตร์", "คอมพิวเตอร์", "เบ็ดเตล็ด..." }));
        jPanel1.add(cbbcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 120, 30));

        txtdate.setForeground(new java.awt.Color(255, 153, 0));
        txtdate.setDateFormatString("dd MMM yyyy");
        txtdate.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtdate.setMinSelectableDate(new java.util.Date(-45031615129000L));
        jPanel1.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 150, 30));

        btnadd.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(143, 60, 16));
        btnadd.setText("เพิ่มหนังสือ");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 160, 40));

        btncl.setFont(new java.awt.Font("Tahoma", 3, 14));
        btncl.setForeground(new java.awt.Color(143, 60, 16));
        btncl.setText("เคลียร์ข้อมูล");
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        jPanel1.add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 160, 40));

        btnupdate.setFont(new java.awt.Font("Tahoma", 3, 14));
        btnupdate.setForeground(new java.awt.Color(143, 60, 16));
        btnupdate.setText("แก้ไขข้อมูลหนังสือ");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 160, 40));

        btndelete.setFont(new java.awt.Font("Tahoma", 3, 14));
        btndelete.setForeground(new java.awt.Color(143, 60, 16));
        btndelete.setText("ลบข้อมูลหนังสือ");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 160, 40));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 180, 210));

        tbbook.setFont(new java.awt.Font("Tahoma", 0, 12));
        tbbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbbook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 920, 230));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String bid = txtbid.getText();
        String name = txtbname.getText();
        String code = txtbcode.getText();
        String date = ((JTextField) txtdate.getDateEditor().getUiComponent()).getText();
        String cat = cbbcat.getSelectedItem().toString();
        String type = cbbtype.getSelectedItem().toString();
        String pub = txtpub.getText();
        String price = txtprice.getText();

        if (txtbid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtbname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtbcode.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (((JTextField) txtdate.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbbcat.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbbtype.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtpub.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtprice.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "INSERT INTO `addbook`(`bid`, `bname`, `code`, `date`, `cat`, `type`, `pub`, `price`, `mark`) VALUES "
                        + "('" + bid + "','" + name + "','" + code + "','" + date + "','" + cat + "','" + type + "','" + pub + "','" + price + "','อยู่') ";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "เพิ่มหนังสือแล้ว");
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String bid = txtbid.getText();
        String name = txtbname.getText();
        String code = txtbcode.getText();
        String date = ((JTextField) txtdate.getDateEditor().getUiComponent()).getText();
        String cat = cbbcat.getSelectedItem().toString();
        String type = cbbtype.getSelectedItem().toString();
        String pub = txtpub.getText();
        String price = txtprice.getText();
        String sql = "UPDATE `addbook` SET `bname`='" + name + "',`code`='" + code + "',`date`='" + date + "',`cat`='" + cat + "',`type`='"
                + type + "',`pub`='" + pub + "',`price`='" + price + "' WHERE bid='" + bid + "'";
        if (txtbid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtbname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtbcode.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (((JTextField) txtdate.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbbcat.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbbtype.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtpub.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtprice.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลหนังสือแล้ว");
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String sql = "DELETE FROM `addbook` WHERE bid='" + txtbid.getText() + "'";
        if (txtbname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "เลือกหนังสือที่ต้องการลบข้อมูล", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                if (pst.executeUpdate(sql) != 1) {
                    JOptionPane.showMessageDialog(null, "ลบหนังสือข้อมูลแล้ว");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tbbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbookMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) tbbook.getModel();
        int selectrowindex = tbbook.getSelectedRow();
        txtbid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtbname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtbcode.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        ((JTextField) txtdate.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 3).toString());
        cbbcat.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        cbbtype.setSelectedItem(tmodel.getValueAt(selectrowindex, 5).toString());
        txtpub.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        txtprice.setText(tmodel.getValueAt(selectrowindex, 7).toString());

    }//GEN-LAST:event_tbbookMouseClicked

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        clearFild();
        autoId();
        showdata();
    }//GEN-LAST:event_btnclActionPerformed

    private void clearFild() {
        txtbid.setText("");
        txtbname.setText("");
        txtbcode.setText("");
        ((JTextField) txtdate.getDateEditor().getUiComponent()).setText("");
        cbbcat.setSelectedIndex(0);
        cbbtype.setSelectedIndex(0);
        txtpub.setText("");
        txtprice.setText("");
    }

    private void autoId() {
        try {
            String sql = "SELECT `bid` FROM `addbook` ORDER BY bid DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("bid");
                int co = rnno.length();
                String txt = rnno.substring(0, 2); // เพื่อให้เป็น PF01
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtbid.setText(ftxt);
            } else {
                txtbid.setText("BF101");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showdata() {
        //tbbook.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        // tbbook.getTableHeader().setForeground(new Color(255, 255, 255));
        tbbook.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `bid`AS รหัสหนังสือ, `bname`AS ชื่อหนังสือ, `code`AS บาร์โค้ด, `date`AS วันที่รับเข้า, "
                + "`cat`AS หมวดหมู่, `type`AS ประเภทสื่อ, `pub`AS สำนักพิมพ์, `price`AS ราคา, `mark`AS สถานะ FROM `addbook`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbbook.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncl;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cbbcat;
    private javax.swing.JComboBox cbbtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbaddress;
    private javax.swing.JLabel lbbirth;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbgen;
    private javax.swing.JLabel lbmid;
    private javax.swing.JLabel lbmtype;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbnickname;
    private javax.swing.JTable tbbook;
    private javax.swing.JTextField txtbcode;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpub;
    // End of variables declaration//GEN-END:variables
}
