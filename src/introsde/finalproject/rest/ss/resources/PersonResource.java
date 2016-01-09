package introsde.finalproject.rest.ss.resources;

//import ehealth.model.MeasureDefinition;
import introsde.finalproject.soap.ws.*;

import java.io.IOException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
public class PersonResource {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    int idPerson;
    private People people = null;

    EntityManager entityManager; // only used if the application is deployed in a Java EE container

    public PersonResource(UriInfo uriInfo, Request request,int id, EntityManager em) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.idPerson = id;
        this.entityManager = em;
    }

    public PersonResource(UriInfo uriInfo, Request request,int id, People people) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.idPerson = id;
        this.people = people;
    }

    // Application integration
    
    @GET
    @Produces( MediaType.APPLICATION_JSON )
    public Response getPerson() {
    	System.out.println("getPerson: Reading Person...");
    	Person person = people.getPerson(this.idPerson);
    	if (person == null)
    		return Response.status(Response.Status.NOT_FOUND)
    				.entity("Get: Person with " + this.idPerson + " not found").build();
    	else{
    		System.out.println("Person: "+person.getIdPerson()+" "+person.getLastname());
    		return Response.ok(person).build();
    	}
    }
    
    @PUT
    @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response updatePerson(Person person) {
    	System.out.println("updatePerson: Updating person with id: "+this.idPerson);
    	person.setIdPerson(this.idPerson);
        int result = people.updatePerson(person);    
        if (result >= 0)
        	return Response.ok(result).build();
        else if (result == -2)
        	return Response.status(Response.Status.NOT_FOUND)
    				.entity("Get: Person with " + this.idPerson + " not found").build();
        else
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity("Error in LocalDatabaseService").build();   	
    }
    
    @DELETE
    public Response deletePerson() {
    	System.out.println("detetePerson: Deleting person with id: "+ this.idPerson);
        int result = people.deletePerson(this.idPerson);
        if (result == -1)
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity("Error in LocalDatabaseService").build();
        else if (result == -2)
        	return Response.status(Response.Status.NOT_FOUND)
    				.entity("Get: Person with " + this.idPerson + " not found").build();
        else
        	return Response.status(Response.Status.NO_CONTENT).build();
    }
    
    @GET
    @Path("/vitalsings")
    @Produces( MediaType.APPLICATION_JSON )
    public List<Measure> getVitalSigns() {
    	System.out.println("getVitalSigns: Reading vital signs for idPerson "+ this.idPerson +"...");
    	List<Measure> result = people.getVitalSigns(this.idPerson);
    	return result;
    }
    
    @GET
    @Path("/target")
    @Produces( MediaType.APPLICATION_JSON )
    public List<Target> getTargetList() {
    	System.out.println("getTargetList: Reading targets for idPerson "+ this.idPerson +"...");
    	List<Target> result = people.getTargetList(this.idPerson);
    	return result;
    }
    
   
    @POST
	@Path("/target")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})
    public Response createTarget(Target target){
    	System.out.println("New Target for " + target.getMeasureDefinition().getMeasureName());
        System.out.println("createTarget: Creating new target...");
        int id = this.people.createTarget(target, this.idPerson);
        if(id == -1)
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity("Error in LocalDatabaseService").build();
        else
        	return Response.status(Response.Status.CREATED).entity(id).build();
    }
    
    @PUT
    @Path("/target/{targetId}")
    @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response updateTarget(Target target, @PathParam("targetId") int targetId) {
    	System.out.println("updateTarget: Updating target with id: "+ targetId);
    	target.setIdTarget(targetId);
        int result = people.updateTarget(target);    
        if (result >= 0)
        	return Response.ok(result).build();
        else if (result == -2)
        	return Response.status(Response.Status.NOT_FOUND)
    				.entity("Get: Target with " + targetId + " not found").build();
        else
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity("Error in LocalDatabaseService").build();   	
    }
    
    @DELETE
    @Path("/target/{targetId}")
    public Response deleteTarget(@PathParam("targetId") int targetId) {
    	System.out.println("deteteTarget: Deleting target with id: "+ targetId);
        int result = people.deleteTarget(targetId);
        if (result == -1)
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity("Error in LocalDatabaseService").build();
        else if (result == -2)
        	return Response.status(Response.Status.NOT_FOUND)
    				.entity("Get: Target with " + targetId + " not found").build();
        else
        	return Response.status(Response.Status.NO_CONTENT).build();
    }
    
    @GET
    @Path("/target/{measureDefinitionId}")
    @Produces( MediaType.APPLICATION_JSON )
    public List<Target> getTarget(@PathParam("measureDefinitionId") int measureDefId) {
    	System.out.println("getTarget: Reading target for idPerson = "+ this.idPerson +
    			" and measureDefId = "+measureDefId+"...");
    	List<Target> result = people.getTarget(this.idPerson, measureDefId);
    	return result;
    }
    
}