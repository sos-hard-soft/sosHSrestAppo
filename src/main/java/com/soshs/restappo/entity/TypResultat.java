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
@Table(name = "TYP_RESULTAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypResultat.findAll", query = "SELECT t FROM TypResultat t")
    , @NamedQuery(name = "TypResultat.findByCodTre", query = "SELECT t FROM TypResultat t WHERE t.codTre = :codTre")
    , @NamedQuery(name = "TypResultat.findByLibTre", query = "SELECT t FROM TypResultat t WHERE t.libTre = :libTre")
    , @NamedQuery(name = "TypResultat.findByLicTre", query = "SELECT t FROM TypResultat t WHERE t.licTre = :licTre")
    , @NamedQuery(name = "TypResultat.findByTemAdiTre", query = "SELECT t FROM TypResultat t WHERE t.temAdiTre = :temAdiTre")
    , @NamedQuery(name = "TypResultat.findByTemAdoTre", query = "SELECT t FROM TypResultat t WHERE t.temAdoTre = :temAdoTre")
    , @NamedQuery(name = "TypResultat.findByTemVdiTre", query = "SELECT t FROM TypResultat t WHERE t.temVdiTre = :temVdiTre")
    , @NamedQuery(name = "TypResultat.findByTemVetTre", query = "SELECT t FROM TypResultat t WHERE t.temVetTre = :temVetTre")
    , @NamedQuery(name = "TypResultat.findByTemElpTre", query = "SELECT t FROM TypResultat t WHERE t.temElpTre = :temElpTre")
    , @NamedQuery(name = "TypResultat.findByTemEprTre", query = "SELECT t FROM TypResultat t WHERE t.temEprTre = :temEprTre")
    , @NamedQuery(name = "TypResultat.findByCodSisDipTre", query = "SELECT t FROM TypResultat t WHERE t.codSisDipTre = :codSisDipTre")
    , @NamedQuery(name = "TypResultat.findByCodNegTre", query = "SELECT t FROM TypResultat t WHERE t.codNegTre = :codNegTre")
    , @NamedQuery(name = "TypResultat.findByTemEnSveTre", query = "SELECT t FROM TypResultat t WHERE t.temEnSveTre = :temEnSveTre")
    , @NamedQuery(name = "TypResultat.findByTemDel", query = "SELECT t FROM TypResultat t WHERE t.temDel = :temDel")
    , @NamedQuery(name = "TypResultat.findByCodTreArb", query = "SELECT t FROM TypResultat t WHERE t.codTreArb = :codTreArb")
    , @NamedQuery(name = "TypResultat.findByLibTreArb", query = "SELECT t FROM TypResultat t WHERE t.libTreArb = :libTreArb")
    , @NamedQuery(name = "TypResultat.findByLicTreArb", query = "SELECT t FROM TypResultat t WHERE t.licTreArb = :licTreArb")})
