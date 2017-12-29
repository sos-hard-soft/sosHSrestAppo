package com.soshs.restappo.entity;

import com.soshs.restappo.entity.IndOpi;
import com.soshs.restappo.entity.Individu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(SitMil.class)
public class SitMil_ { 

    public static volatile SingularAttribute<SitMil, Short> numOrdSim;
    public static volatile SingularAttribute<SitMil, String> temMinSim;
    public static volatile SingularAttribute<SitMil, String> codSim;
    public static volatile SingularAttribute<SitMil, String> libWebSim;
    public static volatile SingularAttribute<SitMil, String> licSim;
    public static volatile SingularAttribute<SitMil, String> lim2Sim;
    public static volatile SingularAttribute<SitMil, String> libSim;
    public static volatile SingularAttribute<SitMil, String> temSaiDmmLbt;
    public static volatile SingularAttribute<SitMil, String> lim3Sim;
    public static volatile SingularAttribute<SitMil, String> lim1Sim;
    public static volatile SingularAttribute<SitMil, String> temEnSveSim;
    public static volatile SingularAttribute<SitMil, String> temDelDip;
    public static volatile CollectionAttribute<SitMil, Individu> individuCollection;
    public static volatile SingularAttribute<SitMil, String> temDel;
    public static volatile CollectionAttribute<SitMil, IndOpi> indOpiCollection;

}