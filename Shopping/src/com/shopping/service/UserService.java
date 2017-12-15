package com.shopping.service;

import com.shopping.entity.User;

import java.util.List;

/**
 * 用户接口
 */
public interface UserService {
    public User getUser(int id);

    public User getUser(String nameOrEmail);

    public void addUser(User user);

    public boolean deleteUser(int id);

    public boolean updateUser(User user);

    public List<User> getAllUser();
}
