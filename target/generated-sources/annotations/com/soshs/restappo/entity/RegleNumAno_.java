package com.soshs.restappo.entity;

import com.soshs.restappo.entity.PeriodeAno;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(RegleNumAno.class)
public class RegleNumAno_ { 

    public static volatile SingularAttribute<RegleNumAno, String> libRna;
    public static volatile SingularAttribute<RegleNumAno, Integer> numDeb;
    public static volatile SingularAttribute<RegleNumAno, String> temEnSveRna;
    public static volatile SingularAttribute<RegleNumAno, String> codRnaExt;
    public static volatile CollectionAttribute<RegleNumAno, PeriodeAno> periodeAnoCollection;
    public static volatile SingularAttribute<RegleNumAno, Integer> codRna;
    public static volatile SingularAttribute<RegleNumAno, String> modRna;
    public static volatile SingularAttribute<RegleNumAno, String> temNumDeb;
    public static volatile SingularAttribute<RegleNumAno, String> temPrefRe;

}