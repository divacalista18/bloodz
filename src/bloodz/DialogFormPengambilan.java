/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bloodz;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ardalepa Muhamad
 */
public class DialogFormPengambilan extends javax.swing.JDialog {

    /**
     * Creates new form a
     */
    private static String[] pengambilan;
    private static String method;
    private static String gol_darah;
    private static String[] dataPengambilan;
    
    public DialogFormPengambilan(java.awt.Frame parent, boolean modal,String[] pengambilan,String method) {
        super(parent, modal);
        this.pengambilan = pengambilan;
        this.method = method;
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        lblIdPengambilan.setText(pengambilan[0]);
//        check create or edit
        if(method.equals("put")){ 
            dataPengambilan = Model.arrResult("SELECT "
                    + "id_pengambilan, "
                    + "id_kantong, "
                    + "nama_pasien, "
                    + "tgl_lahir,"
                    + "alamat, "
                    + "no_tlp, "
                    + "id_pasien "
                    + "FROM pengambilan JOIN pasien USING(id_pasien) WHERE id_pengambilan = '"+pengambilan[0]+"'");
            this.gol_darah = Model.stringResult("SELECT gol_darah from pengambilan join darah using(id_kantong) WHERE id_pengambilan = '"+pengambilan[0]+"'");
            lblIdPengambilan.setText(dataPengambilan[0]);
            cbGolDarah.setSelectedItem(gol_darah);
            tfNama.setText(dataPengambilan[2]);
            tfTglLahir.setText(dataPengambilan[3]);
            tfAlamat.setText(dataPengambilan[4]);
            tfNoTlp.setText(dataPengambilan[5]);
        }
        changeCbIdKantong((String)cbGolDarah.getSelectedItem());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblIdPengambilan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbGolDarah = new javax.swing.JComboBox<>();
        tfTglLahir = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        tfNoTlp = new javax.swing.JTextField();
        btnSimpanPendonoran = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        cbIdKantong = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblIdPengambilan.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblIdPengambilan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tambah Pengambilan");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Golongan Darah");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nama Pasien");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Tanggal Lahir(YYYY-MM-DD)");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Alamat");

        cbGolDarah.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cbGolDarah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));
        cbGolDarah.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGolDarahItemStateChanged(evt);
            }
        });

        tfTglLahir.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        tfNama.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        tfAlamat.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("No Telepon");

        tfNoTlp.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        btnSimpanPendonoran.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnSimpanPendonoran.setText("Simpan");
        btnSimpanPendonoran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPendonoranActionPerformed(evt);
            }
        });

        cbIdKantong.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("ID Kantong");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSimpanPendonoran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTglLahir)
                    .addComponent(cbGolDarah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(lblIdPengambilan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAlamat)
                    .addComponent(jSeparator5)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNoTlp)
                    .addComponent(cbIdKantong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdPengambilan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGolDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbIdKantong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSimpanPendonoran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanPendonoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPendonoranActionPerformed
        String idEditPasien = Model.stringResult("select id_pasien from pasien where nama_pasien = '"+tfNama.getText()
            +"' and tgl_lahir = '"+tfTglLahir.getText()+"'");

        if(method.equals("post")){
            String idPasienPengambilan;
            if (idEditPasien.isEmpty()) {
                String idCreatePasien = Model.stringResult("SELECT id_pasien FROM pasien ORDER BY id_pasien DESC LIMIT 1");
                idCreatePasien = idCreatePasien.isEmpty() ? "PA00001" : idCreatePasien;
                String sIdCreatePasien = "";
                for (int i = 2; i < 7; i++) {
                    sIdCreatePasien += idCreatePasien.charAt(i);
                }
                int iIdCreatePasien = Integer.parseInt(sIdCreatePasien)+1;

                if(iIdCreatePasien<10){
                    idCreatePasien= "PA0000"+iIdCreatePasien;
                }else if(iIdCreatePasien<100){
                    idCreatePasien= "PA000"+iIdCreatePasien;
                }else if(iIdCreatePasien<1000){
                    idCreatePasien= "PA00"+iIdCreatePasien;
                }else if(iIdCreatePasien<10000){
                    idCreatePasien= "PA0"+iIdCreatePasien;
                }else{
                    idCreatePasien= "PA"+iIdCreatePasien;
                }
                try{
                    Model.updOrIns("INSERT INTO pasien VALUES ('"
                        + idCreatePasien+"','"
                        + tfNama.getText()+"','"
                        + tfTglLahir.getText()+"','"
                        + tfAlamat.getText()+"','"
                        + tfNoTlp.getText()+"')"
                    );
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, e);

                }

                idPasienPengambilan = idCreatePasien;
            }else{

                Model.updOrIns("UPDATE pasien SET "
                    +"alamat = '"+ tfAlamat.getText()+"',"
                    +"no_tlp = '"+ tfNoTlp.getText()
                    +"' WHERE id_pasien = '"+idEditPasien+"'");
                idPasienPengambilan = idEditPasien;
            }
            Model.updOrIns("INSERT INTO pengambilan VALUES ('"
                + pengambilan[0]+"','"
                + cbIdKantong.getSelectedItem()+"','"
                + idPasienPengambilan+"','"
                + LocalDate.now()+"')"
            );
            Model.updOrIns("UPDATE darah SET status = 'Tidak tersedia' where id_kantong = '"+cbIdKantong.getSelectedItem()+"'");
            
            dispose();
            JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Data", "Informasi",1);
        // put
        }else{
            if (!idEditPasien.isEmpty()) {
                Model.updOrIns("UPDATE pasien SET "
                    +"alamat = '"+ tfAlamat.getText()+"', "
                    +"no_tlp = '"+ tfNoTlp.getText()
                    +"' WHERE id_pasien = '"+idEditPasien+"'"
                );
                Model.updOrIns("UPDATE pengambilan SET "
                    + "id_kantong = '"+cbIdKantong.getSelectedItem()+"', "
                    + "id_pasien = '"+idEditPasien+"' "
                    + "WHERE id_pengambilan = '"+dataPengambilan[0]+"'");
            }else{
                Model.updOrIns("UPDATE pasien SET "
                    +"nama_pasien = '"+ tfNama.getText()+"', "
                    +"tgl_lahir = '"+ tfTglLahir.getText()+"', "
                    +"alamat = '"+ tfAlamat.getText()+"', "
                    +"no_tlp = '"+ tfNoTlp.getText()
                    +"' WHERE id_pasien = '"+dataPengambilan[6]+"'");
                
            }
            Model.updOrIns("UPDATE darah SET status = 'Tersedia' where id_kantong = '"+dataPengambilan[1]+"'");
            Model.updOrIns("UPDATE darah SET status = 'Tidak tersedia' where id_kantong = '"+cbIdKantong.getSelectedItem()+"'");
            dispose();
            JOptionPane.showMessageDialog(this, "Berhasil Mengubah Data", "Informasi",1);
        }
    }//GEN-LAST:event_btnSimpanPendonoranActionPerformed

    private void cbGolDarahItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGolDarahItemStateChanged
        changeCbIdKantong((String)cbGolDarah.getSelectedItem());
    }//GEN-LAST:event_cbGolDarahItemStateChanged

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
            java.util.logging.Logger.getLogger(DialogFormPengambilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogFormPengambilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogFormPengambilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogFormPengambilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogFormPengambilan dialog = new DialogFormPengambilan(new javax.swing.JFrame(), true,pengambilan,method);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpanPendonoran;
    private javax.swing.JComboBox<String> cbGolDarah;
    private javax.swing.JComboBox<String> cbIdKantong;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblIdPengambilan;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNoTlp;
    private javax.swing.JTextField tfTglLahir;
    // End of variables declaration//GEN-END:variables

    private void changeCbIdKantong(String gol_darah) {
        DefaultComboBoxModel dcbmIdKantong = new DefaultComboBoxModel();
        ArrayList<ArrayList> darahs = Model.arrLi2Result("SELECT id_kantong FROM darah WHERE status = 'Tersedia' and gol_darah = '"+gol_darah+"'");
        if ("put".equals(method)&&gol_darah.equals(this.gol_darah)) {
            ArrayList<String> baru = new ArrayList<String>();
            baru.add(dataPengambilan[1]);
            darahs.add(baru);
        }
        if(darahs.size()>0){
            for (int i = 0; i < darahs.size(); i++) {
                dcbmIdKantong.addElement(darahs.get(i).get(0));
                cbIdKantong.setEnabled(true);
            }
        }else{
            dcbmIdKantong.addElement("Darah tidak tersedia");
            cbIdKantong.setEnabled(false);
        }
        cbIdKantong.setModel(dcbmIdKantong);
    }
}
