package com.soshs.restappo.entity;

import com.soshs.restappo.entity.TypDiplome;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(NiveauFormation.class)
public class NiveauFormation_ { 

    public static volatile CollectionAttribute<NiveauFormation, TypDiplome> typDiplomeCollection;
    public static volatile SingularAttribute<NiveauFormation, String> temEnSveNif;
    public static volatile SingularAttribute<NiveauFormation, String> libNif;
    public static volatile SingularAttribute<NiveauFormation, Short> codNif;

}