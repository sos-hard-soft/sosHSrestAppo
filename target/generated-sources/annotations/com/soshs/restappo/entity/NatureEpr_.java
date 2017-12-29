package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Epreuve;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(NatureEpr.class)
public class NatureEpr_ { 

    public static volatile SingularAttribute<NatureEpr, String> temEnSveNep;
    public static volatile SingularAttribute<NatureEpr, String> licNep;
    public static volatile SingularAttribute<NatureEpr, String> libNep;
    public static volatile CollectionAttribute<NatureEpr, Epreuve> epreuveCollection;
    public static volatile SingularAttribute<NatureEpr, String> codNep;

}