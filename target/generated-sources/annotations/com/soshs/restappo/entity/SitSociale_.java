package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Bourse;
import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(SitSociale.class)
public class SitSociale_ { 

    public static volatile SingularAttribute<SitSociale, String> licSoc;
    public static volatile SingularAttribute<SitSociale, String> lim2Soc;
    public static volatile SingularAttribute<SitSociale, String> libSoc;
    public static volatile SingularAttribute<SitSociale, String> lim3Soc;
    public static volatile SingularAttribute<SitSociale, String> lim1Soc;
    public static volatile CollectionAttribute<SitSociale, Bourse> bourseCollection;
    public static volatile SingularAttribute<SitSociale, String> temEnSveSoc;
    public static volatile SingularAttribute<SitSociale, String> temPecMinSoc;
    public static volatile SingularAttribute<SitSociale, String> lix3Soc;
    public static volatile SingularAttribute<SitSociale, String> lix4Soc;
    public static volatile SingularAttribute<SitSociale, String> lix2Soc;
    public static volatile SingularAttribute<SitSociale, Short> numOrdSoc;
    public static volatile SingularAttribute<SitSociale, String> lix1Soc;
    public static volatile SingularAttribute<SitSociale, String> temMinSoc;
    public static volatile SingularAttribute<SitSociale, String> codSoc;
    public static volatile SingularAttribute<SitSociale, String> libWebSoc;
    public static volatile SingularAttribute<SitSociale, String> temDel;
    public static volatile CollectionAttribute<SitSociale, InsAdmAnu> insAdmAnuCollection;

}