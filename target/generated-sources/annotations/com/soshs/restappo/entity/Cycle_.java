package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Diplome;
import com.soshs.restappo.entity.Etape;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Cycle.class)
public class Cycle_ { 

    public static volatile SingularAttribute<Cycle, String> libCycArb;
    public static volatile CollectionAttribute<Cycle, Etape> etapeCollection;
    public static volatile CollectionAttribute<Cycle, Diplome> diplomeCollection;
    public static volatile SingularAttribute<Cycle, String> libCyc;
    public static volatile SingularAttribute<Cycle, String> temDel;
    public static volatile SingularAttribute<Cycle, String> temEnSveCyc;
    public static volatile SingularAttribute<Cycle, String> codCyc;

}