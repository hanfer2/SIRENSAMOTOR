package co.com.Objetos;
// Generated 10/05/2018 11:09:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tblcliente generated by hbm2java
 */
public class Tblcliente  implements java.io.Serializable {


     private Integer id;
     private Tblparametrodetalle tblparametrodetalle;
     private Tblusuario tblusuario;
     private String identificacion;
     private String direccion;
     private String nombreCliente;
     private String telefono;
     private String celular;
     private String email;
     private Set tblfacturas = new HashSet(0);
     private Set tblpedidos = new HashSet(0);

    public Tblcliente() {
    }

    public Tblcliente(Tblparametrodetalle tblparametrodetalle, Tblusuario tblusuario, String identificacion, String direccion, String nombreCliente, String telefono, String celular, String email, Set tblfacturas, Set tblpedidos) {
       this.tblparametrodetalle = tblparametrodetalle;
       this.tblusuario = tblusuario;
       this.identificacion = identificacion;
       this.direccion = direccion;
       this.nombreCliente = nombreCliente;
       this.telefono = telefono;
       this.celular = celular;
       this.email = email;
       this.tblfacturas = tblfacturas;
       this.tblpedidos = tblpedidos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tblparametrodetalle getTblparametrodetalle() {
        return this.tblparametrodetalle;
    }
    
    public void setTblparametrodetalle(Tblparametrodetalle tblparametrodetalle) {
        this.tblparametrodetalle = tblparametrodetalle;
    }
    public Tblusuario getTblusuario() {
        return this.tblusuario;
    }
    
    public void setTblusuario(Tblusuario tblusuario) {
        this.tblusuario = tblusuario;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getTblfacturas() {
        return this.tblfacturas;
    }
    
    public void setTblfacturas(Set tblfacturas) {
        this.tblfacturas = tblfacturas;
    }
    public Set getTblpedidos() {
        return this.tblpedidos;
    }
    
    public void setTblpedidos(Set tblpedidos) {
        this.tblpedidos = tblpedidos;
    }




}

