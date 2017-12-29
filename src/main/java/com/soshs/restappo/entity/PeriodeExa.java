/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.restappo.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "PERIODE_EXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeriodeExa.findAll", query = "SELECT p FROM PeriodeExa p")
    , @NamedQuery(name = "PeriodeExa.findByCodPxa", query = "SELECT p FROM PeriodeExa p WHERE p.codPxa = :codPxa")
    , @NamedQuery(name = "PeriodeExa.findByDatDebPxa", query = "SELECT p FROM PeriodeExa p WHERE p.datDebPxa = :datDebPxa")
    , @NamedQuery(name = "PeriodeExa.findByDatFinPxa", query = "SELECT p FROM PeriodeExa p WHERE p.datFinPxa = :datFinPxa")
    , @NamedQuery(name = "PeriodeExa.findByLibPxa", query = "SELECT p FROM PeriodeExa p WHERE p.libPxa = :libPxa")
    , @NamedQuery(name = "PeriodeExa.findByTemEnSvePxa", query = "SELECT p FROM PeriodeExa p WHERE p.temEnSvePxa = :temEnSvePxa")
    , @NamedQuery(name = "PeriodeExa.findByTemPrdValidPxa", query = "SELECT p FROM PeriodeExa p WHERE p.temPrdValidPxa = :temPrdValidPxa")
    , @NamedQuery(name = "PeriodeExa.findByDatDerTrtPxa", query = "SELECT p FROM PeriodeExa p WHERE p.datDerTrtPxa = :datDerTrtPxa")})
public class PeriodeExa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_PXA")
    private String codPxa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_DEB_PXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datDebPxa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_FIN_PXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datFinPxa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_PXA")
    private String libPxa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PXA")
    private String temEnSvePxa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PRD_VALID_PXA")
    private String temPrdValidPxa;
    @Column(name = "DAT_DER_TRT_PXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datDerTrtPxa;
    @JoinColumn(name = "COD_CIN", referencedColumnName = "COD_CIN")
    @ManyToOne(optional = false)
    private CentreIncomp codCin;
    @OneToMany(mappedBy = "codPxa1")
    private Collection<Epreuve> epreuveCollection;
    @OneToMany(mappedBy = "codPxa2")
    private Collection<Epreuve> epreuveCollection1;

    public PeriodeExa() {
    }

    public PeriodeExa(String codPxa) {
        this.codPxa = codPxa;
    }

    public PeriodeExa(String codPxa, Date datDebPxa, Date datFinPxa, String libPxa, String temEnSvePxa, String temPrdValidPxa) {
        this.codPxa = codPxa;
        this.datDebPxa = datDebPxa;
        this.datFinPxa = datFinPxa;
        this.libPxa = libPxa;
        this.temEnSvePxa = temEnSvePxa;
        this.temPrdValidPxa = temPrdValidPxa;
    }

    public String getCodPxa() {
        return codPxa;
    }

    public void setCodPxa(String codPxa) {
        this.codPxa = codPxa;
    }

    public Date getDatDebPxa() {
        return datDebPxa;
    }

    public void setDatDebPxa(Date datDebPxa) {
        this.datDebPxa = datDebPxa;
    }

    public Date getDatFinPxa() {
        return datFinPxa;
    }

    public void setDatFinPxa(Date datFinPxa) {
        this.datFinPxa = datFinPxa;
    }

    public String getLibPxa() {
        return libPxa;
    }

    public void setLibPxa(String libPxa) {
        this.libPxa = libPxa;
    }

    public String getTemEnSvePxa() {
        return temEnSvePxa;
    }

    public void setTemEnSvePxa(String temEnSvePxa) {
        this.temEnSvePxa = temEnSvePxa;
    }

    public String getTemPrdValidPxa() {
        return temPrdValidPxa;
    }

    public void setTemPrdValidPxa(String temPrdValidPxa) {
        this.temPrdValidPxa = temPrdValidPxa;
    }

    public Date getDatDerTrtPxa() {
        return datDerTrtPxa;
    }

    public void setDatDerTrtPxa(Date datDerTrtPxa) {
        this.datDerTrtPxa = datDerTrtPxa;
    }

    public CentreIncomp getCodCin() {
        return codCin;
    }

    public void setCodCin(CentreIncomp codCin) {
        this.codCin = codCin;
    }

    @XmlTransient
    public Collection<Epreuve> getEpreuveCollection() {
        return epreuveCollection;
    }

    public void setEpreuveCollection(Collection<Epreuve> epreuveCollection) {
        this.epreuveCollection = epreuveCollection;
    }

    @XmlTransient
    public Collection<Epreuve> getEpreuveCollection1() {
        return epreuveCollection1;
    }

    public void setEpreuveCollection1(Collection<Epreuve> epreuveCollection1) {
        this.epreuveCollection1 = epreuveCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPxa != null ? codPxa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodeExa)) {
            return false;
        }
        PeriodeExa other = (PeriodeExa) object;
        if ((this.codPxa == null && other.codPxa != null) || (this.codPxa != null && !this.codPxa.equals(other.codPxa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.PeriodeExa[ codPxa=" + codPxa + " ]";
    }
    
}
