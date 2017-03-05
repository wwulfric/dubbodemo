package provider;

import api.PermissionService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haidao on 05/03/2017.
 */
public class PermissionServiceImpl implements PermissionService {
    public List<String> getPermissions(final Long id) {
        // 该函数应该实现 getPermissions 的业务逻辑，这里简单返回一个 list
        List<String> permissions = new ArrayList<String>() {{
            add(String.format("Permission_%d", id - 1));
            add(String.format("Permission_%d", id));
            add(String.format("Permission_%d", id + 1));
        }};
        return permissions;
    }
}
