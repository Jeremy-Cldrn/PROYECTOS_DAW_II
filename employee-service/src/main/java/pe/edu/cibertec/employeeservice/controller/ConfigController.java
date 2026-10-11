package pe.edu.cibertec.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${messages.error-database}")
    private String errorDatabaseMsg;

    @GetMapping("/mesagge-error")
    public String errorDatabaseMsg() {
        return "Mensaje del Config-Server "  +errorDatabaseMsg;
    }



}
