package pe.edu.cibertec.demofeignclient.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.iclient.UserClient;
import pe.edu.cibertec.demofeignclient.restclient.placeholder.model.User;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UseService {
    private final UserClient userClient;

    public List<User> getUsers() {
        return userClient.getUsers();
    }

    public User getUserById(Integer id) {
        return userClient.getUserById(id, "");
    }
}
