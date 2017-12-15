package com.shopping.service;

import com.shopping.entity.UserDetail;

import java.util.List;

/**
 * 用户细节接口
 */
public interface UserDetailService {
    public UserDetail getUserDetail(int id);

    public void addUserDetail(UserDetail userDetail);

    public boolean deleteUserDetail(int id);

    public boolean updateUserDetail(UserDetail userDetail);

    public List<UserDetail> getAllUserDetail();
}
