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
        btHome = new javax.swing.JButton();
        jPedidos = new javax.swing.JPanel();
        jPPedi = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jLAP = new javax.swing.JLabel();
        jTextFieldAut = new javax.swing.JTextField();
        jBAnadir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBAceptar = new javax.swing.JButton();
        btHome1 = new javax.swing.JButton();
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
        btHome2 = new javax.swing.JButton();
        txtTerreno = new javax.swing.JLabel();
        jComboBoxTerreno = new javax.swing.JComboBox();
        jRecursos = new javax.swing.JPanel();
        btHome3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));

        jInicio.setBackground(new java.awt.Color(239, 255, 239));

        botonRecursos.setBackground(new java.awt.Color(204, 255, 153));
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

        txtRecursos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRecursos.setText("Gestión de recursos");

        nomEmpresa.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        nomEmpresa.setForeground(new java.awt.Color(0, 204, 51));
        nomEmpresa.setText("Nombre ");

        botonSalir.setBackground(new java.awt.Color(204, 255, 153));
        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconExitRetocada.png"))); // NOI18N
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

        txtPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPedido.setText("Pedidos");

        txtTareas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTareas.setText("Tareas");

        botonPedido.setBackground(new java.awt.Color(204, 255, 153));
        botonPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/pedidos3.jpg"))); // NOI18N
        botonPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedidoActionPerformed(evt);
            }
        });

        botonTareas.setBackground(new java.awt.Color(204, 255, 153));
        botonTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/evolution-tasks.png"))); // NOI18N
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

        botonPlantas.setBackground(new java.awt.Color(204, 255, 153));
        botonPlantas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/tea-plant-leaf-icon.png"))); // NOI18N
        botonPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlantasActionPerformed(evt);
            }
        });

        txtPlantas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPlantas.setText("Plantas");

        javax.swing.GroupLayout jInicioLayout = new javax.swing.GroupLayout(jInicio);
        jInicio.setLayout(jInicioLayout);
        jInicioLayout.setHorizontalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(txtTareas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRecursos)
                .addGap(222, 222, 222))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                        .addComponent(botonTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(botonRecursos)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                        .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                                .addComponent(botonPedido)
                                .addGap(171, 171, 171)
                                .addComponent(botonPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicioLayout.createSequentialGroup()
                                .addComponent(txtPedido)
                                .addGap(363, 363, 363)
                                .addComponent(txtPlantas)
                                .addGap(102, 102, 102)))
                        .addGap(243, 243, 243))))
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(nomEmpresa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInicioLayout.setVerticalGroup(
            jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(nomEmpresa)
                .addGap(5, 5, 5)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRecursos)
                    .addComponent(txtTareas))
                .addGap(90, 90, 90)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedido)
                    .addComponent(txtPlantas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonTareas.getAccessibleContext().setAccessibleName("botonTareas");

        jTabbedPane1.addTab("Inicio", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoInicio.png")), jInicio); // NOI18N

        jTareas.setBackground(new java.awt.Color(239, 255, 239));

        btHome.setBackground(new java.awt.Color(204, 255, 153));
        btHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/icon-home.png"))); // NOI18N
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTareasLayout = new javax.swing.GroupLayout(jTareas);
        jTareas.setLayout(jTareasLayout);
        jTareasLayout.setHorizontalGroup(
            jTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTareasLayout.createSequentialGroup()
                .addContainerGap(1091, Short.MAX_VALUE)
                .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTareasLayout.setVerticalGroup(
            jTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTareasLayout.createSequentialGroup()
                .addContainerGap(581, Short.MAX_VALUE)
                .addComponent(btHome)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tareas", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoTareas.gif")), jTareas); // NOI18N

        jPedidos.setBackground(new java.awt.Color(239, 255, 239));

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

        btHome1.setBackground(new java.awt.Color(204, 255, 153));
        btHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/icon-home.png"))); // NOI18N
        btHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHome1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPedidosLayout = new javax.swing.GroupLayout(jPedidos);
        jPedidos.setLayout(jPedidosLayout);
        jPedidosLayout.setHorizontalGroup(
            jPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPedidosLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jPPedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPedidosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPedidosLayout.setVerticalGroup(
            jPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPedidosLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jPPedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btHome1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pedidos", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoPedidos2.png")), jPedidos); // NOI18N

        jPlantas.setBackground(new java.awt.Color(239, 255, 239));

        jTable1.setBackground(new java.awt.Color(203, 255, 203));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Nombre científico", "Maceta", "Riego", "Epc. plantación", "Descripción", "Terreno", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 204));
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
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        btAnyadir.setBackground(new java.awt.Color(204, 255, 153));
        btAnyadir.setText("Añadir");
        btAnyadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnyadirActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(204, 255, 153));
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

        jComboMaceta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Litro", "2 Litros", "3 Litros", "4 Litros", "5 Litros" }));
        jComboMaceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMacetaActionPerformed(evt);
            }
        });

        txtNombreCientifico.setText("Nombre cientifíco");

        txtNombre.setText("Nombre");

        btNuevo.setBackground(new java.awt.Color(204, 255, 153));
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btActualizar.setBackground(new java.awt.Color(204, 255, 153));
        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(204, 255, 153));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btHome2.setBackground(new java.awt.Color(204, 255, 153));
        btHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/icon-home.png"))); // NOI18N
        btHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHome2ActionPerformed(evt);
            }
        });

        txtTerreno.setText("Terreno");

        jComboBoxTerreno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Interior", "Exterior" }));

        javax.swing.GroupLayout jPlantasLayout = new javax.swing.GroupLayout(jPlantas);
        jPlantas.setLayout(jPlantasLayout);
        jPlantasLayout.setHorizontalGroup(
            jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlantasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPlantasLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPlantasLayout.createSequentialGroup()
                                .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCientifico)
                                    .addComponent(txtNombre)
                                    .addComponent(txtMaceta)
                                    .addComponent(txtRiego)
                                    .addComponent(txtEpoca, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescripcion)
                                    .addComponent(txtTerreno))
                                .addGap(76, 76, 76)
                                .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jEpoca)
                                    .addComponent(jComboMaceta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboRiego, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNombreCientifico)
                                    .addComponent(jNombre)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTerreno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPlantasLayout.createSequentialGroup()
                                .addComponent(txtPrecio)
                                .addGap(157, 157, 157)
                                .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEuro)))
                        .addGap(35, 35, 35))
                    .addGroup(jPlantasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAnyadir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEliminar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPlantasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btHome2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                        .addGap(18, 18, 18)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTerreno))
                        .addGap(18, 18, 18)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEuro)
                            .addComponent(txtPrecio))
                        .addGap(41, 41, 41)
                        .addGroup(jPlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAnyadir)
                            .addComponent(btNuevo)
                            .addComponent(btEliminar)
                            .addComponent(btActualizar)
                            .addComponent(btEditar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btHome2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Plantas", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoPlantas.png")), jPlantas); // NOI18N

        jRecursos.setBackground(new java.awt.Color(239, 255, 239));

        btHome3.setBackground(new java.awt.Color(204, 255, 153));
        btHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/icon-home.png"))); // NOI18N
        btHome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHome3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jRecursosLayout = new javax.swing.GroupLayout(jRecursos);
        jRecursos.setLayout(jRecursosLayout);
        jRecursosLayout.setHorizontalGroup(
            jRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRecursosLayout.createSequentialGroup()
                .addContainerGap(1091, Short.MAX_VALUE)
                .addComponent(btHome3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jRecursosLayout.setVerticalGroup(
            jRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRecursosLayout.createSequentialGroup()
                .addContainerGap(581, Short.MAX_VALUE)
                .addComponent(btHome3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestión de recursos", new javax.swing.ImageIcon(getClass().getResource("/Principal/Resources/iconoRecursos.png")), jRecursos); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecursosActionPerformed
        this.jTabbedPane1.setSelectedIndex(4);//Cambia a la pestaña que le asignamos 
    }//GEN-LAST:event_botonRecursosActionPerformed

    private void botonRecursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRecursosMouseClicked
              
    }//GEN-LAST:event_botonRecursosMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        
      
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTareasActionPerformed
        this.jTabbedPane1.setSelectedIndex(1);//Cambia a la pestaña que le asignamos
    }//GEN-LAST:event_botonTareasActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
         dispose(); //Cerramos la ventana
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

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        this.jTabbedPane1.setSelectedIndex(0);//Volvemos a la pantalla de inicio
    }//GEN-LAST:event_btHomeActionPerformed

    private void btHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHome1ActionPerformed
        this.jTabbedPane1.setSelectedIndex(0);//Volvemos a la pantalla de inicio
    }//GEN-LAST:event_btHome1ActionPerformed

    private void btHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHome2ActionPerformed
        this.jTabbedPane1.setSelectedIndex(0);//Volvemos a la pantalla de inicio
    }//GEN-LAST:event_btHome2ActionPerformed

    private void btHome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHome3ActionPerformed
        this.jTabbedPane1.setSelectedIndex(0);//Volvemos a la pantalla de inicio
    }//GEN-LAST:event_btHome3ActionPerformed

   
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
        this.btEditar.setEnabled(false);
        this.jComboBoxTerreno.setEnabled(false);
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
        this.jComboBoxTerreno.setEnabled(true);
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
                jNombre.getText(),jNombreCientifico.getText(),jComboMaceta.getSelectedItem(),jComboRiego.getSelectedItem(),jEpoca.getText(), jTextAreaDescripcion.getText(), jComboBoxTerreno.getSelectedItem(), jPrecio.getText()           });
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
            jComboBoxTerreno.setSelectedItem(String.valueOf(model.getValueAt(fila, 6)));
            jPrecio.setText(String.valueOf(model.getValueAt(fila, 7)));
            btNuevo.setEnabled(false);
            btEditar.setEnabled(true);
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
        jComboBoxTerreno.setEnabled(true);
        jPrecio.setEnabled(true);
        btAnyadir.setEnabled(false);
    }
    public void actualizar(){
        if(jNombre.getText().isEmpty() || jNombreCientifico.getText().isEmpty() || jEpoca.getText().isEmpty() || jPrecio.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Rellena todos los campos."); 
        }
        else{
            //Modificamos los datos de la tabla
            model.setValueAt(jNombre.getText(), fila, 0);
            model.setValueAt(jNombreCientifico.getText(), fila, 1);
            model.setValueAt(jComboMaceta.getSelectedItem(), fila, 2);
            model.setValueAt(jComboRiego.getSelectedItem(), fila, 3);
            model.setValueAt(jEpoca.getText(), fila, 4);
            model.setValueAt(jTextAreaDescripcion.getText(), fila, 5);
            model.setValueAt(jComboBoxTerreno.getSelectedItem(), fila, 6);
            model.setValueAt(jPrecio.getText(), fila, 7);
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
    private javax.swing.JButton btHome;
    private javax.swing.JButton btHome1;
    private javax.swing.JButton btHome2;
    private javax.swing.JButton btHome3;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBAnadir;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JComboBox jComboBoxTerreno;
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
    private javax.swing.JLabel txtTerreno;
    // End of variables declaration//GEN-END:variables
    
}

