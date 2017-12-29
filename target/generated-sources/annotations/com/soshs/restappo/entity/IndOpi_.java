package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CatSocPfl;
import com.soshs.restappo.entity.DomaineActPfl;
import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.Individu;
import com.soshs.restappo.entity.Pays;
import com.soshs.restappo.entity.SitFam;
import com.soshs.restappo.entity.SitMil;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(IndOpi.class)
public class IndOpi_ { 

    public static volatile SingularAttribute<IndOpi, SitFam> codFam;
    public static volatile SingularAttribute<IndOpi, DomaineActPfl> codDap;
    public static volatile SingularAttribute<IndOpi, Etablissement> codEtb;
    public static volatile SingularAttribute<IndOpi, String> codTypDepPayNai;
    public static volatile SingularAttribute<IndOpi, String> numTelIndOpi;
    public static volatile SingularAttribute<IndOpi, String> temIntEpo;
    public static volatile SingularAttribute<IndOpi, SitMil> codSim;
    public static volatile SingularAttribute<IndOpi, String> daaLbtIndOpi;
    public static volatile SingularAttribute<IndOpi, String> daaEntEtbOpi;
    public static volatile SingularAttribute<IndOpi, String> libVilNaiEtuOpiArb;
    public static volatile SingularAttribute<IndOpi, String> codSexOpi;
    public static volatile SingularAttribute<IndOpi, String> temExpProEpo;
    public static volatile SingularAttribute<IndOpi, String> codCleNneIndOpi;
    public static volatile SingularAttribute<IndOpi, String> libNomPatIndOpi;
    public static volatile SingularAttribute<IndOpi, String> codOpiIntEpo;
    public static volatile SingularAttribute<IndOpi, String> libPrnIndOpiArb;
    public static volatile CollectionAttribute<IndOpi, Individu> individuCollection;
    public static volatile SingularAttribute<IndOpi, String> libNomUsuIndOpi;
    public static volatile SingularAttribute<IndOpi, String> codThp;
    public static volatile SingularAttribute<IndOpi, String> libPr2IndOpi;
    public static volatile SingularAttribute<IndOpi, String> libNomIndOpiArb;
    public static volatile SingularAttribute<IndOpi, String> daaEtbOpi;
    public static volatile SingularAttribute<IndOpi, String> temDateNaiRelOpi;
    public static volatile SingularAttribute<IndOpi, String> libPr3IndOpi;
    public static volatile SingularAttribute<IndOpi, Integer> codEtuOpi;
    public static volatile SingularAttribute<IndOpi, Short> durExpProEpo;
    public static volatile SingularAttribute<IndOpi, String> daaEnsSupOpi;
    public static volatile SingularAttribute<IndOpi, Pays> codPayNat;
    public static volatile SingularAttribute<IndOpi, String> dmmLbtIndOpi;
    public static volatile SingularAttribute<IndOpi, Date> dateNaiIndOpi;
    public static volatile SingularAttribute<IndOpi, CatSocPfl> codPcs;
    public static volatile SingularAttribute<IndOpi, String> numTelTempEpo;
    public static volatile SingularAttribute<IndOpi, Integer> codIndOpi;
    public static volatile SingularAttribute<IndOpi, String> libPr1IndOpi;
    public static volatile SingularAttribute<IndOpi, Short> temMiTpsEpo;
    public static volatile SingularAttribute<IndOpi, String> codDepPayNai;
    public static volatile SingularAttribute<IndOpi, String> codNneIndOpi;
    public static volatile SingularAttribute<IndOpi, String> libVilNaiEtuOpi;
    public static volatile SingularAttribute<IndOpi, Individu> codInd;
    public static volatile SingularAttribute<IndOpi, String> cinIndOpi;

}