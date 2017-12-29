package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Departement;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(Academie.class)
public class Academie_ { 

    public static volatile SingularAttribute<Academie, String> codAcd;
    public static volatile SingularAttribute<Academie, String> temEnSveAcd;
    public static volatile SingularAttribute<Academie, String> codSisAcd;
    public static volatile CollectionAttribute<Academie, Departement> departementCollection;
    public static volatile SingularAttribute<Academie, String> libAcd;
    public static volatile SingularAttribute<Academie, String> licAcd;

}