package consumer;

import api.PermissionRestService;
import api.PermissionService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by haidao on 06/03/2017.
 */
public class DemoConsumer {
    public static void main(String[] args) {
        // 测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        // dubbo 协议
        PermissionService permissionService = context.getBean(PermissionService.class);
        System.out.println(permissionService.getPermissions(1L));
        // rest 规范
        PermissionRestService permissionRestService = context.getBean(PermissionRestService.class);
        System.out.println(permissionRestService.getPermissions(2L));
    }
}
