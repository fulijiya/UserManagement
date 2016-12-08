package com.integration.dao;

import com.integration.entity.User;
import java.util.List;

public interface UserDAO {
void save(User user);
User getUser(String name);
void delete(int id);
void update(User user);
User findById(int id);
List<User> findAll();
}
