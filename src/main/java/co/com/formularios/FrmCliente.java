/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.formularios;

import co.com.Objetos.Tbllogin;
import co.com.Objetos.Tblparametrodetalle;
import co.com.Objetos.Tblrol;
import co.com.Objetos.Tblusuario;
import co.com.Objetos.exclusivos.Item;
import co.com.Objetos.exclusivos.JTableButtonRenderer;
import co.com.Objetos.exclusivos.SimpleHeaderRenderer;
import co.com.Service.ParametrosService;
import co.com.Service.RolService;
import co.com.Service.UsuarioService;
import co.com.ServiceImpl.ParametrosServiceImpl;
import co.com.ServiceImpl.RolServiceImpl;
import co.com.ServiceImpl.UsuarioServiceImpl;
import co.com.Util.Constantes;
import co.com.Util.UtilComponentes;
import co.com.Util.UtilValidaciones;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author hangutco
 */
public class FrmCliente extends javax.swing.JInternalFrame {

    private String accion = "";
    ParametrosService parametrosService = null;
    RolService rolService = null;
    UsuarioService usuarioService = null;
    Tblusuario usuario = null;
    DefaultTableModel tabla = null;

    public FrmCliente() {
        initComponents();
        enabledOrDisabled(false);
        catalogos();
        cargarTabla("");
        accion = Constantes.ACCION_CREAR;
        txtIdLogin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtFiltro = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JButton();
        txtFiltrar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbbTipoDocumento = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbRol = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pfdPass = new javax.swing.JPasswordField();
        pfdConfirmacion = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        txtIdLogin = new javax.swing.JTextField();

        setIconifiable(true);
        setTitle("Administración de usuarios TEST");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_bookmark-new_9207.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_save_173091.png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_cancel_59853.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(152, 152, 152))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setAutoscrolls(true);

        txtFiltro.setText("Filtrar");

        txtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_find_15527.png"))); // NOI18N
        txtBuscar.setText("Buscar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IDIdentifiacion", "Tipo Identificación", "Identificación", "Nombres", "Apellidos", "IDUsuario", "Usuario", "PassWord", "IdRol", "Rol", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableUsuario);
        if (jTableUsuario.getColumnModel().getColumnCount() > 0) {
            jTableUsuario.getColumnModel().getColumn(0).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(1).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(3).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(4).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(5).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(6).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(7).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(8).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(9).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(10).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(11).setResizable(false);
            jTableUsuario.getColumnModel().getColumn(12).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltrar)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro)
                    .addComponent(txtBuscar)
                    .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("ID Usuario");

        txtId.setEditable(false);
        txtId.setName("txtId"); // NOI18N
        txtId.setOpaque(false);

        jLabel7.setText("Nombres");

        txtNombres.setName("txtNombres"); // NOI18N

        jLabel8.setText("Tipo Documento");

        cbbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTipoDocumento.setMinimumSize(new java.awt.Dimension(6, 20));
        cbbTipoDocumento.setPreferredSize(new java.awt.Dimension(6, 20));

        jLabel10.setText("Apellidos");

        lblDocumento.setText("Documento");

        txtDocumento.setName("txtNombres"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(txtId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Usuario");

        jLabel4.setText("ROL");

        cbbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Password");

        jLabel2.setText("confirmación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(cbbRol, 0, 153, Short.MAX_VALUE)
                    .addComponent(pfdPass)
                    .addComponent(pfdConfirmacion)
                    .addComponent(txtUsuario))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfdPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pfdConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        limpiar();
        enabledOrDisabled(true);
        accion = Constantes.ACCION_CREAR;
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void limpiar() {
        enabledOrDisabled(false);
        clearText();
        cargarTabla("");
        accion = "";
    }

    private boolean validateForm() {
        String mensaje = "";

        if (txtNombres.getText().trim().equals("")) {
            mensaje += "Nombre " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtNombres.getText().trim())) {
            mensaje += " Nombres " + Constantes.CAMPO_ALFANUMERICO;
        }
        if (txtApellido.getText().trim().equals("")) {
            mensaje = " Apellido " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtNombres.getText().trim())) {
            mensaje += " Apellidos " + Constantes.CAMPO_ALFANUMERICO;
        }
        if (txtDocumento.getText().trim().equals("")) {
            mensaje += " Documento " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.isNumeric(txtDocumento.getText().trim())) {
            mensaje += " Documento " + Constantes.CAMPO_NUMERICO;
        }
        if (txtUsuario.getText().trim().equals("")) {
            mensaje += " Usuario " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtUsuario.getText().trim())) {
            mensaje += " Usuario " + Constantes.CAMPO_ALFANUMERICO;
        }
        if (new String(pfdPass.getPassword()).trim().equals("")) {
            mensaje += " La contraseña " + Constantes.CAMPO_OBLIGATORIO;
        }

        if (new String(pfdConfirmacion.getPassword()).trim().equals("")) {
            mensaje += " La verificación del password " + Constantes.CAMPO_OBLIGATORIO;
        }

        if (!new String(pfdConfirmacion.getPassword()).trim().equals(new String(pfdPass.getPassword()).trim())) {
            mensaje += " La verificación y el password son diferentes ";
        }

        if (!mensaje.equals("")) {
            JOptionPane.showMessageDialog(this, mensaje);
            return true;
        } else {
            return false;
        }
    }


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        saveOrUpdate();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void saveOrUpdate() {
        if (accion.equals(Constantes.ACCION_CREAR) || accion.equals(Constantes.ACCION_EDITAR)) {
            //Validar
            if (validateForm()) {
                return;
            }
        }
        usuarioService = new UsuarioServiceImpl();
        parametrosService = new ParametrosServiceImpl();
        rolService = new RolServiceImpl();

        Tbllogin login = new Tbllogin();

        try {
            login.setPasswords(new String(pfdPass.getPassword()));
            login.setUsuario(txtUsuario.getText().trim());

            Item item = (Item) cbbRol.getSelectedItem();

            login.setTblrol(rolService.findById(item.getId()));

            if(!txtIdLogin.getText().trim().equals(""))
            {
            login.setId(Integer.parseInt(txtIdLogin.getText()) );
            }
            
            usuario = new Tblusuario();

            usuario.setTbllogin(login);
            usuario.setApellidos(txtApellido.getText().trim());
            usuario.setNombres(txtNombres.getText().trim());
            usuario.setIdentificacion(txtDocumento.getText().trim());

            item = (Item) cbbTipoDocumento.getSelectedItem();

            usuario.setTblparametrodetalle(parametrosService.findById(item.getId()));

            if(!txtId.getText().trim().equals(""))
            {
            usuario.setId(Integer.parseInt(txtId.getText()) );
            }
            
            if (accion.equals(Constantes.ACCION_CREAR)) {
                usuarioService.save(usuario, login);
            }
            if (accion.equals(Constantes.ACCION_EDITAR)) {
                usuarioService.update(usuario, login);
            }
            if (accion.equals(Constantes.ACCION_ELIMINAR)) {
                usuarioService.delete(usuario, login);
            }
            
            

        } catch (NumberFormatException ex) {
            Constantes.LOGGER.log(Level.SEVERE, ex.toString(), ex);
        } catch (Exception ex) {
            Constantes.LOGGER.log(Level.SEVERE, ex.toString(), ex);
        } finally {

            limpiar();
            cargarTabla("");
        }
    }

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
       
        int row = jTableUsuario.getSelectedRow();
        int columna = jTableUsuario.getSelectedColumn();
          System.out.print("row:::" + row + "   colum" + columna);
          
        if(jTableUsuario.getSelectedColumn()==11 || jTableUsuario.getSelectedColumn()==12)
        {
        clearText() ;
        
        TableModel model = jTableUsuario.getModel();

        txtId.setText(model.getValueAt(row, 0).toString());
        cbbTipoDocumento.setSelectedItem(model.getValueAt(row, 1));
        txtDocumento.setText(model.getValueAt(row, 3).toString());
        txtNombres.setText(model.getValueAt(row, 4).toString());
        txtApellido.setText(model.getValueAt(row, 5).toString());
        txtIdLogin.setText(model.getValueAt(row, 6).toString());
        txtUsuario.setText(model.getValueAt(row, 7).toString());
        pfdPass.setText(model.getValueAt(row, 8).toString());
        
        cbbRol.setSelectedItem(model.getValueAt(row, 10));

       }
