package com.igclone_api.repository;

import com.igclone_api.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {

    @Query(
            value = "SELECT id, comment_text, user_id, photo_id " +
                    "FROM comments " +
                    "WHERE user_id = :userId",
            nativeQuery = true
    )
    public List<Comments> findCommentsByUserId(@Param("userId") Long userId);
}
