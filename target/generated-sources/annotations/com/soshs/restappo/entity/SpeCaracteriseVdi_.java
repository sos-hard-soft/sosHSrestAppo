package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmEtp;
import com.soshs.restappo.entity.SpeCaracteriseVdiPK;
import com.soshs.restappo.entity.Specialite;
import com.soshs.restappo.entity.VersionDiplome;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(SpeCaracteriseVdi.class)
public class SpeCaracteriseVdi_ { 

    public static volatile SingularAttribute<SpeCaracteriseVdi, SpeCaracteriseVdiPK> speCaracteriseVdiPK;
    public static volatile SingularAttribute<SpeCaracteriseVdi, String> temEnSveSpv;
    public static volatile CollectionAttribute<SpeCaracteriseVdi, InsAdmEtp> insAdmEtpCollection;
    public static volatile SingularAttribute<SpeCaracteriseVdi, Specialite> specialite;
    public static volatile SingularAttribute<SpeCaracteriseVdi, VersionDiplome> versionDiplome;
    public static volatile CollectionAttribute<SpeCaracteriseVdi, InsAdmEtp> insAdmEtpCollection1;
    public static volatile CollectionAttribute<SpeCaracteriseVdi, InsAdmEtp> insAdmEtpCollection2;

}