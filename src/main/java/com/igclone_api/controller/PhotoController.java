package com.igclone_api.controller;

import com.igclone_api.entity.Photo;
import com.igclone_api.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping("/photos")
    public List<Photo> getPhotos() {
        return photoService.getAllPhotos();
    }

    @RequestMapping("/photos/{id}")
    public Photo getPhotoById(@PathVariable Long id) {
        System.out.println("id: " + id);
        return photoService.getPhotoById(id);
    }

}
