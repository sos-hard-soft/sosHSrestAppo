package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ElementPedagogi;
import com.soshs.restappo.entity.Epreuve;
import com.soshs.restappo.entity.RegleNumAno;
import com.soshs.restappo.entity.VersionDiplome;
import com.soshs.restappo.entity.VersionEtape;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(PeriodeAno.class)
public class PeriodeAno_ { 

    public static volatile CollectionAttribute<PeriodeAno, VersionEtape> versionEtapeCollection;
    public static volatile CollectionAttribute<PeriodeAno, Epreuve> epreuveCollection3;
    public static volatile CollectionAttribute<PeriodeAno, Epreuve> epreuveCollection2;
    public static volatile CollectionAttribute<PeriodeAno, Epreuve> epreuveCollection1;
    public static volatile SingularAttribute<PeriodeAno, String> temEnSvePan;
    public static volatile CollectionAttribute<PeriodeAno, VersionDiplome> versionDiplomeCollection2;
    public static volatile CollectionAttribute<PeriodeAno, VersionEtape> versionEtapeCollection2;
    public static volatile CollectionAttribute<PeriodeAno, VersionDiplome> versionDiplomeCollection3;
    public static volatile CollectionAttribute<PeriodeAno, VersionEtape> versionEtapeCollection1;
    public static volatile CollectionAttribute<PeriodeAno, VersionDiplome> versionDiplomeCollection1;
    public static volatile CollectionAttribute<PeriodeAno, VersionEtape> versionEtapeCollection3;
    public static volatile CollectionAttribute<PeriodeAno, ElementPedagogi> elementPedagogiCollection1;
    public static volatile CollectionAttribute<PeriodeAno, ElementPedagogi> elementPedagogiCollection2;
    public static volatile CollectionAttribute<PeriodeAno, ElementPedagogi> elementPedagogiCollection;
    public static volatile CollectionAttribute<PeriodeAno, ElementPedagogi> elementPedagogiCollection3;
    public static volatile CollectionAttribute<PeriodeAno, Epreuve> epreuveCollection;
    public static volatile SingularAttribute<PeriodeAno, RegleNumAno> codRna;
    public static volatile SingularAttribute<PeriodeAno, String> libPan;
    public static volatile CollectionAttribute<PeriodeAno, VersionDiplome> versionDiplomeCollection;
    public static volatile SingularAttribute<PeriodeAno, String> codPan;

}