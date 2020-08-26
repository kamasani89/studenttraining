/*
 * package com.example.demo.dao;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Map;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.example.demo.model.User;
 * 
 * @Repository public class UserDAO {
 * 
 * @Autowired private JdbcTemplate jdbcTemplate;
 * 
 * public void saveUser(User user) {
 * jdbcTemplate.execute("insert into user(name,age) values('" + user.getName() +
 * "'," + user.getAge() + ")"); }
 * 
 * public List<User> getUserList() {
 * 
 * List<User> userList = new ArrayList<>(); List<Map<String, Object>> userMap =
 * jdbcTemplate.queryForList("select * from user"); for (Map<String, Object> map
 * : userMap) { User user = new User(); user.setId((int) map.get("id"));
 * user.setName((String) map.get("name")); user.setAge((int) map.get("age"));
 * userList.add(user); } return userList; }
 * 
 * 
 * }
 */