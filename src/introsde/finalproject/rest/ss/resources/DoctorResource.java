package introsde.finalproject.rest.ss.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import introsde.finalproject.soap.ws.Doctor;
import introsde.finalproject.soap.ws.People;
import introsde.finalproject.soap.ws.Person;

public class DoctorResource {
	@Context
    UriInfo uriInfo;
    @Context
    Request request;
    int idDoctor;
    private People people = null;

    public DoctorResource(UriInfo uriInfo, Request request,int id) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.idDoctor = id;
    }

    public DoctorResource(UriInfo uriInfo, Request request,int id, People people) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.idDoctor = id;
        this.people = people;
    }
	
    private String errorMessage(){
    	return "{ \n \"error\" : \"Error in LocalDatabaseService\"}";
    }
    
    private String errorMessage(Exception e){
    	return "{ \n \"error\" : \"Error in Storage Services, due to the exception: "+e+"\"}";
    }
    
    private String notFoundMessage(String name, int id){
    	return "{ \n \"error\" : \""+ name +" with " + id + " not found\" \n }";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDoctor() {
    	try{
    	System.out.println("get: Reading Doctor...");
    	Doctor doctor = people.getDoctor(this.idDoctor);
    	if (doctor == null)
    		return Response.status(Response.Status.NOT_FOUND)
    				.entity(notFoundMessage("Doctor", this.idDoctor)).build();
    	else{
    		System.out.println("Doctor: "+doctor.getIdDoctor()+" "+doctor.getLastname());
    		return Response.ok(doctor).build();
    	}
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    	
    }
	
    @PUT
    @Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Produces(MediaType.APPLICATION_JSON )
	public Response updateDoctor(Doctor doctor) {
    	try{
    	System.out.println("updateDoctor: Updating doctor with id: "+this.idDoctor);
    	doctor.setIdDoctor(this.idDoctor);
        int result = people.updateDoctor(doctor);    
        if (result >= 0)
        	return Response.ok(result).build();
        else if (result == -2)
        	return Response.status(Response.Status.NOT_FOUND)
    				.entity(notFoundMessage("Doctor", this.idDoctor)).build();
        else
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage()).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
    
    @DELETE
    @Produces( MediaType.APPLICATION_JSON )
    public Response deleteDoctor() {
    	try{
    	System.out.println("deteteDoctor: Deleting doctor with id: "+ this.idDoctor);
        int result = people.deleteDoctor(this.idDoctor);
        if (result == -1)
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage()).build();
        else if (result == -2)
        	return Response.status(Response.Status.NOT_FOUND)
    				.entity(notFoundMessage("Doctor", this.idDoctor)).build();
        else
        	return Response.status(Response.Status.NO_CONTENT).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
    
    @GET
    @Path("/patients")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getPersonByDoctor() {
    	try{
    	System.out.println("getPersonByDoctor: Reading Patient...");
    	List<Person> result = people.getPersonByDoctor(this.idDoctor);
    	return Response.ok(result).build();
    	}catch(Exception e){
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
    
}
