package com.igclone_api.controller;

import com.igclone_api.entity.Like;
import com.igclone_api.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LikeController {
    @Autowired
    private LikeService likeService;

    @RequestMapping("/likes")
    public List<Like> getAllLikes() {
        return likeService.getLikes();
    }

    @RequestMapping("/likes/user/{id}")
    public List<Like> getLikesByUserId(@PathVariable Long id) {
        return likeService.getLikesByUserId(id);
    }

}
