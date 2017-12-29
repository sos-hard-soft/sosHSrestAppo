package com.soshs.restappo.entity;

import com.soshs.restappo.entity.BureauDis;
import com.soshs.restappo.entity.CentreGestion;
import com.soshs.restappo.entity.CentrePayeur;
import com.soshs.restappo.entity.ComBdiPK;
import com.soshs.restappo.entity.Commune;
import com.soshs.restappo.entity.Composante;
import com.soshs.restappo.entity.Cpam;
import com.soshs.restappo.entity.Etablissement;
import com.soshs.restappo.entity.Mutuelle;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(ComBdi.class)
public class ComBdi_ { 

    public static volatile SingularAttribute<ComBdi, String> libAch;
    public static volatile SingularAttribute<ComBdi, String> etaPtcAch;
    public static volatile SingularAttribute<ComBdi, String> temEnSveCbd;
    public static volatile CollectionAttribute<ComBdi, Composante> composanteCollection;
    public static volatile CollectionAttribute<ComBdi, CentrePayeur> centrePayeurCollection;
    public static volatile SingularAttribute<ComBdi, Commune> commune;
    public static volatile SingularAttribute<ComBdi, String> etaPtcLoc;
    public static volatile SingularAttribute<ComBdi, String> codFicCbd;
    public static volatile SingularAttribute<ComBdi, ComBdiPK> comBdiPK;
    public static volatile CollectionAttribute<ComBdi, Cpam> cpamCollection;
    public static volatile CollectionAttribute<ComBdi, Etablissement> etablissementCollection;
    public static volatile CollectionAttribute<ComBdi, CentreGestion> centreGestionCollection;
    public static volatile SingularAttribute<ComBdi, BureauDis> bureauDis;
    public static volatile CollectionAttribute<ComBdi, Mutuelle> mutuelleCollection;

}