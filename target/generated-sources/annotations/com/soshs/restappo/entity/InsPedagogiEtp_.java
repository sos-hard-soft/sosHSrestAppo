package com.soshs.restappo.entity;

import com.soshs.restappo.entity.FormuleExamen;
import com.soshs.restappo.entity.InsPedagogiAnu;
import com.soshs.restappo.entity.InsPedagogiEtpPK;
import com.soshs.restappo.entity.Utilisateur;
import com.soshs.restappo.entity.VersionEtape;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(InsPedagogiEtp.class)
public class InsPedagogiEtp_ { 

    public static volatile SingularAttribute<InsPedagogiEtp, String> temInsElpAtmqIpe;
    public static volatile SingularAttribute<InsPedagogiEtp, Date> datModIpe;
    public static volatile SingularAttribute<InsPedagogiEtp, InsPedagogiAnu> insPedagogiAnu;
    public static volatile SingularAttribute<InsPedagogiEtp, Utilisateur> codUti;
    public static volatile SingularAttribute<InsPedagogiEtp, Utilisateur> codUtiAcc;
    public static volatile SingularAttribute<InsPedagogiEtp, Date> datCreIpe;
    public static volatile SingularAttribute<InsPedagogiEtp, String> codTypIpe;
    public static volatile SingularAttribute<InsPedagogiEtp, Date> datAccIpe;
    public static volatile SingularAttribute<InsPedagogiEtp, Utilisateur> codUtiMod;
    public static volatile SingularAttribute<InsPedagogiEtp, InsPedagogiEtpPK> insPedagogiEtpPK;
    public static volatile SingularAttribute<InsPedagogiEtp, VersionEtape> versionEtape;
    public static volatile SingularAttribute<InsPedagogiEtp, String> libRefAcc;
    public static volatile SingularAttribute<InsPedagogiEtp, FormuleExamen> codFex;

}