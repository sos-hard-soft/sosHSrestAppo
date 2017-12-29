package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentreGestion;
import com.soshs.restappo.entity.ComBdi;
import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Cpam.class)
public class Cpam_ { 

    public static volatile SingularAttribute<Cpam, String> codCpaTrmCpa;
    public static volatile SingularAttribute<Cpam, String> codCpa;
    public static volatile SingularAttribute<Cpam, Short> numBrdTrmSsoCpa;
    public static volatile SingularAttribute<Cpam, String> libAd3Cpa;
    public static volatile SingularAttribute<Cpam, ComBdi> comBdi;
    public static volatile SingularAttribute<Cpam, String> libAd2Cpa;
    public static volatile SingularAttribute<Cpam, String> libAd1Cpa;
    public static volatile SingularAttribute<Cpam, String> temEnSveCpa;
    public static volatile CollectionAttribute<Cpam, CentreGestion> centreGestionCollection;
    public static volatile CollectionAttribute<Cpam, InsAdmAnu> insAdmAnuCollection;
    public static volatile SingularAttribute<Cpam, String> libCpa;
    public static volatile SingularAttribute<Cpam, String> licCpa;

}