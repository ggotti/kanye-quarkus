package au.com.gigliotti.quarkus;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Path("/quote")
@ApplicationScoped
public class VoteKanyeResource {
    @Inject
    @RestClient
    KanyeService quoteService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public CompletionStage<String> quote() {
        return CompletableFuture.supplyAsync(() -> quoteService.getRandomQuote().getQuote());
    }
}
