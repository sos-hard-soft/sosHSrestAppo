package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Epreuve;
import com.soshs.restappo.entity.PeriodeExa;
import com.soshs.restappo.entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(CentreIncomp.class)
public class CentreIncomp_ { 

    public static volatile CollectionAttribute<CentreIncomp, Utilisateur> utilisateurCollection;
    public static volatile SingularAttribute<CentreIncomp, Short> hhCin;
    public static volatile SingularAttribute<CentreIncomp, String> libCin;
    public static volatile CollectionAttribute<CentreIncomp, Epreuve> epreuveCollection;
    public static volatile SingularAttribute<CentreIncomp, String> temEnSveCin;
    public static volatile SingularAttribute<CentreIncomp, String> codTriEtuCin;
    public static volatile SingularAttribute<CentreIncomp, String> codCin;
    public static volatile SingularAttribute<CentreIncomp, Short> mmCin;
    public static volatile CollectionAttribute<CentreIncomp, PeriodeExa> periodeExaCollection;

}