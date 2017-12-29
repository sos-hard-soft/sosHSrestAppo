package com.soshs.restappo.entity;

import com.soshs.restappo.entity.VersionDiplome;
import com.soshs.restappo.entity.VersionModeleDipPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(VersionModeleDip.class)
public class VersionModeleDip_ { 

    public static volatile SingularAttribute<VersionModeleDip, VersionModeleDipPK> versionModeleDipPK;
    public static volatile SingularAttribute<VersionModeleDip, String> libVmd;
    public static volatile CollectionAttribute<VersionModeleDip, VersionDiplome> versionDiplomeCollection;
    public static volatile SingularAttribute<VersionModeleDip, String> temEnSveVmd;

}