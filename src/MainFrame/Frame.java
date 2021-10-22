package MainFrame;

import Person.Pelanggan;
import Person.PostPerson;
import Stuff.AssetPelanggan;
import Stuff.PostAssets;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class Frame extends javax.swing.JFrame {
//    DEKLARASI VARIABEL GLOBAL BUAT NGAMBIL NAMA PETUGAS YG DIKIRIM DI KONSTRUKTOR
    String pet;
//    KONSTRUKTOR ADA PARAMETERNYA BUAT NGIRIM DATA DARI FRAME SEBELUMNYA
    public Frame(String usr) {
//        NGISI PET SAMA USR (NAMA PETUGAS)
        this.pet = usr;
//        SET OBJEK PETUGAS DIMASUKKIN KE ARRAYLIST
//        NGGA ADA VALUENYA KARNA STATIS
        storePerson.setPetugas();
        initComponents();
//        NYEMBUNYIIN PANEL
        jPanel7.setVisible(false);
//        NYEMBUNYIIN LABEL LOGOUT
        logout.setVisible(false);
//        FRAME BIAR DITENGAH
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        alamat = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        tjenis = new javax.swing.JTextField();
        berat = new javax.swing.JLabel();
        tberat = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        notif = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setTitle("Main Menu");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK)
        );
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insert Pelanggan");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 160, 50);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Barang");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pelanggan");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(230, 20, 140, 20);

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("List Data");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(160, 0, 200, 50);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(460, 10, 30, 30);

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        username.setText(pet
        );
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(370, 10, 120, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nama.setText("Nama Pelanggan");

        tnama.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
        tnama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tnamaFocusGained(evt);
            }
        });
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        talamat.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
        talamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                talamatFocusGained(evt);
            }
        });
        talamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talamatActionPerformed(evt);
            }
        });

        alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alamat.setText("Alamat");

        jenis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jenis.setText("Jenis Barang");

        tjenis.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
        tjenis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tjenisFocusGained(evt);
            }
        });
        tjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tjenisActionPerformed(evt);
            }
        });

        berat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        berat.setText("Jumlah / Berat Barang (max 5)");

        tberat.setText("0");
        tberat.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
        tberat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tberatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tberatFocusLost(evt);
            }
        });
        tberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tberatActionPerformed(evt);
            }
        });

        ttotal.setText("0");
        ttotal.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
        ttotal.setFocusable(false);
        ttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttotalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Rp.");

        total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        total.setText("Total Bayar");

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(51, 51, 51));
        submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        notif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notif.setText("Wait . . .");

        jLabel2.setText("Kg");

        print.setBackground(new java.awt.Color(204, 204, 204));
        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tnama)
                                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(talamat)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tjenis)
                                    .addComponent(total)
                                    .addComponent(jenis, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(tberat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addComponent(berat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(32, 32, 32))
            .addComponent(notif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(alamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jenis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(berat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tberat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(67, 67, 67)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notif)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maximize.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(36, 36, 36)
                .addComponent(jLabel10)
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void talamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talamatActionPerformed

    private void tjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tjenisActionPerformed

    private void tberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tberatActionPerformed

    private void ttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttotalActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
/*    ERROR HANDLER KALO NGGA SESUAI KRITERIA
      EQUALS ITU SAMA KAYA ==
      KAN KALO KOSONG NANTI MUNCUL FIELD TIDAK BOLEH KOSONG
      NAH NGECEK TEXT FIELD NYA KALO ADA TULISAN "FIELD TIDAK BOLEH KOSONG" DIA TETEP NAMPILIN TEXT ITU
*/
    if(
        (tnama.getText().equals("")||tnama.getText().equals("*Field Tidak Bole Kosong")) && 
        (talamat.getText().equals("")||talamat.getText().equals("*Field Tidak Bole Kosong")) && 
        (tjenis.getText().equals("")||tjenis.getText().equals("*Field Tidak Bole Kosong")) && 
        (tberat.getText().equals("0")||tberat.getText().equals("*Field Harus > 0 Dan < 5")) 
    ){
//        INI BIKIN METHOD NAMPILIN TEXTFIELD "FIELD TIDAK BOLE KOSONG"
        this.setEmptyField(tnama);
        this.setEmptyField(talamat);
        this.setEmptyField(tjenis);
        this.setEmptyField(tberat);
//        NAH TERUS INI NGECEK SATU2 KAN TADI LANGSUNG SEMUA
    } else if((tnama.getText().equals("")||tnama.getText().equals("*Field Tidak Bole Kosong"))){
        this.setEmptyField(tnama);
    } else if((talamat.getText().equals("")||talamat.getText().equals("*Field Tidak Bole Kosong"))){
        this.setEmptyField(talamat);
    } else if((tjenis.getText().equals("")||tjenis.getText().equals("*Field Tidak Bole Kosong"))){
        this.setEmptyField(tjenis);
//    NGECEK JUMLAH / BERAT BARANG CHAR AT(0) ITU MAKSUDNYA MISAL "NANANG" DADI NGAMBIL N SOALNYA KAN HARUS ANGKA NAH 
    } else if((tberat.getText().equals("0")||
               tberat.getText().equals("*Field Harus > 0 Dan < 5")||
//               !Character.isDigit(tberat.getText().charAt(0))
               tberat.getText().charAt(0) < '0' || 
               tberat.getText().charAt(0) > '6' ||
               tberat.getText().length() > 1
            )){
//        this.setEmptyField(tberat);
//        NAH INI NGISI VALUE KALO NGGA SESUAI DIATAS
        tberat.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.RED));
        tberat.setText("*Field Harus > 0 Dan < 5");
        tberat.setForeground(Color.RED);
    } else {
//        TERUS KALO UDH SESUAI SEMUA AKSINYA DISINI
//        BIKIN OBJEK PELANGGAN BUAT NANTI OBJEKNYA DISIMPEN DI ARRAYLIST JADI NANTI MANGGILNYA KAYA MANGGIL OBJEK BIASA MISAL p.blablabla()
        Pelanggan p = new Pelanggan();
//        INI BUAT KODE BARANG BIKIN ANGKA RANDOM
        int kode = (int) (Math.random() * 9999 + 1000);
//        INI ID NYA
        ++initId;
//        SET ID ISINYA initId KAN UDH DI ++INITID JADI INIT ID = 1
        p.setId(String.valueOf(initId));
//        NAH INI SET KODE BARANG
//        LN MAKSUDNYA LONDRI, TERUS DIGABUNG SAMA KODE, TERUS SAMA IDPELANGGAN
        p.setKode_Barang("LN."+String.valueOf(kode)+"."+String.valueOf(initId));
//        INI SET NAMA
        p.setNama(tnama.getText());
        p.setAlamat(talamat.getText());
        ttotal.setText((Integer.parseInt( tberat.getText() ) == 1) ? String.valueOf(harga):
                       (Integer.parseInt( tberat.getText() ) == 2) ? String.valueOf(harga*2):
                       (Integer.parseInt( tberat.getText() ) == 3) ? String.valueOf(harga*3):
                       "100000");
//        NAH KALO UDAH OBJEKNYA TINGGAL DIMASUKKIN KE ARRAYLIST TIPE DATANYA OBJEK PELANGGAN
        storePerson.setPelanggan(p);
//        INI BIKIN OBJEK BARANG ITU PARAM NYA P KARNA MASUKIN DATA PELANGGAN KE DATA BARANG KAYA LNGSUNG NGE SET
//        JADINYA NGGAUSA NGE SET NAMA, ALAMAT BLABLABLA
        AssetPelanggan ap = new AssetPelanggan(p);
//        INI SET SET
        ap.setJenis_Barang(tjenis.getText());
        ap.setBeratBarang(tberat.getText());
        ap.setTotal_Bayar(ttotal.getText());
        ap.setNama_Petugas(username.getText());
//        INI NAMBAIN OBJEK BARANG KE ARRAYLIST TIPENYA OBJEK BARANG
        storeStuff.setAssetPelanggan(ap);
//        NOTIFIKASI DIBAWAH KALO BERHASIL SEMUA
        notif.setText( "Data Berhasil Di Tambahkan (" + String.valueOf(initId) + ")" );
//        WARNA TEKS NOTIFIKASI
        notif.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_submitActionPerformed
    
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
//        BUAT KELUAR YES OR NO
        int confirm = JOptionPane.showConfirmDialog(null, "Keluar ?", "Confirm Dialog", JOptionPane.YES_NO_OPTION);
        if(confirm == 0){
            dispose();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
//        MINIMAZE
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void tnamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tnamaFocusGained
//        MANGGIL METOT KALO PAS MAU INPUT
        setDefaultField(tnama);
    }//GEN-LAST:event_tnamaFocusGained

    private void talamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_talamatFocusGained
        //        MANGGIL METOT KALO PAS MAU INPUT INI KEBAWAH SAMA
        setDefaultField(talamat);
    }//GEN-LAST:event_talamatFocusGained

    private void tjenisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tjenisFocusGained
        setDefaultField(tjenis);
    }//GEN-LAST:event_tjenisFocusGained

    private void tberatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tberatFocusLost
        
    }//GEN-LAST:event_tberatFocusLost

    private void tberatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tberatFocusGained
        setDefaultField(tberat);
    }//GEN-LAST:event_tberatFocusGained

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
//        CLEAR INPUTAN
        tnama.setText("");
        talamat.setText("");
        tjenis.setText("");
        tberat.setText("0");
    }//GEN-LAST:event_clearActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
