package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentreIncomp;
import com.soshs.restappo.entity.GrpResultatEpr;
import com.soshs.restappo.entity.NatureEpr;
import com.soshs.restappo.entity.PeriodeAno;
import com.soshs.restappo.entity.PeriodeExa;
import com.soshs.restappo.entity.TypEpreuve;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Epreuve.class)
public class Epreuve_ { 

    public static volatile SingularAttribute<Epreuve, String> licEpr;
    public static volatile SingularAttribute<Epreuve, BigDecimal> notMinRptEpr;
    public static volatile SingularAttribute<Epreuve, Date> datCreEpr;
    public static volatile CollectionAttribute<Epreuve, GrpResultatEpr> grpResultatEprCollection;
    public static volatile SingularAttribute<Epreuve, String> temConEpr;
    public static volatile SingularAttribute<Epreuve, String> libCmtEpr;
    public static volatile SingularAttribute<Epreuve, String> temDocAutEpr;
    public static volatile SingularAttribute<Epreuve, CentreIncomp> codCin;
    public static volatile SingularAttribute<Epreuve, PeriodeExa> codPxa1;
    public static volatile SingularAttribute<Epreuve, Integer> barSaiEpr;
    public static volatile SingularAttribute<Epreuve, PeriodeExa> codPxa2;
    public static volatile SingularAttribute<Epreuve, String> temSesUni;
    public static volatile SingularAttribute<Epreuve, Short> nbrEtuTieTpsEpr;
    public static volatile SingularAttribute<Epreuve, String> codAdmEpr;
    public static volatile SingularAttribute<Epreuve, Short> nbrEtuHanMotEpr;
    public static volatile SingularAttribute<Epreuve, PeriodeAno> codPan2;
    public static volatile SingularAttribute<Epreuve, PeriodeAno> codPan1;
    public static volatile SingularAttribute<Epreuve, PeriodeAno> codPan4;
    public static volatile SingularAttribute<Epreuve, Integer> durExaS2Epr;
    public static volatile SingularAttribute<Epreuve, PeriodeAno> codPan3;
    public static volatile SingularAttribute<Epreuve, Short> nbrEtuAidEpr;
    public static volatile SingularAttribute<Epreuve, String> temAnlRptEpr;
    public static volatile SingularAttribute<Epreuve, String> libTypExeEpr;
    public static volatile SingularAttribute<Epreuve, String> temNotEpr;
    public static volatile SingularAttribute<Epreuve, String> libDocAutEpr;
    public static volatile SingularAttribute<Epreuve, String> temRelPosSyt;
    public static volatile SingularAttribute<Epreuve, String> libEpr;
    public static volatile SingularAttribute<Epreuve, Short> durConEpr;
    public static volatile SingularAttribute<Epreuve, Date> datModEpr;
    public static volatile SingularAttribute<Epreuve, BigDecimal> notMinConEpr;
    public static volatile SingularAttribute<Epreuve, String> licEprArb;
    public static volatile SingularAttribute<Epreuve, String> temResEpr;
    public static volatile SingularAttribute<Epreuve, String> codEpr;
    public static volatile SingularAttribute<Epreuve, String> libEprArb;
    public static volatile SingularAttribute<Epreuve, Integer> durExaS1Epr;
    public static volatile SingularAttribute<Epreuve, String> temCtlValCadEpr;
    public static volatile SingularAttribute<Epreuve, Integer> barMinRptEpr;
    public static volatile SingularAttribute<Epreuve, String> temOrgEpr;
    public static volatile SingularAttribute<Epreuve, Integer> barMinConEpr;
    public static volatile SingularAttribute<Epreuve, NatureEpr> codNep;
    public static volatile SingularAttribute<Epreuve, TypEpreuve> codTep;

}