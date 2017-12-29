package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Diplome;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(NatureDiplome.class)
public class NatureDiplome_ { 

    public static volatile SingularAttribute<NatureDiplome, String> codNdi;
    public static volatile SingularAttribute<NatureDiplome, Short> codPriNdi;
    public static volatile CollectionAttribute<NatureDiplome, Diplome> diplomeCollection;
    public static volatile SingularAttribute<NatureDiplome, String> temEnSveNdi;
    public static volatile SingularAttribute<NatureDiplome, String> temDel;
    public static volatile SingularAttribute<NatureDiplome, String> licNdi;
    public static volatile SingularAttribute<NatureDiplome, String> libNdi;

}