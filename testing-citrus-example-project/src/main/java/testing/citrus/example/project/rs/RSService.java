package testing.citrus.example.project.rs;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Resource
public class RSService {
    
    @POST @Path("/TrainingCitrus")
    public Response testSend(String body) {
        return null;
    }

}
