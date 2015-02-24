/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Traximus
 */
@Entity
@Table(name = "cuentas", catalog = "libro_alcaldia_ssr", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c"),
    @NamedQuery(name = "Cuentas.findByBanco", query = "SELECT c FROM Cuentas c WHERE c.banco = :banco"),
    @NamedQuery(name = "Cuentas.findByNroCta", query = "SELECT c FROM Cuentas c WHERE c.nroCta = :nroCta"),
    @NamedQuery(name = "Cuentas.findByTipoCta", query = "SELECT c FROM Cuentas c WHERE c.tipoCta = :tipoCta"),
    @NamedQuery(name = "Cuentas.findByFechaRegistro", query = "SELECT c FROM Cuentas c WHERE c.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Cuentas.findBySaldo", query = "SELECT c FROM Cuentas c WHERE c.saldo = :saldo")})
public class Cuentas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "banco")
    private String banco;
    @Id
    @Basic(optional = false)
    @Column(name = "nro_cta")
    private String nroCta;
    @Column(name = "tipo_cta")
    private String tipoCta;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private Float saldo;

    public Cuentas() {
    }

    public Cuentas(String nroCta) {
        this.nroCta = nroCta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        String oldBanco = this.banco;
        this.banco = banco;
        changeSupport.firePropertyChange("banco", oldBanco, banco);
    }

    public String getNroCta() {
        return nroCta;
    }

    public void setNroCta(String nroCta) {
        String oldNroCta = this.nroCta;
        this.nroCta = nroCta;
        changeSupport.firePropertyChange("nroCta", oldNroCta, nroCta);
    }

    public String getTipoCta() {
        return tipoCta;
    }

    public void setTipoCta(String tipoCta) {
        String oldTipoCta = this.tipoCta;
        this.tipoCta = tipoCta;
        changeSupport.firePropertyChange("tipoCta", oldTipoCta, tipoCta);
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        Date oldFechaRegistro = this.fechaRegistro;
        this.fechaRegistro = fechaRegistro;
        changeSupport.firePropertyChange("fechaRegistro", oldFechaRegistro, fechaRegistro);
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        Float oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nroCta != null ? nroCta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.nroCta == null && other.nroCta != null) || (this.nroCta != null && !this.nroCta.equals(other.nroCta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paneles.Cuentas[ nroCta=" + nroCta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
