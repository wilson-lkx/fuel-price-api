package online.wilson_lkx.dao;

import online.wilson_lkx.model.User;

import java.security.NoSuchAlgorithmException;

public interface UserLoginDao {

    User getUser(String email, String password) throws NoSuchAlgorithmException;
}
