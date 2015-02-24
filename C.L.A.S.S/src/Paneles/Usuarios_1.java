/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Traximus
 */
@Entity
@Table(name = "usuarios", catalog = "libro_alcaldia_ssr", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuarios_1.findAll", query = "SELECT u FROM Usuarios_1 u"),
    @NamedQuery(name = "Usuarios_1.findByNombre", query = "SELECT u FROM Usuarios_1 u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios_1.findByApellido", query = "SELECT u FROM Usuarios_1 u WHERE u.apellido = :apellido"),
    @NamedQuery(name = "Usuarios_1.findByCedula", query = "SELECT u FROM Usuarios_1 u WHERE u.cedula = :cedula"),
    @NamedQuery(name = "Usuarios_1.findByTelefono", query = "SELECT u FROM Usuarios_1 u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuarios_1.findByDireccion", query = "SELECT u FROM Usuarios_1 u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Usuarios_1.findByEmail", query = "SELECT u FROM Usuarios_1 u WHERE u.email = :email"),
    @NamedQuery(name = "Usuarios_1.findBySexo", query = "SELECT u FROM Usuarios_1 u WHERE u.sexo = :sexo"),
    @NamedQuery(name = "Usuarios_1.findByUsuario", query = "SELECT u FROM Usuarios_1 u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuarios_1.findByPassword", query = "SELECT u FROM Usuarios_1 u WHERE u.password = :password"),
    @NamedQuery(name = "Usuarios_1.findByNivelSeguridad", query = "SELECT u FROM Usuarios_1 u WHERE u.nivelSeguridad = :nivelSeguridad")})
public class Usuarios_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Id
    @Basic(optional = false)
    @Column(name = "cedula")
    private Integer cedula;
    @Column(name = "telefono")
    private Integer telefono;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "email")
    private String email;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "password")
    private String password;
    @Column(name = "nivel_seguridad")
    private String nivelSeguridad;

    public Usuarios_1() {
    }

    public Usuarios_1(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        String oldApellido = this.apellido;
        this.apellido = apellido;
        changeSupport.firePropertyChange("apellido", oldApellido, apellido);
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        Integer oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        Integer oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getNivelSeguridad() {
        return nivelSeguridad;
    }

    public void setNivelSeguridad(String nivelSeguridad) {
        String oldNivelSeguridad = this.nivelSeguridad;
        this.nivelSeguridad = nivelSeguridad;
        changeSupport.firePropertyChange("nivelSeguridad", oldNivelSeguridad, nivelSeguridad);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios_1)) {
            return false;
        }
        Usuarios_1 other = (Usuarios_1) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paneles.Usuarios_1[ cedula=" + cedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
