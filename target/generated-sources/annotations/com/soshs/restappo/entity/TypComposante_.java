package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Composante;
import com.soshs.restappo.entity.SituationSise;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(TypComposante.class)
public class TypComposante_ { 

    public static volatile SingularAttribute<TypComposante, String> libTpc;
    public static volatile CollectionAttribute<TypComposante, Composante> composanteCollection;
    public static volatile SingularAttribute<TypComposante, String> codTpc;
    public static volatile SingularAttribute<TypComposante, String> temEnSveTpc;
    public static volatile SingularAttribute<TypComposante, SituationSise> codSis;

}