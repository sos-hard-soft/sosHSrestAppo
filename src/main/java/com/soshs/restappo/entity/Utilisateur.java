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
import javax.persistence.ManyToMany;
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
@Table(name = "UTILISATEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u")
    , @NamedQuery(name = "Utilisateur.findByCodUti", query = "SELECT u FROM Utilisateur u WHERE u.codUti = :codUti")
    , @NamedQuery(name = "Utilisateur.findByLibCmtUti", query = "SELECT u FROM Utilisateur u WHERE u.libCmtUti = :libCmtUti")
    , @NamedQuery(name = "Utilisateur.findByTemEnSveUti", query = "SELECT u FROM Utilisateur u WHERE u.temEnSveUti = :temEnSveUti")
    , @NamedQuery(name = "Utilisateur.findByRepExpUti", query = "SELECT u FROM Utilisateur u WHERE u.repExpUti = :repExpUti")
    , @NamedQuery(name = "Utilisateur.findByCodNumUti", query = "SELECT u FROM Utilisateur u WHERE u.codNumUti = :codNumUti")
    , @NamedQuery(name = "Utilisateur.findByTemPilUti", query = "SELECT u FROM Utilisateur u WHERE u.temPilUti = :temPilUti")
    , @NamedQuery(name = "Utilisateur.findByCodImpWinA3", query = "SELECT u FROM Utilisateur u WHERE u.codImpWinA3 = :codImpWinA3")
    , @NamedQuery(name = "Utilisateur.findByTemAutSpeMcc", query = "SELECT u FROM Utilisateur u WHERE u.temAutSpeMcc = :temAutSpeMcc")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "COD_UTI")
    private String codUti;
    @Size(max = 200)
    @Column(name = "LIB_CMT_UTI")
    private String libCmtUti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_UTI")
    private String temEnSveUti;
    @Size(max = 60)
    @Column(name = "REP_EXP_UTI")
    private String repExpUti;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_NUM_UTI")
    private int codNumUti;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PIL_UTI")
    private String temPilUti;
    @Size(max = 32)
    @Column(name = "COD_IMP_WIN_A3")
    private String codImpWinA3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_AUT_SPE_MCC")
    private String temAutSpeMcc;
    @ManyToMany(mappedBy = "utilisateurCollection")
    private Collection<Composante> composanteCollection;
    @JoinColumn(name = "COD_CGE", referencedColumnName = "COD_CGE")
    @ManyToOne
    private CentreGestion codCge;
    @JoinColumn(name = "COD_CIN", referencedColumnName = "COD_CIN")
    @ManyToOne
    private CentreIncomp codCin;
    @JoinColumn(name = "COD_CIP", referencedColumnName = "COD_CIP")
    @ManyToOne
    private CentreInsPed codCip;
    @JoinColumn(name = "COD_IMP", referencedColumnName = "COD_IMP")
    @ManyToOne
    private Imprimante codImp;
    @JoinColumn(name = "COD_TUT", referencedColumnName = "COD_TUT")
    @ManyToOne(optional = false)
    private TypUtilisateur codTut;
    @OneToMany(mappedBy = "codUtiMod")
    private Collection<InsAdmAnu> insAdmAnuCollection;
    @OneToMany(mappedBy = "codUti")
    private Collection<InsAdmAnu> insAdmAnuCollection1;
    @OneToMany(mappedBy = "codUti")
    private Collection<InsPedagogiEtp> insPedagogiEtpCollection;
    @OneToMany(mappedBy = "codUtiMod")
    private Collection<InsPedagogiEtp> insPedagogiEtpCollection1;
    @OneToMany(mappedBy = "codUtiAcc")
    private Collection<InsPedagogiEtp> insPedagogiEtpCollection2;
    @OneToMany(mappedBy = "codUti")
    private Collection<Individu> individuCollection;
    @OneToMany(mappedBy = "codUtiMod")
    private Collection<Individu> individuCollection1;
    @OneToMany(mappedBy = "codUtiBlo")
    private Collection<Individu> individuCollection2;
    @OneToMany(mappedBy = "codUtiAcc")
    private Collection<InsAdmEtp> insAdmEtpCollection;
    @OneToMany(mappedBy = "codUti")
    private Collection<InsAdmEtp> insAdmEtpCollection1;
    @OneToMany(mappedBy = "codUtiMod")
    private Collection<InsAdmEtp> insAdmEtpCollection2;

    public Utilisateur() {
    }

    public Utilisateur(String codUti) {
        this.codUti = codUti;
    }

    public Utilisateur(String codUti, String temEnSveUti, int codNumUti, String temPilUti, String temAutSpeMcc) {
        this.codUti = codUti;
        this.temEnSveUti = temEnSveUti;
        this.codNumUti = codNumUti;
        this.temPilUti = temPilUti;
        this.temAutSpeMcc = temAutSpeMcc;
    }

    public String getCodUti() {
        return codUti;
    }

    public void setCodUti(String codUti) {
        this.codUti = codUti;
    }

    public String getLibCmtUti() {
        return libCmtUti;
    }

    public void setLibCmtUti(String libCmtUti) {
        this.libCmtUti = libCmtUti;
    }

    public String getTemEnSveUti() {
        return temEnSveUti;
    }

    public void setTemEnSveUti(String temEnSveUti) {
        this.temEnSveUti = temEnSveUti;
    }

    public String getRepExpUti() {
        return repExpUti;
    }

    public void setRepExpUti(String repExpUti) {
        this.repExpUti = repExpUti;
    }

    public int getCodNumUti() {
        return codNumUti;
    }

    public void setCodNumUti(int codNumUti) {
        this.codNumUti = codNumUti;
    }

    public String getTemPilUti() {
        return temPilUti;
    }

    public void setTemPilUti(String temPilUti) {
        this.temPilUti = temPilUti;
    }

    public String getCodImpWinA3() {
        return codImpWinA3;
    }

    public void setCodImpWinA3(String codImpWinA3) {
        this.codImpWinA3 = codImpWinA3;
    }

    public String getTemAutSpeMcc() {
        return temAutSpeMcc;
    }

    public void setTemAutSpeMcc(String temAutSpeMcc) {
        this.temAutSpeMcc = temAutSpeMcc;
    }

    @XmlTransient
    public Collection<Composante> getComposanteCollection() {
        return composanteCollection;
    }

    public void setComposanteCollection(Collection<Composante> composanteCollection) {
        this.composanteCollection = composanteCollection;
    }

    public CentreGestion getCodCge() {
        return codCge;
    }

    public void setCodCge(CentreGestion codCge) {
        this.codCge = codCge;
    }

    public CentreIncomp getCodCin() {
        return codCin;
    }

    public void setCodCin(CentreIncomp codCin) {
        this.codCin = codCin;
    }

    public CentreInsPed getCodCip() {
        return codCip;
    }

    public void setCodCip(CentreInsPed codCip) {
        this.codCip = codCip;
    }

    public Imprimante getCodImp() {
        return codImp;
    }

    public void setCodImp(Imprimante codImp) {
        this.codImp = codImp;
    }

    public TypUtilisateur getCodTut() {
        return codTut;
    }

    public void setCodTut(TypUtilisateur codTut) {
        this.codTut = codTut;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection() {
        return insAdmAnuCollection;
    }

    public void setInsAdmAnuCollection(Collection<InsAdmAnu> insAdmAnuCollection) {
        this.insAdmAnuCollection = insAdmAnuCollection;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection1() {
        return insAdmAnuCollection1;
    }

    public void setInsAdmAnuCollection1(Collection<InsAdmAnu> insAdmAnuCollection1) {
        this.insAdmAnuCollection1 = insAdmAnuCollection1;
    }

    @XmlTransient
    public Collection<InsPedagogiEtp> getInsPedagogiEtpCollection() {
        return insPedagogiEtpCollection;
    }

    public void setInsPedagogiEtpCollection(Collection<InsPedagogiEtp> insPedagogiEtpCollection) {
        this.insPedagogiEtpCollection = insPedagogiEtpCollection;
    }

    @XmlTransient
    public Collection<InsPedagogiEtp> getInsPedagogiEtpCollection1() {
        return insPedagogiEtpCollection1;
    }

    public void setInsPedagogiEtpCollection1(Collection<InsPedagogiEtp> insPedagogiEtpCollection1) {
        this.insPedagogiEtpCollection1 = insPedagogiEtpCollection1;
    }

    @XmlTransient
    public Collection<InsPedagogiEtp> getInsPedagogiEtpCollection2() {
        return insPedagogiEtpCollection2;
    }

    public void setInsPedagogiEtpCollection2(Collection<InsPedagogiEtp> insPedagogiEtpCollection2) {
        this.insPedagogiEtpCollection2 = insPedagogiEtpCollection2;
    }

    @XmlTransient
    public Collection<Individu> getIndividuCollection() {
        return individuCollection;
    }

    public void setIndividuCollection(Collection<Individu> individuCollection) {
        this.individuCollection = individuCollection;
    }

    @XmlTransient
    public Collection<Individu> getIndividuCollection1() {
        return individuCollection1;
    }

    public void setIndividuCollection1(Collection<Individu> individuCollection1) {
        this.individuCollection1 = individuCollection1;
    }

    @XmlTransient
    public Collection<Individu> getIndividuCollection2() {
        return individuCollection2;
    }

    public void setIndividuCollection2(Collection<Individu> individuCollection2) {
        this.individuCollection2 = individuCollection2;
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
        hash += (codUti != null ? codUti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.codUti == null && other.codUti != null) || (this.codUti != null && !this.codUti.equals(other.codUti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.Utilisateur[ codUti=" + codUti + " ]";
    }
    
}
