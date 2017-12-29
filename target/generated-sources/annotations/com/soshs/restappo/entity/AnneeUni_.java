package com.soshs.restappo.entity;

import com.soshs.restappo.entity.GrpResultatElp;
import com.soshs.restappo.entity.GrpResultatEpr;
import com.soshs.restappo.entity.GrpResultatVdi;
import com.soshs.restappo.entity.GrpResultatVet;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.InsInfoAnu;
import com.soshs.restappo.entity.InsPedagogiAnu;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(AnneeUni.class)
public class AnneeUni_ { 

    public static volatile CollectionAttribute<AnneeUni, GrpResultatVet> grpResultatVetCollection;
    public static volatile SingularAttribute<AnneeUni, Integer> numOccObtVdiUni;
    public static volatile SingularAttribute<AnneeUni, String> libAnu;
    public static volatile SingularAttribute<AnneeUni, String> licAnu;
    public static volatile CollectionAttribute<AnneeUni, InsPedagogiAnu> insPedagogiAnuCollection;
    public static volatile CollectionAttribute<AnneeUni, GrpResultatEpr> grpResultatEprCollection;
    public static volatile SingularAttribute<AnneeUni, String> etaAnuIae;
    public static volatile SingularAttribute<AnneeUni, Integer> numOccObtVdi;
    public static volatile SingularAttribute<AnneeUni, String> codAnu;
    public static volatile CollectionAttribute<AnneeUni, GrpResultatVdi> grpResultatVdiCollection;
    public static volatile CollectionAttribute<AnneeUni, InsInfoAnu> insInfoAnuCollection;
    public static volatile CollectionAttribute<AnneeUni, GrpResultatElp> grpResultatElpCollection;
    public static volatile SingularAttribute<AnneeUni, Date> datFrmOpi;
    public static volatile SingularAttribute<AnneeUni, Date> datOuvOpi;
    public static volatile CollectionAttribute<AnneeUni, Individu> individuCollection;
    public static volatile SingularAttribute<AnneeUni, String> etaAnuIpe;
    public static volatile SingularAttribute<AnneeUni, byte[]> logUni;
    public static volatile SingularAttribute<AnneeUni, String> etaAnuRes;
    public static volatile CollectionAttribute<AnneeUni, InsAdmAnu> insAdmAnuCollection;

}