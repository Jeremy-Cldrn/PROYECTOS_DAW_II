package pe.edu.cibertec.cibertecconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CibertecConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CibertecConfigServerApplication.class, args);
    }

}
