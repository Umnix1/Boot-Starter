package com.umnix.phonebook.service;

import com.umnix.phonebook.model.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
}
