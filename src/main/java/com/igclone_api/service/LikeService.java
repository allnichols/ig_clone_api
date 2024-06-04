package com.igclone_api.service;

import com.igclone_api.entity.Like;
import com.igclone_api.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LikeService {
    private final LikeRepository likeRepository;

    @Autowired
    public LikeService(LikeRepository likeRepository){
        this.likeRepository = likeRepository;
    }

    public List<Like> getLikes() {
        return likeRepository.findAll();
    }

   public List<Like> getLikesByUserId(Long userId) {
        return likeRepository.findLikesByUserId(userId);
   }

}
