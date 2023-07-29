package com.driver.Repository;

import com.driver.model.User;

import java.util.HashMap;

public class UserRepository {
    private final HashMap<int, User>userDb = new HashMap<int, User>();

    public void addUser(User user){
        userDb.put(user.getaadharCardNo(),user);
    }
    public User getUser(int aadharCardNo){
        return userDb.get(aadharCardNo);


    }
}
