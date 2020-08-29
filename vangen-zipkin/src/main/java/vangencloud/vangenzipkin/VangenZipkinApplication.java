package vangencloud.vangenzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class VangenZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(VangenZipkinApplication.class, args);
    }

}
