package introsde.finalproject.rest.ss.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import introsde.finalproject.soap.ws.People;
import introsde.finalproject.soap.ws.Person;

public class DoctorResource {
	@Context
    UriInfo uriInfo;
    @Context
    Request request;
    int idDoctor;
    private People people = null;

    EntityManager entityManager; // only used if the application is deployed in a Java EE container

    public DoctorResource(UriInfo uriInfo, Request request,int id, EntityManager em) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.idDoctor = id;
        this.entityManager = em;
    }

    public DoctorResource(UriInfo uriInfo, Request request,int id, People people) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.idDoctor = id;
        this.people = people;
    }
	
	
    @GET
    @Path("/patients")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getPersonByDoctor() {
    	System.out.println("getPersonByDoctor: Reading Patient...");
    	List<Person> result = people.getPersonByDoctor(this.idDoctor);
    	return Response.ok(result).build();
    }
    
    
}
