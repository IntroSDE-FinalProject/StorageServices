package introsde.finalproject.rest.ss.resources;
import introsde.finalproject.soap.ws.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import javax.ejb.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.glassfish.jersey.client.ClientConfig;

@Stateless // will work only inside a Java EE application
@LocalBean // will work only inside a Java EE application
@Path("/services")
public class CollectionAdapterServiceResource {

    // Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    Response response_motivation;
    
    private URL url = null;
	private Service service = null;
	private People people = null;
	private QName qname = null;
	
	public CollectionAdapterServiceResource() throws MalformedURLException{
		String input_url = "https://lds-hidden-taiga-5842.herokuapp.com/ws/people?wsdl"; //LocalDatabaseService
		//String input_url = "http://127.0.1.1:6902/ws/people?wsdl";
		url = new URL(input_url);
		//1st argument service URI, refer to wsdl document above
		//2nd argument is service name, refer to wsdl document above
		qname = new QName("http://ws.soap.finalproject.introsde/", "PeopleService");
		service = Service.create(url, qname);

		people = service.getPort(People.class);
	}
    
	private String errorMessage(Exception e){
    	return "{ \n \"error\" : \"Error in Adapter Services, due to the exception: "+e+"\"}";
    }
	
	private String externalErrorMessage(String e){
    	return "{ \n \"error\" : \"Error in External services, due to the exception: "+e+"\"}";
    }
	
	
	/**
	 * This method is used to create URI used to connect the cliet to the server
	 * passed as String in the param
	 * 
	 * @param conn the connection string of the server
	 * @return 
	 */
	private static URI getBaseURI() {
		String conn = "https://as-enigmatic-journey-9195.herokuapp.com/sdelab/person";
		return UriBuilder.fromUri(conn).build(); //my server
	}
	
	
	@GET
	@Path("/quote")
	@Produces( MediaType.TEXT_PLAIN )
	public Response getQuote() {
		try{
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget service = client.target(getBaseURI());
		//this.service = service;
		System.out.println("Inside the method getSuggestion()");
		
		
		String randomChuck = "/motivation";
        System.out.println("Service to string" + service.toString());
        Response response_motivation = service.path(randomChuck).request().accept(MediaType.TEXT_PLAIN_TYPE).get(Response.class);
        System.out.print("Response: " + response_motivation);
	
        //AS ---> Response.status(Response.Status.INTERNAL_SERVER_ERROR)
		//.entity("Error AS").build();
        
        String jsonGetRandom = response_motivation.readEntity(String.class);
        if(response_motivation.getStatus() != 200){
        	System.out.println("SS Error response_motivation.getStatus() != 200  ");
         return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(externalErrorMessage(jsonGetRandom)).build();
         
         }else{
        	 return Response.ok(jsonGetRandom).build();
         }
        }catch(Exception e){
        	System.out.println("SS Error catch response_motivation.getStatus() != 200  ");
        	return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
			.entity(errorMessage(e)).build();
        }
        	
		//System.out.println("getPeopleList: Getting list of person...");
		//return Response.ok(people.getPeopleList()).build();
	}
    
	
	
	 /**
     * This method is used to get the current weather data for one location.
     * 
     * 
     * @param city location and nation code for which get current weather data
     * @param metric type of units to use for measure
     * @param json type of return data
     * @return jsonWeather 
     */
    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getWeatherTest(@QueryParam("city") String city, @QueryParam("units") String metric,
    		@QueryParam("mode") String json) {
    	try{
    	//http://127.0.1.1:5700/sdelab/person/weather?city=Trento,it&units=metric&mode=json
    	ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		//WebTarget service_weather = client.target(getBaseURIWeatherTest());
		WebTarget service_weather = client.target("https://as-enigmatic-journey-9195.herokuapp.com/sdelab/person/weather")
				.queryParam("city", city)
				.queryParam("units", metric)
				.queryParam("mode", json);
				
        System.out.println("City: " + city);
        System.out.println("Metric: " + metric);
        System.out.println("mode: " + json);
		System.out.println("Service to string  adding path" + service_weather.toString());
		
		//this.service_weather = service_weather;
		
		System.out.println("Service to string  after this.service_weater adding path" + service_weather.toString());
		
    	//String path = "http://api.openweathermap.org/data/2.5/find?q=Trento,it&units=metric&mode=json&appid=a3dbf2f9a2ab9c24905f3ea44cb9e265";
    	
		Response response_weather = service_weather.request().accept(MediaType.APPLICATION_JSON).get(Response.class);
		System.out.println("response_weather: " + response_weather );
        //System.out.println(weather);
        System.out.println("Service_weather after adding path: " + service_weather.toString());
        
        
        String jsonWeather = response_weather.readEntity(String.class);
        
        if(response_weather.getStatus() != 200){
        	System.out.println("Error in external service");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
       				.entity(externalErrorMessage(jsonWeather)).build();
            }else{
            	System.out.println("jsonWeather: " + jsonWeather );
            	return Response.ok(jsonWeather).build();
            }
    	}catch(Exception e){
    		System.out.print("Error Cath motivation");
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
    }
	
	
    /**
     * This method is used to get weather forecast for 5 days 
     * with data every 3 hours by city name.
     * 
     * 
     * @param city location and nation code for which get forecast weather data
     * @param metric type of units to use for measure
     * @param json type of return data
     * @return jsonWeather
     */
    @GET
    @Path("/forecast")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getForeCast(@QueryParam("city") String city, @QueryParam("units") String metric,
    		@QueryParam("mode") String json) {
    	try{
    	//http://127.0.1.1:5700/sdelab/person/forecast?city=Trento,it&units=metric&mode=json
    	
    	//http://api.openweathermap.org/data/2.5/forecast?q=Trento,it&units=metric&mode=json&appid=2de143494c0b295cca9337e1e96b00e0
    	ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		//WebTarget service = client.target(getBaseURIForecast());
		WebTarget service_forecast = client.target("https://as-enigmatic-journey-9195.herokuapp.com/sdelab/person/forecast")
				.queryParam("city", city)
				.queryParam("units", metric)
				.queryParam("mode", json);
		//this.service_forecast = service;
		
		
        System.out.println("Service to string" + service_forecast.toString());
        Response response_forecast = service_forecast.request().accept(MediaType.APPLICATION_JSON).get(Response.class);
        String jsonForecast = response_forecast.readEntity(String.class);
        
        if(response_forecast.getStatus() != 200){
        	System.out.println("Error in external service");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
       				.entity(externalErrorMessage(jsonForecast)).build();
            }else{
            	System.out.println("jsonGetRandom: " + jsonForecast );
            	return Response.ok(jsonForecast).build();
            }
    	}catch(Exception e){
    		System.out.print("Error Cath motivation");
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
    				.entity(errorMessage(e)).build();
    	}
        
    }
	
	
	
    
}