package com.umnix.phonebook.service;

import com.umnix.phonebook.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    private static List<User> users;
    static {
        users = populateDummyUsers();
    }

    public List<User> findAllUsers() {
        return users;
    }




    public static List<User> populateDummyUsers() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"Vinnie", 16));
        list.add(new User(2,"Debbie", 18));
        list.add(new User(1,"Johnny", 21));
        return list;
    }


}
