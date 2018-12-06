package com.lofts.blog.service;


import com.lofts.blog.dao.IUserDao;
import com.lofts.blog.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService {

    @Resource
    private IUserDao userDao;

    public User login(String name, String password) {
        return userDao.login(name, password);
    }

    public void register(User user) {
        userDao.register(user);
    }

    public String checkUserName(String userName) {
        return userDao.checkUserName(userName);
    }

    public User saveUserInfo(User user) {
        return userDao.saveUserInfo(user);
    }

    public User queryUserInfo(int id) {
        return userDao.queryUserInfo(id);
    }

    public List<String> getBirthdayList() {
        return userDao.getBirthdayList();
    }

    public List<String> getConstellationList() {
        return userDao.getConstellationList();
    }

    public List<String> getHobbyList() {
        return userDao.getHobbyList();
    }


}
