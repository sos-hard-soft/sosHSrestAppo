package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.IndOpi;
import com.soshs.restappo.entity.Individu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Pays.class)
public class Pays_ { 

    public static volatile SingularAttribute<Pays, String> libPayArb;
    public static volatile SingularAttribute<Pays, String> libPay;
    public static volatile SingularAttribute<Pays, String> licPay;
    public static volatile SingularAttribute<Pays, String> codSisPay;
    public static volatile SingularAttribute<Pays, String> temEnSvePay;
    public static volatile SingularAttribute<Pays, String> temAflDecIndPay;
    public static volatile SingularAttribute<Pays, String> codPay;
    public static volatile SingularAttribute<Pays, String> temOuvDrtSsoPay;
    public static volatile SingularAttribute<Pays, String> libNatArb;
    public static volatile SingularAttribute<Pays, String> licPayArb;
    public static volatile CollectionAttribute<Pays, Individu> individuCollection;
    public static volatile CollectionAttribute<Pays, Etablissement> etablissementCollection;
    public static volatile SingularAttribute<Pays, String> temDel;
    public static volatile SingularAttribute<Pays, String> libNat;
    public static volatile CollectionAttribute<Pays, IndOpi> indOpiCollection;

}