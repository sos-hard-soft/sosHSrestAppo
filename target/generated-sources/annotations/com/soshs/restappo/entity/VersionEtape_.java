package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentreGestion;
import com.soshs.restappo.entity.Composante;
import com.soshs.restappo.entity.ConfigMention;
import com.soshs.restappo.entity.Convention;
import com.soshs.restappo.entity.DureeEtape;
import com.soshs.restappo.entity.Etape;
import com.soshs.restappo.entity.EtapeSis;
import com.soshs.restappo.entity.GrpResultatVet;
import com.soshs.restappo.entity.InsAdmEtp;
import com.soshs.restappo.entity.InsPedagogiEtp;
import com.soshs.restappo.entity.PeriodeAno;
import com.soshs.restappo.entity.TypResultat;
import com.soshs.restappo.entity.VersionEtapePK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(VersionEtape.class)
public class VersionEtape_ { 

    public static volatile SingularAttribute<VersionEtape, String> temNotVet;
    public static volatile SingularAttribute<VersionEtape, Etape> etape;
    public static volatile SingularAttribute<VersionEtape, String> temAdo;
    public static volatile SingularAttribute<VersionEtape, String> lim2Vet;
    public static volatile SingularAttribute<VersionEtape, String> libCmtVet;
    public static volatile SingularAttribute<VersionEtape, Integer> barSaiVet;
    public static volatile CollectionAttribute<VersionEtape, InsPedagogiEtp> insPedagogiEtpCollection;
    public static volatile SingularAttribute<VersionEtape, String> temSesUni;
    public static volatile SingularAttribute<VersionEtape, TypResultat> codTrePos;
    public static volatile CollectionAttribute<VersionEtape, InsAdmEtp> insAdmEtpCollection;
    public static volatile SingularAttribute<VersionEtape, String> temOpiMinVet;
    public static volatile SingularAttribute<VersionEtape, Composante> codCmp;
    public static volatile SingularAttribute<VersionEtape, PeriodeAno> codPan2;
    public static volatile SingularAttribute<VersionEtape, TypResultat> codTreNeg;
    public static volatile SingularAttribute<VersionEtape, PeriodeAno> codPan1;
    public static volatile SingularAttribute<VersionEtape, VersionEtapePK> versionEtapePK;
    public static volatile SingularAttribute<VersionEtape, String> temJurVet;
    public static volatile SingularAttribute<VersionEtape, PeriodeAno> codPan4;
    public static volatile SingularAttribute<VersionEtape, PeriodeAno> codPan3;
    public static volatile SingularAttribute<VersionEtape, String> temPntJurVet;
    public static volatile SingularAttribute<VersionEtape, String> temAdi;
    public static volatile SingularAttribute<VersionEtape, String> libWebVet;
    public static volatile SingularAttribute<VersionEtape, EtapeSis> codEsi;
    public static volatile CollectionAttribute<VersionEtape, GrpResultatVet> grpResultatVetCollection;
    public static volatile SingularAttribute<VersionEtape, String> lim1Vet;
    public static volatile SingularAttribute<VersionEtape, String> lim3Vet;
    public static volatile SingularAttribute<VersionEtape, DureeEtape> codDue;
    public static volatile SingularAttribute<VersionEtape, Date> datDebMinVet;
    public static volatile SingularAttribute<VersionEtape, ConfigMention> codCfm;
    public static volatile SingularAttribute<VersionEtape, Convention> codCnv;
    public static volatile SingularAttribute<VersionEtape, Short> nbrVolHorVet;
    public static volatile SingularAttribute<VersionEtape, String> temResVet;
    public static volatile SingularAttribute<VersionEtape, String> temDipVet;
    public static volatile SingularAttribute<VersionEtape, Date> datFinMinVet;
    public static volatile SingularAttribute<VersionEtape, String> temTlsVet;
    public static volatile SingularAttribute<VersionEtape, CentreGestion> codCgeMinVet;
    public static volatile SingularAttribute<VersionEtape, Short> nbrAdmVet;
    public static volatile SingularAttribute<VersionEtape, String> temMndVet;

}