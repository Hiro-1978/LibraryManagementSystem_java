package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class login extends javax.swing.JFrame {

    Connection conn;

    public login() {
        super("Login");
        initComponents();
        conn = DBConnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        txtpword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        lbHead = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบบริการจัดการห้องสมุด Petfriends");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/LogoPF.png"))); // NOI18N
        jPanel1.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 273, 99));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/UserIcon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/PassIcon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        txtuname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtuname.setForeground(new java.awt.Color(143, 60, 16));
        jPanel1.add(txtuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 330, 40));

        txtpword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtpword.setForeground(new java.awt.Color(143, 60, 16));
        jPanel1.add(txtpword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 330, 40));

        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnlg.png"))); // NOI18N
        btnlogin.setBorder(null);
        btnlogin.setBorderPainted(false);
        btnlogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 100, 40));

        btnreset.setBackground(new java.awt.Color(255, 255, 255));
        btnreset.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnreset.setForeground(new java.awt.Color(255, 255, 255));
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnrs.png"))); // NOI18N
        btnreset.setBorder(null);
        btnreset.setBorderPainted(false);
        btnreset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 100, 40));

        btnexit.setBackground(new java.awt.Color(255, 255, 255));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 255, 255));
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnet.png"))); // NOI18N
        btnexit.setBorder(null);
        btnexit.setBorderPainted(false);
        btnexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 100, 40));

        lbHead.setFont(new java.awt.Font("Tahoma", 3, 40)); // NOI18N
        lbHead.setForeground(new java.awt.Color(143, 60, 16));
        lbHead.setText("Petfriends Library Book");
        jPanel1.add(lbHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 480, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(593, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtuname.setText("");
        txtpword.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        if (txtuname.getText().trim().isEmpty() && txtpword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtuname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtpword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อหรือรหัสผ่านผู้ใช้ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "Select * from admin where username=? and password=?";
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, txtuname.getText());
                pst.setString(2, txtpword.getText());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Petfriends Library Book ยินดีต้อนรับ");
                    setVisible(false);
                    Loading ld = new Loading();
                    ld.setUpLoading();
                    ld.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "ชื่อและรหัสผ่านไม่ถูกต้อง", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtuname.setText("");
                    txtpword.setText("");
                }
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
    }//GEN-LAST:event_btnloginActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHead;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JPasswordField txtpword;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}