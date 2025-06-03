package com.bhuseva.backend.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Yadhesh DG
 * @copyright Bhuseva Public Charitable Trust
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GalleryImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String imageUrl;
    private String description;
    private String uploadedBy;
    private String filePath;
    private long uploadTime;
}

