package co.com.Objetos;
// Generated 10/05/2018 11:09:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tblusuario generated by hbm2java
 */
public class Tblusuario  implements java.io.Serializable {


     private Integer id;
     private Tbllogin tbllogin;
     private Tblparametrodetalle tblparametrodetalle;
     private String nombres;
     private String apellidos;
     private String identificacion;
  

    public Tblusuario() {
    }

    public Tblusuario(Tbllogin tbllogin, Tblparametrodetalle tblparametrodetalle, String nombres, String apellidos, String identificacion) {
       this.tbllogin = tbllogin;
       this.tblparametrodetalle = tblparametrodetalle;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.identificacion = identificacion;

    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tbllogin getTbllogin() {
        return this.tbllogin;
    }
    
    public void setTbllogin(Tbllogin tbllogin) {
        this.tbllogin = tbllogin;
    }
    public Tblparametrodetalle getTblparametrodetalle() {
        return this.tblparametrodetalle;
    }
    
    public void setTblparametrodetalle(Tblparametrodetalle tblparametrodetalle) {
        this.tblparametrodetalle = tblparametrodetalle;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


}


