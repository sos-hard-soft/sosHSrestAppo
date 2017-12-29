package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ResultatElp;
import com.soshs.restappo.entity.ResultatEpr;
import com.soshs.restappo.entity.VersionDiplome;
import com.soshs.restappo.entity.VersionEtape;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(TypResultat.class)
public class TypResultat_ { 

    public static volatile SingularAttribute<TypResultat, String> licTre;
    public static volatile SingularAttribute<TypResultat, String> temAdiTre;
    public static volatile SingularAttribute<TypResultat, String> libTre;
    public static volatile SingularAttribute<TypResultat, String> temEprTre;
    public static volatile SingularAttribute<TypResultat, String> temEnSveTre;
    public static volatile SingularAttribute<TypResultat, String> libTreArb;
    public static volatile CollectionAttribute<TypResultat, VersionEtape> versionEtapeCollection;
    public static volatile SingularAttribute<TypResultat, String> codSisDipTre;
    public static volatile CollectionAttribute<TypResultat, VersionEtape> versionEtapeCollection1;
    public static volatile SingularAttribute<TypResultat, String> codNegTre;
    public static volatile CollectionAttribute<TypResultat, VersionDiplome> versionDiplomeCollection1;
    public static volatile CollectionAttribute<TypResultat, ResultatEpr> resultatEprCollection;
    public static volatile SingularAttribute<TypResultat, String> codTre;
    public static volatile SingularAttribute<TypResultat, String> codTreArb;
    public static volatile SingularAttribute<TypResultat, String> temAdoTre;
    public static volatile SingularAttribute<TypResultat, String> temVetTre;
    public static volatile CollectionAttribute<TypResultat, VersionDiplome> versionDiplomeCollection;
    public static volatile SingularAttribute<TypResultat, String> temVdiTre;
    public static volatile SingularAttribute<TypResultat, String> temDel;
    public static volatile CollectionAttribute<TypResultat, ResultatElp> resultatElpCollection;
    public static volatile SingularAttribute<TypResultat, String> temElpTre;
    public static volatile SingularAttribute<TypResultat, String> licTreArb;

}