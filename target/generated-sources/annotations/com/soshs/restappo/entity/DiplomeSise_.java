package com.soshs.restappo.entity;

import com.soshs.restappo.entity.DiplomeSise;
import com.soshs.restappo.entity.VersionDiplome;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(DiplomeSise.class)
public class DiplomeSise_ { 

    public static volatile SingularAttribute<DiplomeSise, String> libInt2Dis;
    public static volatile SingularAttribute<DiplomeSise, String> libInt1Dis;
    public static volatile SingularAttribute<DiplomeSise, String> etaDis;
    public static volatile CollectionAttribute<DiplomeSise, DiplomeSise> diplomeSiseCollection1;
    public static volatile CollectionAttribute<DiplomeSise, VersionDiplome> versionDiplomeCollection;
    public static volatile SingularAttribute<DiplomeSise, Integer> codDis;
    public static volatile CollectionAttribute<DiplomeSise, DiplomeSise> diplomeSiseCollection;
    public static volatile SingularAttribute<DiplomeSise, String> temEnSveDis;
    public static volatile SingularAttribute<DiplomeSise, String> licTypDis;

}