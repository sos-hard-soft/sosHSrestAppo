package com.soshs.restappo.entity;

import com.soshs.restappo.entity.IndOpi;
import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(DomaineActPfl.class)
public class DomaineActPfl_ { 

    public static volatile SingularAttribute<DomaineActPfl, String> codDap;
    public static volatile SingularAttribute<DomaineActPfl, Short> numOrdDap;
    public static volatile SingularAttribute<DomaineActPfl, String> libWebDap;
    public static volatile SingularAttribute<DomaineActPfl, String> codSisDap1;
    public static volatile SingularAttribute<DomaineActPfl, String> licDap;
    public static volatile SingularAttribute<DomaineActPfl, String> libDap;
    public static volatile SingularAttribute<DomaineActPfl, String> lim2Dap;
    public static volatile SingularAttribute<DomaineActPfl, String> lim3Dap;
    public static volatile SingularAttribute<DomaineActPfl, String> lim1Dap;
    public static volatile SingularAttribute<DomaineActPfl, String> temEnSveDap;
    public static volatile SingularAttribute<DomaineActPfl, String> temMinDap;
    public static volatile CollectionAttribute<DomaineActPfl, IndOpi> indOpiCollection;
    public static volatile CollectionAttribute<DomaineActPfl, InsAdmAnu> insAdmAnuCollection;

}