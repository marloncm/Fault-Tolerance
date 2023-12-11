package com.servicos;

import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(configKey = "serviceb-client")
public interface ServiceBClient {

    @GET
    @Path("/serviceb")
    String callServiceB();
}