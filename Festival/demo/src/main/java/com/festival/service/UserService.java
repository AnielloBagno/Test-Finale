package com.festival.service;
import com.festival.entities.User;
import com.festival.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    private UserRepo userRepo;

    public void saveUser(User user){
        userRepo.save(user);
    }

    public User findByEmail(String email){
        return userRepo.findByEmail(email);
    }
}