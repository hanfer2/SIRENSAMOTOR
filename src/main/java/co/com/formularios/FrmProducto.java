/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.formularios;

import co.com.Objetos.Tblparametrodetalle;
import co.com.Objetos.Tblproducto;
import co.com.Objetos.exclusivos.Item;
import co.com.Objetos.exclusivos.JTableButtonRenderer;
import co.com.Service.ParametrosService;
import co.com.Service.ProductoService;
import co.com.ServiceImpl.ParametrosServiceImpl;
import co.com.ServiceImpl.ProductoServiceImpl;
import co.com.Util.Constantes;
import co.com.Util.UtilComponentes;
import co.com.Util.UtilValidaciones;
import java.math.BigDecimal;
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
public class FrmProducto extends javax.swing.JInternalFrame {

    private String accion = "";
    ParametrosService parametrosService = null;
    ProductoService productoService = null;
    Tblproducto producto = null;
    DefaultTableModel tabla = null;
    private static final int editar =8;
    private static final int eliminar =9;
    
    public FrmProducto() {
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
        txtDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        cbbPresentacion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbbMarca = new javax.swing.JComboBox<>();
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

        jLabel6.setText("ID Producto");
        jLabel6.setToolTipText("");

        txtId.setEditable(false);
        txtId.setName("txtId"); // NOI18N
        txtId.setOpaque(false);

        txtDescripcion.setName("txtDescripcion"); // NOI18N

        jLabel8.setText("Referencia");

        lblDocumento.setText("Descripción");

        txtReferencia.setName("txtNombres"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Precio");

        jLabel5.setText("Presentación");

        cbbPresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbPresentacion.setMinimumSize(new java.awt.Dimension(6, 20));
        cbbPresentacion.setPreferredSize(new java.awt.Dimension(6, 20));

        jLabel7.setText("Marca");

        cbbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMarca.setMinimumSize(new java.awt.Dimension(6, 20));
        cbbMarca.setPreferredSize(new java.awt.Dimension(6, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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
                "ID", "Referencia", "Descripción", "Precio", "IDPresentacion", "Presentación", "IDMarca", "Marca", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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

        if (txtDescripcion.getText().trim().equals("")) {
            mensaje += "Descripción " + Constantes.CAMPO_OBLIGATORIO;
        }
        if (txtReferencia.getText().trim().equals("")) {
            mensaje = " Referencia " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.containValuesNoAlfanumeric_withSpace(txtReferencia.getText().trim())) {
            mensaje += " Referencia " + Constantes.CAMPO_ALFANUMERICO;
        }
        if (txtPrecio.getText().trim().equals("")) {
            mensaje += " Precio " + Constantes.CAMPO_OBLIGATORIO;
        } else if (!UtilValidaciones.isValueMoney(txtPrecio.getText().trim())) {
            mensaje += " Precio " + Constantes.CAMPO_NUMERICO;
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
        productoService = new ProductoServiceImpl();
        parametrosService = new ParametrosServiceImpl();
       

        Tblproducto producto = null;

        try {
           
            producto = new Tblproducto();

           
            producto.setReferencia(txtReferencia.getText().trim());
            producto.setDescripcion(txtDescripcion.getText().trim());

           Item item = (Item) cbbMarca.getSelectedItem();
           producto.setTblparametrodetalleByMarca(parametrosService.findById(item.getId()));
          
            
           item = (Item) cbbPresentacion.getSelectedItem();
           
            producto.setTblparametrodetalleByPresentacion(parametrosService.findById(item.getId()));
           
            producto.setPrecio(new BigDecimal(txtPrecio.getText().trim()));
            
            if(!txtId.getText().trim().equals(""))
            {
            producto.setId(Integer.parseInt(txtId.getText()) );
            }
            
            if (accion.equals(Constantes.ACCION_CREAR)) {
                productoService.save(producto);
            }
            if (accion.equals(Constantes.ACCION_EDITAR)) {
                productoService.update(producto);
            }
            if (accion.equals(Constantes.ACCION_ELIMINAR)) {
                productoService.delete(producto);
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
        txtReferencia.setText(model.getValueAt(row, 1).toString());
        txtDescripcion.setText(model.getValueAt(row, 2).toString());
        txtPrecio.setText(model.getValueAt(row, 3).toString());
        cbbPresentacion.setSelectedItem(model.getValueAt(row, 4));
        cbbMarca.setSelectedItem(model.getValueAt(row, 6));
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

        cbbPresentacion.setModel(new DefaultComboBoxModel(util.buildModelParametros(Constantes.PRESENTACION)));
        cbbMarca.setModel(new DefaultComboBoxModel(util.buildModelParametros(Constantes.MARCAS)));
    }

    private void cargarTabla(String filtro) {

        productoService = new ProductoServiceImpl();
        producto = new Tblproducto();
        
Iterator consulta;
        if(filtro.isEmpty())
        {
         consulta = productoService.findAll().iterator();
        }else
        {
         consulta = productoService.findByFilter(filtro).iterator();
        }
        
        clearTabla();
        tabla = (DefaultTableModel) jTableUsuario.getModel();

        TableCellRenderer buttonRenderer = new JTableButtonRenderer();

        jTableUsuario.getColumn("Editar").setCellRenderer(buttonRenderer);
        jTableUsuario.getColumn("Eliminar").setCellRenderer(buttonRenderer);

        while (consulta.hasNext()) {
            Vector datos = new Vector();

            Tblproducto fila = (Tblproducto) consulta.next();

            datos.add(fila.getId());
            datos.add(fila.getReferencia());
            datos.add(fila.getDescripcion());
            datos.add(fila.getPrecio());
            
            Tblparametrodetalle param = fila.getTblparametrodetalleByPresentacion();
            /*-Presentacion-*/
            datos.add(param.getId());
            datos.add(param.getDescripcionDetalle());
            
            Tblparametrodetalle marca = fila.getTblparametrodetalleByMarca();
            /*-Presentacion-*/
            datos.add(marca.getId());
            datos.add(marca.getDescripcionDetalle());
            
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
        txtReferencia.setText("");
        cbbMarca.setSelectedIndex(0);
        cbbPresentacion.setSelectedIndex(0);
        txtDescripcion.setText("");
        txtPrecio.setText("");
       
    }

    private void enabledOrDisabled(boolean enable) {
        txtId.setEnabled(false);
        txtReferencia.setEnabled(enable);
        cbbMarca.setEnabled(enable);
        txtDescripcion.setEnabled(enable);
        cbbPresentacion.setEnabled(enable);
        txtPrecio.setEnabled(enable);
        btnSave.setEnabled(enable);
        btnCancel.setEnabled(enable);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbMarca;
    private javax.swing.JComboBox<String> cbbPresentacion;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFiltrar;
    private javax.swing.JLabel txtFiltro;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
