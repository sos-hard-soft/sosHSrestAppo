package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Cycle;
import com.soshs.restappo.entity.VersionEtape;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Etape.class)
public class Etape_ { 

    public static volatile SingularAttribute<Etape, String> codEtp;
    public static volatile SingularAttribute<Etape, String> libEtpArb;
    public static volatile CollectionAttribute<Etape, VersionEtape> versionEtapeCollection;
    public static volatile SingularAttribute<Etape, Short> nbrMaxInscDeug;
    public static volatile SingularAttribute<Etape, Short> nbrMaxIaeAut;
    public static volatile SingularAttribute<Etape, String> licEtp;
    public static volatile SingularAttribute<Etape, String> libEtp;
    public static volatile SingularAttribute<Etape, String> temOuvDrtSsoEtp;
    public static volatile SingularAttribute<Etape, String> temTypOpi;
    public static volatile SingularAttribute<Etape, String> temCouAccTrvEtp;
    public static volatile SingularAttribute<Etape, String> licEtpArb;
    public static volatile SingularAttribute<Etape, Cycle> codCyc;

}