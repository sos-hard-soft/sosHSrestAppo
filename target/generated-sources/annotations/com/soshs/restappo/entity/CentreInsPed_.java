package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Composante;
import com.soshs.restappo.entity.ElementPedagogi;
import com.soshs.restappo.entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(CentreInsPed.class)
public class CentreInsPed_ { 

    public static volatile CollectionAttribute<CentreInsPed, Utilisateur> utilisateurCollection;
    public static volatile SingularAttribute<CentreInsPed, String> temEnSveCip;
    public static volatile CollectionAttribute<CentreInsPed, Composante> composanteCollection;
    public static volatile SingularAttribute<CentreInsPed, String> libCip;
    public static volatile SingularAttribute<CentreInsPed, String> licCip;
    public static volatile CollectionAttribute<CentreInsPed, ElementPedagogi> elementPedagogiCollection;
    public static volatile SingularAttribute<CentreInsPed, String> codCip;

}