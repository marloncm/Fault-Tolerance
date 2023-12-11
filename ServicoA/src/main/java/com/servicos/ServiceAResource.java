package com.servicos;


import jakarta.ws.rs.*;
import jakarta.inject.Inject;



@Path("/servicea")
public class ServiceAResource {
    @Inject
    ServiceBClient serviceBClient;

    @GET
    @Path("/callServiceB")
    public String callServiceB() {
        return serviceBClient.callServiceB();
    }
}