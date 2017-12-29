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
@Table(name = "SITUATION_SISE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SituationSise.findAll", query = "SELECT s FROM SituationSise s")
    , @NamedQuery(name = "SituationSise.findByCodSis", query = "SELECT s FROM SituationSise s WHERE s.codSis = :codSis")
    , @NamedQuery(name = "SituationSise.findByLibSis", query = "SELECT s FROM SituationSise s WHERE s.libSis = :libSis")
    , @NamedQuery(name = "SituationSise.findByLicSis", query = "SELECT s FROM SituationSise s WHERE s.licSis = :licSis")
    , @NamedQuery(name = "SituationSise.findByTemEnSveSis", query = "SELECT s FROM SituationSise s WHERE s.temEnSveSis = :temEnSveSis")
    , @NamedQuery(name = "SituationSise.findByTemMinSis", query = "SELECT s FROM SituationSise s WHERE s.temMinSis = :temMinSis")
    , @NamedQuery(name = "SituationSise.findByLim1Sis", query = "SELECT s FROM SituationSise s WHERE s.lim1Sis = :lim1Sis")
    , @NamedQuery(name = "SituationSise.findByLim2Sis", query = "SELECT s FROM SituationSise s WHERE s.lim2Sis = :lim2Sis")
    , @NamedQuery(name = "SituationSise.findByLim3Sis", query = "SELECT s FROM SituationSise s WHERE s.lim3Sis = :lim3Sis")
    , @NamedQuery(name = "SituationSise.findByNumOrdSis", query = "SELECT s FROM SituationSise s WHERE s.numOrdSis = :numOrdSis")
    , @NamedQuery(name = "SituationSise.findByTemAnnPrmInsSis", query = "SELECT s FROM SituationSise s WHERE s.temAnnPrmInsSis = :temAnnPrmInsSis")
    , @NamedQuery(name = "SituationSise.findByTemAccLieSis", query = "SELECT s FROM SituationSise s WHERE s.temAccLieSis = :temAccLieSis")
    , @NamedQuery(name = "SituationSise.findByLibWebSis", query = "SELECT s FROM SituationSise s WHERE s.libWebSis = :libWebSis")
    , @NamedQuery(name = "SituationSise.findByTemAccEtaSis", query = "SELECT s FROM SituationSise s WHERE s.temAccEtaSis = :temAccEtaSis")})
public class SituationSise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_SIS")
    private String codSis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "LIB_SIS")
    private String libSis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIC_SIS")
    private String licSis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SIS")
    private String temEnSveSis;
    @Size(max = 1)
    @Column(name = "TEM_MIN_SIS")
    private String temMinSis;
    @Size(max = 35)
    @Column(name = "LIM1_SIS")
    private String lim1Sis;
    @Size(max = 35)
    @Column(name = "LIM2_SIS")
    private String lim2Sis;
    @Size(max = 35)
    @Column(name = "LIM3_SIS")
    private String lim3Sis;
    @Column(name = "NUM_ORD_SIS")
    private Short numOrdSis;
    @Size(max = 1)
    @Column(name = "TEM_ANN_PRM_INS_SIS")
    private String temAnnPrmInsSis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ACC_LIE_SIS")
    private String temAccLieSis;
    @Size(max = 120)
    @Column(name = "LIB_WEB_SIS")
    private String libWebSis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ACC_ETA_SIS")
    private String temAccEtaSis;
    @JoinTable(name = "SIS_ATTACHE_TPE", joinColumns = {
        @JoinColumn(name = "COD_SIS", referencedColumnName = "COD_SIS")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_TPE", referencedColumnName = "COD_TPE")})
    @ManyToMany
    private Collection<TypEtb> typEtbCollection;
    @OneToMany(mappedBy = "codSisAnnPre")
    private Collection<InsAdmAnu> insAdmAnuCollection;
    @OneToMany(mappedBy = "codSis")
    private Collection<TypComposante> typComposanteCollection;

    public SituationSise() {
    }

    public SituationSise(String codSis) {
        this.codSis = codSis;
    }

    public SituationSise(String codSis, String libSis, String licSis, String temEnSveSis, String temAccLieSis, String temAccEtaSis) {
        this.codSis = codSis;
        this.libSis = libSis;
        this.licSis = licSis;
        this.temEnSveSis = temEnSveSis;
        this.temAccLieSis = temAccLieSis;
        this.temAccEtaSis = temAccEtaSis;
    }

    public String getCodSis() {
        return codSis;
    }

    public void setCodSis(String codSis) {
        this.codSis = codSis;
    }

    public String getLibSis() {
        return libSis;
    }

    public void setLibSis(String libSis) {
        this.libSis = libSis;
    }

    public String getLicSis() {
        return licSis;
    }

    public void setLicSis(String licSis) {
        this.licSis = licSis;
    }

    public String getTemEnSveSis() {
        return temEnSveSis;
    }

    public void setTemEnSveSis(String temEnSveSis) {
        this.temEnSveSis = temEnSveSis;
    }

    public String getTemMinSis() {
        return temMinSis;
    }

    public void setTemMinSis(String temMinSis) {
        this.temMinSis = temMinSis;
    }

    public String getLim1Sis() {
        return lim1Sis;
    }

    public void setLim1Sis(String lim1Sis) {
        this.lim1Sis = lim1Sis;
    }

    public String getLim2Sis() {
        return lim2Sis;
    }

    public void setLim2Sis(String lim2Sis) {
        this.lim2Sis = lim2Sis;
    }

    public String getLim3Sis() {
        return lim3Sis;
    }

    public void setLim3Sis(String lim3Sis) {
        this.lim3Sis = lim3Sis;
    }

    public Short getNumOrdSis() {
        return numOrdSis;
    }

    public void setNumOrdSis(Short numOrdSis) {
        this.numOrdSis = numOrdSis;
    }

    public String getTemAnnPrmInsSis() {
        return temAnnPrmInsSis;
    }

    public void setTemAnnPrmInsSis(String temAnnPrmInsSis) {
        this.temAnnPrmInsSis = temAnnPrmInsSis;
    }

    public String getTemAccLieSis() {
        return temAccLieSis;
    }

    public void setTemAccLieSis(String temAccLieSis) {
        this.temAccLieSis = temAccLieSis;
    }

    public String getLibWebSis() {
        return libWebSis;
    }

    public void setLibWebSis(String libWebSis) {
        this.libWebSis = libWebSis;
    }

    public String getTemAccEtaSis() {
        return temAccEtaSis;
    }

    public void setTemAccEtaSis(String temAccEtaSis) {
        this.temAccEtaSis = temAccEtaSis;
    }

    @XmlTransient
    public Collection<TypEtb> getTypEtbCollection() {
        return typEtbCollection;
    }

    public void setTypEtbCollection(Collection<TypEtb> typEtbCollection) {
        this.typEtbCollection = typEtbCollection;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection() {
        return insAdmAnuCollection;
    }

    public void setInsAdmAnuCollection(Collection<InsAdmAnu> insAdmAnuCollection) {
        this.insAdmAnuCollection = insAdmAnuCollection;
    }

    @XmlTransient
    public Collection<TypComposante> getTypComposanteCollection() {
        return typComposanteCollection;
    }

    public void setTypComposanteCollection(Collection<TypComposante> typComposanteCollection) {
        this.typComposanteCollection = typComposanteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSis != null ? codSis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SituationSise)) {
            return false;
        }
        SituationSise other = (SituationSise) object;
        if ((this.codSis == null && other.codSis != null) || (this.codSis != null && !this.codSis.equals(other.codSis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.SituationSise[ codSis=" + codSis + " ]";
    }
    
}
