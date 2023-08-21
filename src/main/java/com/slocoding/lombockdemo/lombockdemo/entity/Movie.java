package com.slocoding.lombockdemo.lombockdemo.entity;

import lombok.*;

import java.net.URL;

@Getter @Setter
public class Movie {

    private Long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;
}
