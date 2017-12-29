package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Droit;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(TypDroit.class)
public class TypDroit_ { 

    public static volatile SingularAttribute<TypDroit, String> codTdr;
    public static volatile CollectionAttribute<TypDroit, Droit> droitCollection;
    public static volatile SingularAttribute<TypDroit, String> temEnSveTdr;
    public static volatile SingularAttribute<TypDroit, String> temDel;
    public static volatile SingularAttribute<TypDroit, String> libTdr;
    public static volatile SingularAttribute<TypDroit, String> licTdr;

}