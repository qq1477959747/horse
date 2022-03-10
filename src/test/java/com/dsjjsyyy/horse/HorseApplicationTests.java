package com.dsjjsyyy.horse;

import com.dsjjsyyy.horse.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HorseApplicationTests {

    @Autowired
    public UserDao userDao;

    @Test
    void contextLoads() {
        userDao.selectList(null).forEach(System.out::println);
    }

}
