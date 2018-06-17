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
import co.com.Service.LoginService;
import co.com.Service.ParametrosService;
import co.com.Service.RolService;
import co.com.Service.UsuarioService;
import co.com.ServiceImpl.LoginServiceImpl;
import co.com.ServiceImpl.ParametrosServiceImpl;
import co.com.ServiceImpl.RolServiceImpl;
import co.com.ServiceImpl.UsuarioServiceImpl;
import co.com.Util.Constantes;
import co.com.Util.UtilComponentes;
import co.com.Util.UtilValidaciones;
import java.util.Iterator;
import java.util.List;
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
public class FrmRol extends javax.swing.JInternalFrame {

    private String accion = "";
    ParametrosService parametrosService = null;
    RolService rolService = null;
    LoginService loginService = null;
    DefaultTableModel tabla = null;
    final int editar = 3;
    final int eliminar = 4;
    Tblrol rol;

    public FrmRol() {
        initComponents();
        enabledOrDisabled(false);
        cargarTabla("");
        accion = Constantes.ACCION_CREAR;

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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIdRol = new javax.swing.JTextField();
        lblDocumento = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        lblDocumento1 = new javax.swing.JLabel();
        jckActivo = new javax.swing.JCheckBox();

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
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                "IdRol", "Rol", "Activo", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltrar)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

        txtIdRol.setEditable(false);
        txtIdRol.setName("txtIdRol"); // NOI18N
        txtIdRol.setOpaque(false);

        lblDocumento.setText("Rol");

        txtRol.setName("txtNombres"); // NOI18N

        lblDocumento1.setText("Activo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(txtIdRol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jckActivo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento1)
                    .addComponent(jckActivo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        limpiar();
        enabledOrDisabled(true);
        accion = Constantes.ACCION_CREAR;
        btnSave.setText(Constantes.ACCION_CREAR);
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
        if (accion.equals(Constantes.ACCION_CREAR) || accion.equals(Constantes.ACCION_EDITAR)) {
            //Validar
            if (txtRol.getText().trim().equals("")) {
                mensaje += "Nombre del Rol " + Constantes.CAMPO_OBLIGATORIO;
            } else if (!UtilValidaciones.containValuesNoAlfanumeric(txtRol.getText().trim())) {
                mensaje += "Nombre del Rol " + Constantes.CAMPO_ALFANUMERICO;
            }
        }
        if (accion.equals(Constantes.ACCION_ELIMINAR))
        {
            loginService = new LoginServiceImpl();
            
            List<Tbllogin> listaLogin = loginService.findAllByIdRol(Integer.parseInt(txtIdRol.getText().trim()));
            
            if(listaLogin !=null && listaLogin.size()>0)
            {
             mensaje += Constantes.REGISTRO_ELIMINAR;
            }
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

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked

        int row = jTableUsuario.getSelectedRow();
        int columna = jTableUsuario.getSelectedColumn();
        System.out.print("row:::" + row + "   colum" + columna);

        if (jTableUsuario.getSelectedColumn() == editar || jTableUsuario.getSelectedColumn() == eliminar) {
            clearText();

            TableModel model = jTableUsuario.getModel();

            txtIdRol.setText(model.getValueAt(row, 0).toString());
            txtRol.setText(model.getValueAt(row, 1).toString());
            
            if( model.getValueAt(row, 2).toString().equalsIgnoreCase(Constantes.ACTIVO))
            {
            jckActivo.setSelected(true);
            }else
            {
            jckActivo.setSelected(false);
            }
        }
        //Editar
        if (jTableUsuario.getSelectedColumn() == editar) {
            btnSave.setText(Constantes.ACCION_EDITAR);
            enabledOrDisabled(true);
            accion = Constantes.ACCION_EDITAR;
        }
        //Eliminar
        if (jTableUsuario.getSelectedColumn() == eliminar) {
            int input = JOptionPane.showConfirmDialog(null, Constantes.ELIMINAR_ITEM, Constantes.ALERTA,
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            if (input == 0) {
                accion = Constantes.ACCION_ELIMINAR;
                saveOrUpdate();
            }else
            {
            limpiar();
            }
        }

    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

        String filtro = txtFiltrar.getText().trim();

        cargarTabla(filtro);
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void saveOrUpdate() {

        if (validateForm()) {
            return;
        }

        parametrosService = new ParametrosServiceImpl();
        rolService = new RolServiceImpl();

        rol = new Tblrol();

        try {

            if (!txtIdRol.getText().trim().equals("")) {
                rol.setId(Integer.parseInt(txtIdRol.getText()));
            }

            rol.setNombreRol(txtRol.getText().trim());
            rol.setActivo(jckActivo.isSelected() ? 1 : 0);

            if (accion.equals(Constantes.ACCION_CREAR)) {
                rolService.save(rol);
            }
            if (accion.equals(Constantes.ACCION_EDITAR)) {
                rolService.update(rol);
            }
            if (accion.equals(Constantes.ACCION_ELIMINAR)) {

                rolService.delete(rol);
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

    private void clearTabla() {
        while (jTableUsuario.getRowCount() != 0) {
            ((DefaultTableModel) jTableUsuario.getModel()).removeRow(0);
        }
    }

    private void cargarTabla(String filtro) {

        rolService = new RolServiceImpl();
        rol = new Tblrol();

        Iterator consulta;
        if (filtro.isEmpty()) {
            consulta = rolService.findAll().iterator();
        } else {
            consulta = rolService.findByFilter(filtro).iterator();
        }

        clearTabla();
        tabla = (DefaultTableModel) jTableUsuario.getModel();

        TableCellRenderer buttonRenderer = new JTableButtonRenderer();

        jTableUsuario.getColumn("Editar").setCellRenderer(buttonRenderer);
        jTableUsuario.getColumn("Eliminar").setCellRenderer(buttonRenderer);

        while (consulta.hasNext()) {
            Vector datos = new Vector();

            Tblrol fila = (Tblrol) consulta.next();

            datos.add(fila.getId());

            datos.add(fila.getNombreRol());
            datos.add(fila.getActivo() == 1 ? Constantes.ACTIVO : Constantes.INACTIVO);

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
        txtIdRol.setText("");
        txtRol.setText("");
        jckActivo.setSelected(false);

    }

    private void enabledOrDisabled(boolean enable) {
        txtIdRol.setEnabled(false);
        txtRol.setEnabled(enable);
        jckActivo.setEnabled(enable);

        btnSave.setEnabled(enable);
        btnCancel.setEnabled(enable);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JCheckBox jckActivo;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblDocumento1;
    private javax.swing.JButton txtBuscar;
    private javax.swing.JTextField txtFiltrar;
    private javax.swing.JLabel txtFiltro;
    private javax.swing.JTextField txtIdRol;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables
}
