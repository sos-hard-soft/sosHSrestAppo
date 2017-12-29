package com.soshs.restappo.entity;

import com.soshs.restappo.entity.GrpResultatElp;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.Mention;
import com.soshs.restappo.entity.ResultatElpPK;
import com.soshs.restappo.entity.TypResultat;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(ResultatElp.class)
public class ResultatElp_ { 

    public static volatile SingularAttribute<ResultatElp, Date> datCreElp;
    public static volatile SingularAttribute<ResultatElp, Individu> individu;
    public static volatile SingularAttribute<ResultatElp, String> temIntElp;
    public static volatile SingularAttribute<ResultatElp, Mention> codMen;
    public static volatile SingularAttribute<ResultatElp, String> temExiNotElp;
    public static volatile SingularAttribute<ResultatElp, String> temDstSupElp;
    public static volatile SingularAttribute<ResultatElp, String> temIaeKoElp;
    public static volatile SingularAttribute<ResultatElp, BigDecimal> notPntJurElp;
    public static volatile SingularAttribute<ResultatElp, String> temIndCrnElp;
    public static volatile SingularAttribute<ResultatElp, String> temIpElp;
    public static volatile SingularAttribute<ResultatElp, BigDecimal> notElp;
    public static volatile SingularAttribute<ResultatElp, String> temNotRptElp;
    public static volatile SingularAttribute<ResultatElp, GrpResultatElp> grpResultatElp;
    public static volatile SingularAttribute<ResultatElp, String> etaMndElp;
    public static volatile SingularAttribute<ResultatElp, String> etaRngElp;
    public static volatile SingularAttribute<ResultatElp, String> notSubElp;
    public static volatile SingularAttribute<ResultatElp, String> temOriActElp;
    public static volatile SingularAttribute<ResultatElp, ResultatElpPK> resultatElpPK;
    public static volatile SingularAttribute<ResultatElp, Short> nbrRngEtuElp;
    public static volatile SingularAttribute<ResultatElp, String> temCrnHerElp;
    public static volatile SingularAttribute<ResultatElp, Integer> codEtuAno;
    public static volatile SingularAttribute<ResultatElp, Integer> codNumUtiCre;
    public static volatile SingularAttribute<ResultatElp, String> etaResElp;
    public static volatile SingularAttribute<ResultatElp, String> temResRptElp;
    public static volatile SingularAttribute<ResultatElp, Date> datModElp;
    public static volatile SingularAttribute<ResultatElp, Integer> codNumUtiMod;
    public static volatile SingularAttribute<ResultatElp, String> temTrtRptElp;
    public static volatile SingularAttribute<ResultatElp, TypResultat> codTre;
    public static volatile SingularAttribute<ResultatElp, String> etaNotElp;
    public static volatile SingularAttribute<ResultatElp, Integer> barNotElp;

}