package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by chenyong on 2017-09-21.
 */

@RefreshScope
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationClass {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationClass.class);

    }
}
