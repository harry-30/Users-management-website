package com.fsoftregistration;

import com.fsoftregistration.user.User;
import com.fsoftregistration.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
//    @Autowired private UserRepository repo;
//
//    @Test
//    public void testAddNew1() {
//        User user = new User();
//        user.setId(null);
//        user.setName("Harry Duong");
//        user.setAccount("thisisanemail@gmail.com");
//        user.setPassword("password");
//        user.setRole("Student");
//
//        User savedUser = repo.save(user);
//
//        Assertions.assertThat(savedUser).isNotNull();
//        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
//    }
//
//    @Test
//    public void testAddNew2() {
//        User user = new User();
//        user.setId(null);
//        user.setName("Duong Duc Hieu");
//        user.setAccount("thisisanemail@gmail.com");
//        user.setPassword("password");
//        user.setRole("Intern");
//
//        User savedUser = repo.save(user);
//
//        Assertions.assertThat(savedUser).isNotNull();
//        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
//    }
//
//    @Test
//    public void testListAll() {
//        Iterable<User> users = repo.findAll();
//        Assertions.assertThat(users).hasSizeGreaterThan(0);
//
//        for (User user : users) {
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    public void testUpdate() {
//        Integer userId = 1;
//        Optional<User> optionalUser = repo.findById(userId);
//        User user = optionalUser.get();
//        user.setPassword("hello2002");
//        repo.save(user);
//
//        User updatedUser = repo.findById(userId).get();
//        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("hello2002");
//    }
//
//    @Test
//    public void testGet() {
//        Integer userId = 2;
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertThat(optionalUser).isPresent();
//        System.out.println(optionalUser.get());
//    }
//
//    @Test
//    public void testDelete() {
//        Integer userId = 2;
//        repo.deleteById(userId);
//
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertThat(optionalUser).isNotPresent();
//    }
}
