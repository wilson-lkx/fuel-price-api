package online.wilson_lkx.repository;

import online.wilson_lkx.dao.UserInfoDao;
import online.wilson_lkx.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>, UserInfoDao {

}