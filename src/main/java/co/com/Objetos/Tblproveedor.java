package co.com.Objetos;
// Generated 18/06/2018 05:29:22 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tblproveedor generated by hbm2java
 */
public class Tblproveedor  implements java.io.Serializable {


     private Integer id;
     private Tblparametrodetalle tblparametrodetalle;
     private Tblusuario tblusuario;
     private String nit;
     private String razonSocial;
     private String telefono;
     private String celular;
     private String direccion;
     private String ciudad;
     private String email;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private Set tblfacturas = new HashSet(0);
     private Set tblpedidos = new HashSet(0);

    public Tblproveedor() {
    }

	
    public Tblproveedor(String nit, String razonSocial) {
        this.nit = nit;
        this.razonSocial = razonSocial;
    }
    public Tblproveedor(Tblparametrodetalle tblparametrodetalle, Tblusuario tblusuario, String nit, String razonSocial, String telefono, String celular, String direccion, String ciudad, String email, Date fechaCreacion, Date fechaModificacion, Set tblfacturas, Set tblpedidos) {
       this.tblparametrodetalle = tblparametrodetalle;
       this.tblusuario = tblusuario;
       this.nit = nit;
       this.razonSocial = razonSocial;
       this.telefono = telefono;
       this.celular = celular;
       this.direccion = direccion;
       this.ciudad = ciudad;
       this.email = email;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
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
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
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


