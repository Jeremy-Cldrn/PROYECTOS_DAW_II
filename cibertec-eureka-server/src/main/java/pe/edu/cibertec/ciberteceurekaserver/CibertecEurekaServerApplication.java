package pe.edu.cibertec.ciberteceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CibertecEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CibertecEurekaServerApplication.class, args);
    }

}
