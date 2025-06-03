package com.bhuseva.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhuseva.backend.entity.GalleryImage;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
public interface GalleryImageRepository extends JpaRepository<GalleryImage, Long> {
}
