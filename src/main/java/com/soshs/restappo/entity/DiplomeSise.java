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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "DIPLOME_SISE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiplomeSise.findAll", query = "SELECT d FROM DiplomeSise d")
    , @NamedQuery(name = "DiplomeSise.findByCodDis", query = "SELECT d FROM DiplomeSise d WHERE d.codDis = :codDis")
    , @NamedQuery(name = "DiplomeSise.findByEtaDis", query = "SELECT d FROM DiplomeSise d WHERE d.etaDis = :etaDis")
    , @NamedQuery(name = "DiplomeSise.findByTemEnSveDis", query = "SELECT d FROM DiplomeSise d WHERE d.temEnSveDis = :temEnSveDis")
    , @NamedQuery(name = "DiplomeSise.findByLibInt1Dis", query = "SELECT d FROM DiplomeSise d WHERE d.libInt1Dis = :libInt1Dis")
    , @NamedQuery(name = "DiplomeSise.findByLicTypDis", query = "SELECT d FROM DiplomeSise d WHERE d.licTypDis = :licTypDis")
    , @NamedQuery(name = "DiplomeSise.findByLibInt2Dis", query = "SELECT d FROM DiplomeSise d WHERE d.libInt2Dis = :libInt2Dis")})
public class DiplomeSise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_DIS")
    private Integer codDis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_DIS")
    private String etaDis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_DIS")
    private String temEnSveDis;
    @Size(max = 200)
    @Column(name = "LIB_INT1_DIS")
    private String libInt1Dis;
    @Size(max = 20)
    @Column(name = "LIC_TYP_DIS")
    private String licTypDis;
    @Size(max = 100)
    @Column(name = "LIB_INT2_DIS")
    private String libInt2Dis;
    @JoinTable(name = "DIS_CORRESPOND_DIS", joinColumns = {
        @JoinColumn(name = "COD_DIS1", referencedColumnName = "COD_DIS")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_DIS2", referencedColumnName = "COD_DIS")})
    @ManyToMany
    private Collection<DiplomeSise> diplomeSiseCollection;
    @ManyToMany(mappedBy = "diplomeSiseCollection")
    private Collection<DiplomeSise> diplomeSiseCollection1;
    @OneToMany(mappedBy = "codSisVdi")
    private Collection<VersionDiplome> versionDiplomeCollection;

    public DiplomeSise() {
    }

    public DiplomeSise(Integer codDis) {
        this.codDis = codDis;
    }

    public DiplomeSise(Integer codDis, String etaDis, String temEnSveDis) {
        this.codDis = codDis;
        this.etaDis = etaDis;
        this.temEnSveDis = temEnSveDis;
    }

    public Integer getCodDis() {
        return codDis;
    }

    public void setCodDis(Integer codDis) {
        this.codDis = codDis;
    }

    public String getEtaDis() {
        return etaDis;
    }

    public void setEtaDis(String etaDis) {
        this.etaDis = etaDis;
    }

    public String getTemEnSveDis() {
        return temEnSveDis;
    }

    public void setTemEnSveDis(String temEnSveDis) {
        this.temEnSveDis = temEnSveDis;
    }

    public String getLibInt1Dis() {
        return libInt1Dis;
    }

    public void setLibInt1Dis(String libInt1Dis) {
        this.libInt1Dis = libInt1Dis;
    }

    public String getLicTypDis() {
        return licTypDis;
    }

    public void setLicTypDis(String licTypDis) {
        this.licTypDis = licTypDis;
    }

    public String getLibInt2Dis() {
        return libInt2Dis;
    }

    public void setLibInt2Dis(String libInt2Dis) {
        this.libInt2Dis = libInt2Dis;
    }

    @XmlTransient
    public Collection<DiplomeSise> getDiplomeSiseCollection() {
        return diplomeSiseCollection;
    }

    public void setDiplomeSiseCollection(Collection<DiplomeSise> diplomeSiseCollection) {
        this.diplomeSiseCollection = diplomeSiseCollection;
    }

    @XmlTransient
    public Collection<DiplomeSise> getDiplomeSiseCollection1() {
        return diplomeSiseCollection1;
    }

    public void setDiplomeSiseCollection1(Collection<DiplomeSise> diplomeSiseCollection1) {
        this.diplomeSiseCollection1 = diplomeSiseCollection1;
    }

    @XmlTransient
    public Collection<VersionDiplome> getVersionDiplomeCollection() {
        return versionDiplomeCollection;
    }

    public void setVersionDiplomeCollection(Collection<VersionDiplome> versionDiplomeCollection) {
        this.versionDiplomeCollection = versionDiplomeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDis != null ? codDis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiplomeSise)) {
            return false;
        }
        DiplomeSise other = (DiplomeSise) object;
        if ((this.codDis == null && other.codDis != null) || (this.codDis != null && !this.codDis.equals(other.codDis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.DiplomeSise[ codDis=" + codDis + " ]";
    }
    
}
