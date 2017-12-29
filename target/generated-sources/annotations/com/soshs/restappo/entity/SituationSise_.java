package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.TypComposante;
import com.soshs.restappo.entity.TypEtb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(SituationSise.class)
public class SituationSise_ { 

    public static volatile SingularAttribute<SituationSise, String> libWebSis;
    public static volatile SingularAttribute<SituationSise, String> temMinSis;
    public static volatile SingularAttribute<SituationSise, String> temEnSveSis;
    public static volatile CollectionAttribute<SituationSise, TypComposante> typComposanteCollection;
    public static volatile SingularAttribute<SituationSise, String> licSis;
    public static volatile SingularAttribute<SituationSise, String> libSis;
    public static volatile SingularAttribute<SituationSise, String> lim1Sis;
    public static volatile SingularAttribute<SituationSise, String> temAccLieSis;
    public static volatile SingularAttribute<SituationSise, String> temAccEtaSis;
    public static volatile SingularAttribute<SituationSise, String> lim3Sis;
    public static volatile SingularAttribute<SituationSise, String> lim2Sis;
    public static volatile SingularAttribute<SituationSise, Short> numOrdSis;
    public static volatile CollectionAttribute<SituationSise, InsAdmAnu> insAdmAnuCollection;
    public static volatile SingularAttribute<SituationSise, String> codSis;
    public static volatile SingularAttribute<SituationSise, String> temAnnPrmInsSis;
    public static volatile CollectionAttribute<SituationSise, TypEtb> typEtbCollection;

}