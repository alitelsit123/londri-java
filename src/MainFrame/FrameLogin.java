package MainFrame;
import Person.PostPerson;
import javax.swing.*;
import java.awt.*;
public final class FrameLogin extends javax.swing.JFrame {

    public FrameLogin() {
        initComponents();
//        SET UKURAN FRAME SAMA NENGAHIN
        setSize(530,461);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        alert = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(0,0,0,50));
        jPanel1.setOpaque(false);

        jPanel2.setBackground(new Color(0, 0, 0, 90));

        jLabel1.setBackground(new Color(0, 0, 0, 90));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Form");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("x");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        username.setBackground(new Color(255,255,255,0));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE)
        );
        username.setCaretColor(new Color(0,0,0));
        username.setOpaque(false);
        username.setSelectedTextColor(Color.BLUE);
        username.setSelectionColor(new Color(0,0,0,10));

        jLabel2.setBackground(new Color(0, 0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lupa Password");

        jCheckBox1.setBackground(new Color(0, 0, 0, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Remember Me");
        jCheckBox1.setOpaque(false);

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Login");
        submit.setOpaque(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        password.setBackground(new Color(255,255,255,0));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("jPasswordField1");
        password.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        password.setCaretColor(new Color(0,0,0));
        password.setOpaque(false);
        password.setSelectedTextColor(Color.BLUE);

        alert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alert.setForeground(new java.awt.Color(255, 255, 255));
        alert.setText("Login Status : waiting ...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(alert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1))
                .addGap(29, 29, 29)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alert)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(123, 35, 290, 360);

        jPanel3.setBackground(new Color(0,0,0,80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(90, 30, 350, 360);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, Color.BLACK)
        );
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 530, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
//        EXIT
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
//        SET BORDER INPUTAN
        username.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        password.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
//        NGECEK AUTINTEKASI
//        MANGGIL METOT GET AUTH RETURN NYA INT
        if(getAuth(username.getText(),new String(password.getPassword())) == 1){
//            KALO RETURN 1 NUTUP FRAME TERUS KE FRAME SELANJUTNYA
            dispose();
//            NGIRIM STRING NAMA PETUGAS
            new Frame(username.getText()).setVisible(true);    
        } else {
//            SELAIN RETURN 1 SALAH
//            NGECEK LAGI BIAR TAU SALAHNYA DI USERNAME APA DI PASSWORD
//            KALO RETURN 0 SALAHNYA DI USERNAME KALO RETURN 2 SALAHNYA DI PASSWORD
            if(getAuth(username.getText(),new String(password.getPassword())) == 0)
                username.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            else if(getAuth(username.getText(),new String(password.getPassword())) == 2)
                password.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
//            NAMPILIN TEKS NOTIFIKASI
            alert.setText("Login Status : Username/Password Salah");
            alert.setForeground(Color.RED);
        }
        
    }//GEN-LAST:event_submitActionPerformed
//    DEKLARASI METOT GET AUTH
    private int getAuth(String usr, String psswd){
//        SET PETUGAS YG STATIS TADI
        p.setPetugas();
//        VALUE VARIABEL PERTAMA 0
        int auth = 0;
//        NGULANG SAMPE UKURANNYA OBJEK PETUGAS KARNA TADI ADA 4 BERATI NGULANG 4 KALI
        for (int i=0;i<p.petugas.size();i++){
//            CEK 
//              KALO USERNAME SAMA PASWORT BENAR SAMA DATA DI OBJEK PETUGAS NGAMBILNYA DARI ARRAYLIST YA YG TIPE OBJEK
//                KALO BENER VALUE NYA AUTH JADI SATU TERUS KALO PASSWORD NYA YG SALAH VALUE NYA 2 KALO PASWORD SALAH VALUE 0
            auth = ( usr.equals(p.petugas.get(i).nama) && psswd.equals(p.petugas.get(i).password) ) ? 1:
                   ( usr.equals(p.petugas.get(i).nama) ) ? 2: 0;
//            KALO UDH KETEMU LNGSUNG DI BREAK BIAR DAPET VALUE NYA
            if(auth == 1)
                break;
            else if(auth == 2)
                break;
        }
        return auth;
    }
//    INI OBJEK YG ADA ARRAYLIST BUAT NYIMPEN PERSON KAYA PETUGAS SAMA PELANGGAN
//    DIDEKLARASI DISINI BUAT NGECEK AUTENTIKASI TADI        
    private final PostPerson p = new PostPerson();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
