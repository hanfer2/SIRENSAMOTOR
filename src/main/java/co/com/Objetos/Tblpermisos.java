package co.com.Objetos;
// Generated 10/05/2018 11:09:35 AM by Hibernate Tools 4.3.1



/**
 * Tblpermisos generated by hbm2java
 */
public class Tblpermisos  implements java.io.Serializable {


     private Integer id;
     private Tblpantalla tblpantalla;
     private Tblrol tblrol;
     private Integer permiso;

    public Tblpermisos() {
    }

	
    public Tblpermisos(Tblpantalla tblpantalla, Tblrol tblrol) {
        this.tblpantalla = tblpantalla;
        this.tblrol = tblrol;
    }
    public Tblpermisos(Tblpantalla tblpantalla, Tblrol tblrol, Integer permiso) {
       this.tblpantalla = tblpantalla;
       this.tblrol = tblrol;
       this.permiso = permiso;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tblpantalla getTblpantalla() {
        return this.tblpantalla;
    }
    
    public void setTblpantalla(Tblpantalla tblpantalla) {
        this.tblpantalla = tblpantalla;
    }
    public Tblrol getTblrol() {
        return this.tblrol;
    }
    
    public void setTblrol(Tblrol tblrol) {
        this.tblrol = tblrol;
    }
    public Integer getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(Integer permiso) {
        this.permiso = permiso;
    }




}

