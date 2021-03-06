/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Sáfico
 */
public class LogIn extends javax.swing.JDialog {

    /**
     * Creates new form LogIn
     */
    public static String nomEmpresa;//Nos creamos una variable que recogera el valor del campo empresa
   
    public LogIn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        lolEmpresa = new javax.swing.JLabel();
        jTextEmpresa = new javax.swing.JTextField();
        BotonEntrar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 51));

        jTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jTitulo.setText("Acceso a la gestión del vivero");

        jPanel1.setBackground(new java.awt.Color(239, 255, 239));

        lblUsuario.setText("Usuario");

        lblPass.setText("Contraseña");

        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        lolEmpresa.setText("Nombre de la empresa");

        jTextEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmpresaActionPerformed(evt);
            }
        });

        BotonEntrar.setBackground(new java.awt.Color(204, 255, 153));
        BotonEntrar.setText("Entrar");
        BotonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEntrarMouseClicked(evt);
            }
        });
        BotonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEntrarActionPerformed(evt);
            }
        });
        BotonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonEntrarKeyPressed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPass)
                    .addComponent(lblUsuario)
                    .addComponent(lolEmpresa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonEntrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir))
                    .addComponent(jPass)
                    .addComponent(jTextEmpresa)
                    .addComponent(jTextUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lolEmpresa)
                    .addComponent(jTextEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEntrar)
                    .addComponent(botonSalir))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jTitulo)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void jTextEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmpresaActionPerformed
       // BotonEntrarKeyPressed(null);
    }//GEN-LAST:event_jTextEmpresaActionPerformed

    private void BotonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEntrarMouseClicked
       
    }//GEN-LAST:event_BotonEntrarMouseClicked

    private void BotonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonEntrarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){//Compara si el codigo de la tecla pulsada equivale al Intro
            String user="di", pass="123";//Nos creamos las 2 variables para comparar el login
        
            String pass2=new String(jPass.getPassword());//Recuperamos el valor del campo de la contraseña

            if (jTextUsuario.getText().equalsIgnoreCase(user) && pass2.equals(pass)){ //Comparamos los valores equalsIgnoreCase sirve para ignorar las mayusculas

                this.nomEmpresa = jTextEmpresa.getText();//Obtenemos el valor del campo Nombre de empresa
                Principal p = new Principal();
                dispose();// Cerramos la ventana del login
                p.setVisible(true);// Mostramos la pantalla principal

            }else{
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos","Error", JOptionPane.ERROR_MESSAGE);
            }
        }         
    }//GEN-LAST:event_BotonEntrarKeyPressed

    private void BotonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEntrarActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        String user="di", pass="123";//Nos creamos las 2 variables para comparar el login
        
        String pass2=new String(jPass.getPassword());//Recuperamos el valor del campo de la contraseña
        
        if (jTextUsuario.getText().equalsIgnoreCase(user) && pass2.equals(pass)){ //Comparamos los valores equalsIgnoreCase sirve para ignorar las mayusculas
        
            this.nomEmpresa = jTextEmpresa.getText();//Obtenemos el valor del campo Nombre de empresa
            Principal p = new Principal();
            dispose();// Cerramos la ventana del login
            p.setVisible(true);// Mostramos la pantalla principal
            
        }else{
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonEntrarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();// Salimos de la pantalla de logIn
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogIn dialog = new LogIn(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonEntrar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jTextEmpresa;
    private javax.swing.JTextField jTextUsuario;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lolEmpresa;
    // End of variables declaration//GEN-END:variables
}
