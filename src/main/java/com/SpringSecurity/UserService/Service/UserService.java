package com.SpringSecurity.UserService.Service;

import com.SpringSecurity.UserService.Model.Role;
import com.SpringSecurity.UserService.Model.User;
import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);

    //assuming that there wouldn't be users with same username
    void addRoleToUser(String userName, String roleName);

    //assuming that there wouldn't be users with same username
    User getUser(String userName);

    //This type of functions will not be used in the real world
    //Because imagine if there are 50,000 users, we won't be showing them all
    //Instead we will return page and the users belonging to the page.
    List<User> getUsers();
}
