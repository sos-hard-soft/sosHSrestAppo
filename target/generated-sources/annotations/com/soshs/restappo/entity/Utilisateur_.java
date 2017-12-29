package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentreGestion;
import com.soshs.restappo.entity.CentreIncomp;
import com.soshs.restappo.entity.CentreInsPed;
import com.soshs.restappo.entity.Composante;
import com.soshs.restappo.entity.Imprimante;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.InsAdmEtp;
import com.soshs.restappo.entity.InsPedagogiEtp;
import com.soshs.restappo.entity.TypUtilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> temEnSveUti;
    public static volatile SingularAttribute<Utilisateur, String> codImpWinA3;
    public static volatile SingularAttribute<Utilisateur, TypUtilisateur> codTut;
    public static volatile SingularAttribute<Utilisateur, String> libCmtUti;
    public static volatile CollectionAttribute<Utilisateur, Composante> composanteCollection;
    public static volatile SingularAttribute<Utilisateur, CentreInsPed> codCip;
    public static volatile CollectionAttribute<Utilisateur, InsPedagogiEtp> insPedagogiEtpCollection;
    public static volatile SingularAttribute<Utilisateur, CentreIncomp> codCin;
    public static volatile SingularAttribute<Utilisateur, String> temPilUti;
    public static volatile SingularAttribute<Utilisateur, Imprimante> codImp;
    public static volatile CollectionAttribute<Utilisateur, InsAdmEtp> insAdmEtpCollection;
    public static volatile SingularAttribute<Utilisateur, CentreGestion> codCge;
    public static volatile CollectionAttribute<Utilisateur, InsAdmAnu> insAdmAnuCollection1;
    public static volatile SingularAttribute<Utilisateur, Integer> codNumUti;
    public static volatile CollectionAttribute<Utilisateur, Individu> individuCollection;
    public static volatile SingularAttribute<Utilisateur, String> repExpUti;
    public static volatile CollectionAttribute<Utilisateur, InsAdmAnu> insAdmAnuCollection;
    public static volatile CollectionAttribute<Utilisateur, InsAdmEtp> insAdmEtpCollection1;
    public static volatile CollectionAttribute<Utilisateur, InsAdmEtp> insAdmEtpCollection2;
    public static volatile CollectionAttribute<Utilisateur, InsPedagogiEtp> insPedagogiEtpCollection2;
    public static volatile CollectionAttribute<Utilisateur, InsPedagogiEtp> insPedagogiEtpCollection1;
    public static volatile CollectionAttribute<Utilisateur, Individu> individuCollection2;
    public static volatile CollectionAttribute<Utilisateur, Individu> individuCollection1;
    public static volatile SingularAttribute<Utilisateur, String> codUti;
    public static volatile SingularAttribute<Utilisateur, String> temAutSpeMcc;

}