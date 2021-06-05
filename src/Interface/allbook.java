package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class allbook extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public allbook() {
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
        tballbook = new javax.swing.JTable();

        setClosable(true);
        setTitle("หน้าเพิ่มหนังสือ");
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
        jLabel2.setText("ค้นหาหนังสือ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 110, 40));

        txtsearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 190, 30));

        jLabel13.setFont(new java.awt.Font("Kanit", 3, 45)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setText("รายชื่อหนังสือทั้งหมด");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 70));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 80));

        btncl.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btncl.setForeground(new java.awt.Color(143, 60, 16));
        btncl.setText("เคลียร์ข้อมูล");
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });
        jPanel1.add(btncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 140, 30));

        tballbook.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tballbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tballbook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 920, 340));

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
    }//GEN-LAST:event_btnclActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        try {
            String sql = "SELECT `bid`AS รหัสหนังสือ, `bname`AS ชื่อหนังสือ, `code`AS บาร์โค้ด, `date`AS วันที่รับเข้า, "
                    + "`cat`AS หมวดหมู่, `type`AS ประเภทสื่อ, `pub`AS สำนักพิมพ์, `price`AS ราคา FROM `addbook`WHERE bname LIKE '%" + txtsearch.getText() + "%'";
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tballbook.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void showdata() {
        //tballbook.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        //tballbook.getTableHeader().setForeground(new Color(255, 255, 255));
        tballbook.getTableHeader().setBackground(new Color(255, 204, 51));
        String sql = "SELECT `bid`AS รหัสหนังสือ, `bname`AS ชื่อหนังสือ, `code`AS บาร์โค้ด, `date`AS วันที่รับเข้า, "
                + "`cat`AS หมวดหมู่, `type`AS ประเภทสื่อ, `pub`AS สำนักพิมพ์, `price`AS ราคา, `mark`AS สถานะ FROM `addbook`";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tballbook.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tballbook;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
