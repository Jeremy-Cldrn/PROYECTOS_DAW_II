package pe.edu.cibertec.demofeignclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.User;
import pe.edu.cibertec.demofeignclient.service.UseService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user-client")
@RestController
public class UserController {
    private final UseService useService;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(useService.getUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        return ResponseEntity.ok(useService.getUserById(id));
    }
}
