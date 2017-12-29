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
@Table(name = "CENTRE_INS_PED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentreInsPed.findAll", query = "SELECT c FROM CentreInsPed c")
    , @NamedQuery(name = "CentreInsPed.findByCodCip", query = "SELECT c FROM CentreInsPed c WHERE c.codCip = :codCip")
    , @NamedQuery(name = "CentreInsPed.findByLibCip", query = "SELECT c FROM CentreInsPed c WHERE c.libCip = :libCip")
    , @NamedQuery(name = "CentreInsPed.findByLicCip", query = "SELECT c FROM CentreInsPed c WHERE c.licCip = :licCip")
    , @NamedQuery(name = "CentreInsPed.findByTemEnSveCip", query = "SELECT c FROM CentreInsPed c WHERE c.temEnSveCip = :temEnSveCip")})
public class CentreInsPed implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "COD_CIP")
    private String codCip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_CIP")
    private String libCip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_CIP")
    private String licCip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_CIP")
    private String temEnSveCip;
    @JoinTable(name = "CMP_GERER_CIP", joinColumns = {
        @JoinColumn(name = "COD_CIP", referencedColumnName = "COD_CIP")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_CMP", referencedColumnName = "COD_CMP")})
    @ManyToMany
    private Collection<Composante> composanteCollection;
    @JoinTable(name = "CIP_INSCRIRE_ELP", joinColumns = {
        @JoinColumn(name = "COD_CIP", referencedColumnName = "COD_CIP")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP")})
    @ManyToMany
    private Collection<ElementPedagogi> elementPedagogiCollection;
    @OneToMany(mappedBy = "codCip")
    private Collection<Utilisateur> utilisateurCollection;

    public CentreInsPed() {
    }

    public CentreInsPed(String codCip) {
        this.codCip = codCip;
    }

    public CentreInsPed(String codCip, String libCip, String licCip, String temEnSveCip) {
        this.codCip = codCip;
        this.libCip = libCip;
        this.licCip = licCip;
        this.temEnSveCip = temEnSveCip;
    }

    public String getCodCip() {
        return codCip;
    }

    public void setCodCip(String codCip) {
        this.codCip = codCip;
    }

    public String getLibCip() {
        return libCip;
    }

    public void setLibCip(String libCip) {
        this.libCip = libCip;
    }

    public String getLicCip() {
        return licCip;
    }

    public void setLicCip(String licCip) {
        this.licCip = licCip;
    }

    public String getTemEnSveCip() {
        return temEnSveCip;
    }

    public void setTemEnSveCip(String temEnSveCip) {
        this.temEnSveCip = temEnSveCip;
    }

    @XmlTransient
    public Collection<Composante> getComposanteCollection() {
        return composanteCollection;
    }

    public void setComposanteCollection(Collection<Composante> composanteCollection) {
        this.composanteCollection = composanteCollection;
    }

    @XmlTransient
    public Collection<ElementPedagogi> getElementPedagogiCollection() {
        return elementPedagogiCollection;
    }

    public void setElementPedagogiCollection(Collection<ElementPedagogi> elementPedagogiCollection) {
        this.elementPedagogiCollection = elementPedagogiCollection;
    }

    @XmlTransient
    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCip != null ? codCip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentreInsPed)) {
            return false;
        }
        CentreInsPed other = (CentreInsPed) object;
        if ((this.codCip == null && other.codCip != null) || (this.codCip != null && !this.codCip.equals(other.codCip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.restappo.entity.CentreInsPed[ codCip=" + codCip + " ]";
    }
    
}
