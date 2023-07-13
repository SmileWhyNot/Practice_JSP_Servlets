package com.example.testee.app.model;

import com.example.testee.app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserModel {
    private static UserModel instance = new UserModel();

    private List<User> userModel;

    public static UserModel getInstance() {
        return instance;
    }

    private UserModel() {
        userModel = new ArrayList<>();
    }

    public void add(User user) {
        userModel.add(user);
    }

    public List<String> list() {
        return userModel.stream().map(User::getName).collect(Collectors.toList());
    }
}
