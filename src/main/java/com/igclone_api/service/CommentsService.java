package com.igclone_api.service;

import com.igclone_api.entity.Comments;
import com.igclone_api.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {
    private final CommentsRepository commentsRepository;

    @Autowired
    public CommentsService(CommentsRepository commentsRepository){
        this.commentsRepository = commentsRepository;
    }

    public List<Comments> getAllComments(){
        return commentsRepository.findAll();
    }

    public Comments getCommentById(Long id){
        if(id == null){
            return null;
        }
        return commentsRepository.findById(id).orElse(null);
    }

    public List<Comments> getCommentsByUserId(Long userId){
        if(userId == null){
            return null;
        }
        return commentsRepository.findCommentsByUserId(userId);
    }


}
