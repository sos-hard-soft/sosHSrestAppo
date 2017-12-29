package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Diplome;
import com.soshs.restappo.entity.DisciplineSis;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(SecDisSis.class)
public class SecDisSis_ { 

    public static volatile SingularAttribute<SecDisSis, String> codSds;
    public static volatile CollectionAttribute<SecDisSis, Diplome> diplomeCollection;
    public static volatile SingularAttribute<SecDisSis, DisciplineSis> codDsi;
    public static volatile SingularAttribute<SecDisSis, String> temEnSveSds;
    public static volatile SingularAttribute<SecDisSis, String> libSds;
    public static volatile SingularAttribute<SecDisSis, String> licSds;

}