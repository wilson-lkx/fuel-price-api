package online.wilson_lkx.dao;

import online.wilson_lkx.model.UserInfo;

public interface UserInfoDao {

    UserInfo getUserInfoByUserId(int userId);
}
