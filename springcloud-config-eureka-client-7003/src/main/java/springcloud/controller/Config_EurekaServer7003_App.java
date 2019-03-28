package springcloud.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Config_EurekaServer7003_App {

    public static void main(String[] args) {
        SpringApplication.run(Config_EurekaServer7003_App.class, args);
    }

}
