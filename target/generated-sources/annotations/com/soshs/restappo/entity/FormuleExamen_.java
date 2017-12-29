package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsPedagogiEtp;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(FormuleExamen.class)
public class FormuleExamen_ { 

    public static volatile SingularAttribute<FormuleExamen, String> temEnSveFex;
    public static volatile SingularAttribute<FormuleExamen, String> licFex;
    public static volatile SingularAttribute<FormuleExamen, String> libFex;
    public static volatile CollectionAttribute<FormuleExamen, InsPedagogiEtp> insPedagogiEtpCollection;
    public static volatile SingularAttribute<FormuleExamen, String> codFex;
    public static volatile SingularAttribute<FormuleExamen, String> temDel;

}