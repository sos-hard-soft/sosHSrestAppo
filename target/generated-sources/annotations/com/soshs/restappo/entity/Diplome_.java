package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Cycle;
import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.NatureDiplome;
import com.soshs.restappo.entity.NiveauIntermini;
import com.soshs.restappo.entity.SecDisSis;
import com.soshs.restappo.entity.TypDiplome;
import com.soshs.restappo.entity.VersionDiplome;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Diplome.class)
public class Diplome_ { 

    public static volatile SingularAttribute<Diplome, NiveauIntermini> codNim;
    public static volatile SingularAttribute<Diplome, Etablissement> codEtb;
    public static volatile SingularAttribute<Diplome, NatureDiplome> codNdi;
    public static volatile SingularAttribute<Diplome, String> licDip;
    public static volatile SingularAttribute<Diplome, String> licDipArb;
    public static volatile SingularAttribute<Diplome, String> libDip;
    public static volatile SingularAttribute<Diplome, String> temCouAccTrvDip;
    public static volatile SingularAttribute<Diplome, String> codDip;
    public static volatile SingularAttribute<Diplome, String> libDipArb;
    public static volatile SingularAttribute<Diplome, Cycle> codCyc;
    public static volatile SingularAttribute<Diplome, SecDisSis> codSds;
    public static volatile SingularAttribute<Diplome, String> temOuvDrtSsoDip;
    public static volatile SingularAttribute<Diplome, Short> nbrMaxInscDeug;
    public static volatile CollectionAttribute<Diplome, VersionDiplome> versionDiplomeCollection;
    public static volatile SingularAttribute<Diplome, TypDiplome> codTpdEtb;
    public static volatile SingularAttribute<Diplome, Integer> codPer;

}