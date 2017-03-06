package api;

import javax.validation.constraints.Min;
import java.util.List;

/**
 * Created by haidao on 06/03/2017.
 */
public interface PermissionRestService {
    List<String> getPermissions(@Min(value = 1L, message = "User ID must be greater than 1") Long id);
}
