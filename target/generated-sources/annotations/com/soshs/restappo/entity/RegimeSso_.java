package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(RegimeSso.class)
public class RegimeSso_ { 

    public static volatile SingularAttribute<RegimeSso, String> codRss;
    public static volatile SingularAttribute<RegimeSso, String> temEnSveRss;
    public static volatile SingularAttribute<RegimeSso, String> libRss;
    public static volatile SingularAttribute<RegimeSso, String> licRss;
    public static volatile CollectionAttribute<RegimeSso, InsAdmAnu> insAdmAnuCollection;

}