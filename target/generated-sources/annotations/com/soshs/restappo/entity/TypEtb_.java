package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.ProfilEtu;
import com.soshs.restappo.entity.SituationSise;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(TypEtb.class)
public class TypEtb_ { 

    public static volatile SingularAttribute<TypEtb, String> temEnSveTpe;
    public static volatile SingularAttribute<TypEtb, String> lim3Tpe;
    public static volatile SingularAttribute<TypEtb, String> licTpe;
    public static volatile SingularAttribute<TypEtb, String> lim2Tpe;
    public static volatile SingularAttribute<TypEtb, String> codSisTpe;
    public static volatile SingularAttribute<TypEtb, String> libTpe;
    public static volatile SingularAttribute<TypEtb, ProfilEtu> codPruPrl;
    public static volatile SingularAttribute<TypEtb, String> codTpe;
    public static volatile SingularAttribute<TypEtb, String> lim1Tpe;
    public static volatile SingularAttribute<TypEtb, ProfilEtu> codPruChg;
    public static volatile SingularAttribute<TypEtb, Short> numOrdTpe;
    public static volatile SingularAttribute<TypEtb, String> temGesTrfTpe;
    public static volatile SingularAttribute<TypEtb, String> temMinTpe;
    public static volatile SingularAttribute<TypEtb, String> libWebTpe;
    public static volatile CollectionAttribute<TypEtb, InsAdmAnu> insAdmAnuCollection1;
    public static volatile CollectionAttribute<TypEtb, Etablissement> etablissementCollection;
    public static volatile SingularAttribute<TypEtb, String> temDetTpe;
    public static volatile CollectionAttribute<TypEtb, SituationSise> situationSiseCollection;
    public static volatile CollectionAttribute<TypEtb, InsAdmAnu> insAdmAnuCollection;

}