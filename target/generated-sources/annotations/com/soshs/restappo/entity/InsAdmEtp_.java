package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Bourse;
import com.soshs.restappo.entity.CentreGestion;
import com.soshs.restappo.entity.Composante;
import com.soshs.restappo.entity.DipAutCur;
import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.InsAdmEtpPK;
import com.soshs.restappo.entity.ProfilEtu;
import com.soshs.restappo.entity.SpeCaracteriseVdi;
import com.soshs.restappo.entity.TeleEnseignementMode;
import com.soshs.restappo.entity.Utilisateur;
import com.soshs.restappo.entity.VersionDiplome;
import com.soshs.restappo.entity.VersionEtape;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(InsAdmEtp.class)
public class InsAdmEtp_ { 

    public static volatile SingularAttribute<InsAdmEtp, Short> nbrInsEtp;
    public static volatile SingularAttribute<InsAdmEtp, Date> datObsSisIae;
    public static volatile SingularAttribute<InsAdmEtp, Short> nbrInsCyc;
    public static volatile SingularAttribute<InsAdmEtp, String> temInsElpAtmqIae;
    public static volatile SingularAttribute<InsAdmEtp, String> temTlsIae;
    public static volatile SingularAttribute<InsAdmEtp, CentreGestion> codCge;
    public static volatile SingularAttribute<InsAdmEtp, Composante> codCmp;
    public static volatile SingularAttribute<InsAdmEtp, String> etaPmtIae;
    public static volatile SingularAttribute<InsAdmEtp, InsAdmEtpPK> insAdmEtpPK;
    public static volatile SingularAttribute<InsAdmEtp, TeleEnseignementMode> codTls;
    public static volatile SingularAttribute<InsAdmEtp, VersionDiplome> versionDiplome1;
    public static volatile SingularAttribute<InsAdmEtp, String> libRefAcc;
    public static volatile SingularAttribute<InsAdmEtp, String> temDipIae;
    public static volatile SingularAttribute<InsAdmEtp, String> numBrsEtu;
    public static volatile SingularAttribute<InsAdmEtp, ProfilEtu> codPru;
    public static volatile SingularAttribute<InsAdmEtp, String> temIaePrm;
    public static volatile SingularAttribute<InsAdmEtp, Date> datCreIae;
    public static volatile SingularAttribute<InsAdmEtp, String> zblEtb1;
    public static volatile SingularAttribute<InsAdmEtp, String> zblEtb2;
    public static volatile SingularAttribute<InsAdmEtp, DipAutCur> codDacAcc;
    public static volatile SingularAttribute<InsAdmEtp, Utilisateur> codUtiAcc;
    public static volatile SingularAttribute<InsAdmEtp, Utilisateur> codUti;
    public static volatile SingularAttribute<InsAdmEtp, String> codSesIae;
    public static volatile SingularAttribute<InsAdmEtp, VersionDiplome> versionDiplome;
    public static volatile SingularAttribute<InsAdmEtp, Short> nbrInsDip;
    public static volatile SingularAttribute<InsAdmEtp, Date> datAccIae;
    public static volatile SingularAttribute<InsAdmEtp, SpeCaracteriseVdi> speCaracteriseVdi;
    public static volatile SingularAttribute<InsAdmEtp, Bourse> codBrs;
    public static volatile SingularAttribute<InsAdmEtp, Date> datModIae;
    public static volatile SingularAttribute<InsAdmEtp, String> etaIae;
    public static volatile SingularAttribute<InsAdmEtp, InsAdmAnu> insAdmAnu;
    public static volatile SingularAttribute<InsAdmEtp, String> codNatTitAccIae;
    public static volatile SingularAttribute<InsAdmEtp, SpeCaracteriseVdi> speCaracteriseVdi1;
    public static volatile SingularAttribute<InsAdmEtp, Utilisateur> codUtiMod;
    public static volatile SingularAttribute<InsAdmEtp, SpeCaracteriseVdi> speCaracteriseVdi2;
    public static volatile SingularAttribute<InsAdmEtp, VersionEtape> versionEtape;
    public static volatile SingularAttribute<InsAdmEtp, String> temChgSurEtp;

}