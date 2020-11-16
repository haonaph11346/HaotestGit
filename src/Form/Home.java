/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author viphn
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        pnlTrangThai = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        lblNoiDung = new javax.swing.JLabel();
        toolBar = new javax.swing.JToolBar();
        btNhansu = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btThongke = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btHethong = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btCanhan = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Info.png"))); // NOI18N
        lblTrangThai.setText(" Báo lỗi");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Alarm.png"))); // NOI18N

        javax.swing.GroupLayout pnlTrangThaiLayout = new javax.swing.GroupLayout(pnlTrangThai);
        pnlTrangThai.setLayout(pnlTrangThaiLayout);
        pnlTrangThaiLayout.setHorizontalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        pnlTrangThaiLayout.setVerticalGroup(
            pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrangThaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblNoiDung.setBackground(new java.awt.Color(204, 204, 204));
        lblNoiDung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/HR18.jpg"))); // NOI18N
        lblNoiDung.setOpaque(true);

        desktopPane.setLayer(lblNoiDung, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        toolBar.setRollover(true);

        btNhansu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User group.png"))); // NOI18N
        btNhansu.setText("Nhân sự");
        btNhansu.setFocusable(false);
        btNhansu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNhansu.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btNhansu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNhansu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhansuActionPerformed(evt);
            }
        });
        toolBar.add(btNhansu);
        toolBar.add(jSeparator2);

        btThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Bar chart.png"))); // NOI18N
        btThongke.setText("Thống kê");
        btThongke.setFocusable(false);
        btThongke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btThongke.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btThongke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongkeActionPerformed(evt);
            }
        });
        toolBar.add(btThongke);
        toolBar.add(jSeparator3);

        btHethong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Lists.png"))); // NOI18N
        btHethong.setText("Hệ thống");
        btHethong.setFocusable(false);
        btHethong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btHethong.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btHethong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btHethong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHethongActionPerformed(evt);
            }
        });
        toolBar.add(btHethong);
        toolBar.add(jSeparator1);

        btCanhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clien list.png"))); // NOI18N
        btCanhan.setText("Cá nhân");
        btCanhan.setFocusable(false);
        btCanhan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCanhan.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btCanhan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCanhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCanhanActionPerformed(evt);
            }
        });
        toolBar.add(btCanhan);
        toolBar.add(jSeparator4);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNhansuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhansuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNhansuActionPerformed

    private void btHethongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHethongActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_btHethongActionPerformed

    private void btThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongkeActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btThongkeActionPerformed

    private void btCanhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCanhanActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btCanhanActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCanhan;
    private javax.swing.JButton btHethong;
    private javax.swing.JButton btNhansu;
    private javax.swing.JButton btThongke;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblNoiDung;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
