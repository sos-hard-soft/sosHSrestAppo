package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ElementPedagogi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(SectionCnu.class)
public class SectionCnu_ { 

    public static volatile SingularAttribute<SectionCnu, String> codScc;
    public static volatile CollectionAttribute<SectionCnu, ElementPedagogi> elementPedagogiCollection;
    public static volatile SingularAttribute<SectionCnu, String> temEnSveScc;
    public static volatile SingularAttribute<SectionCnu, String> licScc;
    public static volatile SingularAttribute<SectionCnu, String> libScc;

}