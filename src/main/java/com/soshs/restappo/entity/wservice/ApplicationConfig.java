/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.restappo.entity.wservice;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author docFSJES
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.soshs.restappo.entity.wservice.AcademieFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.AideFinanciereFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.AnneeUniFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.AssRspCivFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.BourseFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.BureauDisFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CatSocPflFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CentreGestionFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CentreIncompFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CentreInsPedFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CentrePayeurFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ComBdiFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CommuneFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ComposanteFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ConfigMentionFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ConventionFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CpamFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.CycleFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DepartementFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DipAutCurFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DiplomeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DiplomeSiseFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DisciplineSisFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DomaineActPflFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DroitFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.DureeEtapeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ElementPedagogiFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.EpreuveFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.EtablissementFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.EtapeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.EtapeSisFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.FormuleExamenFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.GrpResultatElpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.GrpResultatEprFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.GrpResultatVdiFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.GrpResultatVetFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ImprimanteFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.IndOpiFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.IndividuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.InsAdmAnuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.InsAdmEtpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.InsAdmSitFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.InsInfoAnuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.InsPedagogiAnuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.InsPedagogiEtpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ListeElpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.LseRegroupeElpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.MentionFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.MtfAflSsoFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.MtfNonAflSsoFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.MutuelleFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.NatureDiplomeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.NatureElpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.NatureEprFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.NivRegroupFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.NiveauFormationFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.NiveauInterminiFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.PaysFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.PeriodeAnoFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.PeriodeElpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.PeriodeExaFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.PhoEtuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.PrefixeIntFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.PrgEchangeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ProfilEtuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.QuotiteTraFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.RegimeInsFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.RegimeSsoFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.RegleNumAnoFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ResultatElpFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.ResultatEprFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SecDisSisFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SectionCnuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SignataireFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SitFamFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SitMilFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SitSocialeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SituationSiseFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SpeCaracteriseVdiFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SpecialiteFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.SpoHauNivFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.StatutEtuFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TeleEnseignementModeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypComposanteFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypDiplomeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypDiplomeSiseFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypDroitFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypEpreuveFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypEtbFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypHandicapFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypHebergementFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypResultatFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.TypUtilisateurFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.UtilisateurFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.VersionDiplomeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.VersionEtapeFacadeREST.class);
        resources.add(com.soshs.restappo.entity.wservice.VersionModeleDipFacadeREST.class);
    }
    
}
