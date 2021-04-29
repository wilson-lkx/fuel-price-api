package online.wilson_lkx.repository;

import online.wilson_lkx.dao.UserLoginDao;
import online.wilson_lkx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, UserLoginDao {

}