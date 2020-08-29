package vangencloud.vangenconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
public class VangenConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(VangenConfigApplication.class, args);
    }

}
