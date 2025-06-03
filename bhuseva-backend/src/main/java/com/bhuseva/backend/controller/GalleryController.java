package com.bhuseva.backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.bhuseva.backend.entity.GalleryImage;
import com.bhuseva.backend.repository.GalleryImageRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Author: Yadhesh DG  
 * © Bhuseva Public Charitable Trust
 */
@RestController
@RequestMapping("/api/gallery")
public class GalleryController {

    @Autowired
    private GalleryImageRepository galleryRepo;

    private static final String IMAGE_DIR = "uploads/gallery/";

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        String filename = UUID.randomUUID() + "_" + file.getOriginalFilename();
        File dest = new File(IMAGE_DIR + filename);
        dest.getParentFile().mkdirs();
        file.transferTo(dest);

        GalleryImage img = new GalleryImage();
        img.setFilePath(dest.getPath());
		img.setUploadTime(System.currentTimeMillis());
        galleryRepo.save(img);

        return "Uploaded";
    }

    @GetMapping("/")
    public List<GalleryImage> allImages() {
        return galleryRepo.findAll();
    }
}

