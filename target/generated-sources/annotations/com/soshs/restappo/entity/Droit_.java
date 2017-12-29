package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.Mutuelle;
import com.soshs.restappo.entity.NivRegroup;
import com.soshs.restappo.entity.TypDroit;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Droit.class)
public class Droit_ { 

    public static volatile SingularAttribute<Droit, String> lim1Drt;
    public static volatile SingularAttribute<Droit, String> libDrt;
    public static volatile SingularAttribute<Droit, String> licDrt;
    public static volatile SingularAttribute<Droit, String> lim2Drt;
    public static volatile SingularAttribute<Droit, String> temEnSveDrt;
    public static volatile SingularAttribute<Droit, Mutuelle> codMut;
    public static volatile SingularAttribute<Droit, TypDroit> codTdr;
    public static volatile SingularAttribute<Droit, NivRegroup> codNrg;
    public static volatile SingularAttribute<Droit, String> temRmbEtb;
    public static volatile SingularAttribute<Droit, String> codDrt;
    public static volatile SingularAttribute<Droit, BigDecimal> mntDrt;
    public static volatile SingularAttribute<Droit, Short> numOrdDrt;
    public static volatile SingularAttribute<Droit, String> libWebDrt;
    public static volatile CollectionAttribute<Droit, InsAdmAnu> insAdmAnuCollection1;
    public static volatile CollectionAttribute<Droit, InsAdmAnu> insAdmAnuCollection;

}