
package FormMhs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import loginform.FLogin;

public class FUser extends javax.swing.JFrame {

    private String nim;
    private Statement ST;
    private ResultSet RS;
    private Connection CN = KoneksiDB.ConnectDatabase.OpenConn();
    
    public FUser(String nim) {
        initComponents();
        setLocationRelativeTo(null);
        setNim(nim);
        TampilData();
    }

    // Metode setter untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    
private void TampilData() {
    try {
            Statement statement = CN.createStatement();
            String sql = "SELECT NIM, Nama, Alamat, Prodi, Email, Angkatan, Status FROM tb_data WHERE NIM = '" + nim + "'";
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                String nimData = resultSet.getString("NIM");
                String nama = resultSet.getString("Nama");
                String alamat = resultSet.getString("Alamat");
                String prodi = resultSet.getString("Prodi");
                String email = resultSet.getString("Email");
                String angkatan = resultSet.getString("Angkatan");
                String status = resultSet.getString("Status");

                // Menampilkan data ke komponen-komponen di FUser
                txtNIM.setText(nimData);
                txtNIM.setEditable(false);
                txtNama.setText(nama);
                txtNama.setEditable(false);
                txtAlamat.setText(alamat);
                txtAlamat.setEditable(false);
                txtProdi.setText(prodi);
                txtProdi.setEditable(false);
                txtEmail.setText(email);
                txtEmail.setEditable(false);
                txtAngkatan.setText(angkatan);
                txtAngkatan.setEditable(false);
                txtStatus.setText(status);
                txtStatus.setEditable(false);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}




    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAngkatan = new javax.swing.JTextField();
        btnClose = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(700, 425));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(625, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBg.setBackground(new java.awt.Color(102, 102, 102));
        pnlBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA SAYA");
        pnlBg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 190, 50));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Lengkap");
        pnlBg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, 30));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        pnlBg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 100, 30));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Program Studi");
        pnlBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 100, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        pnlBg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 100, 30));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Angkatan");
        pnlBg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 100, 30));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status");
        pnlBg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 100, 30));

        txtStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 320, -1));

        txtEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 320, -1));

        txtProdi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtProdi.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 320, -1));

        txtAlamat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAlamat.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 320, -1));

        txtNama.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNama.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 320, -1));

        txtNIM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNIM.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 320, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NIM");
        pnlBg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, 30));

        txtAngkatan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAngkatan.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtAngkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 320, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        pnlBg.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 20, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        pnlBg.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));

        getContentPane().add(pnlBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                FLogin loginForm = new FLogin();
                loginForm.setVisible(true);
                this.dispose();
            }
    }//GEN-LAST:event_btnCloseMouseClicked

    public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(FUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(FUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(FUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(FUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            String nim = "2109106041"; // Ganti dengan nim yang sesuai
            new FUser(nim).setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAngkatan;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtProdi;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
