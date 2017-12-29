package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Diplome;
import com.soshs.restappo.entity.NiveauFormation;
import com.soshs.restappo.entity.TypDiplomeSise;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(TypDiplome.class)
public class TypDiplome_ { 

    public static volatile SingularAttribute<TypDiplome, TypDiplomeSise> codTds;
    public static volatile SingularAttribute<TypDiplome, String> libTpd;
    public static volatile SingularAttribute<TypDiplome, String> licTpd;
    public static volatile SingularAttribute<TypDiplome, String> etaThsHdrDrt;
    public static volatile SingularAttribute<TypDiplome, String> codTpdSis;
    public static volatile SingularAttribute<TypDiplome, String> temEnqSisTpd;
    public static volatile SingularAttribute<TypDiplome, String> temEnSveTpd;
    public static volatile CollectionAttribute<TypDiplome, Diplome> diplomeCollection;
    public static volatile SingularAttribute<TypDiplome, String> temSante;
    public static volatile SingularAttribute<TypDiplome, NiveauFormation> codNif;
    public static volatile SingularAttribute<TypDiplome, String> codTpdEtb;
    public static volatile SingularAttribute<TypDiplome, String> temNatEur;

}