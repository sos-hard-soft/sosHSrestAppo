package com.soshs.restappo.entity;

import com.soshs.restappo.entity.VersionEtape;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(DureeEtape.class)
public class DureeEtape_ { 

    public static volatile SingularAttribute<DureeEtape, String> codDue;
    public static volatile CollectionAttribute<DureeEtape, VersionEtape> versionEtapeCollection;
    public static volatile SingularAttribute<DureeEtape, String> temEnSveDue;
    public static volatile SingularAttribute<DureeEtape, String> libDue;

}