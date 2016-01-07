package introsde.finalproject.rest.ss.resources;
import introsde.finalproject.soap.ws.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
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
    
    // will work only inside a Java EE application
    @PersistenceUnit(unitName="introsde-jpa")
    EntityManager entityManager;

    // will work only inside a Java EE application
    @PersistenceContext(unitName = "introsde-jpa",type=PersistenceContextType.TRANSACTION)
    private EntityManagerFactory entityManagerFactory;
    
    private URL url = null;
	private Service service = null;
	private People people = null;
	private QName qname = null;
	
	public CollectionResources() throws MalformedURLException{
		String input_url = "https://lds-hidden-taiga-5842.herokuapp.com/ws/people?wsdl";
		url = new URL(input_url);
		//1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
		qname = new QName("http://ws.soap.finalproject.introsde/", "PeopleService");
		service = Service.create(url, qname);

		people = service.getPort(People.class);
	}
    
    
	 /**
     * returns the number of people to get the total number of records
     * @return a string representing the number of people
     */
    @GET
    @Path("person/count")
    @Produces(MediaType.TEXT_PLAIN)
    public String getCount() {
        System.out.println("Getting count...");
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
    
    @Path("doctor/{doctorId}")
    public DoctorResource getDoctor(@PathParam("doctorId") int id) {
        return new DoctorResource(uriInfo, request, id, people);
    }
}