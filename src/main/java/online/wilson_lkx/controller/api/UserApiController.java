package online.wilson_lkx.controller.api;

import online.wilson_lkx.model.Role;
import online.wilson_lkx.model.UserRole;
import online.wilson_lkx.repository.RoleRepository;
import online.wilson_lkx.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserApiController {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    @GetMapping("/role")
    public ResponseEntity login(
            @RequestParam("userId") int userId
    ) {
        UserRole userRole = userRoleRepository.getUserRoleByUserId(userId);
        Role role = roleRepository.getRoleById(userRole.getRoleId());
        return new ResponseEntity(role, HttpStatus.OK);
    }
}
