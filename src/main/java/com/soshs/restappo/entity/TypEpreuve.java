/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.restappo.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "TYP_EPREUVE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypEpreuve.findAll", query = "SELECT t FROM TypEpreuve t")
    , @NamedQuery(name = "TypEpreuve.findByCodTep", query = "SELECT t FROM TypEpreuve t WHERE t.codTep = :codTep")
    , @NamedQuery(name = "TypEpreuve.findByLibTep", query = "SELECT t FROM TypEpreuve t WHERE t.libTep = :libTep")
    , @NamedQuery(name = "TypEpreuve.findByLicTep", query = "SELECT t FROM TypEpreuve t WHERE t.licTep = :licTep")
    , @NamedQuery(name = "TypEpreuve.findByTemEnSveTep", query = "SELECT t FROM TypEpreuve t WHERE t.temEnSveTep = :temEnSveTep")})
public class TypEpreuve implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_TEP")
    private String codTep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TEP")
    private String libTep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_TEP")
    private String licTep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TEP")
    private String temEnSveTep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTep")
    private Collection<Epreuve> epreuveCollection;

    public TypEpreuve() {
    }

    public TypEpreuve(String codTep) {
        this.codTep = codTep;
    }

    public TypEpreuve(String codTep, String libTep, String licTep, String temEnSveTep) {
        this.codTep = codTep;
        this.libTep = libTep;
        this.licTep = licTep;
        this.temEnSveTep = temEnSveTep;
    }

    public String getCodTep() {
        return codTep;
    }

    public void setCodTep(String codTep) {
        this.codTep = codTep;
    }

    public String getLibTep() {
        return libTep;
    }

    public void setLibTep(String libTep) {
        this.libTep = libTep;
    }

    public String getLicTep() {
        return licTep;
    }

    public void setLicTep(String licTep) {
        this.licTep = licTep;
    }

    public String getTemEnSveTep() {
        return temEnSveTep;
    }

    public void setTemEnSveTep(String temEnSveTep) {
        this.temEnSveTep = temEnSveTep;
    }

    @XmlTransient
    public Collection<Epreuve> getEpreuveCollection() {
        return epreuveCollection;
    }

    public void setEpreuveCollection(Collection<Epreuve> epreuveCollection) {
        this.epreuveCollection = epreuveCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTep != null ? codTep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypEpreuve)) {
            return false;
        }
        TypEpreuve other = (TypEpreuve) object;
        if ((this.codTep == null && other.codTep != null) || (this.codTep != null && !this.codTep.equals(other.codTep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.TypEpreuve[ codTep=" + codTep + " ]";
    }
    
}
