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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "SPE_CARACTERISE_VDI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpeCaracteriseVdi.findAll", query = "SELECT s FROM SpeCaracteriseVdi s")
    , @NamedQuery(name = "SpeCaracteriseVdi.findByCodSpe", query = "SELECT s FROM SpeCaracteriseVdi s WHERE s.speCaracteriseVdiPK.codSpe = :codSpe")
    , @NamedQuery(name = "SpeCaracteriseVdi.findByCodDip", query = "SELECT s FROM SpeCaracteriseVdi s WHERE s.speCaracteriseVdiPK.codDip = :codDip")
    , @NamedQuery(name = "SpeCaracteriseVdi.findByCodVrsVdi", query = "SELECT s FROM SpeCaracteriseVdi s WHERE s.speCaracteriseVdiPK.codVrsVdi = :codVrsVdi")
    , @NamedQuery(name = "SpeCaracteriseVdi.findByTemEnSveSpv", query = "SELECT s FROM SpeCaracteriseVdi s WHERE s.temEnSveSpv = :temEnSveSpv")})
public class SpeCaracteriseVdi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpeCaracteriseVdiPK speCaracteriseVdiPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_SPV")
    private String temEnSveSpv;
    @JoinColumn(name = "COD_SPE", referencedColumnName = "COD_SPE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Specialite specialite;
    @JoinColumns({
        @JoinColumn(name = "COD_DIP", referencedColumnName = "COD_DIP", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_VRS_VDI", referencedColumnName = "COD_VRS_VDI", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private VersionDiplome versionDiplome;
    @OneToMany(mappedBy = "speCaracteriseVdi")
    private Collection<InsAdmEtp> insAdmEtpCollection;
    @OneToMany(mappedBy = "speCaracteriseVdi1")
    private Collection<InsAdmEtp> insAdmEtpCollection1;
    @OneToMany(mappedBy = "speCaracteriseVdi2")
    private Collection<InsAdmEtp> insAdmEtpCollection2;

    public SpeCaracteriseVdi() {
    }

    public SpeCaracteriseVdi(SpeCaracteriseVdiPK speCaracteriseVdiPK) {
        this.speCaracteriseVdiPK = speCaracteriseVdiPK;
    }

    public SpeCaracteriseVdi(SpeCaracteriseVdiPK speCaracteriseVdiPK, String temEnSveSpv) {
        this.speCaracteriseVdiPK = speCaracteriseVdiPK;
        this.temEnSveSpv = temEnSveSpv;
    }

    public SpeCaracteriseVdi(String codSpe, String codDip, short codVrsVdi) {
        this.speCaracteriseVdiPK = new SpeCaracteriseVdiPK(codSpe, codDip, codVrsVdi);
    }

    public SpeCaracteriseVdiPK getSpeCaracteriseVdiPK() {
        return speCaracteriseVdiPK;
    }

    public void setSpeCaracteriseVdiPK(SpeCaracteriseVdiPK speCaracteriseVdiPK) {
        this.speCaracteriseVdiPK = speCaracteriseVdiPK;
    }

    public String getTemEnSveSpv() {
        return temEnSveSpv;
    }

    public void setTemEnSveSpv(String temEnSveSpv) {
        this.temEnSveSpv = temEnSveSpv;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public VersionDiplome getVersionDiplome() {
        return versionDiplome;
    }

    public void setVersionDiplome(VersionDiplome versionDiplome) {
        this.versionDiplome = versionDiplome;
    }

    @XmlTransient
    public Collection<InsAdmEtp> getInsAdmEtpCollection() {
        return insAdmEtpCollection;
    }

    public void setInsAdmEtpCollection(Collection<InsAdmEtp> insAdmEtpCollection) {
        this.insAdmEtpCollection = insAdmEtpCollection;
    }

    @XmlTransient
    public Collection<InsAdmEtp> getInsAdmEtpCollection1() {
        return insAdmEtpCollection1;
    }

    public void setInsAdmEtpCollection1(Collection<InsAdmEtp> insAdmEtpCollection1) {
        this.insAdmEtpCollection1 = insAdmEtpCollection1;
    }

    @XmlTransient
    public Collection<InsAdmEtp> getInsAdmEtpCollection2() {
        return insAdmEtpCollection2;
    }

    public void setInsAdmEtpCollection2(Collection<InsAdmEtp> insAdmEtpCollection2) {
        this.insAdmEtpCollection2 = insAdmEtpCollection2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (speCaracteriseVdiPK != null ? speCaracteriseVdiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpeCaracteriseVdi)) {
            return false;
        }
        SpeCaracteriseVdi other = (SpeCaracteriseVdi) object;
        if ((this.speCaracteriseVdiPK == null && other.speCaracteriseVdiPK != null) || (this.speCaracteriseVdiPK != null && !this.speCaracteriseVdiPK.equals(other.speCaracteriseVdiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.SpeCaracteriseVdi[ speCaracteriseVdiPK=" + speCaracteriseVdiPK + " ]";
    }
    
}
