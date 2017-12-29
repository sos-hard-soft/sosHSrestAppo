/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.restappo.entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "PERIODE_ANO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeriodeAno.findAll", query = "SELECT p FROM PeriodeAno p")
    , @NamedQuery(name = "PeriodeAno.findByCodPan", query = "SELECT p FROM PeriodeAno p WHERE p.codPan = :codPan")
    , @NamedQuery(name = "PeriodeAno.findByLibPan", query = "SELECT p FROM PeriodeAno p WHERE p.libPan = :libPan")
    , @NamedQuery(name = "PeriodeAno.findByTemEnSvePan", query = "SELECT p FROM PeriodeAno p WHERE p.temEnSvePan = :temEnSvePan")})
public class PeriodeAno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_PAN")
    private String codPan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_PAN")
    private String libPan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_PAN")
    private String temEnSvePan;
    @OneToMany(mappedBy = "codPan1")
    private Collection<ElementPedagogi> elementPedagogiCollection;
    @OneToMany(mappedBy = "codPan2")
    private Collection<ElementPedagogi> elementPedagogiCollection1;
    @OneToMany(mappedBy = "codPan3")
    private Collection<ElementPedagogi> elementPedagogiCollection2;
    @OneToMany(mappedBy = "codPan4")
    private Collection<ElementPedagogi> elementPedagogiCollection3;
    @OneToMany(mappedBy = "codPan1")
    private Collection<VersionDiplome> versionDiplomeCollection;
    @OneToMany(mappedBy = "codPan2")
    private Collection<VersionDiplome> versionDiplomeCollection1;
    @OneToMany(mappedBy = "codPan3")
    private Collection<VersionDiplome> versionDiplomeCollection2;
    @OneToMany(mappedBy = "codPan4")
    private Collection<VersionDiplome> versionDiplomeCollection3;
    @OneToMany(mappedBy = "codPan1")
    private Collection<VersionEtape> versionEtapeCollection;
    @OneToMany(mappedBy = "codPan2")
    private Collection<VersionEtape> versionEtapeCollection1;
    @OneToMany(mappedBy = "codPan3")
    private Collection<VersionEtape> versionEtapeCollection2;
    @OneToMany(mappedBy = "codPan4")
    private Collection<VersionEtape> versionEtapeCollection3;
    @OneToMany(mappedBy = "codPan1")
    private Collection<Epreuve> epreuveCollection;
    @OneToMany(mappedBy = "codPan2")
    private Collection<Epreuve> epreuveCollection1;
    @OneToMany(mappedBy = "codPan3")
    private Collection<Epreuve> epreuveCollection2;
    @OneToMany(mappedBy = "codPan4")
    private Collection<Epreuve> epreuveCollection3;
    @JoinColumn(name = "COD_RNA", referencedColumnName = "COD_RNA")
    @ManyToOne
    private RegleNumAno codRna;

    public PeriodeAno() {
    }

    public PeriodeAno(String codPan) {
        this.codPan = codPan;
    }

    public PeriodeAno(String codPan, String libPan, String temEnSvePan) {
        this.codPan = codPan;
        this.libPan = libPan;
        this.temEnSvePan = temEnSvePan;
    }

    public String getCodPan() {
        return codPan;
    }

    public void setCodPan(String codPan) {
        this.codPan = codPan;
    }

    public String getLibPan() {
        return libPan;
    }

    public void setLibPan(String libPan) {
        this.libPan = libPan;
    }

    public String getTemEnSvePan() {
        return temEnSvePan;
    }

    public void setTemEnSvePan(String temEnSvePan) {
        this.temEnSvePan = temEnSvePan;
    }

    @XmlTransient
    public Collection<ElementPedagogi> getElementPedagogiCollection() {
        return elementPedagogiCollection;
    }

    public void setElementPedagogiCollection(Collection<ElementPedagogi> elementPedagogiCollection) {
        this.elementPedagogiCollection = elementPedagogiCollection;
    }

    @XmlTransient
    public Collection<ElementPedagogi> getElementPedagogiCollection1() {
        return elementPedagogiCollection1;
    }

    public void setElementPedagogiCollection1(Collection<ElementPedagogi> elementPedagogiCollection1) {
        this.elementPedagogiCollection1 = elementPedagogiCollection1;
    }

    @XmlTransient
    public Collection<ElementPedagogi> getElementPedagogiCollection2() {
        return elementPedagogiCollection2;
    }

    public void setElementPedagogiCollection2(Collection<ElementPedagogi> elementPedagogiCollection2) {
        this.elementPedagogiCollection2 = elementPedagogiCollection2;
    }

    @XmlTransient
    public Collection<ElementPedagogi> getElementPedagogiCollection3() {
        return elementPedagogiCollection3;
    }

    public void setElementPedagogiCollection3(Collection<ElementPedagogi> elementPedagogiCollection3) {
        this.elementPedagogiCollection3 = elementPedagogiCollection3;
    }

    @XmlTransient
    public Collection<VersionDiplome> getVersionDiplomeCollection() {
        return versionDiplomeCollection;
    }

    public void setVersionDiplomeCollection(Collection<VersionDiplome> versionDiplomeCollection) {
        this.versionDiplomeCollection = versionDiplomeCollection;
    }

    @XmlTransient
    public Collection<VersionDiplome> getVersionDiplomeCollection1() {
        return versionDiplomeCollection1;
    }

    public void setVersionDiplomeCollection1(Collection<VersionDiplome> versionDiplomeCollection1) {
        this.versionDiplomeCollection1 = versionDiplomeCollection1;
    }

    @XmlTransient
    public Collection<VersionDiplome> getVersionDiplomeCollection2() {
        return versionDiplomeCollection2;
    }

    public void setVersionDiplomeCollection2(Collection<VersionDiplome> versionDiplomeCollection2) {
        this.versionDiplomeCollection2 = versionDiplomeCollection2;
    }

    @XmlTransient
    public Collection<VersionDiplome> getVersionDiplomeCollection3() {
        return versionDiplomeCollection3;
    }

    public void setVersionDiplomeCollection3(Collection<VersionDiplome> versionDiplomeCollection3) {
        this.versionDiplomeCollection3 = versionDiplomeCollection3;
    }

    @XmlTransient
    public Collection<VersionEtape> getVersionEtapeCollection() {
        return versionEtapeCollection;
    }

    public void setVersionEtapeCollection(Collection<VersionEtape> versionEtapeCollection) {
        this.versionEtapeCollection = versionEtapeCollection;
    }

    @XmlTransient
    public Collection<VersionEtape> getVersionEtapeCollection1() {
        return versionEtapeCollection1;
    }

    public void setVersionEtapeCollection1(Collection<VersionEtape> versionEtapeCollection1) {
        this.versionEtapeCollection1 = versionEtapeCollection1;
    }

    @XmlTransient
    public Collection<VersionEtape> getVersionEtapeCollection2() {
        return versionEtapeCollection2;
    }

    public void setVersionEtapeCollection2(Collection<VersionEtape> versionEtapeCollection2) {
        this.versionEtapeCollection2 = versionEtapeCollection2;
    }

    @XmlTransient
    public Collection<VersionEtape> getVersionEtapeCollection3() {
        return versionEtapeCollection3;
    }

    public void setVersionEtapeCollection3(Collection<VersionEtape> versionEtapeCollection3) {
        this.versionEtapeCollection3 = versionEtapeCollection3;
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

    @XmlTransient
    public Collection<Epreuve> getEpreuveCollection2() {
        return epreuveCollection2;
    }

    public void setEpreuveCollection2(Collection<Epreuve> epreuveCollection2) {
        this.epreuveCollection2 = epreuveCollection2;
    }

    @XmlTransient
    public Collection<Epreuve> getEpreuveCollection3() {
        return epreuveCollection3;
    }

    public void setEpreuveCollection3(Collection<Epreuve> epreuveCollection3) {
        this.epreuveCollection3 = epreuveCollection3;
    }

    public RegleNumAno getCodRna() {
        return codRna;
    }

    public void setCodRna(RegleNumAno codRna) {
        this.codRna = codRna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPan != null ? codPan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodeAno)) {
            return false;
        }
        PeriodeAno other = (PeriodeAno) object;
        if ((this.codPan == null && other.codPan != null) || (this.codPan != null && !this.codPan.equals(other.codPan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.PeriodeAno[ codPan=" + codPan + " ]";
    }
    
}
