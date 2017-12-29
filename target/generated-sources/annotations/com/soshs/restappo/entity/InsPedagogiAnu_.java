package com.soshs.restappo.entity;

import com.soshs.restappo.entity.AnneeUni;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.InsPedagogiAnuPK;
import com.soshs.restappo.entity.InsPedagogiEtp;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(InsPedagogiAnu.class)
public class InsPedagogiAnu_ { 

    public static volatile SingularAttribute<InsPedagogiAnu, Individu> individu;
    public static volatile CollectionAttribute<InsPedagogiAnu, InsPedagogiEtp> insPedagogiEtpCollection;
    public static volatile SingularAttribute<InsPedagogiAnu, InsPedagogiAnuPK> insPedagogiAnuPK;
    public static volatile SingularAttribute<InsPedagogiAnu, AnneeUni> anneeUni;

}