//Editar
        if (jTableUsuario.getSelectedColumn()==11)
        {
           btnSave.setText(Constantes.ACCION_EDITAR);
           enabledOrDisabled(true);
           accion= Constantes.ACCION_EDITAR;
        }
        //Eliminar
        if (jTableUsuario.getSelectedColumn()==12 ) 
        {
          int input = JOptionPane.showConfirmDialog(null, Constantes.ELIMINAR_ITEM, Constantes.ALERTA,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
          if(input == 1)
          {
           accion= Constantes.ACCION_ELIMINAR;
           saveOrUpdate();
          } 
          
        }
         
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
        String filtro = txtFiltrar.getText().trim();
        
        cargarTabla(filtro);
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void clearTabla() {
        while (jTableUsuario.getRowCount() != 0) {
            ((DefaultTableModel) jTableUsuario.getModel()).removeRow(0);
        }
    }

    private void catalogos() {
        UtilComponentes util = new UtilComponentes();

        cbbTipoDocumento.setModel(new DefaultComboBoxModel(util.buildModelParametros(Constantes.DOCUMENTOS_IDENTIDAD)));
        cbbRol.setModel(new DefaultComboBoxModel(util.buildModelRoles()));
    }

    private void cargarTabla(String filtro) {

        usuarioService = new UsuarioServiceImpl();
        usuario = new Tblusuario();
        
Iterator consulta;
        if(filtro.isEmpty())
        {
         consulta = usuarioService.findAll().iterator();
        }else
        {
         consulta = usuarioService.findByFilter(filtro).iterator();
        }
        
        clearTabla();
        tabla = (DefaultTableModel) jTableUsuario.getModel();

        TableCellRenderer buttonRenderer = new JTableButtonRenderer();

        jTableUsuario.getColumn("Editar").setCellRenderer(buttonRenderer);
        jTableUsuario.getColumn("Eliminar").setCellRenderer(buttonRenderer);

        while (consulta.hasNext()) {
            Vector datos = new Vector();

            Tblusuario fila = (Tblusuario) consulta.next();

            datos.add(fila.getId());
            Tblparametrodetalle param = fila.getTblparametrodetalle();
            /*-Tipo de documento-*/
            datos.add(param.getId());
            datos.add(param.getDescripcionDetalle());

            datos.add(fila.getIdentificacion());
            datos.add(fila.getNombres());
            datos.add(fila.getApellidos());

            /*-Login-*/
            datos.add(fila.getTbllogin().getId());
            datos.add(fila.getTbllogin().getUsuario());
            datos.add(fila.getTbllogin().getPasswords());
            datos.add(fila.getTbllogin().getTblrol().getId());
            datos.add(fila.getTbllogin().getTblrol().getNombreRol());

            JButton button1 = new JButton();
            JButton button2 = new JButton();
            button1.setText("Editar");
            button2.setText("Eliminar");

            datos.add(button1);
            datos.add(button2);

            tabla.addRow(datos);
        }

    }

    private void clearText() {
        txtId.setText("");
        txtDocumento.setText("");
        cbbTipoDocumento.setSelectedIndex(0);
        txtNombres.setText("");
        txtApellido.setText("");

        txtUsuario.setText("");
        pfdPass.setText("");
        pfdConfirmacion.setText("");
        cbbRol.setSelectedIndex(0);
        txtIdLogin.setText("");
    }

    private void enabledOrDisabled(boolean enable) {
        txtId.setEnabled(false);
        txtDocumento.setEnabled(enable);
        cbbTipoDocumento.setEnabled(enable);
        txtNombres.setEnabled(enable);
        txtApellido.setEnabled(enable);

        txtUsuario.setEnabled(enable);
        pfdPass.setEnabled(enable);
        pfdConfirmacion.setEnabled(enable);
        cbbRol.setEnabled(enable);

        btnSave.setEnabled(enable);
        btnCancel.setEnabled(enable);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbRol;
    private javax.swing.JComboBox<String> cbbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JPasswordField pfdConfirmacion;
    private javax.swing.JPasswordField pfdPass;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JButton txtBuscar;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFiltrar;
    private javax.swing.JLabel txtFiltro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdLogin;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
