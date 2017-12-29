package com.soshs.restappo.entity;

import com.soshs.restappo.entity.GrpResultatEpr;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.ResultatEprPK;
import com.soshs.restappo.entity.TypResultat;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(ResultatEpr.class)
public class ResultatEpr_ { 

    public static volatile SingularAttribute<ResultatEpr, String> temIntEpr;
    public static volatile SingularAttribute<ResultatEpr, Date> datCreEpr;
    public static volatile SingularAttribute<ResultatEpr, Individu> individu;
    public static volatile SingularAttribute<ResultatEpr, String> temIndCrnEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temIaeKoEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temDstSupEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temIpEpr;
    public static volatile SingularAttribute<ResultatEpr, BigDecimal> notEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temNotRptEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temExiNotEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temOriActEpr;
    public static volatile SingularAttribute<ResultatEpr, GrpResultatEpr> grpResultatEpr;
    public static volatile SingularAttribute<ResultatEpr, ResultatEprPK> resultatEprPK;
    public static volatile SingularAttribute<ResultatEpr, String> notSubEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temCrnHerEpr;
    public static volatile SingularAttribute<ResultatEpr, Integer> codEtuAno;
    public static volatile SingularAttribute<ResultatEpr, Integer> codNumUtiCre;
    public static volatile SingularAttribute<ResultatEpr, Date> datModEpr;
    public static volatile SingularAttribute<ResultatEpr, String> etaResEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temResRptEpr;
    public static volatile SingularAttribute<ResultatEpr, Integer> codNumUtiMod;
    public static volatile SingularAttribute<ResultatEpr, Integer> barNotEpr;
    public static volatile SingularAttribute<ResultatEpr, String> temTrtRptEpr;
    public static volatile SingularAttribute<ResultatEpr, TypResultat> codTre;
    public static volatile SingularAttribute<ResultatEpr, String> etaNotEpr;

}