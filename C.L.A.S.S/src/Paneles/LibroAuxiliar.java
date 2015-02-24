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
@Table(name = "libro_auxiliar", catalog = "libro_alcaldia_ssr", schema = "")
@NamedQueries({
    @NamedQuery(name = "LibroAuxiliar.findAll", query = "SELECT l FROM LibroAuxiliar l"),
    @NamedQuery(name = "LibroAuxiliar.findByDia", query = "SELECT l FROM LibroAuxiliar l WHERE l.dia = :dia"),
    @NamedQuery(name = "LibroAuxiliar.findByNrocheque", query = "SELECT l FROM LibroAuxiliar l WHERE l.nrocheque = :nrocheque"),
    @NamedQuery(name = "LibroAuxiliar.findByOP", query = "SELECT l FROM LibroAuxiliar l WHERE l.oP = :oP"),
    @NamedQuery(name = "LibroAuxiliar.findByCE", query = "SELECT l FROM LibroAuxiliar l WHERE l.cE = :cE"),
    @NamedQuery(name = "LibroAuxiliar.findByBeneficiario", query = "SELECT l FROM LibroAuxiliar l WHERE l.beneficiario = :beneficiario"),
    @NamedQuery(name = "LibroAuxiliar.findByRif", query = "SELECT l FROM LibroAuxiliar l WHERE l.rif = :rif"),
    @NamedQuery(name = "LibroAuxiliar.findByDescripcion", query = "SELECT l FROM LibroAuxiliar l WHERE l.descripcion = :descripcion"),
    @NamedQuery(name = "LibroAuxiliar.findByDebe", query = "SELECT l FROM LibroAuxiliar l WHERE l.debe = :debe"),
    @NamedQuery(name = "LibroAuxiliar.findByHaber", query = "SELECT l FROM LibroAuxiliar l WHERE l.haber = :haber"),
    @NamedQuery(name = "LibroAuxiliar.findBySaldo", query = "SELECT l FROM LibroAuxiliar l WHERE l.saldo = :saldo"),
    @NamedQuery(name = "LibroAuxiliar.findByBanco", query = "SELECT l FROM LibroAuxiliar l WHERE l.banco = :banco"),
    @NamedQuery(name = "LibroAuxiliar.findByMes", query = "SELECT l FROM LibroAuxiliar l WHERE l.mes = :mes")})
public class LibroAuxiliar implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "dia")
    private String dia;
    @Id
    @Basic(optional = false)
    @Column(name = "nrocheque")
    private String nrocheque;
    @Column(name = "o_p")
    private String oP;
    @Column(name = "c_e")
    private String cE;
    @Column(name = "beneficiario")
    private String beneficiario;
    @Column(name = "rif")
    private String rif;
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "debe")
    private Float debe;
    @Column(name = "haber")
    private Float haber;
    @Column(name = "saldo")
    private Float saldo;
    @Column(name = "banco")
    private String banco;
    @Column(name = "mes")
    private String mes;

    public LibroAuxiliar() {
    }

    public LibroAuxiliar(String nrocheque) {
        this.nrocheque = nrocheque;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        String oldDia = this.dia;
        this.dia = dia;
        changeSupport.firePropertyChange("dia", oldDia, dia);
    }

    public String getNrocheque() {
        return nrocheque;
    }

    public void setNrocheque(String nrocheque) {
        String oldNrocheque = this.nrocheque;
        this.nrocheque = nrocheque;
        changeSupport.firePropertyChange("nrocheque", oldNrocheque, nrocheque);
    }

    public String getOP() {
        return oP;
    }

    public void setOP(String oP) {
        String oldOP = this.oP;
        this.oP = oP;
        changeSupport.firePropertyChange("OP", oldOP, oP);
    }

    public String getCE() {
        return cE;
    }

    public void setCE(String cE) {
        String oldCE = this.cE;
        this.cE = cE;
        changeSupport.firePropertyChange("CE", oldCE, cE);
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        String oldBeneficiario = this.beneficiario;
        this.beneficiario = beneficiario;
        changeSupport.firePropertyChange("beneficiario", oldBeneficiario, beneficiario);
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        String oldRif = this.rif;
        this.rif = rif;
        changeSupport.firePropertyChange("rif", oldRif, rif);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    public Float getDebe() {
        return debe;
    }

    public void setDebe(Float debe) {
        Float oldDebe = this.debe;
        this.debe = debe;
        changeSupport.firePropertyChange("debe", oldDebe, debe);
    }

    public Float getHaber() {
        return haber;
    }

    public void setHaber(Float haber) {
        Float oldHaber = this.haber;
        this.haber = haber;
        changeSupport.firePropertyChange("haber", oldHaber, haber);
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        Float oldSaldo = this.saldo;
        this.saldo = saldo;
        changeSupport.firePropertyChange("saldo", oldSaldo, saldo);
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        String oldBanco = this.banco;
        this.banco = banco;
        changeSupport.firePropertyChange("banco", oldBanco, banco);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        String oldMes = this.mes;
        this.mes = mes;
        changeSupport.firePropertyChange("mes", oldMes, mes);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrocheque != null ? nrocheque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibroAuxiliar)) {
            return false;
        }
        LibroAuxiliar other = (LibroAuxiliar) object;
        if ((this.nrocheque == null && other.nrocheque != null) || (this.nrocheque != null && !this.nrocheque.equals(other.nrocheque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paneles.LibroAuxiliar[ nrocheque=" + nrocheque + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
