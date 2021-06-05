package Interface;

import com.mysql.jdbc.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Connection conn = null;

    public Home() {
        initComponents();
        clock();
        conn = DBConnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homeDesktop = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        lbpf = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        btnborrow = new javax.swing.JButton();
        btnreturn = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnaddBook = new javax.swing.JButton();
        btnaddMember = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnallmem = new javax.swing.JButton();
        btnallbook = new javax.swing.JButton();
        btnlend = new javax.swing.JButton();
        btnpend = new javax.swing.JButton();
        btnbackup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบบริการจัดการห้องสมุด Petfriends V.103");
        setMinimumSize(new java.awt.Dimension(1295, 695));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 8, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(1295, 695));
        jPanel1.setMinimumSize(new java.awt.Dimension(1295, 695));
        jPanel1.setPreferredSize(new java.awt.Dimension(1295, 695));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeDesktop.setBackground(new java.awt.Color(240, 240, 240));
        homeDesktop.setForeground(new java.awt.Color(240, 240, 240));
        homeDesktop.setPreferredSize(new java.awt.Dimension(970, 530));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/wallpaper.jpg"))); // NOI18N
        homeDesktop.add(jLabel4);
        jLabel4.setBounds(0, 0, 970, 530);

        jPanel1.add(homeDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 970, 530));

        lbpf.setFont(new java.awt.Font("Kanit", 3, 60)); // NOI18N
        lbpf.setForeground(new java.awt.Color(143, 60, 16));
        lbpf.setText("Petfriends Library Book");
        jPanel1.add(lbpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 750, 90));

        lbDate.setBackground(new java.awt.Color(255, 255, 255));
        lbDate.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        lbDate.setForeground(new java.awt.Color(0, 0, 255));
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 210, 40));

        lbTime.setBackground(new java.awt.Color(255, 255, 255));
        lbTime.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        lbTime.setForeground(new java.awt.Color(0, 0, 255));
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 210, 40));

        btnhome.setBackground(new java.awt.Color(255, 255, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/iconHome1.png"))); // NOI18N
        btnhome.setBorder(null);
        btnhome.setBorderPainted(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 60, 60));

        btnborrow.setBackground(new java.awt.Color(255, 255, 255));
        btnborrow.setFont(new java.awt.Font("Angsana New", 3, 40)); // NOI18N
        btnborrow.setForeground(new java.awt.Color(255, 255, 255));
        btnborrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnbr1.png"))); // NOI18N
        btnborrow.setBorder(null);
        btnborrow.setBorderPainted(false);
        btnborrow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnborrow.setMaximumSize(new java.awt.Dimension(170, 30));
        btnborrow.setMinimumSize(new java.awt.Dimension(170, 30));
        btnborrow.setPreferredSize(new java.awt.Dimension(170, 30));
        btnborrow.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnborrow.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnborrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrowActionPerformed(evt);
            }
        });
        jPanel1.add(btnborrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 160, 30));

        btnreturn.setBackground(new java.awt.Color(255, 255, 255));
        btnreturn.setFont(new java.awt.Font("Angsana New", 3, 40)); // NOI18N
        btnreturn.setForeground(new java.awt.Color(255, 255, 255));
        btnreturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnrt1.png"))); // NOI18N
        btnreturn.setBorder(null);
        btnreturn.setBorderPainted(false);
        btnreturn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnreturn.setPreferredSize(new java.awt.Dimension(170, 30));
        btnreturn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnreturn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 160, 30));

        btnexit.setBackground(new java.awt.Color(255, 255, 255));
        btnexit.setFont(new java.awt.Font("Angsana New", 3, 40)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 255, 255));
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnet1.png"))); // NOI18N
        btnexit.setBorder(null);
        btnexit.setBorderPainted(false);
        btnexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexit.setPreferredSize(new java.awt.Dimension(170, 30));
        btnexit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnexit.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 160, 30));

        btnaddBook.setBackground(new java.awt.Color(255, 255, 255));
        btnaddBook.setFont(new java.awt.Font("Angsana New", 3, 40)); // NOI18N
        btnaddBook.setForeground(new java.awt.Color(255, 255, 255));
        btnaddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnaddbook1.png"))); // NOI18N
        btnaddBook.setBorder(null);
        btnaddBook.setBorderPainted(false);
        btnaddBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnaddBook.setPreferredSize(new java.awt.Dimension(170, 30));
        btnaddBook.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnaddBook.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnaddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 160, 30));

        btnaddMember.setBackground(new java.awt.Color(255, 255, 255));
        btnaddMember.setFont(new java.awt.Font("Angsana New", 3, 40)); // NOI18N
        btnaddMember.setForeground(new java.awt.Color(255, 255, 255));
        btnaddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/btnaddmember1.png"))); // NOI18N
        btnaddMember.setBorder(null);
        btnaddMember.setBorderPainted(false);
        btnaddMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnaddMember.setPreferredSize(new java.awt.Dimension(170, 30));
        btnaddMember.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnaddMember.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnaddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddMemberActionPerformed(evt);
            }
        });
        jPanel1.add(btnaddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 160, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/img/logo2.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(260, 110));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 290, 110));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 42, 1290, 100));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 550));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(1295, 33));
        jToolBar1.setMinimumSize(new java.awt.Dimension(1295, 33));
        jToolBar1.setPreferredSize(new java.awt.Dimension(1300, 33));

        btnallmem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnallmem.setForeground(new java.awt.Color(143, 60, 16));
        btnallmem.setText("รายชื่อหนังสือ");
        btnallmem.setFocusable(false);
        btnallmem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnallmem.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnallmem.setMaximumSize(new java.awt.Dimension(200, 25));
        btnallmem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnallmem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallmemActionPerformed(evt);
            }
        });
        jToolBar1.add(btnallmem);

        btnallbook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnallbook.setForeground(new java.awt.Color(143, 60, 16));
        btnallbook.setText("รายชื่อสมาชิก");
        btnallbook.setFocusable(false);
        btnallbook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnallbook.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnallbook.setMaximumSize(new java.awt.Dimension(200, 25));
        btnallbook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnallbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallbookActionPerformed(evt);
            }
        });
        jToolBar1.add(btnallbook);

        btnlend.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlend.setForeground(new java.awt.Color(143, 60, 16));
        btnlend.setText("ประวัติการยืม");
        btnlend.setFocusable(false);
        btnlend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlend.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnlend.setMaximumSize(new java.awt.Dimension(200, 25));
        btnlend.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlendActionPerformed(evt);
            }
        });
        jToolBar1.add(btnlend);

        btnpend.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnpend.setForeground(new java.awt.Color(143, 60, 16));
        btnpend.setText("หนังสือที่ถูกยืมอยู่");
        btnpend.setFocusable(false);
        btnpend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpend.setMargin(new java.awt.Insets(2, 20, 2, 20));
        btnpend.setMaximumSize(new java.awt.Dimension(200, 25));
        btnpend.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnpend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpendActionPerformed(evt);
            }
        });
        jToolBar1.add(btnpend);

        btnbackup.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnbackup.setForeground(new java.awt.Color(143, 60, 16));
        btnbackup.setText("Backup And Restore");
        btnbackup.setFocusable(false);
        btnbackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackupActionPerformed(evt);
            }
        });
        jToolBar1.add(btnbackup);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1278, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void clock() {
        Thread clock = new Thread() {

            public void run() {
                try {
                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);

                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        lbTime.setText(hour + ":" + minute + ":" + second);
                        lbDate.setText(day + "-" + month + "-" + year);
                        sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        clock.start();
    }

    private void btnborrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrowActionPerformed
        homeDesktop.removeAll();
        Borrow br = new Borrow();
        homeDesktop.add(br).setVisible(true);
    }//GEN-LAST:event_btnborrowActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        homeDesktop.removeAll();
        Return rt = new Return();
        homeDesktop.add(rt).setVisible(true);
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
    if(JOptionPane.showConfirmDialog(this ,"ยืนยันการปิดโปรแกรม","ยืนยัน",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION)
    {System.exit(0);}
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnaddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddBookActionPerformed
        homeDesktop.removeAll();
        addbook adb = new addbook();
        homeDesktop.add(adb).setVisible(true);
    }//GEN-LAST:event_btnaddBookActionPerformed

    private void btnaddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddMemberActionPerformed
        homeDesktop.removeAll();
        addmember adm = new addmember();
        homeDesktop.add(adm).setVisible(true);
    }//GEN-LAST:event_btnaddMemberActionPerformed

    private void btnallmemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallmemActionPerformed
        homeDesktop.removeAll();
        allbook alb = new allbook();
        homeDesktop.add(alb).setVisible(true);
    }//GEN-LAST:event_btnallmemActionPerformed

    private void btnallbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallbookActionPerformed
        homeDesktop.removeAll();
        allmember alm = new allmember();
        homeDesktop.add(alm).setVisible(true);
    }//GEN-LAST:event_btnallbookActionPerformed

    private void btnlendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlendActionPerformed
        homeDesktop.removeAll();
        lendhis lend = new lendhis();
        homeDesktop.add(lend).setVisible(true);
    }//GEN-LAST:event_btnlendActionPerformed

    private void btnpendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpendActionPerformed
       homeDesktop.removeAll();
        pending pend = new pending();
        homeDesktop.add(pend).setVisible(true);
    }//GEN-LAST:event_btnpendActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        homeDesktop.removeAll();
        Home2 h2 = new Home2();
        homeDesktop.add(h2).setVisible(true);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackupActionPerformed
        homeDesktop.removeAll();
        SQLBackupAndRestore bk = new SQLBackupAndRestore();
        homeDesktop.add(bk).setVisible(true);
    }//GEN-LAST:event_btnbackupActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddBook;
    private javax.swing.JButton btnaddMember;
    private javax.swing.JButton btnallbook;
    private javax.swing.JButton btnallmem;
    private javax.swing.JButton btnbackup;
    private javax.swing.JButton btnborrow;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlend;
    private javax.swing.JButton btnpend;
    private javax.swing.JButton btnreturn;
    private javax.swing.JDesktopPane homeDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbpf;
    // End of variables declaration//GEN-END:variables
}
