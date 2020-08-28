package vangencloud.vangenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VangenServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VangenServiceApplication.class, args);
    }

}
