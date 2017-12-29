package com.soshs.restappo.entity;

import com.soshs.restappo.entity.ElementPedagogi;
import com.soshs.restappo.entity.VersionDiplome;
import com.soshs.restappo.entity.VersionEtape;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:12")
@StaticMetamodel(ConfigMention.class)
public class ConfigMention_ { 

    public static volatile SingularAttribute<ConfigMention, String> temEnSveCfm;
    public static volatile SingularAttribute<ConfigMention, String> temThsCfm;
    public static volatile SingularAttribute<ConfigMention, String> licCfm;
    public static volatile SingularAttribute<ConfigMention, String> libCfm;
    public static volatile CollectionAttribute<ConfigMention, ElementPedagogi> elementPedagogiCollection;
    public static volatile SingularAttribute<ConfigMention, String> codCfm;
    public static volatile CollectionAttribute<ConfigMention, VersionDiplome> versionDiplomeCollection;
    public static volatile CollectionAttribute<ConfigMention, VersionEtape> versionEtapeCollection;
    public static volatile SingularAttribute<ConfigMention, String> temDel;

}