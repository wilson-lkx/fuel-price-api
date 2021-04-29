package online.wilson_lkx.repository;

import online.wilson_lkx.dao.UserRoleDao;
import online.wilson_lkx.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Void>, UserRoleDao {

}