package online.wilson_lkx.controller.api;

import online.wilson_lkx.model.User;
import online.wilson_lkx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginApiController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity login(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) throws NoSuchAlgorithmException {

        User user = userRepository.getUser(email, password);
        if(user != null) {
            user.setPassword("");
            user.setSalt("");
        } else {
            user = new User();
            user.setId(0);
            user.setEmail("");
            user.setPassword("");
            user.setSalt("");
        }

        return new ResponseEntity(user, HttpStatus.OK);
    }
}
