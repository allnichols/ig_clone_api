package com.igclone_api.service;

import com.igclone_api.entity.Photo;
import com.igclone_api.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    private final PhotoRepository photoRepository;

    @Autowired
    public PhotoService(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public List<Photo> getAllPhotos(){
        return photoRepository.findAll();
    }

    public Photo getPhotoById(Long id){
        if (id == null) {
            return null;
        }
        return photoRepository.findById(id).orElse(null);
    }
}
