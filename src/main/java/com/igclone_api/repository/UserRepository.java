package com.igclone_api.repository;

import com.igclone_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(
            value = "SELECT * FROM users WHERE username = :userName",
            nativeQuery = true
    )
    public List<User> findByUserName(@Param("userName") String userName);
}
