package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Imprimante.class)
public class Imprimante_ { 

    public static volatile CollectionAttribute<Imprimante, Utilisateur> utilisateurCollection;
    public static volatile SingularAttribute<Imprimante, String> libImp;
    public static volatile SingularAttribute<Imprimante, String> fmtRptImp;
    public static volatile SingularAttribute<Imprimante, String> nomRptImp;
    public static volatile SingularAttribute<Imprimante, String> codImp;

}