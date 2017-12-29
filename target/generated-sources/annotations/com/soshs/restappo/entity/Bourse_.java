package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmEtp;
import com.soshs.restappo.entity.SitSociale;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(Bourse.class)
public class Bourse_ { 

    public static volatile SingularAttribute<Bourse, String> lim2Brs;
    public static volatile SingularAttribute<Bourse, String> lim3Brs;
    public static volatile SingularAttribute<Bourse, String> lim1Brs;
    public static volatile SingularAttribute<Bourse, String> temEnSveBrs;
    public static volatile SingularAttribute<Bourse, String> temMinBrs;
    public static volatile SingularAttribute<Bourse, String> temSaiNumBrs;
    public static volatile CollectionAttribute<Bourse, InsAdmEtp> insAdmEtpCollection;
    public static volatile SingularAttribute<Bourse, String> codBrs;
    public static volatile SingularAttribute<Bourse, Short> numOrdBrs;
    public static volatile SingularAttribute<Bourse, SitSociale> codSoc;
    public static volatile SingularAttribute<Bourse, String> codSisAfiBrs;
    public static volatile SingularAttribute<Bourse, String> libWebBrs;
    public static volatile SingularAttribute<Bourse, String> licBrs;
    public static volatile SingularAttribute<Bourse, String> libBrs;

}