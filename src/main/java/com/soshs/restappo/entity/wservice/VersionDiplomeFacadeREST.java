/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.restappo.entity.wservice;

import com.soshs.restappo.entity.VersionDiplome;
import com.soshs.restappo.entity.VersionDiplomePK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author docFSJES
 */
@Stateless
@Path("com.soshs.restappo.entity.versiondiplome")
public class VersionDiplomeFacadeREST extends AbstractFacade<VersionDiplome> {

    @PersistenceContext(unitName = "com.soshs_sosHSrestAppo_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private VersionDiplomePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codDip=codDipValue;codVrsVdi=codVrsVdiValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.soshs.restappo.entity.VersionDiplomePK key = new com.soshs.restappo.entity.VersionDiplomePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codDip = map.get("codDip");
        if (codDip != null && !codDip.isEmpty()) {
            key.setCodDip(codDip.get(0));
        }
        java.util.List<String> codVrsVdi = map.get("codVrsVdi");
        if (codVrsVdi != null && !codVrsVdi.isEmpty()) {
            key.setCodVrsVdi(new java.lang.Short(codVrsVdi.get(0)));
        }
        return key;
    }

    public VersionDiplomeFacadeREST() {
        super(VersionDiplome.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(VersionDiplome entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, VersionDiplome entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.soshs.restappo.entity.VersionDiplomePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public VersionDiplome find(@PathParam("id") PathSegment id) {
        com.soshs.restappo.entity.VersionDiplomePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<VersionDiplome> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<VersionDiplome> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
