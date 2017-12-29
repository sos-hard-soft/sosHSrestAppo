package com.soshs.restappo.entity;

import com.soshs.restappo.entity.IndOpi;
import com.soshs.restappo.entity.Individu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(SitFam.class)
public class SitFam_ { 

    public static volatile SingularAttribute<SitFam, String> codFam;
    public static volatile SingularAttribute<SitFam, String> lim3Fam;
    public static volatile SingularAttribute<SitFam, String> codSisFam;
    public static volatile SingularAttribute<SitFam, Short> numOrdFam;
    public static volatile SingularAttribute<SitFam, String> libWebFam;
    public static volatile SingularAttribute<SitFam, String> libFam;
    public static volatile SingularAttribute<SitFam, String> licFam;
    public static volatile SingularAttribute<SitFam, String> lim1Fam;
    public static volatile SingularAttribute<SitFam, String> lim2Fam;
    public static volatile SingularAttribute<SitFam, String> temEnSveFam;
    public static volatile CollectionAttribute<SitFam, Individu> individuCollection;
    public static volatile SingularAttribute<SitFam, String> temMinFam;
    public static volatile CollectionAttribute<SitFam, IndOpi> indOpiCollection;

}