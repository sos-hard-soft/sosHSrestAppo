package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Droit;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(NivRegroup.class)
public class NivRegroup_ { 

    public static volatile SingularAttribute<NivRegroup, String> codNrg;
    public static volatile SingularAttribute<NivRegroup, String> lim2Nrg;
    public static volatile CollectionAttribute<NivRegroup, Droit> droitCollection;
    public static volatile SingularAttribute<NivRegroup, String> lim1Nrg;
    public static volatile SingularAttribute<NivRegroup, String> temEnSveNrg;
    public static volatile SingularAttribute<NivRegroup, String> libWebNrg;
    public static volatile SingularAttribute<NivRegroup, String> licNrg;
    public static volatile SingularAttribute<NivRegroup, String> libNrg;

}