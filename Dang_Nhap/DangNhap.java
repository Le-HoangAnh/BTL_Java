/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhap;

import MenuChuongTrinh.Menu;
import QL_DanhSachTaiSan.DBEngine;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DangNhap extends javax.swing.JFrame {
    ArrayList<TaiKhoan> dsTK = new ArrayList<>();
    TaiKhoan tk = new TaiKhoan();
    DBEngine db = new DBEngine();
    String fname = "dsTK.dat";

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        readData();
        setLocationRelativeTo(null);
        setTitle("Đăng nhập");
        jTextDN.setText("BTL");
        jPassMK.setText("BTL");
    }
    public void reset(){
        jTextDN.setText("");
        jPassMK.setText("");
    }
    
    public void readData(){
        try {
            dsTK=(ArrayList<TaiKhoan>) db.docFile(fname);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sách hiện tại rỗng!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc dữ liệu:\n" +ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveData(){
        try {            
            db.LuuFile(fname, dsTK);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi lưu dữ liệu:\n" +ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextDN = new javax.swing.JTextField();
        jPassMK = new javax.swing.JPasswordField();
        jLabelMK = new javax.swing.JLabel();
        jLabelDN = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonDN = new javax.swing.JButton();
        jButtonHuy = new javax.swing.JButton();
        jButtonDK = new javax.swing.JButton();
        jLabelTitl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 150, -1));
        jPanel1.add(jPassMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 150, -1));

        jLabelMK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMK.setText("Mật khẩu:");
        jPanel1.add(jLabelMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabelDN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDN.setText("Tên đăng nhập:");
        jPanel1.add(jLabelDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DangNhap/logoDHCNHN.jpg"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 156));

        jButtonDN.setText("Đăng nhập");
        jButtonDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDNActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 100, -1));

        jButtonHuy.setText("Hủy");
        jButtonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 70, -1));

        jButtonDK.setText("Đăng ký");
        jButtonDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDKActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 100, -1));

        jLabelTitl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitl.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabelTitl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 480, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDNActionPerformed
        // TODO add your handling code here:
        Menu mnForm = new Menu();
        String dn = jTextDN.getText();
        String mk = jPassMK.getText();
        tk = new TaiKhoan(dn,mk);
        if(dn.trim().length() == 0 || mk.trim().length() == 0) 
            JOptionPane.showMessageDialog(this,"Phải nhập đầy đủ thông tin!","Thông báo", JOptionPane.WARNING_MESSAGE);
        else if(dn.toLowerCase().equalsIgnoreCase("btl") 
                && mk.toLowerCase().equalsIgnoreCase("btl")
                ||dsTK.contains(tk)){
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
            mnForm.setVisible(true);
            this.dispose();
        }            
        else 
            JOptionPane.showMessageDialog(null, "Kiểm tra lại tên đăng nhập và mật khẩu!","Lỗi", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtonDNActionPerformed

    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButtonHuyActionPerformed

    private void jButtonDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDKActionPerformed
        // TODO add your handling code here:
        DangKy dkForm = new DangKy();
        dkForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDKActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDK;
    private javax.swing.JButton jButtonDN;
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JLabel jLabelDN;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMK;
    private javax.swing.JLabel jLabelTitl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassMK;
    private javax.swing.JTextField jTextDN;
    // End of variables declaration//GEN-END:variables
}
