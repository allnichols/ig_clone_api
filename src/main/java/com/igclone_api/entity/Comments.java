package com.igclone_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "comments")
public class Comments {

        @Id
        @SequenceGenerator(
                name = "comment_sequence",
                sequenceName = "id",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "comment_sequence"
        )
        private Long id;

        @Column(nullable = false)
        private String comment_text;

        @ManyToOne()
        @JoinColumn(name = "photo_id", nullable = false, referencedColumnName = "id")
        private Photo photo;

        @ManyToOne()
        @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
        private User user;


}
