package com.soshs.restappo.entity;

import com.soshs.restappo.entity.AnneeUni;
import com.soshs.restappo.entity.GrpResultatVdiPK;
import com.soshs.restappo.entity.VersionDiplome;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(GrpResultatVdi.class)
public class GrpResultatVdi_ { 

    public static volatile SingularAttribute<GrpResultatVdi, String> etaAvcVdi;
    public static volatile SingularAttribute<GrpResultatVdi, String> temIniTabResVdi;
    public static volatile SingularAttribute<GrpResultatVdi, String> temTrtRptGvi;
    public static volatile SingularAttribute<GrpResultatVdi, GrpResultatVdiPK> grpResultatVdiPK;
    public static volatile SingularAttribute<GrpResultatVdi, String> temAvcHerVdi;
    public static volatile SingularAttribute<GrpResultatVdi, Date> datAvcVdi;
    public static volatile SingularAttribute<GrpResultatVdi, AnneeUni> anneeUni;
    public static volatile SingularAttribute<GrpResultatVdi, VersionDiplome> versionDiplome;

}