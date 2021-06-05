package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class lendhis extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public lendhis() {
        initComponents();
        conn = DBConnect.connect();
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btncl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblend = new javax.swing.JTable();
        datebegin = new com.toedter.calendar.JDateChooser();
        dateend = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();

        setClosable(true);
        setTitle("ประวัติการยืมหนังสือ");
        setMaximumSize(new java.awt.Dimension(970, 530));
        setMinimumSize(new java.awt.Dimension(970, 530));
        setPreferredSize(new java.awt.Dimension(970, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setText("หมายเลขสมาชิก");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 150, 40));

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 150, 30));

        jLabel13.setFont(new java.awt.Font("Kanit", 3, 45)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setText("ประวัติการยืม");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 60));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 70));

        btncl.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btncl.setForeground(new java.awt.Color(143, 60, 16));
        btncl.setText("เคลียร์ข้อมูล");
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        jPanel1.add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, 131, 31));

        tblend.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblend);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 920, 320));

        datebegin.setForeground(new java.awt.Color(0, 0, 255));
        datebegin.setDateFormatString("yyyy-MM-dd");
        datebegin.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        datebegin.setMinSelectableDate(new java.util.Date(-62135791134000L));
        jPanel1.add(datebegin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 180, 30));

        dateend.setForeground(new java.awt.Color(0, 0, 255));
        dateend.setDateFormatString("yyyy-MM-dd");
        dateend.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jPanel1.add(dateend, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ตั้งแต่");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ถึง");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 50, 50));

        btnok.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnok.setForeground(new java.awt.Color(143, 60, 16));
        btnok.setText("ค้นข้อมูล");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel1.add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        txtsearch.setText("");
        showdata();
        ((JTextField) datebegin.getDateEditor().getUiComponent()).setText("");
        ((JTextField) dateend.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_btnclActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        try {
            String sql = "SELECT `br_no`AS รหัสยืมหนังสือ, `mid`AS หมายเลขสมาชิก, `mname`AS ชื่อสมาชิก, `bid`AS รหัสหนังสือ, `bname`AS ชื่อหนังสือ, `b_date`AS วันที่ยืม, `r_date`AS กำหนดคืน  "
                    + "FROM `bookborrow`WHERE mid LIKE '%" + txtsearch.getText() + "%'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblend.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        lendFilter();
    }//GEN-LAST:event_btnokActionPerformed

    private void lendFilter() {
        String FDate = ((JTextField) datebegin.getDateEditor().getUiComponent()).getText().toString();
        String TDate = ((JTextField) dateend.getDateEditor().getUiComponent()).getText().toString();
        if (FDate.length() > 0 && TDate.isEmpty() && FDate.isEmpty() && TDate.length() > 0) {
            JOptionPane.showMessageDialog(rootPane, "กรุณาระบุช่วงวันที่จะค้นหา", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (FDate.length() > 0 && TDate.length() > 0) {
            try {
                String reportSql = "SELECT `br_no`AS รหัสยืมหนังสือ, `mid`AS หมายเลขสมาชิก, `mname`AS ชื่อสมาชิก, `bid`AS รหัสหนังสือ, `bname`AS ชื่อหนังสือ, `b_date`AS วันที่ยืม, `r_date`AS กำหนดคืน  "
                        + "FROM `bookborrow` WHERE mid Like'%" + txtsearch.getText() + "%' and b_date between'" + FDate + "' and '" + TDate + "' ";
                pst = (PreparedStatement) conn.prepareStatement(reportSql);
                rs = pst.executeQuery();
                tblend.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "เลือกช่วงวันที่เพื่อดูข้อมูล");
        }
    }

    private void showdata() {
        //tblend.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        //tblend.getTableHeader().setForeground(new Color(255, 255, 255));
        tblend.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `br_no`AS รหัสยืมหนังสือ, `mid`AS หมายเลขสมาชิก, `mname`AS ชื่อสมาชิก, `bid`AS รหัสหนังสือ, `bname`AS ชื่อหนังสือ, `b_date`AS วันที่ยืม, `r_date`AS กำหนดคืน FROM `bookborrow`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblend.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncl;
    private javax.swing.JButton btnok;
    private com.toedter.calendar.JDateChooser datebegin;
    private com.toedter.calendar.JDateChooser dateend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblend;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
