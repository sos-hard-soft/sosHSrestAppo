package com.soshs.restappo.entity;

import com.soshs.restappo.entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-29T14:09:11")
@StaticMetamodel(TypUtilisateur.class)
public class TypUtilisateur_ { 

    public static volatile CollectionAttribute<TypUtilisateur, Utilisateur> utilisateurCollection;
    public static volatile SingularAttribute<TypUtilisateur, String> codTut;
    public static volatile SingularAttribute<TypUtilisateur, String> temCofNot;
    public static volatile SingularAttribute<TypUtilisateur, String> libCmtTut;
    public static volatile SingularAttribute<TypUtilisateur, String> libTut;

}