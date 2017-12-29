package com.soshs.restappo.entity;

import com.soshs.restappo.entity.AnneeUni;
import com.soshs.restappo.entity.Epreuve;
import com.soshs.restappo.entity.GrpResultatEprPK;
import com.soshs.restappo.entity.ResultatEpr;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(GrpResultatEpr.class)
public class GrpResultatEpr_ { 

    public static volatile SingularAttribute<GrpResultatEpr, GrpResultatEprPK> grpResultatEprPK;
    public static volatile SingularAttribute<GrpResultatEpr, String> etaAvcEpr;
    public static volatile SingularAttribute<GrpResultatEpr, String> temAvcHerEpr;
    public static volatile SingularAttribute<GrpResultatEpr, Date> datAvcEpr;
    public static volatile SingularAttribute<GrpResultatEpr, String> temIniTabResEpr;
    public static volatile SingularAttribute<GrpResultatEpr, AnneeUni> anneeUni;
    public static volatile SingularAttribute<GrpResultatEpr, Epreuve> epreuve;
    public static volatile CollectionAttribute<GrpResultatEpr, ResultatEpr> resultatEprCollection;

}