package com.igclone_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "photos")
public class Photo {

    @Id
    @SequenceGenerator(
            name = "photo_sequence",
            sequenceName = "id",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "photo_sequence")
    private Long id;

    @Column(nullable = false)
    private String image_url;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date created_at;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    private User user;
}
