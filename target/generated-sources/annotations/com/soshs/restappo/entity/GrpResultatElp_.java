package com.soshs.restappo.entity;

import com.soshs.restappo.entity.AnneeUni;
import com.soshs.restappo.entity.ElementPedagogi;
import com.soshs.restappo.entity.GrpResultatElpPK;
import com.soshs.restappo.entity.ResultatElp;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(GrpResultatElp.class)
public class GrpResultatElp_ { 

    public static volatile SingularAttribute<GrpResultatElp, GrpResultatElpPK> grpResultatElpPK;
    public static volatile SingularAttribute<GrpResultatElp, String> etaAvcElp;
    public static volatile SingularAttribute<GrpResultatElp, String> temTrtRptGeg;
    public static volatile SingularAttribute<GrpResultatElp, String> temAvcHerElp;
    public static volatile SingularAttribute<GrpResultatElp, ElementPedagogi> elementPedagogi;
    public static volatile SingularAttribute<GrpResultatElp, Date> datAvcElp;
    public static volatile SingularAttribute<GrpResultatElp, String> temIniTabResElp;
    public static volatile SingularAttribute<GrpResultatElp, AnneeUni> anneeUni;
    public static volatile CollectionAttribute<GrpResultatElp, ResultatElp> resultatElpCollection;

}