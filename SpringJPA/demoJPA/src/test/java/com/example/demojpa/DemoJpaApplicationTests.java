package com.example.demojpa;

import com.example.demojpa.entity.User;
import com.example.demojpa.repository.EmployeeRepository;
import com.example.demojpa.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootTest

class DemoJpaApplicationTests {


    @Autowired
    private UserRepository userRepository;
//
    @Autowired
    private EmployeeRepository employeeRepository;
//
//    @Test
//    void  get_users() {
//        System.out.println(employeeRepository.findAllByName("Tran Thanh Long"));
//    }
//    @Test
//    void save_user() {
//        User user = new User(null,"Long","long@gmail.com", LocalDate.now().minusYears(22),true);
//        userRepository.save(user);
//    }


//    @Test
//    void save_user_list() {
//        List<User> users = List.of(
//                new User(null,"Long1","a@gmail.com", LocalDate.now().minusYears(22),true),
//                new User(null,"Son","b@gmail.com", LocalDate.now().minusYears(22),true),
//                new User(null,"dat","c@gmail.com", LocalDate.now().minusYears(22),true)
//        );
//        userRepository.saveAll(users);
//    }

//    @Test
//    void find_user() {
//        // tim theo id
//        Optional<User> userOptional = userRepository.findById(1);
//        userOptional.ifPresent(System.out::println);
//
//        // cap nhat
//        User user = userOptional.get();
//        user.setName("Long update");
//        userRepository.save(user);
//
//
//
//        // findAll : lay tat ca
//        List<User> userList = userRepository.findAll();
//        userList.forEach(System.out::println);
//    }
//
//    @Test
//    void test_findByName() {
//        List<User> userList = userRepository.findAllByName("a");
//        userList.forEach(System.out::println);
//    }
}
