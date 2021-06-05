package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class addmember extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public addmember() {
        initComponents();
        conn = DBConnect.connect();
        autoId();
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbmid = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbnickname = new javax.swing.JLabel();
        lbbirth = new javax.swing.JLabel();
        lbgen = new javax.swing.JLabel();
        lbaddress = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        lbcontrac = new javax.swing.JLabel();
        lbmtype = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtnickname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtemail = new javax.swing.JTextField();
        txtcontrac = new javax.swing.JTextField();
        cbmtype = new javax.swing.JComboBox();
        cbgen = new javax.swing.JComboBox();
        txtbirthday = new com.toedter.calendar.JDateChooser();
        btncl = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbmember = new javax.swing.JTable();

        setClosable(true);
        setTitle("หน้าเพิ่มสมาชิก");
        setMaximumSize(new java.awt.Dimension(970, 530));
        setMinimumSize(new java.awt.Dimension(970, 530));
        setPreferredSize(new java.awt.Dimension(970, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Kanit", 3, 45)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setText("เพิ่มสมาชิก");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 60));

        lbmid.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbmid.setForeground(new java.awt.Color(143, 60, 16));
        lbmid.setText("เลขสมาชิก");
        jPanel1.add(lbmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        lbname.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbname.setForeground(new java.awt.Color(143, 60, 16));
        lbname.setText("ชื่อ-นามสกุล");
        jPanel1.add(lbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 30));

        lbnickname.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbnickname.setForeground(new java.awt.Color(143, 60, 16));
        lbnickname.setText("ชื่อเล่น");
        jPanel1.add(lbnickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 30));

        lbbirth.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbbirth.setForeground(new java.awt.Color(143, 60, 16));
        lbbirth.setText("วันเกิด");
        jPanel1.add(lbbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, 30));

        lbgen.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbgen.setForeground(new java.awt.Color(143, 60, 16));
        lbgen.setText("เพศ");
        jPanel1.add(lbgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 40, 30));

        lbaddress.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbaddress.setForeground(new java.awt.Color(143, 60, 16));
        lbaddress.setText("ที่อยู่");
        jPanel1.add(lbaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 50, -1));

        lbemail.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbemail.setForeground(new java.awt.Color(143, 60, 16));
        lbemail.setText("อีเมล");
        jPanel1.add(lbemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 50, -1));

        lbcontrac.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbcontrac.setForeground(new java.awt.Color(143, 60, 16));
        lbcontrac.setText("เบอร์โทรศัพท์");
        jPanel1.add(lbcontrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, -1));

        lbmtype.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lbmtype.setForeground(new java.awt.Color(143, 60, 16));
        lbmtype.setText("ประเภทสมาชิก");
        jPanel1.add(lbmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 120, -1));

        txtmid.setEditable(false);
        txtmid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmid.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, 30));

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 30));

        txtnickname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtnickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 140, 30));

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 290, 80));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 210, 30));

        txtcontrac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtcontrac, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 140, 30));

        cbmtype.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmtype.setForeground(new java.awt.Color(143, 60, 16));
        cbmtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ประเภทของสมาชิก", "สัตวแพทย์", "ผู้ช่วยสัตวแพทย์", "เวชระเบียน", "กรูมมิ่ง", "Back Office", "HR", "Lab", "อื่นๆ ....", " " }));
        jPanel1.add(cbmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 160, 30));

        cbgen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbgen.setForeground(new java.awt.Color(143, 60, 16));
        cbgen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ระบุเพศ", "ชาย", "หญิง" }));
        jPanel1.add(cbgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 30));

        txtbirthday.setForeground(new java.awt.Color(255, 153, 0));
        txtbirthday.setDateFormatString("dd MMM yyyy");
        txtbirthday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbirthday.setMinSelectableDate(new java.util.Date(-45031615129000L));
        jPanel1.add(txtbirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, 30));

        btncl.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btncl.setForeground(new java.awt.Color(143, 60, 16));
        btncl.setText("เคลียร์ข้อมูล");
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        jPanel1.add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 150, 40));

        btnadd.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(143, 60, 16));
        btnadd.setText("เพิ่มข้อมูลสมาชิก");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 150, 40));

        btnupdate.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(143, 60, 16));
        btnupdate.setText("แก้ไขข้อมูลสมาชิก");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 150, 40));

        btndelete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(143, 60, 16));
        btndelete.setText("ลบข้อมูลสมาชิก");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 150, 40));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 170, 210));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 270));

        tbmember.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbmember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbmemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbmember);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 920, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String mid = txtmid.getText();
        String name = txtname.getText();
        String nic = txtnickname.getText();
        String date = ((JTextField) txtbirthday.getDateEditor().getUiComponent()).getText();
        String gender = cbgen.getSelectedItem().toString();
        String adress = txtaddress.getText();
        String email = txtemail.getText();
        String contac = txtcontrac.getText();
        String type = cbmtype.getSelectedItem().toString();
        if (txtmid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtnickname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (((JTextField) txtbirthday.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbgen.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtaddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtemail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtcontrac.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbmtype.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            String sql = "INSERT INTO `addmember`(`mid`, `mname`, `nick`, `birth`, `gen`, `address`, `email`, `contrac`, `type`) VALUES "
                    + "('" + mid + "','" + name + "','" + nic + "','" + date + "','" + gender + "','" + adress + "','" + email + "','" + contac + "','" + type + "')";
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลสมาชิกแล้ว");
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String mid = txtmid.getText();
        String name = txtname.getText();
        String nic = txtnickname.getText();
        String date = ((JTextField) txtbirthday.getDateEditor().getUiComponent()).getText();
        String gender = cbgen.getSelectedItem().toString();
        String adress = txtaddress.getText();
        String email = txtemail.getText();
        String contac = txtcontrac.getText();
        String type = cbmtype.getSelectedItem().toString();
        String sql = "UPDATE `addmember` SET `mname`='" + name + "',`nick`='" + nic + "',`birth`='" + date + "',`gen`='" + gender + "',`address`='"
                + adress + "',`email`='" + email + "',`contrac`='" + contac + "',`type`='" + type + "' WHERE mid='" + mid + "'";
        if (txtmid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtnickname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (((JTextField) txtbirthday.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbgen.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtaddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtemail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtcontrac.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbmtype.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลแล้ว");
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String sql = "DELETE FROM `addmember` WHERE mid='" + txtmid.getText() + "'";
        if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "เลือกสมาชิกที่ต้องการลบข้อมูล", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                if (pst.executeUpdate(sql) != 1) {
                    JOptionPane.showMessageDialog(null, "ลบข้อมูลแล้ว");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            clearFild();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tbmemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbmemberMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbmember.getModel();
        int selectrowindex = tbmember.getSelectedRow();
        txtmid.setText(model.getValueAt(selectrowindex, 0).toString());
        txtname.setText(model.getValueAt(selectrowindex, 1).toString());
        txtnickname.setText(model.getValueAt(selectrowindex, 2).toString());
        ((JTextField) txtbirthday.getDateEditor().getUiComponent()).setText(model.getValueAt(selectrowindex, 3).toString());
        cbgen.setSelectedItem(model.getValueAt(selectrowindex, 4).toString());
        txtaddress.setText(model.getValueAt(selectrowindex, 5).toString());
        txtemail.setText(model.getValueAt(selectrowindex, 6).toString());
        txtcontrac.setText(model.getValueAt(selectrowindex, 7).toString());
        cbmtype.setSelectedItem(model.getValueAt(selectrowindex, 8).toString());

    }//GEN-LAST:event_tbmemberMouseClicked

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        clearFild();
        autoId();
        showdata();
    }//GEN-LAST:event_btnclActionPerformed

    private void clearFild() {
        txtmid.setText("");
        txtname.setText("");
        txtnickname.setText("");
        ((JTextField) txtbirthday.getDateEditor().getUiComponent()).setText("");
        cbgen.setSelectedIndex(0);
        txtaddress.setText("");
        txtemail.setText("");
        txtcontrac.setText("");
        cbmtype.setSelectedIndex(0);
    }

    private void autoId() {
        try {
            String sql = "SELECT `mid` FROM `addmember` ORDER BY mid DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("mid");
                int co = rnno.length();
                String txt = rnno.substring(0, 2); // เพื่อให้เป็น PF01
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtmid.setText(ftxt);
            } else {
                txtmid.setText("PF101");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showdata() {

        String sql = "SELECT `mid`AS หมายเลขสมาชิก, `mname`AS ชื่อสมาชิก, `nick`AS ชื่อเล่น, `birth`AS วันเกิด, `gen`AS เพศ,"
                + " `address`AS ที่อยู่, `email`AS อีเมล, `contrac`AS เบอร์โทร, `type`AS ประเภทสมาชิก FROM `addmember`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbmember.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncl;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cbgen;
    private javax.swing.JComboBox cbmtype;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbaddress;
    private javax.swing.JLabel lbbirth;
    private javax.swing.JLabel lbcontrac;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbgen;
    private javax.swing.JLabel lbmid;
    private javax.swing.JLabel lbmtype;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbnickname;
    private javax.swing.JTable tbmember;
    private javax.swing.JTextArea txtaddress;
    private com.toedter.calendar.JDateChooser txtbirthday;
    private javax.swing.JTextField txtcontrac;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnickname;
    // End of variables declaration//GEN-END:variables
}
