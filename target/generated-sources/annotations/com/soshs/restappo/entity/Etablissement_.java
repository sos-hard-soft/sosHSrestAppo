package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentreGestion;
import com.soshs.restappo.entity.ComBdi;
import com.soshs.restappo.entity.Composante;
import com.soshs.restappo.entity.Departement;
import com.soshs.restappo.entity.Diplome;
import com.soshs.restappo.entity.IndOpi;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.Pays;
import com.soshs.restappo.entity.ProfilEtu;
import com.soshs.restappo.entity.TypEtb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Etablissement.class)
public class Etablissement_ { 

    public static volatile SingularAttribute<Etablissement, Short> codAffDepEtb;
    public static volatile SingularAttribute<Etablissement, String> codEtb;
    public static volatile SingularAttribute<Etablissement, Short> numOrdEtb;
    public static volatile CollectionAttribute<Etablissement, Composante> composanteCollection;
    public static volatile SingularAttribute<Etablissement, ProfilEtu> codPruPrl;
    public static volatile SingularAttribute<Etablissement, String> libEtbArb;
    public static volatile SingularAttribute<Etablissement, String> libAd3Etb;
    public static volatile SingularAttribute<Etablissement, Short> codAffEtb;
    public static volatile SingularAttribute<Etablissement, String> libAd1Etb;
    public static volatile SingularAttribute<Etablissement, String> libWebEtb;
    public static volatile SingularAttribute<Etablissement, Departement> codDep;
    public static volatile SingularAttribute<Etablissement, String> libEtb;
    public static volatile SingularAttribute<Etablissement, String> libAdeEtb;
    public static volatile SingularAttribute<Etablissement, ProfilEtu> codPruChg;
    public static volatile SingularAttribute<Etablissement, String> temPubEtb;
    public static volatile SingularAttribute<Etablissement, String> libArtOffEtb;
    public static volatile SingularAttribute<Etablissement, String> libAd1EtbArb;
    public static volatile CollectionAttribute<Etablissement, InsAdmAnu> insAdmAnuCollection4;
    public static volatile SingularAttribute<Etablissement, String> lim3Etb;
    public static volatile CollectionAttribute<Etablissement, InsAdmAnu> insAdmAnuCollection3;
    public static volatile SingularAttribute<Etablissement, String> lim1Etb;
    public static volatile SingularAttribute<Etablissement, String> libAd3EtbArb;
    public static volatile CollectionAttribute<Etablissement, Diplome> diplomeCollection;
    public static volatile CollectionAttribute<Etablissement, InsAdmAnu> insAdmAnuCollection2;
    public static volatile CollectionAttribute<Etablissement, InsAdmAnu> insAdmAnuCollection1;
    public static volatile SingularAttribute<Etablissement, ComBdi> comBdi;
    public static volatile SingularAttribute<Etablissement, String> codEsuEse;
    public static volatile CollectionAttribute<Etablissement, Individu> individuCollection;
    public static volatile SingularAttribute<Etablissement, String> temCnvEtb;
    public static volatile SingularAttribute<Etablissement, String> temMinEtb;
    public static volatile CollectionAttribute<Etablissement, InsAdmAnu> insAdmAnuCollection;
    public static volatile SingularAttribute<Etablissement, String> temAutSisEtb;
    public static volatile SingularAttribute<Etablissement, Pays> codPayAdrEtb;
    public static volatile SingularAttribute<Etablissement, String> temPreSisEtb;
    public static volatile SingularAttribute<Etablissement, String> libCmtEtb;
    public static volatile SingularAttribute<Etablissement, String> libAd2Etb;
    public static volatile SingularAttribute<Etablissement, TypEtb> codTpe;
    public static volatile SingularAttribute<Etablissement, String> licEtb;
    public static volatile SingularAttribute<Etablissement, String> libAd2EtbArb;
    public static volatile SingularAttribute<Etablissement, String> libOffEtb;
    public static volatile SingularAttribute<Etablissement, String> lim2Etb;
    public static volatile SingularAttribute<Etablissement, String> libOffEtbArb;
    public static volatile SingularAttribute<Etablissement, String> temEnSveEtb;
    public static volatile CollectionAttribute<Etablissement, CentreGestion> centreGestionCollection;
    public static volatile CollectionAttribute<Etablissement, IndOpi> indOpiCollection;

}