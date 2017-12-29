package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentreIncomp;
import com.soshs.restappo.entity.Epreuve;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(PeriodeExa.class)
public class PeriodeExa_ { 

    public static volatile SingularAttribute<PeriodeExa, String> temEnSvePxa;
    public static volatile SingularAttribute<PeriodeExa, String> libPxa;
    public static volatile CollectionAttribute<PeriodeExa, Epreuve> epreuveCollection;
    public static volatile SingularAttribute<PeriodeExa, Date> datDebPxa;
    public static volatile SingularAttribute<PeriodeExa, CentreIncomp> codCin;
    public static volatile CollectionAttribute<PeriodeExa, Epreuve> epreuveCollection1;
    public static volatile SingularAttribute<PeriodeExa, String> codPxa;
    public static volatile SingularAttribute<PeriodeExa, Date> datFinPxa;
    public static volatile SingularAttribute<PeriodeExa, String> temPrdValidPxa;
    public static volatile SingularAttribute<PeriodeExa, Date> datDerTrtPxa;

}