package online.wilson_lkx.repository;

import online.wilson_lkx.dao.RoleDao;
import online.wilson_lkx.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>, RoleDao {

}