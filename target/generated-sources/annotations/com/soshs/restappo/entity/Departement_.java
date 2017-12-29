package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Academie;
import com.soshs.restappo.entity.Commune;
import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(Departement.class)
public class Departement_ { 

    public static volatile SingularAttribute<Departement, Academie> codAcd;
    public static volatile SingularAttribute<Departement, String> licDepArb;
    public static volatile SingularAttribute<Departement, String> licDep;
    public static volatile CollectionAttribute<Departement, InsAdmAnu> insAdmAnuCollection1;
    public static volatile SingularAttribute<Departement, String> libDep;
    public static volatile CollectionAttribute<Departement, Commune> communeCollection;
    public static volatile CollectionAttribute<Departement, Etablissement> etablissementCollection;
    public static volatile SingularAttribute<Departement, String> codDep;
    public static volatile SingularAttribute<Departement, String> temEnSveDep;
    public static volatile SingularAttribute<Departement, String> libDepArb;
    public static volatile CollectionAttribute<Departement, InsAdmAnu> insAdmAnuCollection;

}