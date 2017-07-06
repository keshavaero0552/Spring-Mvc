package com.example.demo.service;

import java.util.List;


import com.example.user.User;
 
public interface UserService {
     
    User findById(long id);
     
    User findByName(String name);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserById(long id);
 
    static List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
     
    void deleteAllUsers();
     
    boolean isUserExist(User user);
     
}