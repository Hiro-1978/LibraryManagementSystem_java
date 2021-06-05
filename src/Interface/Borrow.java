package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.joda.time.LocalDate;

public class Borrow extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Borrow() {
        initComponents();
        conn = DBConnect.connect();
        autoId();
        LocalDate today = LocalDate.now();
        LocalDate reday = today.plusDays(10);
        txtbrdate.setText(today.toString());
        txtrdate.setText(reday.toString());
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmtype = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtbid = new javax.swing.JTextField();
        txtbtype = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtmark = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bntcl = new javax.swing.JButton();
        btnbr = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbrdate = new javax.swing.JTextField();
        txtrdate = new javax.swing.JTextField();
        txtbrno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbborrow = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("หน้ายืมหนังสือ");
        setPreferredSize(new java.awt.Dimension(970, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 480));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setText("เลขสมาชิก");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setText("ชื่อ-สกุล");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setText("ประเภทสมาชิก");

        txtmtype.setEditable(false);
        txtmtype.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtmid.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtmid.setForeground(new java.awt.Color(0, 0, 255));
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmidKeyReleased(evt);
            }
        });

        txtbid.setFont(new java.awt.Font("Tahoma", 0, 18));
        txtbid.setForeground(new java.awt.Color(0, 0, 255));
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });

        txtbtype.setEditable(false);
        txtbtype.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtbname.setEditable(false);
        txtbname.setFont(new java.awt.Font("Tahoma", 0, 14));

        txtmark.setEditable(false);
        txtmark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtmark.setForeground(new java.awt.Color(255, 0, 0));
        txtmark.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setText("รหัสหนังสือ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(143, 60, 16));
        jLabel14.setText("สถานะหนังสือ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setText("ชื่อหนังสือ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 16));
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setText("ประเภทสื่อ");

        bntcl.setFont(new java.awt.Font("Tahoma", 3, 17));
        bntcl.setForeground(new java.awt.Color(143, 60, 16));
        bntcl.setText("เคลียร์ข้อมูล");
        bntcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntclActionPerformed(evt);
            }
        });

        btnbr.setFont(new java.awt.Font("Tahoma", 3, 17));
        btnbr.setForeground(new java.awt.Color(143, 60, 16));
        btnbr.setText("ยืมหนังสือ");
        btnbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setText("วันที่ยืม");

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setText("กำหนดคืน");

        txtbrdate.setEditable(false);
        txtbrdate.setFont(new java.awt.Font("Tahoma", 2, 16));
        txtbrdate.setForeground(new java.awt.Color(0, 0, 255));
        txtbrdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtrdate.setEditable(false);
        txtrdate.setFont(new java.awt.Font("Tahoma", 2, 16));
        txtrdate.setForeground(new java.awt.Color(0, 0, 255));
        txtrdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtbrno.setEditable(false);
        txtbrno.setFont(new java.awt.Font("Tahoma", 1, 18));
        txtbrno.setForeground(new java.awt.Color(0, 0, 255));
        txtbrno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("รหัสยืมหนังสือ");

        tbborrow.setFont(new java.awt.Font("Tahoma", 0, 12));
        tbborrow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbborrow);

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtmid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(txtmtype, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(txtbid, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(txtbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(txtmark, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(txtrdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(txtbrdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtbrno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bntcl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnbr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtmtype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtbid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(txtbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(txtmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtbname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtrdate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtbrdate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtbrno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(bntcl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnbr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autoId() {
        try {
            String sql = "SELECT `br_no` FROM `bookborrow` ORDER BY bid DESC LIMIT 1";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("br_no");
                int co = rnno.length();
                String txt = rnno.substring(0, 2); // เพื่อให้เป็น PF01
                String num = rnno.substring(2, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                txtbrno.setText(ftxt);
            } else {
                txtbrno.setText("BR101");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void txtmidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyReleased
        try {
            String sql = "SELECT `mname`, `type` FROM `addmember` WHERE mid='" + txtmid.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtname.setText(rs.getString("mname"));
                txtmtype.setText(rs.getString("type"));
            } else {
                txtname.setText("");
                txtmtype.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtmidKeyReleased

    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
        try {
            String sql = "SELECT `bname`, `type`, `mark` FROM `addbook` WHERE bid='" + txtbid.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                txtbname.setText(rs.getString("bname"));
                txtbtype.setText(rs.getString("type"));
                txtmark.setText(rs.getString("mark"));
            } else {
                txtbname.setText("");
                txtbtype.setText("");
                txtmark.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtbidKeyReleased

    private void showdata() {

        tbborrow.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `br_no`AS รหัสยืมหนังสือ, `mid`AS หมายเลขสมาชิก, `mname`AS ชื่อสมาชิก, `bid`AS รหัสหนังสือ, `bname`AS ชื่อหนังสือ,"
                + " `b_date`AS วันที่ยืม, `r_date`AS กำหนดคืน FROM `bookborrow`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tbborrow.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clear() {
        txtbid.setText("");
        txtmid.setText("");
        txtbtype.setText("");
        txtbname.setText("");
        txtname.setText("");
        txtmtype.setText("");
        txtmark.setText("");
    }

    private void update() {
        try {
            String sql = "UPDATE `addbook` SET `mark`='ไม่อยู่' WHERE bid='" + txtbid.getText() + "'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "รายการยืมเสร็จเรียบร้อย");
            showdata();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrActionPerformed
        String rno = txtbrno.getText();
        String mid = txtmid.getText().toUpperCase();
        String mname = txtname.getText();
        String bid = txtbid.getText().toUpperCase();
        String bname = txtbname.getText();
        String idate = txtbrdate.getText();
        String rdate = txtrdate.getText();
        String mark = txtmark.getText();
           if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (txtbname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ข้อมูลไม่ครบ", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(txtmark.getText().equals("ไม่อยู่")) {
            JOptionPane.showMessageDialog(null, "หนังสือเล่มนี้ไม่อยู่", "Warning", JOptionPane.WARNING_MESSAGE);
            txtbid.setText("");
            txtbname.setText("");
            txtbtype.setText("");
            txtmark.setText("");
        } else {
            try {
                String sql = "INSERT INTO `bookborrow`(`br_no`, `mid`, `mname`, `bid`, `bname`, `b_date`, `r_date`, `mark`) VALUES "
                        + "('" + rno + "','" + mid + "','" + mname + "','" + bid + "','" + bname + "','" + idate + "','" + rdate + "','ไม่อยู่')";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                //JOptionPane.showMessageDialog(null, "รายการยืมเสร็จเรียบร้อย");
            } catch (Exception e) {
                e.printStackTrace();
            }
            update();
            clear();
            autoId();
            showdata();
        }
    }//GEN-LAST:event_btnbrActionPerformed

    private void bntclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntclActionPerformed
        clear();
    }//GEN-LAST:event_bntclActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntcl;
    private javax.swing.JButton btnbr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTable tbborrow;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbrdate;
    private javax.swing.JTextField txtbrno;
    private javax.swing.JTextField txtbtype;
    private javax.swing.JTextField txtmark;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmtype;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtrdate;
    // End of variables declaration//GEN-END:variables
}
