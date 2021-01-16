package org.pensatocode.sample;

import org.pensatocode.sample.entities.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces("application/json")
    public Response sayHello() {
        String hello = "Hello world!";
        return Response.ok(hello).build();
    }

    @GET
    @Path("/{name}")
    @Produces("application/json")
    public Response sayHello(@PathParam("name") String name) {
        Person person = new Person(name);
        return Response.ok().entity(person).build();
    }

}
