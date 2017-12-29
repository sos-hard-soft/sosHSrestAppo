package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ComBdi;
import com.soshs.restappo.entity.Departement;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(Commune.class)
public class Commune_ { 

    public static volatile SingularAttribute<Commune, String> codCom;
    public static volatile SingularAttribute<Commune, String> libComArb;
    public static volatile SingularAttribute<Commune, String> temEnSveCom;
    public static volatile SingularAttribute<Commune, String> libCom;
    public static volatile SingularAttribute<Commune, Departement> codDep;
    public static volatile CollectionAttribute<Commune, ComBdi> comBdiCollection;

}