package online.wilson_lkx.controller.api;

import online.wilson_lkx.model.Role;
import online.wilson_lkx.model.UserInfo;
import online.wilson_lkx.model.UserRole;
import online.wilson_lkx.repository.RoleRepository;
import online.wilson_lkx.repository.UserInfoRepository;
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

    @Autowired
    UserInfoRepository userInfoRepository;

    @GetMapping("/role")
    public ResponseEntity getUserRole(
            @RequestParam("userId") int userId
    ) {
        UserRole userRole = userRoleRepository.getUserRoleByUserId(userId);
        Role role = roleRepository.getRoleById(userRole.getRoleId());
        return new ResponseEntity(role, HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity getUserInfo(
            @RequestParam("userId") int userId
    ) {
        UserInfo userInfo = userInfoRepository.getUserInfoByUserId(userId);
        return new ResponseEntity(userInfo, HttpStatus.OK);
    }
}
