package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ElementPedagogi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(PeriodeElp.class)
public class PeriodeElp_ { 

    public static volatile SingularAttribute<PeriodeElp, String> licPel;
    public static volatile SingularAttribute<PeriodeElp, String> libPel;
    public static volatile SingularAttribute<PeriodeElp, String> codPel;
    public static volatile CollectionAttribute<PeriodeElp, ElementPedagogi> elementPedagogiCollection;
    public static volatile SingularAttribute<PeriodeElp, String> temEnSvePel;

}