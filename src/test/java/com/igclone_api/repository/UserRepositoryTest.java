package com.igclone_api.repository;

import com.igclone_api.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetUsers() {
        assertEquals(100, userRepository.findAll().size());
    }

    @Test
    public void testGetUserByUsername() {
        assertEquals(1, userRepository.findByUserName("Bethany20").size());
    }


}