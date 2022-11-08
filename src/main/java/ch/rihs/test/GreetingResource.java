package ch.rihs.test;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import org.eclipse.microprofile.openapi.annotations.media.Content;

@Path("/hello")
public class GreetingResource {

    @GET
    // @Produces(MediaType.TEXT_PLAIN)
    public List<BlogEntity> hello() {
        return BlogEntity.listAll();
    }

    @Transactional
    @POST
    @RequestBody(content = @Content(mediaType = "application/json"))
    public void addPost(BlogEntity blogEntity) {
        blogEntity.persist();
    }
}