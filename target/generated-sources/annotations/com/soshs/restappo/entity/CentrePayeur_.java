package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ComBdi;
import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.Mutuelle;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(CentrePayeur.class)
public class CentrePayeur_ { 

    public static volatile SingularAttribute<CentrePayeur, String> temMinCtp;
    public static volatile SingularAttribute<CentrePayeur, String> temEnSveCtp;
    public static volatile SingularAttribute<CentrePayeur, Mutuelle> codMut;
    public static volatile SingularAttribute<CentrePayeur, String> libAd2Ctp;
    public static volatile SingularAttribute<CentrePayeur, String> libAd3Ctp;
    public static volatile SingularAttribute<CentrePayeur, String> libAd1Ctp;
    public static volatile SingularAttribute<CentrePayeur, String> licCtp;
    public static volatile SingularAttribute<CentrePayeur, String> lim2Ctp;
    public static volatile SingularAttribute<CentrePayeur, Short> numOrdCtp;
    public static volatile SingularAttribute<CentrePayeur, ComBdi> comBdi;
    public static volatile SingularAttribute<CentrePayeur, String> libCtp;
    public static volatile SingularAttribute<CentrePayeur, String> lim3Ctp;
    public static volatile SingularAttribute<CentrePayeur, String> lim1Ctp;
    public static volatile SingularAttribute<CentrePayeur, String> codCtp;
    public static volatile CollectionAttribute<CentrePayeur, InsAdmAnu> insAdmAnuCollection;
    public static volatile SingularAttribute<CentrePayeur, String> codTrmSsoCtp;
    public static volatile SingularAttribute<CentrePayeur, String> libWebCtp;

}