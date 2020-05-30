package paquete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Registro extends javax.swing.JFrame {
    public Registro() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/Imagen1.png")).getImage());
        setTitle("INGRESO A OUDENY");
        this.setLocationRelativeTo(null);  
    }
    int contrasena=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSala = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdSalaCreada = new javax.swing.JTextField();
        jButtonNuevaSala = new javax.swing.JButton();
        jTextFieldNombreSala = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("ID USUARIO OURDENY :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setText("CONTRASEÑA OUDENY :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTextFieldUsuario.setText("hola");
        jTextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMouseClicked(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        jPasswordField1.setText("hola");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 30));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OURDENY");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("nuestro destino con la educación");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ojito.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 60, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Imagencerradoo.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 60, 30);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 40, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setText("ID DE INGRESO A SALA:");

        jTextFieldSala.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setText("INGRESAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setText("CREAR SALA NUEVA   :");

        jTextFieldIdSalaCreada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonNuevaSala.setText("CREAR SALA");
        jButtonNuevaSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNuevaSalaMouseClicked(evt);
            }
        });
        jButtonNuevaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaSalaActionPerformed(evt);
            }
        });

        jTextFieldNombreSala.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldIdSalaCreada, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNuevaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreSala))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSala, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombreSala, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldIdSalaCreada, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevaSala)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String usuario= "DOCENTE";
    String Contra = "123";
    String Pass=new String(jPasswordField1.getPassword());
    if (jTextFieldUsuario.getText().equals(usuario)&&Pass.equals(Contra)) {
        JOptionPane.showMessageDialog(null,"DATOS CORRECTOS");
        MainGeneral ma=new MainGeneral();
        ma.setVisible(true);
        System.out.println("Verificando sala: "+jTextFieldSala.getText());
        this.setVisible(false);
        Thread hiloP2= new Proceso2("proceso 2");
//        hiloP1.start();
        hiloP2.start();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextFieldUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMouseClicked
    jTextFieldUsuario.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//        if (contrasena%2 == 0) {
//            jPasswordField1.setEchoChar((char)0);
//            contrasena++;
//        }
//        else{
//        jPasswordField1.setEchoChar('*');
//        contrasena++;
//        }
        
        jPasswordField1.setEchoChar('*');
        jLabel8.setVisible(true);
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        jPasswordField1.setEchoChar((char)0);
        jLabel8.setVisible(false);
        jLabel5.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButtonNuevaSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaSalaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNuevaSalaMouseClicked

    private void jButtonNuevaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaSalaActionPerformed
        jPasswordField1.setEchoChar((char)0);
        jLabel8.setVisible(false);
        jLabel5.setVisible(true);
        
        Connection conexion = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String Url = "jdbc:sqlserver://DESKTOP-JD4OQ1D:1433;databaseName=master;user=testjava;password=testjava;";
            conexion=DriverManager.getConnection(Url);

            String comando1 ="Insert into Salas (IdSala,Nombre,Encargado) values (?,?,?)";
            PreparedStatement declaracion1 = conexion.prepareStatement(comando1);
            
            declaracion1.setInt(1, Integer.parseInt(jTextFieldIdSalaCreada.getText()));
            declaracion1.setString(2, jTextFieldNombreSala.getText());
            declaracion1.setString(3, jTextFieldUsuario.getText());
            int registro = declaracion1.executeUpdate();
            if (registro > 0) {
//                JOptionPane.showMessageDialog(null,"Se han guardado los archivos correctamente");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR BASE DE DATOS "+e);
            
        }
        //....................................
            MainGeneral ma=new MainGeneral();
            ma.setVisible(true);
            System.out.println("Verificando sala: "+jTextFieldSala.getText());
            this.setVisible(false);
            
    }//GEN-LAST:event_jButtonNuevaSalaActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String usuario= "DOCENTE";
        String Contra = "123";
        String Pass=new String(jPasswordField1.getPassword());
        if (jTextFieldUsuario.getText().equals(usuario)&&Pass.equals(Contra)) {
            JOptionPane.showMessageDialog(null,"DATOS CORRECTOS");
            this.setVisible(false);

        }

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonNuevaSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPasswordField jPasswordField1;
    public static javax.swing.JTextField jTextFieldIdSalaCreada;
    public static javax.swing.JTextField jTextFieldNombreSala;
    public static javax.swing.JTextField jTextFieldSala;
    public static javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
