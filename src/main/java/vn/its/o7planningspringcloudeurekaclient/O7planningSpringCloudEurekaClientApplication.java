package vn.its.o7planningspringcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class O7planningSpringCloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(O7planningSpringCloudEurekaClientApplication.class, args);
    }
}
