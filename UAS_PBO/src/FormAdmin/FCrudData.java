
package FormAdmin;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import static java.awt.Color.gray;
import static java.awt.Color.magenta;
import static java.awt.Color.white;
import java.awt.Font;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import loginform.FLogin;


public class FCrudData extends javax.swing.JFrame {

   public Statement ST;
   public ResultSet RS;
   // = nama_package.namaclass.method
   Connection CN = KoneksiDB.ConnectDatabase.OpenConn();
    
   //LOAD
    public FCrudData() {
        initComponents();
        setLocationRelativeTo(null);
        Tampil();
        setJarak();
        
    }
    
    // ------------- FUNGSI BERSIHKAN DATA -------------
    private void Clear(){
        txtNIM.setText("");
        txtEmail.setText("");
        txtPass.setText("");
        txtNama.setText("");
        txtProdi.setText("");
        txtAlamat.setText("");
        txtAngkatan.setText("");
//        cmbStatus.removeAllItems();
        btnSimpan.setText("Simpan");
        txtNIM.setEditable(true);
    }
    
    // ------------- TAMPIL DATA -------------
private void Tampil() {
    try {
        ST = CN.createStatement();
        RS = ST.executeQuery("SELECT * FROM tb_data");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIM");
        model.addColumn("Password");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Prodi");
        model.addColumn("Email");
        model.addColumn("Angkatan");
        model.addColumn("Status");

        int jumlahData = 0;

        while (RS.next()) {
            String status = RS.getString("Status");
            if (status.equals("Aktif") || status.equals("Tidak Aktif")) {
                Object[] data = {
                    RS.getString("NIM"),
                    RS.getString("Password"),
                    RS.getString("Nama"),
                    RS.getString("Alamat"),
                    RS.getString("Prodi"),
                    RS.getString("Email"),
                    RS.getString("Angkatan"),
                    status
                };
                model.addRow(data);
                jumlahData++; 
            }
        }

        tblData.setModel(model);
        tblData.setBackground(Color.white);
        tblData.setForeground(Color.black);

        Font font = new Font("Arial", Font.PLAIN, 12);
        tblData.setFont(font);

        tblData.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JTableHeader header = tblData.getTableHeader();
        header.setBackground(new Color(57, 0, 143));
        header.setForeground(white);
        header.setFont(font);

        txtJumlah.setText(Integer.toString(jumlahData));
        txtJumlah.setEditable(false);

    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    private void setJarak() {
    TableColumnModel columnModel = tblData.getColumnModel();
    columnModel.getColumn(0).setPreferredWidth(100); // Mengatur lebar kolom pertama menjadi 100 piksel
    columnModel.getColumn(1).setPreferredWidth(150); // Mengatur lebar kolom kedua menjadi 150 piksel
    columnModel.getColumn(2).setPreferredWidth(200); // Mengatur lebar kolom kedua menjadi 150 piksel
    columnModel.getColumn(3).setPreferredWidth(150); // Mengatur lebar kolom kedua menjadi 150 piksel
    columnModel.getColumn(4).setPreferredWidth(150); // Mengatur lebar kolom kedua menjadi 150 piksel
    columnModel.getColumn(5).setPreferredWidth(150); // Mengatur lebar kolom kedua menjadi 150 piksel
    columnModel.getColumn(6).setPreferredWidth(150); // Mengatur lebar kolom kedua menjadi 150 piksel
    columnModel.getColumn(7).setPreferredWidth(150); // Mengatur lebar kolom kedua menjadi 150 piksel
}

    
    
    // ------------- CARI DATA -------------
    private void CariData() {
        try {
            ST = CN.createStatement();
            String cariQuery = "SELECT * FROM tb_data WHERE " +
                    cmbCari.getSelectedItem().toString() +
                    " LIKE '%" + txtCari.getText() + "%' AND (Status = 'Aktif' OR Status = 'Tidak Aktif')";
            RS = ST.executeQuery(cariQuery);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("NIM");
            model.addColumn("Password");
            model.addColumn("Nama");
            model.addColumn("Alamat");
            model.addColumn("Prodi");
            model.addColumn("Email");
            model.addColumn("Angkatan");
            model.addColumn("Status");

            while (RS.next()) {
                Object[] data = {
                    RS.getString("NIM"),
                    RS.getString("Password"),
                    RS.getString("Nama"),
                    RS.getString("Alamat"),
                    RS.getString("Prodi"),
                    RS.getString("Email"),
                    RS.getString("Angkatan"),
                    RS.getString("Status")
                };
                model.addRow(data);
            }

            tblData.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAngkatan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        txtNIM = new javax.swing.JTextField();
        cmbCari = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        txtJumlah = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1062, 616));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        pnlBg.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 20, 20));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Program Studi");
        pnlBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 30));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIM");
        pnlBg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 30));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        pnlBg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 30));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Lengkap");
        pnlBg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 30));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Angkatan");
        pnlBg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 100, 30));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        pnlBg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 30));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status");
        pnlBg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 100, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        pnlBg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 30));

        txtPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 320, -1));

        txtNama.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNama.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 320, -1));

        txtAlamat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAlamat.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 320, -1));

        txtProdi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtProdi.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtProdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 320, -1));

        txtEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 320, -1));

        txtAngkatan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAngkatan.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtAngkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 320, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jumlah Mahasiswa");
        pnlBg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 180, 50));

        txtCari.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCari.setForeground(new java.awt.Color(102, 102, 102));
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });
        pnlBg.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 230, -1));

        cmbStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbStatus.setForeground(new java.awt.Color(102, 102, 102));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Tidak Aktif" }));
        pnlBg.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 320, -1));

        txtNIM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNIM.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 320, -1));

        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM", "Nama", "Prodi", "Angkatan" }));
        pnlBg.add(cmbCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 110, -1));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        pnlBg.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        pnlBg.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        btnBatal.setText("Batal");
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatalMouseClicked(evt);
            }
        });
        pnlBg.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Password", "Nama", "Alamat", "Prodi", "Email", "Angkatan", "Status"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        pnlBg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, 430));

        txtJumlah.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtJumlah.setForeground(new java.awt.Color(102, 102, 102));
        pnlBg.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 110, -1));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cari Data");
        pnlBg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 110, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        pnlBg.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1130, 640));

        getContentPane().add(pnlBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

       // ------------- KLIK SIMPAN DATA  -------------
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            ST = CN.createStatement();
            //Data Kosong
            if(txtNIM.getText().equals("")||
                txtPass.getText().equals("")||
                txtNama.getText().equals("")||
                txtAlamat.getText().equals("")||
                txtEmail.getText().equals("")||
                txtAngkatan.getText().equals("")||
                txtProdi.getText().equals("")||
                cmbStatus.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Harap lengkapi semua data!", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //SIMPAN DATA
            if(btnSimpan.getText() == "Simpan"){
                //Cek dupe
                String cek = "SELECT * FROM tb_data WHERE NIM = '" + txtNIM.getText() + "'";
                RS = ST.executeQuery(cek);
                if(RS.next()){
                    JOptionPane.showMessageDialog(null, "NIM telah terdaftar..");
                } else {
                    String sql = "INSERT INTO tb_data VALUES ('" + txtNIM.getText()+
                    "','" + txtPass.getText() +
                    "','" + txtNama.getText() +
                    "','" + txtAlamat.getText() +
                    "','" + txtProdi.getText() +
                    "','" + txtEmail.getText() +
                    "','" + txtAngkatan.getText() +
                    "','" + cmbStatus.getSelectedItem().toString() + "')";
                    ST.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Data Mahasiswa berhasil disimpan");
                    Clear();
                    Tampil();
                }

            }else{
                //UBAH DATA
                String update = "UPDATE tb_data SET Password = '" + txtPass.getText() +
                "', Nama = '" + txtNama.getText() +
                "', Alamat = '" + txtAlamat.getText() +
                "', Prodi = '" + txtProdi.getText() +
                "', Email = '" + txtEmail.getText() +
                "', Angkatan = '" + txtAngkatan.getText() +
                "', Status = '" + cmbStatus.getSelectedItem().toString() +
                "' WHERE NIM = '" + txtNIM.getText() + "'";

                ST.executeUpdate(update);
                JOptionPane.showMessageDialog(null, "Data Mahasiswa berhasil disimpan");
                Clear();
                Tampil();

            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        String nim = txtNIM.getText();
        if (nim.equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String sql = "DELETE FROM tb_data WHERE NIM = ?";
                    PreparedStatement statement = (PreparedStatement) CN.prepareStatement(sql);
                    statement.setString(1, nim);
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        JOptionPane.showMessageDialog(null, "Data mahasiswa berhasil dihapus");
                        Tampil(); 
                        Clear(); 
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }

    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        Clear();
    }//GEN-LAST:event_btnBatalMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            FLogin loginForm = new FLogin();
            loginForm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow >= 0) {
            txtNIM.setText(tblData.getValueAt(selectedRow, 0).toString());
            txtPass.setText(tblData.getValueAt(selectedRow, 1).toString());
            txtNama.setText(tblData.getValueAt(selectedRow, 2).toString());
            txtAlamat.setText(tblData.getValueAt(selectedRow, 3).toString());
            txtProdi.setText(tblData.getValueAt(selectedRow, 4).toString());
            txtEmail.setText(tblData.getValueAt(selectedRow, 5).toString());
            txtAngkatan.setText(tblData.getValueAt(selectedRow, 6).toString());
            cmbStatus.setSelectedItem(tblData.getValueAt(selectedRow, 7).toString());

            txtNIM.setEditable(false);
            btnSimpan.setText("Update");
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        CariData();
    }//GEN-LAST:event_txtCariKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCrudData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnBatal;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtAngkatan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtProdi;
    // End of variables declaration//GEN-END:variables
}
