package provider;

import java.io.IOException;

/**
 * Created by haidao on 05/03/2017.
 */
public class DemoProvider {
    public static void main(String[] args) throws IOException {
        // 如果 spring 配置文件的位置是默认的，则可以直接这样启动服务
        com.alibaba.dubbo.container.Main.main(args);
    }
}
