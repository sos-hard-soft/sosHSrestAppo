package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ComBdi;
import com.soshs.restappo.entity.Cpam;
import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.InsAdmEtp;
import com.soshs.restappo.entity.Utilisateur;
import com.soshs.restappo.entity.VersionEtape;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(CentreGestion.class)
public class CentreGestion_ { 

    public static volatile SingularAttribute<CentreGestion, Integer> numOccQutVal;
    public static volatile CollectionAttribute<CentreGestion, Utilisateur> utilisateurCollection;
    public static volatile SingularAttribute<CentreGestion, String> codModPaiMinCge;
    public static volatile SingularAttribute<CentreGestion, String> libCmtPcjMinCge;
    public static volatile SingularAttribute<CentreGestion, Cpam> codCpa;
    public static volatile SingularAttribute<CentreGestion, Short> nbrEtuCpt;
    public static volatile CollectionAttribute<CentreGestion, VersionEtape> versionEtapeCollection;
    public static volatile SingularAttribute<CentreGestion, String> temMinCge;
    public static volatile SingularAttribute<CentreGestion, Integer> numChrQutCge;
    public static volatile CollectionAttribute<CentreGestion, InsAdmEtp> insAdmEtpCollection;
    public static volatile SingularAttribute<CentreGestion, Integer> numOccQutEdtLch;
    public static volatile SingularAttribute<CentreGestion, String> temPaiMemePos;
    public static volatile SingularAttribute<CentreGestion, String> codCge;
    public static volatile SingularAttribute<CentreGestion, String> libAd2Cge;
    public static volatile SingularAttribute<CentreGestion, ComBdi> comBdi;
    public static volatile SingularAttribute<CentreGestion, String> licCge;
    public static volatile SingularAttribute<CentreGestion, String> libCmtCge;
    public static volatile SingularAttribute<CentreGestion, String> etaTypEdtCrtCge;
    public static volatile SingularAttribute<CentreGestion, Date> datFinInsCge;
    public static volatile SingularAttribute<CentreGestion, String> temCtrlPai;
    public static volatile SingularAttribute<CentreGestion, Short> nbrMaxInsAut;
    public static volatile SingularAttribute<CentreGestion, Integer> numOccQutEdtVdr;
    public static volatile SingularAttribute<CentreGestion, String> temEnSveCge;
    public static volatile SingularAttribute<CentreGestion, Date> datDebInsCge;
    public static volatile SingularAttribute<CentreGestion, String> temCtrlRmb;
    public static volatile SingularAttribute<CentreGestion, Integer> numOccQutEdt;
    public static volatile SingularAttribute<CentreGestion, Integer> numOccPrmQutVal;
    public static volatile SingularAttribute<CentreGestion, String> libNomRespCge;
    public static volatile SingularAttribute<CentreGestion, String> libAd3Cge;
    public static volatile SingularAttribute<CentreGestion, String> modEdtCrt;
    public static volatile SingularAttribute<CentreGestion, String> libAd1Cge;
    public static volatile CollectionAttribute<CentreGestion, Etablissement> etablissementCollection;
    public static volatile SingularAttribute<CentreGestion, String> libCge;

}