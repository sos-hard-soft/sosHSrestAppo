package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmAnu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(AssRspCiv.class)
public class AssRspCiv_ { 

    public static volatile SingularAttribute<AssRspCiv, String> codAsr;
    public static volatile SingularAttribute<AssRspCiv, Short> numOrdAsr;
    public static volatile SingularAttribute<AssRspCiv, String> lim1Asr;
    public static volatile SingularAttribute<AssRspCiv, String> temMinAsr;
    public static volatile SingularAttribute<AssRspCiv, String> libAsr;
    public static volatile SingularAttribute<AssRspCiv, String> licAsr;
    public static volatile SingularAttribute<AssRspCiv, String> lim2Asr;
    public static volatile SingularAttribute<AssRspCiv, String> lim3Asr;
    public static volatile SingularAttribute<AssRspCiv, String> libWebAsr;
    public static volatile CollectionAttribute<AssRspCiv, InsAdmAnu> insAdmAnuCollection;
    public static volatile SingularAttribute<AssRspCiv, String> temEnSveAsr;

}