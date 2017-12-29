package com.soshs.restappo.entity;

import com.soshs.restappo.entity.CentreInsPed;
import com.soshs.restappo.entity.ComBdi;
import com.soshs.restappo.entity.ElementPedagogi;
import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.InsAdmEtp;
import com.soshs.restappo.entity.Signataire;
import com.soshs.restappo.entity.TypComposante;
import com.soshs.restappo.entity.Utilisateur;
import com.soshs.restappo.entity.VersionDiplome;
import com.soshs.restappo.entity.VersionEtape;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(Composante.class)
public class Composante_ { 

    public static volatile SingularAttribute<Composante, String> lim1Cmp;
    public static volatile SingularAttribute<Composante, Signataire> codSig;
    public static volatile CollectionAttribute<Composante, VersionEtape> versionEtapeCollection;
    public static volatile CollectionAttribute<Composante, CentreInsPed> centreInsPedCollection;
    public static volatile SingularAttribute<Composante, String> libArtCmp;
    public static volatile SingularAttribute<Composante, String> temMinCmp;
    public static volatile SingularAttribute<Composante, String> libCmtCmpArb;
    public static volatile CollectionAttribute<Composante, ElementPedagogi> elementPedagogiCollection1;
    public static volatile SingularAttribute<Composante, String> codCmp;
    public static volatile SingularAttribute<Composante, Etablissement> codCmpEtb;
    public static volatile SingularAttribute<Composante, BigDecimal> surCmpTot;
    public static volatile CollectionAttribute<Composante, VersionDiplome> versionDiplomeCollection;
    public static volatile SingularAttribute<Composante, ComBdi> comBdi;
    public static volatile SingularAttribute<Composante, String> licCmpArb;
    public static volatile SingularAttribute<Composante, String> int2EdiDipCmpArb;
    public static volatile SingularAttribute<Composante, String> int1EdiDipCmp;
    public static volatile SingularAttribute<Composante, String> int1EdiDipCmpArb;
    public static volatile SingularAttribute<Composante, String> licCmp;
    public static volatile SingularAttribute<Composante, String> lim2Cmp;
    public static volatile SingularAttribute<Composante, String> libAd3CmpArb;
    public static volatile SingularAttribute<Composante, String> libTtrArb;
    public static volatile CollectionAttribute<Composante, ElementPedagogi> elementPedagogiCollection;
    public static volatile SingularAttribute<Composante, String> libWebCmp;
    public static volatile SingularAttribute<Composante, String> libAd1Cmp;
    public static volatile CollectionAttribute<Composante, Utilisateur> utilisateurCollection;
    public static volatile SingularAttribute<Composante, String> libCmp;
    public static volatile SingularAttribute<Composante, String> libVilCmpArb;
    public static volatile SingularAttribute<Composante, String> temCouAccTrvCmp;
    public static volatile SingularAttribute<Composante, String> int2EdiDipCmp;
    public static volatile SingularAttribute<Composante, String> libPhr1;
    public static volatile SingularAttribute<Composante, String> lim3Cmp;
    public static volatile SingularAttribute<Composante, String> libVilCmp;
    public static volatile SingularAttribute<Composante, String> libPhr2;
    public static volatile SingularAttribute<Composante, String> libPhr3;
    public static volatile SingularAttribute<Composante, String> codRneCmp;
    public static volatile SingularAttribute<Composante, String> libAd2CmpArb;
    public static volatile CollectionAttribute<Composante, InsAdmEtp> insAdmEtpCollection;
    public static volatile SingularAttribute<Composante, String> codNatCmp;
    public static volatile SingularAttribute<Composante, Short> numOrdCmp;
    public static volatile SingularAttribute<Composante, BigDecimal> surCmpVer;
    public static volatile SingularAttribute<Composante, String> libAd2Cmp;
    public static volatile SingularAttribute<Composante, String> codCoSig;
    public static volatile SingularAttribute<Composante, String> temEnSveCmp;
    public static volatile SingularAttribute<Composante, BigDecimal> surCmpCou;
    public static volatile SingularAttribute<Composante, String> libCmtCmp;
    public static volatile SingularAttribute<Composante, String> libTtr;
    public static volatile SingularAttribute<Composante, byte[]> logoCmp;
    public static volatile SingularAttribute<Composante, String> libCmpArb;
    public static volatile SingularAttribute<Composante, TypComposante> codTpc;
    public static volatile SingularAttribute<Composante, String> temElcCmp;
    public static volatile SingularAttribute<Composante, String> libAd1CmpArb;
    public static volatile SingularAttribute<Composante, BigDecimal> surCmpLib;
    public static volatile SingularAttribute<Composante, String> libAd3Cmp;

}