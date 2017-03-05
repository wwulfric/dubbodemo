package api;

import java.util.List;

/**
 * Created by haidao on 05/03/2017.
 */
public interface PermissionService {
    List<String> getPermissions(Long id);
}
