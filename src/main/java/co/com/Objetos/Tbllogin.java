package co.com.Objetos;
// Generated 18/06/2018 05:29:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tbllogin generated by hbm2java
 */
public class Tbllogin  implements java.io.Serializable {


     private Integer id;
     private Tblrol tblrol;
     private String usuario;
     private String passwords;
     private Set tblusuarios = new HashSet(0);

    public Tbllogin() {
    }

	
    public Tbllogin(Tblrol tblrol) {
        this.tblrol = tblrol;
    }
    public Tbllogin(Tblrol tblrol, String usuario, String passwords, Set tblusuarios) {
       this.tblrol = tblrol;
       this.usuario = usuario;
       this.passwords = passwords;
       this.tblusuarios = tblusuarios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tblrol getTblrol() {
        return this.tblrol;
    }
    
    public void setTblrol(Tblrol tblrol) {
        this.tblrol = tblrol;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPasswords() {
        return this.passwords;
    }
    
    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }
    public Set getTblusuarios() {
        return this.tblusuarios;
    }
    
    public void setTblusuarios(Set tblusuarios) {
        this.tblusuarios = tblusuarios;
    }




}


