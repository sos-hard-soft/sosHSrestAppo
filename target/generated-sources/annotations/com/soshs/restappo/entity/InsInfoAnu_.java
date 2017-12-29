package com.soshs.restappo.entity;

import com.soshs.restappo.entity.AnneeUni;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.InsInfoAnuPK;
import com.soshs.restappo.entity.TypHebergement;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(InsInfoAnu.class)
public class InsInfoAnu_ { 

    public static volatile SingularAttribute<InsInfoAnu, Individu> individu;
    public static volatile SingularAttribute<InsInfoAnu, InsInfoAnuPK> insInfoAnuPK;
    public static volatile SingularAttribute<InsInfoAnu, AnneeUni> anneeUni;
    public static volatile SingularAttribute<InsInfoAnu, TypHebergement> codThb;

}