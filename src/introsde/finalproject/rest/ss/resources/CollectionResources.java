package introsde.finalproject.rest.ss.resources;
import introsde.finalproject.soap.ws.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.ejb.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

@Stateless // will work only inside a Java EE application
@LocalBean // will work only inside a Java EE application
@Path("/")
public class CollectionResources {

    // Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
    
    private URL url = null;
	private Service service = null;
	private People people = null;
	private QName qname = null;
	
	public CollectionResources() throws MalformedURLException{
		String input_url = "https://lds-hidden-taiga-5842.herokuapp.com/ws/people?wsdl"; //LocalDatabaseService
		//String input_url = "http://127.0.1.1:6902/ws/people?wsdl";
		url = new URL(input_url);
		//1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
		qname = new QName("http://ws.soap.finalproject.introsde/", "PeopleService");
		service = Service.create(url, qname);

		people = service.getPort(People.class);
	}
    
	private String errorMessage(){
    	return "{ \n \"error\" : \"Error in LocalDatabaseService\"}";
    }
	
	//***********************Person***********************
	
	@GET
	@Path("person")
	@Produces( MediaType.APPLICATION_JSON )
	public Response getPeopleList() {
		System.out.println("getPeopleList: Getting list of person...");
		return Response.ok(people.getPeopleList()).build();
	}
    
	@POST
	@Path("person")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})  
    public Response createPerson(Person person) throws IOException {
		System.out.println("New Person: "+person.getFirstname()+" "+person.getLastname());
        System.out.println("createPerson: Creating new person...");
        int id = this.people.createPerson(person);
        if(id == -1)
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage()).build();
        else
        	return Response.status(Response.Status.CREATED).entity(id).build();
    }
	
	 /**
     * returns the number of people to get the total number of records
     * @return a string representing the number of people
     */
    @GET
    @Path("person/count")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCount() {
        System.out.println("getCount: Getting count...");
        List<Person> people = this.people.getPeopleList();
        int count = people.size();
        return String.valueOf(count);
    }
    
    /** Defines that the next path parameter after the base url is
    * treated as a parameter and passed to the PersonResources
    * Allows to type http://localhost:599/base_url/1
    * 1 will be treaded as parameter todo and passed to PersonResource
    */
    @Path("person/{personId}")
    public PersonResource getPerson(@PathParam("personId") int id) {
        return new PersonResource(uriInfo, request, id, people);
    }
    
    //***********************Doctor***********************
    
    @POST
	@Path("doctor")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML})  
    public Response createDoctor(Doctor doctor) throws IOException {
		System.out.println("New Doctor: "+doctor.getFirstname()+" "+doctor.getLastname());
        System.out.println("createDoctor: Creating new doctor...");
        int id = this.people.createDoctor(doctor);
        if(id == -1)
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage()).build();
        else
        	return Response.status(Response.Status.CREATED).entity(id).build();
    }
    
    @Path("doctor/{doctorId}")
    public DoctorResource getDoctor(@PathParam("doctorId") int id) {
        return new DoctorResource(uriInfo, request, id, people);
    }
    
    //***********************MeasureDefinition***********************
    
    @GET
    @Path("measureDefinition")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MeasureDefinition> getMeasureDefinition() {
        System.out.println("getMeasureDefinition: Reading measure definitions...");
        List<MeasureDefinition> result = this.people.getMeasureDefinition();
        return result;
    }
    
    //***********************Family***********************
    @GET
    @Path("family/{familyId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Family getFamily(@PathParam("familyId") int id) {
        System.out.println("getFamily: Reading family...");
        Family result = this.people.getFamily(id);
        return result;
    }
    
}