package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

	@Inject
	GreetingService greetingService;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingService.message();
    }
}