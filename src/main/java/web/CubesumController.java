package web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.CubesumService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by carrio1 on 1/30/17.
 */
@EnableAsync
@Controller("cubesumController")
@Path("/")
public class CubesumController {

    private static final Logger log = LoggerFactory.getLogger(CubesumController.class);

    @Autowired
    private CubesumService cubesumService;

    @PUT
    @Path("/update/")
    @Produces (MediaType.APPLICATION_JSON + ";charset=utf-8")
    public String getCubeUpdate(@QueryParam("x") int x,
                                @QueryParam("y") int y,
                                @QueryParam("z") int z,
                                @QueryParam("value") int value) {

        log.debug("Updating value...");

        return cubesumService.getCubeUpdate(x, y, z, value);
    }

    @GET
    @Path("/query/")
    @Produces (MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Integer getCubeQuery(@QueryParam("x1") int x1,
                                @QueryParam("y1") int y1,
                                @QueryParam("z1") int z1,
                                @QueryParam("x2") int x2,
                                @QueryParam("y2") int y2,
                                @QueryParam("z2") int z2) {

        log.debug("Processing Query...");

        return cubesumService.getCubeQuery(x1, y1, z1, x2, y2, z2);

    }

}
