package com.soshs.restappo.entity;

import com.soshs.restappo.entity.VersionEtape;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(Convention.class)
public class Convention_ { 

    public static volatile SingularAttribute<Convention, String> codSisCnv;
    public static volatile SingularAttribute<Convention, String> temEnSveCnv;
    public static volatile SingularAttribute<Convention, String> libCnv;
    public static volatile CollectionAttribute<Convention, VersionEtape> versionEtapeCollection;
    public static volatile SingularAttribute<Convention, String> codCnv;

}