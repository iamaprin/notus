package io.vilya.notus.rest;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhukuanxin
 * @time 2017年5月21日 下午8:32:31
 */
@Path("account")
@Produces(MediaType.APPLICATION_JSON)
public class AccountResource implements ExceptionMapper<AccountNotFoundException> {
    
    private static final Logger LOG = LoggerFactory.getLogger(AccountResource.class);
    
    @Context
    private Request request;
    
    private List<Account> accounts;
    
    private Executor executor;
    
    public AccountResource() {
        accounts = new ArrayList<>();
        
        Account vilya = new Account();
        vilya.setUsername("vilya");
        vilya.setPassword("1");
        accounts.add(vilya);
        
        Account nenya = new Account();
        nenya.setUsername("nenya");
        nenya.setPassword("2");
        accounts.add(nenya);
        
        executor = Executors.newSingleThreadExecutor();
    }
    
    @GET
    public List<Account> list() {
        return accounts;
    }
    
    @GET
    @Path("{id}")
    public Account get(@PathParam("id") int id) {
        Account account;
        try {
            account = accounts.get(id);
        } catch (Exception e) {
            throw new AccountNotFoundException(id);
        }
        
        return account;
    }
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_XML)
    public Account getByQuery(@QueryParam("id") int id) {
        return accounts.get(id);        // uncheck index
    }
    
    @GET
    @Path("async")
    public void getByAsync(@Suspended final AsyncResponse ar) {
        executor.execute(() -> {
            ar.resume(accounts);
        });
    }

    @Override
    public Response toResponse(AccountNotFoundException exception) {
        return Response.status(Response
                .Status.NOT_FOUND)
                .entity("Response not found.")
                .build();
    }

    
}