public class TypResultat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_TRE")
    private String codTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_TRE")
    private String libTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "LIC_TRE")
    private String licTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADI_TRE")
    private String temAdiTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADO_TRE")
    private String temAdoTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_VDI_TRE")
    private String temVdiTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_VET_TRE")
    private String temVetTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ELP_TRE")
    private String temElpTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EPR_TRE")
    private String temEprTre;
    @Size(max = 1)
    @Column(name = "COD_SIS_DIP_TRE")
    private String codSisDipTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_NEG_TRE")
    private String codNegTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_TRE")
    private String temEnSveTre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DEL")
    private String temDel;
    @Size(max = 4)
    @Column(name = "COD_TRE_ARB")
    private String codTreArb;
    @Size(max = 40)
    @Column(name = "LIB_TRE_ARB")
    private String libTreArb;
    @Size(max = 15)
    @Column(name = "LIC_TRE_ARB")
    private String licTreArb;
    @OneToMany(mappedBy = "codTrePos")
    private Collection<VersionDiplome> versionDiplomeCollection;
    @OneToMany(mappedBy = "codTreNeg")
    private Collection<VersionDiplome> versionDiplomeCollection1;
    @OneToMany(mappedBy = "codTre")
    private Collection<ResultatEpr> resultatEprCollection;
    @OneToMany(mappedBy = "codTrePos")
    private Collection<VersionEtape> versionEtapeCollection;
    @OneToMany(mappedBy = "codTreNeg")
    private Collection<VersionEtape> versionEtapeCollection1;
    @OneToMany(mappedBy = "codTre")
    private Collection<ResultatElp> resultatElpCollection;

    public TypResultat() {
    }

    public TypResultat(String codTre) {
        this.codTre = codTre;
    }

    public TypResultat(String codTre, String libTre, String licTre, String temAdiTre, String temAdoTre, String temVdiTre, String temVetTre, String temElpTre, String temEprTre, String codNegTre, String temEnSveTre, String temDel) {
        this.codTre = codTre;
        this.libTre = libTre;
        this.licTre = licTre;
        this.temAdiTre = temAdiTre;
        this.temAdoTre = temAdoTre;
        this.temVdiTre = temVdiTre;
        this.temVetTre = temVetTre;
        this.temElpTre = temElpTre;
        this.temEprTre = temEprTre;
        this.codNegTre = codNegTre;
        this.temEnSveTre = temEnSveTre;
        this.temDel = temDel;
    }

    public String getCodTre() {
        return codTre;
    }

    public void setCodTre(String codTre) {
        this.codTre = codTre;
    }

    public String getLibTre() {
        return libTre;
    }

    public void setLibTre(String libTre) {
        this.libTre = libTre;
    }

    public String getLicTre() {
        return licTre;
    }

    public void setLicTre(String licTre) {
        this.licTre = licTre;
    }

    public String getTemAdiTre() {
        return temAdiTre;
    }

    public void setTemAdiTre(String temAdiTre) {
        this.temAdiTre = temAdiTre;
    }

    public String getTemAdoTre() {
        return temAdoTre;
    }

    public void setTemAdoTre(String temAdoTre) {
        this.temAdoTre = temAdoTre;
    }

    public String getTemVdiTre() {
        return temVdiTre;
    }

    public void setTemVdiTre(String temVdiTre) {
        this.temVdiTre = temVdiTre;
    }

    public String getTemVetTre() {
        return temVetTre;
    }

    public void setTemVetTre(String temVetTre) {
        this.temVetTre = temVetTre;
    }

    public String getTemElpTre() {
        return temElpTre;
    }

    public void setTemElpTre(String temElpTre) {
        this.temElpTre = temElpTre;
    }

    public String getTemEprTre() {
        return temEprTre;
    }

    public void setTemEprTre(String temEprTre) {
        this.temEprTre = temEprTre;
    }

    public String getCodSisDipTre() {
        return codSisDipTre;
    }

    public void setCodSisDipTre(String codSisDipTre) {
        this.codSisDipTre = codSisDipTre;
    }

    public String getCodNegTre() {
        return codNegTre;
    }

    public void setCodNegTre(String codNegTre) {
        this.codNegTre = codNegTre;
    }

    public String getTemEnSveTre() {
        return temEnSveTre;
    }

    public void setTemEnSveTre(String temEnSveTre) {
        this.temEnSveTre = temEnSveTre;
    }

    public String getTemDel() {
        return temDel;
    }

    public void setTemDel(String temDel) {
        this.temDel = temDel;
    }

    public String getCodTreArb() {
        return codTreArb;
    }

    public void setCodTreArb(String codTreArb) {
        this.codTreArb = codTreArb;
    }

    public String getLibTreArb() {
        return libTreArb;
    }

    public void setLibTreArb(String libTreArb) {
        this.libTreArb = libTreArb;
    }

    public String getLicTreArb() {
        return licTreArb;
    }

    public void setLicTreArb(String licTreArb) {
        this.licTreArb = licTreArb;
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
    public Collection<ResultatEpr> getResultatEprCollection() {
        return resultatEprCollection;
    }

    public void setResultatEprCollection(Collection<ResultatEpr> resultatEprCollection) {
        this.resultatEprCollection = resultatEprCollection;
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
    public Collection<ResultatElp> getResultatElpCollection() {
        return resultatElpCollection;
    }

    public void setResultatElpCollection(Collection<ResultatElp> resultatElpCollection) {
        this.resultatElpCollection = resultatElpCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTre != null ? codTre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypResultat)) {
            return false;
        }
        TypResultat other = (TypResultat) object;
        if ((this.codTre == null && other.codTre != null) || (this.codTre != null && !this.codTre.equals(other.codTre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.TypResultat[ codTre=" + codTre + " ]";
    }
    
}
