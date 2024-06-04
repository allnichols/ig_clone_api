package com.igclone_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Embeddable
@Data
@Getter
public class LikeId implements Serializable {

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "photo_id", nullable = false, referencedColumnName = "id")
    private Photo photo;

    public Long getUserId() {
        return user.getId();
    }

    public Long getPhotoId() {
        return user.getId();
    }

}
