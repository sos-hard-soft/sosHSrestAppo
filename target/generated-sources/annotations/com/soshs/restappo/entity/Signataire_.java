package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Composante;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(Signataire.class)
public class Signataire_ { 

    public static volatile SingularAttribute<Signataire, String> nomSig;
    public static volatile SingularAttribute<Signataire, String> codSig;
    public static volatile CollectionAttribute<Signataire, Composante> composanteCollection;
    public static volatile SingularAttribute<Signataire, String> quaSig;
    public static volatile SingularAttribute<Signataire, String> nomSigArb;
    public static volatile SingularAttribute<Signataire, String> temEnSveSig;
    public static volatile SingularAttribute<Signataire, String> quaSigArb;
    public static volatile SingularAttribute<Signataire, String> codGenSig;

}