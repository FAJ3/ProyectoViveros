package Principal;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sáfico
 */
public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        this.nomEmpresa.setText(LogIn.nomEmpresa);
        iniciar();
        tableModel();
       
    }
    DefaultTableModel model=null;
    int fila;

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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btAnyadir = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        txtEuro = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        jEpoca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jComboRiego = new javax.swing.JComboBox();
        txtEpoca = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        txtRiego = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtMaceta = new javax.swing.JLabel();
        jComboMaceta = new javax.swing.JComboBox();
        jNombreCientifico = new javax.swing.JTextField();
        txtNombreCientifico = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        btNuevo = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jRecursos = new javax.swing.JPanel();

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

        txtPedido.setText("Pedidos");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(178, 178, 178)
                .addComponent(botonRecursos)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(txtTareas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRecursos)
                .addGap(185, 185, 185))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                        .addComponent(botonPedido)
                        .addGap(133, 133, 133)
                        .addComponent(botonPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                        .addComponent(txtPedido)
                        .addGap(359, 359, 359)
                        .addComponent(txtPlantas)
                        .addGap(365, 365, 365))))
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGap(442, 442, 442)
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
                        .addContainerGap()
                        .addComponent(nomEmpresa)
                        .addGap(110, 110, 110)
                        .addComponent(botonSalir)))
                .addGap(39, 39, 39)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPedido)
                    .addComponent(txtPlantas))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        botonTareas.getAccessibleContext().setAccessibleName("botonTareas");

        jTabbedPane1.addTab("Inicio", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoInicio.png")), jInicio); // NOI18N

        javax.swing.GroupLayout jTareasLayout = new javax.swing.GroupLayout(jTareas);
        jTareas.setLayout(jTareasLayout);
        jTareasLayout.setHorizontalGroup(
            jTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1189, Short.MAX_VALUE)
        );
        jTareasLayout.setVerticalGroup(
            jTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
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
                .addContainerGap(449, Short.MAX_VALUE))
        );
        jPedidosLayout.setVerticalGroup(
            jPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPedidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPPedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        jTabbedPane1.addTab("Pedidos", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoPedidos2.png")), jPedidos); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nombre científico", "Maceta", "Riego", "Epc. plantación", "Descripción", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        btAnyadir.setText("Añadir");
        btAnyadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnyadirActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        txtEuro.setText("€");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jComboRiego.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 riego/semana", "2 riegos/semana", "3 riegos/semana", "4 riegos/semana", "5 riegos/semana", "6 riegos/semana", "7 riegos/semana" }));

        txtEpoca.setText("Época de plantación");

        txtDescripcion.setText("Descripción");

        txtRiego.setText("Riego");

        txtPrecio.setText("Precio");

        txtMaceta.setText("Maceta");

        jComboMaceta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Litro", "2 Litros", "5 Litros" }));
        jComboMaceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMacetaActionPerformed(evt);
            }
        });

        txtNombreCientifico.setText("Nombre cientifíco");

        txtNombre.setText("Nombre");

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPlantasLayout = new javax.swing.GroupLayout(jPlantas);
        jPlantas.setLayout(jPlantasLayout);
        jPlantasLayout.setHorizontalGroup(
            jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlantasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPlantasLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCientifico)
                            .addComponent(txtNombre)
                            .addComponent(txtMaceta)
                            .addComponent(txtRiego)
                            .addComponent(txtEpoca, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion)
                            .addComponent(txtPrecio))
                        .addGap(76, 76, 76)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPlantasLayout.createSequentialGroup()
                                .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEuro))
                            .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jEpoca)
                                .addComponent(jComboMaceta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboRiego, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jNombreCientifico)
                                .addComponent(jNombre)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(jPlantasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btAnyadir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btActualizar)
                        .addGap(30, 30, 30)
                        .addComponent(btEliminar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlantasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar)
                        .addGap(182, 182, 182))))
        );
        jPlantasLayout.setVerticalGroup(
            jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPlantasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPlantasLayout.createSequentialGroup()
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCientifico)
                            .addComponent(jNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaceta)
                            .addComponent(jComboMaceta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRiego)
                            .addComponent(jComboRiego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEpoca)
                            .addComponent(jEpoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPlantasLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtDescripcion))
                            .addGroup(jPlantasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEuro)
                            .addComponent(txtPrecio))
                        .addGap(69, 69, 69)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAnyadir)
                            .addComponent(btNuevo)
                            .addComponent(btEliminar)
                            .addComponent(btActualizar))
                        .addGap(18, 18, 18)
                        .addComponent(btEditar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoPlantas.png")), jPlantas); // NOI18N

        javax.swing.GroupLayout jRecursosLayout = new javax.swing.GroupLayout(jRecursos);
        jRecursos.setLayout(jRecursosLayout);
        jRecursosLayout.setHorizontalGroup(
            jRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1189, Short.MAX_VALUE)
        );
        jRecursosLayout.setVerticalGroup(
            jRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gestión de recursos", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoRecursos.png")), jRecursos); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
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

    }//GEN-LAST:event_botonSalirActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void botonTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTareasMouseClicked

    }//GEN-LAST:event_botonTareasMouseClicked

    private void botonPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidoActionPerformed
        this.jTabbedPane1.setSelectedIndex(2);//Cambia a la pestaña que le asignamos 
    }//GEN-LAST:event_botonPedidoActionPerformed

    private void botonPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlantasActionPerformed
        this.jTabbedPane1.setSelectedIndex(3);//Cambia a la pestaña que le asignamos 
        
    }//GEN-LAST:event_botonPlantasActionPerformed

    private void btAnyadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnyadirActionPerformed
        agregar();
    }//GEN-LAST:event_btAnyadirActionPerformed

    private void jComboMacetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMacetaActionPerformed

    }//GEN-LAST:event_jComboMacetaActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        seleccionarFila();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editar();
    }//GEN-LAST:event_btEditarActionPerformed

   
    public void iniciar(){
        //Vaciamos campus e inhabilitamos botones y desplegables
        this.jNombre.setText(null);
        this.jNombre.setEnabled(false);
        this.jNombreCientifico.setText(null);
        this.jNombreCientifico.setEnabled(false);
        this.jEpoca.setText(null);
        this.jEpoca.setEnabled(false);
        this.jTextAreaDescripcion.setText(null);
        this.jTextAreaDescripcion.setEnabled(false);
        this.jPrecio.setEnabled(false);
        this.jPrecio.setEnabled(false);
        this.btNuevo.setEnabled(true);
        this.btEliminar.setEnabled(false);
        this.btAnyadir.setEnabled(false);
        this.btActualizar.setEnabled(false);
        this.jTable1.setEnabled(true);
        this.jComboMaceta.setEnabled(false);
        this.jComboRiego.setEnabled(false);
        int fila = 0;
        
    }
    public void tableModel(){       
        //Aplicamos el modelo a la tabla
        model = (DefaultTableModel)this.jTable1.getModel();
        //Indicamos la cantidad de filas que tendrá la tabla al inicio
        model.setNumRows(0);        
    }
    public void cancelar(){
        iniciar();
    }
    public void nuevo(){
        iniciar();
       //Activamos campos y botones
        this.jNombre.setEnabled(true);
        this.jNombreCientifico.setEnabled(true);
        this.jComboMaceta.setEnabled(true);
        this.jComboRiego.setEnabled(true);
        this.jEpoca.setEnabled(true);        
        this.jTextAreaDescripcion.setEnabled(true);
        this.jPrecio.setEnabled(true);
        this.btAnyadir.setEnabled(true);
    }
    public void agregar(){
        //Comprobamos que los campos no esten vacios
        if(jNombre.getText().isEmpty() || jNombreCientifico.getText().isEmpty() || jEpoca.getText().isEmpty() || jPrecio.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Rellena todos los campos."); 
        }
        else{
            //Agregamos datos a la tabla
            model.addRow(new Object[]{
                jNombre.getText(),jNombreCientifico.getText(),jComboMaceta.getSelectedItem(),jComboMaceta.getSelectedItem(),jEpoca.getText(), jTextAreaDescripcion.getText(), jPrecio.getText()           });
            iniciar();
        }
    }
    public void seleccionarFila(){
        //Utilizamos este método para obtener que fila se ha seleccionado
        //Habilitamos botones y campos
        //Rellenamos campos
        if(jTable1.getRowCount() > 0 || btAnyadir.isEnabled()== false){
            //Utilizamos getValueAt del model para obtener datos de la tabla.
            fila = jTable1.getSelectedRow();
            jNombre.setText(String.valueOf(model.getValueAt(fila, 0)));
            jNombreCientifico.setText(String.valueOf(model.getValueAt(fila, 1)));
            jComboMaceta.setSelectedItem(String.valueOf(model.getValueAt(fila, 2)));
            jComboRiego.setSelectedItem(String.valueOf(model.getValueAt(fila, 3)));
            jEpoca.setText(String.valueOf(model.getValueAt(fila, 4)));
            jTextAreaDescripcion.setText(String.valueOf(model.getValueAt(fila, 5)));
            jPrecio.setText(String.valueOf(model.getValueAt(fila, 6)));
            btNuevo.setEnabled(false);
            btEliminar.setEnabled(true);            
        }
    }
    public void editar(){
        //Activamos y desactivamos algunos campos y botones
        jTable1.setEnabled(false);
        btEliminar.setEnabled(false);
        btActualizar.setEnabled(true);
        jNombre.setEnabled(true);
        jNombreCientifico.setEnabled(true);
        jComboMaceta.setEnabled(true);
        jComboRiego.setEnabled(true);
        jEpoca.setEnabled(true);        
        jTextAreaDescripcion.setEnabled(true);
        jPrecio.setEnabled(true);
        btAnyadir.setEnabled(true);
    }
    public void actualizar(){
        if(jNombre.getText().isEmpty() || jNombreCientifico.getText().isEmpty() || jEpoca.getText().isEmpty() || jPrecio.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Rellena todos los campos."); 
        }
        else{
            //Modificamos los datos de la tabla
            model.setValueAt(jNombre.getText(), fila, 1);
            model.setValueAt(jNombreCientifico.getText(), fila, 2);
            model.setValueAt(jComboMaceta.getSelectedItem(), fila, 3);
            model.setValueAt(jComboRiego.getSelectedItem(), fila, 4);
            model.setValueAt(jEpoca.getText(), fila, 5);
            model.setValueAt(jTextAreaDescripcion.getText(), fila, 6);
            model.setValueAt(jPrecio, fila, 7);
            iniciar();            
        }
    }
    public void eliminar(){
        //Mostramos un mensaje 
        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Desea eliminar esta fila.", "Eliminar fila", JOptionPane.YES_NO_OPTION);
        if (showConfirmDialog == 0) {
            model.removeRow(fila);
           // reiniciar();
            iniciar();
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPedido;
    private javax.swing.JButton botonPlantas;
    private javax.swing.JButton botonRecursos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonTareas;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btAnyadir;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBAnadir;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox jComboMaceta;
    private javax.swing.JComboBox jComboRiego;
    private javax.swing.JTextField jEpoca;
    private javax.swing.JPanel jInicio;
    private javax.swing.JLabel jLAP;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jNombreCientifico;
    private javax.swing.JPanel jPPedi;
    private javax.swing.JPanel jPedidos;
    private javax.swing.JPanel jPlantas;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JPanel jRecursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JPanel jTareas;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldAut;
    private javax.swing.JLabel nomEmpresa;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtEpoca;
    private javax.swing.JLabel txtEuro;
    private javax.swing.JLabel txtMaceta;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNombreCientifico;
    private javax.swing.JLabel txtPedido;
    private javax.swing.JLabel txtPlantas;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtRecursos;
    private javax.swing.JLabel txtRiego;
    private javax.swing.JLabel txtTareas;
    // End of variables declaration//GEN-END:variables
    
}

