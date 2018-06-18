/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.formularios;

import co.com.Objetos.Tblparametrodetalle;
import co.com.Objetos.Tblcliente;
import co.com.Objetos.exclusivos.Item;
import co.com.Objetos.exclusivos.JTableButtonRenderer;
import co.com.Service.ParametrosService;
import co.com.Service.ClienteService;
import co.com.ServiceImpl.ParametrosServiceImpl;
import co.com.ServiceImpl.ClienteServiceImpl;
import co.com.Util.Constantes;
import co.com.Util.UtilComponentes;
import co.com.Util.UtilValidaciones;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
    ClienteService clienteService = null;
    Tblcliente cliente = null;
    DefaultTableModel tabla = null;
    private static final int editar =9;
    private static final int eliminar =10;
    public FrmCliente() {
        initComponents();
        enabledOrDisabled(false);
        catalogos();
        cargarTabla("");
        accion = Constantes.ACCION_CREAR;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbbTipoDocumento = new javax.swing.JComboBox<>();
        lblDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
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

        setIconifiable(true);
        setTitle("Administración de usuarios TEST");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("ID Cliente");
        jLabel6.setToolTipText("");

        txtId.setEditable(false);
        txtId.setName("txtId"); // NOI18N
        txtId.setOpaque(false);

        jLabel7.setText("Nombres completo");

        txtNombres.setName("txtNombres"); // NOI18N

        jLabel8.setText("Tipo Documento");

        cbbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTipoDocumento.setMinimumSize(new java.awt.Dimension(6, 20));
        cbbTipoDocumento.setPreferredSize(new java.awt.Dimension(6, 20));

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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(txtId))
                    .addComponent(jLabel7))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Teléfono");

        jLabel5.setText("Celular");

        jLabel2.setText("Email");

        jLabel3.setText("Dirección");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtCelular)
                    .addComponent(txtEmail)
                    .addComponent(txtDireccion))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblID");

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
                "ID", "IDIdentifiacion", "Tipo Identificación", "Identificación", "Nombres", "Dirección", "Teléfono", "Celular", "Email", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
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
        if (txtCelular.getText().trim().equals("")) {
            mensaje = " Celular " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtCelular.getText().trim())) {
            mensaje += " Celular " + Constantes.CAMPO_ALFANUMERICO;
        }
        if (txtDocumento.getText().trim().equals("")) {
            mensaje += " Documento " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.isNumeric(txtDocumento.getText().trim())) {
            mensaje += " Documento " + Constantes.CAMPO_NUMERICO;
        }
        if (txtTelefono.getText().trim().equals("")) {
            mensaje += " Teléfono " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtTelefono.getText().trim())) {
            mensaje += " Teléfono " + Constantes.CAMPO_ALFANUMERICO;
        }
        if (txtEmail.getText().trim().equals("")) {
            mensaje += " Email " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtEmail.getText().trim())) {
            mensaje += " Email " + Constantes.CAMPO_ALFANUMERICO;
        }

        if (txtDireccion.getText().trim().equals("")) {
            mensaje += " Dirección " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtDireccion.getText().trim())) {
            mensaje += " Dirección " + Constantes.CAMPO_ALFANUMERICO;
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
        clienteService = new ClienteServiceImpl();
        parametrosService = new ParametrosServiceImpl();
       

        Tblcliente cliente = null;

        try {
           
            cliente = new Tblcliente();

           
            cliente.setNombreCliente(txtNombres.getText().trim());
            cliente.setIdentificacion(txtDocumento.getText().trim());

           Item item = (Item) cbbTipoDocumento.getSelectedItem();
            
            
            cliente.setTblparametrodetalle(parametrosService.findById(item.getId()));
            
            cliente.setTelefono(txtTelefono.getText().trim());
            cliente.setCelular(txtCelular.getText().trim());
            cliente.setDireccion(txtDireccion.getText().trim());
            cliente.setEmail(txtEmail.getText().trim());
            
            if(!txtId.getText().trim().equals(""))
            {
            cliente.setId(Integer.parseInt(txtId.getText()) );
            }
            
            if (accion.equals(Constantes.ACCION_CREAR)) {
                clienteService.save(cliente);
            }
            if (accion.equals(Constantes.ACCION_EDITAR)) {
                clienteService.update(cliente);
            }
            if (accion.equals(Constantes.ACCION_ELIMINAR)) {
                clienteService.delete(cliente);
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
        //System.out.print("row:::" + row + "   colum" + columna);
          
        if(jTableUsuario.getSelectedColumn()==editar || jTableUsuario.getSelectedColumn()==eliminar)
        {
        clearText() ;
        
        TableModel model = jTableUsuario.getModel();

        txtId.setText(model.getValueAt(row, 0).toString());
        cbbTipoDocumento.setSelectedItem(model.getValueAt(row, 1));
       // cbbTipoDocumento.setSelectedItem(model.getValueAt(row, 2));
        txtDocumento.setText(model.getValueAt(row, 3).toString());
        txtNombres.setText(model.getValueAt(row, 4).toString());
        txtDireccion.setText(model.getValueAt(row, 5).toString());
        txtTelefono.setText(model.getValueAt(row, 6).toString());
        txtCelular.setText(model.getValueAt(row, 7).toString());
        txtEmail.setText(model.getValueAt(row, 8).toString());
       
       }
//Editar
        if (jTableUsuario.getSelectedColumn()==editar)
        {
           btnSave.setText(Constantes.ACCION_EDITAR);
           enabledOrDisabled(true);
           accion= Constantes.ACCION_EDITAR;
        }
        //Eliminar
        if (jTableUsuario.getSelectedColumn()==eliminar ) 
        {
          int input = JOptionPane.showConfirmDialog(null, Constantes.ELIMINAR_ITEM, Constantes.ALERTA,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
          if(input == 0)
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
    }

    private void cargarTabla(String filtro) {

        clienteService = new ClienteServiceImpl();
        cliente = new Tblcliente();
        
Iterator consulta;
        if(filtro.isEmpty())
        {
         consulta = clienteService.findAll().iterator();
        }else
        {
         consulta = clienteService.findByFilter(filtro).iterator();
        }
        
        clearTabla();
        tabla = (DefaultTableModel) jTableUsuario.getModel();

        TableCellRenderer buttonRenderer = new JTableButtonRenderer();

        jTableUsuario.getColumn("Editar").setCellRenderer(buttonRenderer);
        jTableUsuario.getColumn("Eliminar").setCellRenderer(buttonRenderer);

        while (consulta.hasNext()) {
            Vector datos = new Vector();

            Tblcliente fila = (Tblcliente) consulta.next();

            datos.add(fila.getId());
            Tblparametrodetalle param = fila.getTblparametrodetalle();
            /*-Tipo de documento-*/
            datos.add(param.getId());
            datos.add(param.getDescripcionDetalle());

            datos.add(fila.getIdentificacion());
            datos.add(fila.getNombreCliente());
            datos.add(fila.getTelefono());
            datos.add(fila.getCelular());
            datos.add(fila.getDireccion());
            datos.add(fila.getEmail());
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
        txtCelular.setText("");

        txtTelefono.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
    }

    private void enabledOrDisabled(boolean enable) {
        txtId.setEnabled(false);
        txtDocumento.setEnabled(enable);
        cbbTipoDocumento.setEnabled(enable);
        txtNombres.setEnabled(enable);
        txtCelular.setEnabled(enable);

        txtTelefono.setEnabled(enable);
        txtDireccion.setEnabled(enable);
        txtEmail.setEnabled(enable);
       

        btnSave.setEnabled(enable);
        btnCancel.setEnabled(enable);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JButton txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFiltrar;
    private javax.swing.JLabel txtFiltro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
