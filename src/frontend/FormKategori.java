/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingUtilities;
/**
 *
 * @author raki
 */
public class FormKategori extends javax.swing.JFrame {

    /**
     * Creates new form FormKategori
     */
    public FormKategori() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdKategori = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtKeterangan = new java.awt.TextField();
        btnSimpan = new java.awt.Button();
        btnTambahBaru = new java.awt.Button();
        btnHapus = new java.awt.Button();
        txtCari = new java.awt.TextField();
        btnCari = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKategori = new javax.swing.JTable();
        btnCallFK = new javax.swing.JButton();
        btnCallFP = new javax.swing.JButton();
        btnCallFA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Kategori");

        jLabel1.setText("ID Kategori:");

        txtIdKategori.setEnabled(false);

        jLabel2.setText("Nama Kategori:");

        jLabel3.setText("Keterangan:");

        btnSimpan.setLabel("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnTambahBaru.setLabel("Tambah baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setLabel("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setLabel("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKategori);

        btnCallFK.setText("Form Buku");
        btnCallFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallFKActionPerformed(evt);
            }
        });

        btnCallFP.setText("Form Peminjaman");
        btnCallFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallFPActionPerformed(evt);
            }
        });

        btnCallFA.setText("Form Anggota");
        btnCallFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallFAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambahBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCallFK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCallFP)
                                .addGap(70, 70, 70)
                                .addComponent(btnCallFA))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTambahBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCallFP)
                    .addComponent(btnCallFA)
                    .addComponent(btnCallFK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Kategori kat = new Kategori(txtNama.getText(), txtKeterangan.getText());
        kat.setIdkategori(Integer.parseInt(txtIdKategori.getText()));
        kat.save();
        txtIdKategori.setText(Integer.toString(kat.getIdkategori()));
        tampilkanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblKategori.getModel();
        int row = tblKategori.getSelectedRow();

        Kategori kat = new Kategori().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        kat.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKategoriMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblKategori.getModel();
        int row = tblKategori.getSelectedRow();

        txtIdKategori.setText(model.getValueAt(row, 0).toString());
        txtNama.setText(model.getValueAt(row, 1).toString());
        txtKeterangan.setText(model.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblKategoriMouseClicked

    private void btnCallFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallFKActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(() -> {
            FormBuku fb = new FormBuku();
            fb.setVisible(true);
        });
    }//GEN-LAST:event_btnCallFKActionPerformed

    private void btnCallFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallFPActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(() -> {
            FormPeminjaman fp = new FormPeminjaman();
            fp.setVisible(true);
        });
    }//GEN-LAST:event_btnCallFPActionPerformed

    private void btnCallFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallFAActionPerformed
        // TODO add your handling code here:
        SwingUtilities.invokeLater(() -> {
            FormAnggota fa = new FormAnggota();
            fa.setVisible(true);
        });
    }//GEN-LAST:event_btnCallFAActionPerformed

    public void kosongkanForm(){
        txtIdKategori.setText("0");
        txtNama.setText("");
        txtKeterangan.setText("");
    }
    public void tampilkanData(){
        String[] kolom = {"id", "Nama", "Keterangan"};
        ArrayList<Kategori> list = new Kategori().getAll();
        Object rowData[] = new Object[3];
        
        tblKategori.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        for(Kategori kat:list){
            rowData[0] = kat.getIdkategori();
            rowData[1] = kat.getNama();
            rowData[2] = kat.getKeterangan();
            ((DefaultTableModel)tblKategori.getModel()).addRow(rowData);
        }
    }
        public void cari(String keyword){
        String[] kolom = {"id", "Nama", "Keterangan"};
        ArrayList<Kategori> list = new Kategori().search(keyword);
        Object rowData[] = new Object[3];
        
        tblKategori.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        for(Kategori kat:list){
            rowData[0] = kat.getIdkategori();
            rowData[1] = kat.getNama();
            rowData[2] = kat.getKeterangan();
            ((DefaultTableModel)tblKategori.getModel()).addRow(rowData);
        }
    }

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
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCallFA;
    private javax.swing.JButton btnCallFK;
    private javax.swing.JButton btnCallFP;
    private java.awt.Button btnCari;
    private java.awt.Button btnHapus;
    private java.awt.Button btnSimpan;
    private java.awt.Button btnTambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKategori;
    private java.awt.TextField txtCari;
    private java.awt.TextField txtIdKategori;
    private java.awt.TextField txtKeterangan;
    private java.awt.TextField txtNama;
    // End of variables declaration//GEN-END:variables
}
