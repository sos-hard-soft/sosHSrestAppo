package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ResultatElp;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(Mention.class)
public class Mention_ { 

    public static volatile SingularAttribute<Mention, String> licMen;
    public static volatile SingularAttribute<Mention, String> libMen;
    public static volatile SingularAttribute<Mention, String> codMen;
    public static volatile SingularAttribute<Mention, String> libMenArb;
    public static volatile SingularAttribute<Mention, String> temEnSveMen;
    public static volatile SingularAttribute<Mention, String> licMenArb;
    public static volatile SingularAttribute<Mention, String> codMenArb;
    public static volatile CollectionAttribute<Mention, ResultatElp> resultatElpCollection;

}