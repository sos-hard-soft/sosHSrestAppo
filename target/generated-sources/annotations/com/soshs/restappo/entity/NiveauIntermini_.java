package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Diplome;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(NiveauIntermini.class)
public class NiveauIntermini_ { 

    public static volatile SingularAttribute<NiveauIntermini, String> codNim;
    public static volatile CollectionAttribute<NiveauIntermini, Diplome> diplomeCollection;
    public static volatile SingularAttribute<NiveauIntermini, String> temEnSveNim;
    public static volatile SingularAttribute<NiveauIntermini, String> libNim;

}