package com.soshs.restappo.entity;

import com.soshs.restappo.entity.IndOpi;
import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(CatSocPfl.class)
public class CatSocPfl_ { 

    public static volatile SingularAttribute<CatSocPfl, String> temMinPcs;
    public static volatile SingularAttribute<CatSocPfl, String> temEnSvePcs;
    public static volatile SingularAttribute<CatSocPfl, String> codPcs;
    public static volatile CollectionAttribute<CatSocPfl, InsAdmAnu> insAdmAnuCollection1;
    public static volatile SingularAttribute<CatSocPfl, Short> numOrdPcs;
    public static volatile SingularAttribute<CatSocPfl, String> temSaiQtr;
    public static volatile SingularAttribute<CatSocPfl, String> lim1Pcs;
    public static volatile SingularAttribute<CatSocPfl, String> libPcs;
    public static volatile SingularAttribute<CatSocPfl, String> licPcs;
    public static volatile SingularAttribute<CatSocPfl, String> temDel;
    public static volatile SingularAttribute<CatSocPfl, String> lim2Pcs;
    public static volatile SingularAttribute<CatSocPfl, String> lim3Pcs;
    public static volatile SingularAttribute<CatSocPfl, String> codSisPcs;
    public static volatile CollectionAttribute<CatSocPfl, IndOpi> indOpiCollection;
    public static volatile SingularAttribute<CatSocPfl, String> libWebPcs;
    public static volatile CollectionAttribute<CatSocPfl, InsAdmAnu> insAdmAnuCollection;

}