/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Util;

import java.util.logging.Logger;

/**
 *
 * @author hangutco
 */
public class Constantes {
    
    public static final Logger LOGGER = Logger.getLogger( Constantes.class.getName() );
    
    public final static String ACCION_CREAR ="CREAR";
    public final static String ACCION_EDITAR ="EDITAR";
    public final static String ACCION_ELIMINAR ="ELIMINAR";
    
    
    public final static String DOCUMENTOS_IDENTIDAD ="DDI";
    public final static String MARCAS ="MARCAS";
    public final static String PRESENTACION ="PRESENTACION";
    

    /*---------*/
    public final static String CAMPO_OBLIGATORIO = "Es un campo obligatorio";
    public final static String CAMPO_NUMERICO = "Es un campo de solo números"; 
    public final static String CAMPO_ALFANUMERICO = "Es un campo alfanumerico";
    
    public final static String REGISTRO_ELIMINAR = "Este registro esta Asociado a otro, por lo tanto no puede ser eliminado \n Borre la relación antes de intentarlo nuevamente";
    
  /*Mensajes ventanas*/
    public final static String ELIMINAR_ITEM = "¿Esta seguro que desea eliminar este registro?";
    public final static String ALERTA = "Alerta...";
    
    
    /*Disable*/
    
    public final static String ACTIVO = "Activo";
    public final static String INACTIVO = "Inactivo";
}
