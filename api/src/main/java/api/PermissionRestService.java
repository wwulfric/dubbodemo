package api;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.validation.constraints.Min;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by haidao on 06/03/2017.
 */
@Path("permissions")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface PermissionRestService {
    @GET
    @Path("{id : \\d+}")
    List<String> getPermissions(@PathParam("id") @Min(value = 1L, message = "User ID must be greater than 1") Long id);
}
