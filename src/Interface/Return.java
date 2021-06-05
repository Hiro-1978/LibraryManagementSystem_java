package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.joda.time.Days;
import org.joda.time.LocalDate;

public class Return extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Return() {
        initComponents();
        conn = DBConnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtlday = new javax.swing.JTextField();
        txtfine = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnreturn = new javax.swing.JButton();
        btnpt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtmname = new javax.swing.JLabel();
        txtbname = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtbrdate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtrtdate = new javax.swing.JLabel();
        btncl = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("หน้าคืนหนังสือ");
        setMaximumSize(new java.awt.Dimension(970, 530));
        setMinimumSize(new java.awt.Dimension(970, 530));
        setPreferredSize(new java.awt.Dimension(970, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel1.setForeground(new java.awt.Color(143, 60, 16));
        jLabel1.setText("รหัสหนังสือ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("หมายเลขสมาชิก");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("เกินกำหนดคืน (วัน)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setText("ค่าปรับ (บาท)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 140, 30));

        txtbid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });
        jPanel1.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 170, 30));

        txtmid.setEditable(false);
        txtmid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 30));

        txtlday.setEditable(false);
        txtlday.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtlday, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 170, 30));

        txtfine.setEditable(false);
        txtfine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 60));
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("รายการคืนหนังสือและค่าปรับ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(950, 79));
        jLabel2.setMinimumSize(new java.awt.Dimension(950, 79));
        jLabel2.setPreferredSize(new java.awt.Dimension(950, 79));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 950, 90));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 340, 300));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txtbill.setColumns(20);
        txtbill.setEditable(false);
        txtbill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 250, 280));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 270, 300));

        btnreturn.setFont(new java.awt.Font("Tahoma", 3, 30));
        btnreturn.setForeground(new java.awt.Color(143, 60, 16));
        btnreturn.setText("คืนหนังสือ");
        btnreturn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 425, 200, -1));

        btnpt.setFont(new java.awt.Font("Tahoma", 3, 30));
        btnpt.setForeground(new java.awt.Color(143, 60, 16));
        btnpt.setText("พิมพ์");
        btnpt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnptActionPerformed(evt);
            }
        });
        jPanel1.add(btnpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 425, 200, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 30));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setText("รายละเอียด");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 170, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setText("ชื่อสมาชิก");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 80, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setText("ชื่อหนังสือ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 80, 30));

        txtmname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 190, 30));

        txtbname.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 190, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setText("วันที่ยืม");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 80, 30));

        txtbrdate.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtbrdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 190, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setText("กำหนดคืน");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 80, 30));

        txtrtdate.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPanel1.add(txtrtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 190, 30));

        btncl.setFont(new java.awt.Font("Tahoma", 3, 30));
        btncl.setForeground(new java.awt.Color(143, 60, 16));
        btncl.setText("เคลียร์ข้อมูล");
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        jPanel1.add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 425, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
        try {
            String sql = "SELECT `br_no`, `mid`, `mname`, `bid`, `bname`, `b_date`, `r_date` FROM `bookborrow` "
                    + "WHERE bookborrow.bid='" + txtbid.getText() + "' and bookborrow.mark='ไม่อยู่'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtmid.setText(rs.getString("mid").toUpperCase());
                String days = rs.getString("r_date");
                txtmname.setText(rs.getString("mname"));
                txtbname.setText(rs.getString("bname"));
                txtbrdate.setText(rs.getString("b_date"));
                txtrtdate.setText(rs.getString("r_date"));
                LocalDate today = LocalDate.now();
                LocalDate reday = LocalDate.parse(days);
                int ldays = Days.daysBetween(reday, today).getDays();
                if (ldays > 0) {
                    txtlday.setText(Integer.toString(ldays));
                    int fine = ldays * 2;
                    txtfine.setText(Integer.toString(fine));
                } else {
                    txtlday.setText("0");
                    txtfine.setText("0");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtbidKeyReleased

    private void bill() {
        Format nowDay = new SimpleDateFormat(" dd MMMM yyyy", new Locale("th", "TH"));
        txtbill.setText("========================" + "\n"
                + "            Petfriends Library Book" + "\n"
                + "========================" + "\n"
                + "\n"
                + " วันที่" + nowDay.format(new Date()) + "\n"
                + "\n"
                + " หมายเลขสมาชิก  " + txtmid.getText().toUpperCase() + "\n"
                + " ชื่อสมาชิก  " + txtmname.getText() + "\n"
                + " รหัสหนังสือ  " + txtbid.getText().toUpperCase() + "\n"
                + "\n"
                + " วันที่เกินกำหนด\t" + txtlday.getText() + "  วัน\n"
                + " ค่าปรับ\t\t" + txtfine.getText() + "  บาท\n"
                + "\n"
                + "\n"
                + "      ***** ขอบคุณที่ใช้บริการ *****" + "\n"
                + "\n"
                + "========================");
    }

    private void update() {
        try {
            String sql = "UPDATE `addbook` SET `mark`='อยู่' WHERE bid='" + txtbid.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void retunMark() {
        try {
            String sql = "UPDATE `bookborrow` SET `mark`='อยู่' WHERE bid='" + txtbid.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtmid.setText("");
        txtbid.setText("");
        txtmname.setText("");
        txtbname.setText("");
        txtlday.setText("");
        txtfine.setText("");
        txtfine.setText("");
        txtbrdate.setText("");
        txtrtdate.setText("");
        txtbill.setText("");
    }

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        String bid = txtbid.getText();
        String mid = txtmid.getText();
        String ldate = txtlday.getText();
        String fine = txtfine.getText();
        if (txtbid.getText().trim().isEmpty()) {
            btnreturn.setEnabled(false);
        } else if (txtmid.getText().trim().isEmpty()) {
            btnreturn.setEnabled(false);
        } else {
            try {
                String sql = "INSERT INTO `bookreturn`(`bid`, `mid`, `l_date`, `fine`) VALUES "
                        + "('" + bid + "','" + mid + "','" + ldate + "','" + fine + "')";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                update();
                bill();
                retunMark();
                JOptionPane.showMessageDialog(null, "คืนหนังสือเสร็จเรียบร้อย");
                clear();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        clear();
    }//GEN-LAST:event_btnclActionPerformed

    private void btnptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnptActionPerformed
        if (txtbill.getText().trim().isEmpty()) {
            btnpt.setEnabled(false);
        } else {
            try {
                txtbill.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnptActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncl;
    private javax.swing.JButton btnpt;
    private javax.swing.JButton btnreturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JLabel txtbname;
    private javax.swing.JLabel txtbrdate;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtlday;
    private javax.swing.JTextField txtmid;
    private javax.swing.JLabel txtmname;
    private javax.swing.JLabel txtrtdate;
    // End of variables declaration//GEN-END:variables
}
