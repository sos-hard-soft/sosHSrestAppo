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
@Table(name = "CYCLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cycle.findAll", query = "SELECT c FROM Cycle c")
    , @NamedQuery(name = "Cycle.findByCodCyc", query = "SELECT c FROM Cycle c WHERE c.codCyc = :codCyc")
    , @NamedQuery(name = "Cycle.findByLibCyc", query = "SELECT c FROM Cycle c WHERE c.libCyc = :libCyc")
    , @NamedQuery(name = "Cycle.findByTemEnSveCyc", query = "SELECT c FROM Cycle c WHERE c.temEnSveCyc = :temEnSveCyc")
    , @NamedQuery(name = "Cycle.findByTemDel", query = "SELECT c FROM Cycle c WHERE c.temDel = :temDel")
    , @NamedQuery(name = "Cycle.findByLibCycArb", query = "SELECT c FROM Cycle c WHERE c.libCycArb = :libCycArb")})
public class Cycle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_CYC")
    private String codCyc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CYC")
    private String libCyc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CYC")
    private String temEnSveCyc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 40)
    @Column(name = "LIB_CYC_ARB")
    private String libCycArb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCyc")
    private Collection<Diplome> diplomeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCyc")
    private Collection<Etape> etapeCollection;

    public Cycle() {
    }

    public Cycle(String codCyc) {
        this.codCyc = codCyc;
    }

    public Cycle(String codCyc, String libCyc, String temEnSveCyc, String temDel) {
        this.codCyc = codCyc;
        this.libCyc = libCyc;
        this.temEnSveCyc = temEnSveCyc;
        this.temDel = temDel;
    }

    public String getCodCyc() {
        return codCyc;
    }

    public void setCodCyc(String codCyc) {
        this.codCyc = codCyc;
    }

    public String getLibCyc() {
        return libCyc;
    }

    public void setLibCyc(String libCyc) {
        this.libCyc = libCyc;
    }

    public String getTemEnSveCyc() {
        return temEnSveCyc;
    }

    public void setTemEnSveCyc(String temEnSveCyc) {
        this.temEnSveCyc = temEnSveCyc;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getLibCycArb() {
        return libCycArb;
    }

    public void setLibCycArb(String libCycArb) {
        this.libCycArb = libCycArb;
    }

    @XmlTransient
    public Collection<Diplome> getDiplomeCollection() {
        return diplomeCollection;
    }

    public void setDiplomeCollection(Collection<Diplome> diplomeCollection) {
        this.diplomeCollection = diplomeCollection;
    }

    @XmlTransient
    public Collection<Etape> getEtapeCollection() {
        return etapeCollection;
    }

    public void setEtapeCollection(Collection<Etape> etapeCollection) {
        this.etapeCollection = etapeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCyc != null ? codCyc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cycle)) {
            return false;
        }
        Cycle other = (Cycle) object;
        if ((this.codCyc == null && other.codCyc != null) || (this.codCyc != null && !this.codCyc.equals(other.codCyc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.Cycle[ codCyc=" + codCyc + " ]";
    }
    
}
