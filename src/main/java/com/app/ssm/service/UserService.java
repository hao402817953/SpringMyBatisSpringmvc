package com.app.ssm.service;

import com.app.ssm.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public interface UserService {

    User getUserById(int userId);
    int insert(User user);
    List selectAll();
    List selectLimit(Integer offset, Integer limit);
    int update(int userId);
    int update2(User user);
    int delete(User user);
    int getCount();
    int somedel(Integer[] arr);
    List twosel();
    User sele(User user);
}
