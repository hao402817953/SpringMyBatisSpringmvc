package com.app.ssm.service.impl;

import com.app.ssm.dao.UserDao;
import com.app.ssm.domain.User;
import com.app.ssm.service.UserService;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
public class UserServiceImpl extends SqlSessionDaoSupport implements UserService {




    public User getUserById(int userId) {

        return this.getSqlSession().selectOne("com.app.ssm.domain.User.selectByPrimaryKey");
    }

    public int insert(User user) {
        return 0;
    }

    public List selectAll() {
        return null;
    }

    public List selectLimit(Integer offset, Integer limit) {
        return null;
    }

    public int update(int userId) {
        return 0;
    }

    public int update2(User user) {
        return 0;
    }

    public int delete(User user) {
        return 0;
    }

    public int getCount() {
        return 0;
    }

    public int somedel(Integer[] arr) {
        return 0;
    }

    public List twosel() {
        return null;
    }

    public User sele(User user) {
        return null;
    }
}