//        INI MANGGIL FRAME LOGIN KARNA DI LOGOUT
        new FrameLogin().setVisible(true);
//        KELUAR SATU FRAME
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
//        CEK LOGOUT NYA MUNCUL NGGA KALO NGGA DIMUNCULIN DIKLIK KE PETUGASNYA
        if(logout.isVisible()){
            logout.setVisible(false);
        } else {
            logout.setVisible(true);
        }
    }//GEN-LAST:event_usernameMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
//        NAH INI NGIRIM DATA YG DI ARRAYLIST KE LIST BARANG
        new FrameListBarang(storePerson,storeStuff).setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
//        SAMA NGECEK KALO GA KELIATAN DI KLIK LIST JADI KELIATAN
        if(jPanel7.isVisible()){
            jLabel12.setForeground(Color.GRAY);
            jPanel7.setVisible(false);
        } else {
            jLabel12.setForeground(Color.BLACK);
            jPanel7.setVisible(true);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//        NGIRIM DATA KE LIST PELANGGAN
        new FrameListPelanggan(storePerson).setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
//        INI TOMBOL CETAK BUAT NGIRIM DATA YG BARUSAN DIINPUT DI MASUKIN
        if(storeStuff.asset_pelanggan.size() > 0){
            String[] send = {
                storeStuff.asset_pelanggan.get(storeStuff.asset_pelanggan.size()-1).kode_barang,
                pet,
                tnama.getText(),
                talamat.getText(),
                tjenis.getText(),
                tberat.getText(),
                ttotal.getText()
            };
            EventQueue.invokeLater(() -> {
                new FramePrint(send).setVisible(true);
            });
        } else {
//            JADI KALO MAU CETAK HARUS DI SUBMIT DULU
            notif.setText("Data Belum Dimasukkan");
            notif.setForeground(Color.red);
        }
    }//GEN-LAST:event_printActionPerformed
    private void setEmptyField(JTextField f){
//        INI METHOT BUAT NAMPILIN "FIELD TIDAK BOLE KOSONG" KALO KRITERIA NYA SALAH
        f.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.RED));
        f.setText("*Field Tidak Bole Kosong");
        f.setForeground(Color.RED);
    }
    private void setDefaultField(JTextField f){
//        DEFAULT STYLE INPUTAN
        f.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
        f.setForeground(Color.BLACK);
    }
//    OBJEK POST PERSON ITU BUAT NYIMPEN DATA PELANGGAN SAMA PETUGAS NAH DI DEKLARASI DISINI KAN BUTUH DATANYA PELANGGAN YG DIMASUKKIN
//    KE ARRAYLIST TADI
    PostPerson storePerson = new PostPerson();
//    INI SAMA KYA ATAS CUMA BUAT DATA BARANG
    PostAssets storeStuff = new PostAssets();
//    INIT ID BUAT ID, HARGA BUAT HARGA PERKILO
    Integer initId = 0, harga = 20000; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel berat;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel notif;
    private javax.swing.JButton print;
    private javax.swing.JButton submit;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tberat;
    private javax.swing.JTextField tjenis;
    private javax.swing.JTextField tnama;
    private javax.swing.JLabel total;
    private javax.swing.JTextField ttotal;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
