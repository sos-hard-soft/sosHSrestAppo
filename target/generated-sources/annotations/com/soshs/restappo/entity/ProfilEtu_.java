package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.InsAdmAnu;
import com.soshs.restappo.entity.InsAdmEtp;
import com.soshs.restappo.entity.PrgEchange;
import com.soshs.restappo.entity.StatutEtu;
import com.soshs.restappo.entity.TypEtb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(ProfilEtu.class)
public class ProfilEtu_ { 

    public static volatile CollectionAttribute<ProfilEtu, Etablissement> etablissementCollection1;
    public static volatile SingularAttribute<ProfilEtu, String> licPru;
    public static volatile CollectionAttribute<ProfilEtu, StatutEtu> statutEtuCollection;
    public static volatile CollectionAttribute<ProfilEtu, InsAdmEtp> insAdmEtpCollection;
    public static volatile CollectionAttribute<ProfilEtu, TypEtb> typEtbCollection1;
    public static volatile SingularAttribute<ProfilEtu, String> temPecMinPru;
    public static volatile SingularAttribute<ProfilEtu, String> lim2Pru;
    public static volatile SingularAttribute<ProfilEtu, String> lix3Pru;
    public static volatile SingularAttribute<ProfilEtu, String> temEnSvePru;
    public static volatile SingularAttribute<ProfilEtu, String> lix1Pru;
    public static volatile CollectionAttribute<ProfilEtu, InsAdmAnu> insAdmAnuCollection;
    public static volatile SingularAttribute<ProfilEtu, String> codPru;
    public static volatile SingularAttribute<ProfilEtu, Short> numOrdPru;
    public static volatile SingularAttribute<ProfilEtu, String> libWebPru;
    public static volatile CollectionAttribute<ProfilEtu, PrgEchange> prgEchangeCollection;
    public static volatile SingularAttribute<ProfilEtu, String> libPru;
    public static volatile SingularAttribute<ProfilEtu, String> temTypEtpPru;
    public static volatile SingularAttribute<ProfilEtu, String> lim3Pru;
    public static volatile SingularAttribute<ProfilEtu, String> lim1Pru;
    public static volatile CollectionAttribute<ProfilEtu, Etablissement> etablissementCollection;
    public static volatile SingularAttribute<ProfilEtu, String> lix4Pru;
    public static volatile SingularAttribute<ProfilEtu, String> temDel;
    public static volatile SingularAttribute<ProfilEtu, String> lix2Pru;
    public static volatile SingularAttribute<ProfilEtu, String> temSpePru;
    public static volatile SingularAttribute<ProfilEtu, String> temMinPru;
    public static volatile CollectionAttribute<ProfilEtu, TypEtb> typEtbCollection;

}