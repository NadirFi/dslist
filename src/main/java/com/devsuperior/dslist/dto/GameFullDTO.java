package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.BeanUtils;

public class GameFullDTO {

    private long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameFullDTO() {}

    public GameFullDTO(Game game) {
        //BeanUtils.copyProperties(game, this);

        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.genre = game.getGenre();
        this.platforms = game.getPlatforms();
        this.score = game.getScore();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
        this.longDescription = game.getLongDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
