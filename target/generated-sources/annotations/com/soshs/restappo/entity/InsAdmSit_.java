package com.soshs.restappo.entity;

import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.InsAdmSitPK;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(InsAdmSit.class)
public class InsAdmSit_ { 

    public static volatile SingularAttribute<InsAdmSit, String> etaIas;
    public static volatile SingularAttribute<InsAdmSit, Date> datModIas;
    public static volatile SingularAttribute<InsAdmSit, InsAdmAnu> insAdmAnu;
    public static volatile SingularAttribute<InsAdmSit, InsAdmSitPK> insAdmSitPK;
    public static volatile SingularAttribute<InsAdmSit, BigDecimal> mntDrtPai;
    public static volatile SingularAttribute<InsAdmSit, BigDecimal> mntBalRee;
    public static volatile SingularAttribute<InsAdmSit, BigDecimal> mntDrtRmb;
    public static volatile SingularAttribute<InsAdmSit, BigDecimal> mntReePai;
    public static volatile SingularAttribute<InsAdmSit, BigDecimal> mntReeRmb;
    public static volatile SingularAttribute<InsAdmSit, BigDecimal> mntBalDrt;
    public static volatile SingularAttribute<InsAdmSit, BigDecimal> mntIas;

}