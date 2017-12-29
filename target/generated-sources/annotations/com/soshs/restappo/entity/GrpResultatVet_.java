package com.soshs.restappo.entity;

import com.soshs.restappo.entity.AnneeUni;
import com.soshs.restappo.entity.GrpResultatVetPK;
import com.soshs.restappo.entity.VersionEtape;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(GrpResultatVet.class)
public class GrpResultatVet_ { 

    public static volatile SingularAttribute<GrpResultatVet, String> temTrtRptGvt;
    public static volatile SingularAttribute<GrpResultatVet, GrpResultatVetPK> grpResultatVetPK;
    public static volatile SingularAttribute<GrpResultatVet, String> temAvcHerVet;
    public static volatile SingularAttribute<GrpResultatVet, String> etaAvcVet;
    public static volatile SingularAttribute<GrpResultatVet, Date> datAvcVet;
    public static volatile SingularAttribute<GrpResultatVet, VersionEtape> versionEtape;
    public static volatile SingularAttribute<GrpResultatVet, String> temIniTabResVet;
    public static volatile SingularAttribute<GrpResultatVet, AnneeUni> anneeUni;

}