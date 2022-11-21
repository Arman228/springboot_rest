package com.Spring_Boot.spring.springboot_rest.service;

import com.Spring_Boot.spring.springboot_rest.dao.UserDao;
import com.Spring_Boot.spring.springboot_rest.model.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    // @Autowired
    private final UserDao dao;

    public UserServiceImp(UserDao dao) {
        this.dao = dao;
    }

    @Transactional
    @Override
    public void add(User user) {
        dao.add(user);

    }

    @Override
    @Transactional
    public User getById(int id) {
        return dao.getById(id);

    }

    @Override
    @Transactional
    public void delete(int id) {
        dao.delete(id);

    }

    @Override
    @Transactional
    public void edit( User user) {
        dao.edit( user);

    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }
}
