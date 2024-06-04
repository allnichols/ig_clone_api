package com.igclone_api.controller;

import com.igclone_api.entity.Comments;
import com.igclone_api.entity.Photo;
import com.igclone_api.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    @RequestMapping("/comments")
    public List<Comments> getComments() {
        return commentsService.getAllComments();
    }

    @RequestMapping("/comments/{id}")
    public Comments getCommentById(@PathVariable Long id) {
        return commentsService.getCommentById(id);
    }

    @RequestMapping("/comments/user/{userId}")
    public List<Comments> getCommentsByUserId(@PathVariable Long userId) {
        return commentsService.getCommentsByUserId(userId);
    }
}
