package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentrePayeur;
import com.soshs.restappo.entity.ComBdi;
import com.soshs.restappo.entity.Droit;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Mutuelle.class)
public class Mutuelle_ { 

    public static volatile SingularAttribute<Mutuelle, String> libNomMut;
    public static volatile SingularAttribute<Mutuelle, String> libAd3Mut;
    public static volatile SingularAttribute<Mutuelle, String> libAd1Mut;
    public static volatile SingularAttribute<Mutuelle, String> libAd2Mut;
    public static volatile SingularAttribute<Mutuelle, String> temEnSveMut;
    public static volatile CollectionAttribute<Mutuelle, Droit> droitCollection;
    public static volatile CollectionAttribute<Mutuelle, CentrePayeur> centrePayeurCollection;
    public static volatile SingularAttribute<Mutuelle, Short> numOrdMut;
    public static volatile SingularAttribute<Mutuelle, String> codMut;
    public static volatile SingularAttribute<Mutuelle, String> lim1Mut;
    public static volatile SingularAttribute<Mutuelle, String> lim2Mut;
    public static volatile SingularAttribute<Mutuelle, String> lim3Mut;
    public static volatile SingularAttribute<Mutuelle, String> libWebMut;
    public static volatile SingularAttribute<Mutuelle, String> temMinMut;
    public static volatile SingularAttribute<Mutuelle, ComBdi> comBdi;

}