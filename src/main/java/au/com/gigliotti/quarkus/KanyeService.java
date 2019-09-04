package au.com.gigliotti.quarkus;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
@RegisterRestClient
@Consumes("application/json")
public interface KanyeService {

    @GET
    @ClientHeaderParam(name="User-Agent", value="curl/7.54.0")
    KanyeQuote getRandomQuote();

    @GET
    @ClientHeaderParam(name="User-Agent", value="curl/7.54.0")
    Response getYo();
}
