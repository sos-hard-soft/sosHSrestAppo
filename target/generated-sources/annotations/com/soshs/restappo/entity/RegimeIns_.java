package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(RegimeIns.class)
public class RegimeIns_ { 

    public static volatile SingularAttribute<RegimeIns, String> temPecMinRgi;
    public static volatile SingularAttribute<RegimeIns, String> codRgi;
    public static volatile SingularAttribute<RegimeIns, String> codSisRgi;
    public static volatile SingularAttribute<RegimeIns, String> etaSisRgi;
    public static volatile SingularAttribute<RegimeIns, String> temPdfRgi;
    public static volatile SingularAttribute<RegimeIns, String> temEnSveRgi;
    public static volatile CollectionAttribute<RegimeIns, InsAdmAnu> insAdmAnuCollection;
    public static volatile SingularAttribute<RegimeIns, String> libRgi;
    public static volatile SingularAttribute<RegimeIns, String> licRgi;

}