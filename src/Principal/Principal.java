/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Properties/Run y seleccionamos la clase que se va a ejecutar primero
package Principal;

/**
 *
 * @author Sáfico
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
  // private final String nomEmpresa2;
    public Principal() {
        initComponents();
        this.nomEmpresa.setText(LogIn.nomEmpresa);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInicio = new javax.swing.JPanel();
        botonRecursos = new javax.swing.JButton();
        txtRecursos = new javax.swing.JLabel();
        nomEmpresa = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        txtPedido = new javax.swing.JLabel();
        txtTareas = new javax.swing.JLabel();
        botonPedido = new javax.swing.JButton();
        botonTareas = new javax.swing.JButton();
        botonPlantas = new javax.swing.JButton();
        txtPlantas = new javax.swing.JLabel();
        jTareas = new javax.swing.JPanel();
        jPedidos = new javax.swing.JPanel();
        jPPedi = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jLAP = new javax.swing.JLabel();
        jTextFieldAut = new javax.swing.JTextField();
        jBAnadir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        jPlantas = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        botonAnyadir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRecursos = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/invernadero.jpg"))); // NOI18N
        botonRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRecursosMouseClicked(evt);
            }
        });
        botonRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecursosActionPerformed(evt);
            }
        });

        txtRecursos.setText("Gestión de recursos");

        nomEmpresa.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nomEmpresa.setText("Nombre de la empresa");

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        txtPedido.setText("Pedido");

        txtTareas.setText("Tareas");

        botonPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/pedidos3.jpg"))); // NOI18N
        botonPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedidoActionPerformed(evt);
            }
        });

        botonTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/tareas.jpeg"))); // NOI18N
        botonTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTareasMouseClicked(evt);
            }
        });
        botonTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTareasActionPerformed(evt);
            }
        });

        botonPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/planta.jpg"))); // NOI18N
        botonPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlantasActionPerformed(evt);
            }
        });

        txtPlantas.setText("Plantas");

        javax.swing.GroupLayout jInicioLayout = new javax.swing.GroupLayout(jInicio);
        jInicio.setLayout(jInicioLayout);
        jInicioLayout.setHorizontalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(botonTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRecursos)
                .addGap(89, 89, 89))
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(txtTareas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRecursos)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(botonPedido)
                        .addGap(149, 149, 149)
                        .addComponent(botonPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(jInicioLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(botonSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(txtPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPlantas)
                .addGap(370, 370, 370))
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(nomEmpresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInicioLayout.setVerticalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInicioLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonTareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRecursos)
                            .addComponent(txtTareas)))
                    .addGroup(jInicioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(nomEmpresa)
                        .addGap(119, 119, 119)
                        .addComponent(botonSalir)))
                .addGap(39, 39, 39)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlantas)
                    .addComponent(txtPedido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonTareas.getAccessibleContext().setAccessibleName("botonTareas");

        jTabbedPane1.addTab("Inicio", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoInicio.png")), jInicio); // NOI18N

        javax.swing.GroupLayout jTareasLayout = new javax.swing.GroupLayout(jTareas);
        jTareas.setLayout(jTareasLayout);
        jTareasLayout.setHorizontalGroup(
            jTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1109, Short.MAX_VALUE)
        );
        jTareasLayout.setVerticalGroup(
            jTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tareas", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoTareas.gif")), jTareas); // NOI18N

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Fecha Entrega", "Planta", "Numero", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTablePedidos);

        jLAP.setText("Autor del Pedido");

        jTextFieldAut.setText(" ");

        jBAnadir.setText("Añadir");

        jBCancelar.setText("Cancelar");

        jBAceptar.setText("Aceptar");

        javax.swing.GroupLayout jPPediLayout = new javax.swing.GroupLayout(jPPedi);
        jPPedi.setLayout(jPPediLayout);
        jPPediLayout.setHorizontalGroup(
            jPPediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPediLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPediLayout.createSequentialGroup()
                        .addGroup(jPPediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPPediLayout.createSequentialGroup()
                                .addComponent(jLAP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAut, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPPediLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBAnadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAceptar)
                        .addGap(20, 20, 20))))
        );
        jPPediLayout.setVerticalGroup(
            jPPediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPediLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAP, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jTextFieldAut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPPediLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnadir)
                    .addComponent(jBCancelar)
                    .addComponent(jBAceptar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPedidosLayout = new javax.swing.GroupLayout(jPedidos);
        jPedidos.setLayout(jPedidosLayout);
        jPedidosLayout.setHorizontalGroup(
            jPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPedidosLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jPPedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPedidosLayout.setVerticalGroup(
            jPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPedidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPPedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        jTabbedPane1.addTab("Pedidos", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoPedidos2.png")), jPedidos); // NOI18N

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonAnyadir.setText("Añadir");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPlantasLayout = new javax.swing.GroupLayout(jPlantas);
        jPlantas.setLayout(jPlantasLayout);
        jPlantasLayout.setHorizontalGroup(
            jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlantasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAnyadir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPlantasLayout.setVerticalGroup(
            jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlantasLayout.createSequentialGroup()
                .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlantasLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(botonAnyadir)
                        .addGap(97, 97, 97)
                        .addComponent(botonEliminar))
                    .addGroup(jPlantasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoPlantas.png")), jPlantas); // NOI18N

        javax.swing.GroupLayout jRecursosLayout = new javax.swing.GroupLayout(jRecursos);
        jRecursos.setLayout(jRecursosLayout);
        jRecursosLayout.setHorizontalGroup(
            jRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1109, Short.MAX_VALUE)
        );
        jRecursosLayout.setVerticalGroup(
            jRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gestión de recursos", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoRecursos.png")), jRecursos); // NOI18N

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecursosActionPerformed
        this.jTabbedPane1.setSelectedIndex(4);//Cambia a la pestaña que le asignamos 
    }//GEN-LAST:event_botonRecursosActionPerformed

    private void botonRecursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRecursosMouseClicked
              
    }//GEN-LAST:event_botonRecursosMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        
       dispose(); //Cerramos la ventana
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTareasActionPerformed
        this.jTabbedPane1.setSelectedIndex(1);//Cambia a la pestaña que le asignamos
    }//GEN-LAST:event_botonTareasActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTareasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTareasMouseClicked

    private void botonPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidoActionPerformed
        this.jTabbedPane1.setSelectedIndex(2);//Cambia a la pestaña que le asignamos 
    }//GEN-LAST:event_botonPedidoActionPerformed

    private void botonPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlantasActionPerformed
        this.jTabbedPane1.setSelectedIndex(3);//Cambia a la pestaña que le asignamos 
    }//GEN-LAST:event_botonPlantasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnyadir;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonPedido;
    private javax.swing.JButton botonPlantas;
    private javax.swing.JButton botonRecursos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonTareas;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBAnadir;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JPanel jInicio;
    private javax.swing.JLabel jLAP;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPPedi;
    private javax.swing.JPanel jPedidos;
    private javax.swing.JPanel jPlantas;
    private javax.swing.JPanel jRecursos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JPanel jTareas;
    private javax.swing.JTextField jTextFieldAut;
    private javax.swing.JLabel nomEmpresa;
    private javax.swing.JLabel txtPedido;
    private javax.swing.JLabel txtPlantas;
    private javax.swing.JLabel txtRecursos;
    private javax.swing.JLabel txtTareas;
    // End of variables declaration//GEN-END:variables
}
