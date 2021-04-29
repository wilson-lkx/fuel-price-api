package online.wilson_lkx.dao;

import online.wilson_lkx.model.UserRole;

public interface UserRoleDao {

    UserRole getUserRoleByUserId(int userId);
}
