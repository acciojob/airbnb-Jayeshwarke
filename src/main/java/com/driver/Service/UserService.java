package com.driver.Service;

import com.driver.Repository.UserRepository;
import com.driver.model.User;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void addUser (User user){
        userRepository.addUser(user);
    }

    public User getUserByAdhar( int Adhar){
        return  userRepository.getUser(Adhar);
    }


}
