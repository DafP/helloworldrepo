package com.example.helloworld;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Path("/get-person")
    public String sayHello(@QueryParam("name") String name) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<String> hands = new ArrayList<>();
        hands.add("left");
        hands.add("right");

        Person matt = new Person(name, 24, hands);
        Person daf = new Person("Daf",24, hands);

        List<Person> people = new ArrayList<>();
        people.add(matt);
        people.add(daf);

        return mapper.writeValueAsString(people);

    }

    @POST
    @Path("/create-person")
    public Collection<Person> sayHello(List<Person> person) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return person;

    }



}