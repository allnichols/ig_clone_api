package com.igclone_api.repository;

import com.igclone_api.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

    @Query(
            value = "SELECT user_id, photo_id " +
                    "FROM likes " +
                    "WHERE user_id = :userId",
            nativeQuery = true
    )
    public List<Like> findLikesByUserId(@Param("userId") Long userId);

}
