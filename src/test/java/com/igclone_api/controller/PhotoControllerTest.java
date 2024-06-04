package com.igclone_api.controller;

import com.igclone_api.entity.Photo;
import com.igclone_api.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhotoControllerTest {

        @Autowired
        private PhotoService photoService;

        @org.junit.jupiter.api.Test
        void getPhotos() {
           assertEquals(100, photoService.getAllPhotos().size());
        }

        @org.junit.jupiter.api.Test
        void getPhotoNull() {
            assertNull(photoService.getPhotoById(null));
        }

        @org.junit.jupiter.api.Test
        void getPhoto() {
            assertNotNull(photoService.getPhotoById(1L));
        }
}