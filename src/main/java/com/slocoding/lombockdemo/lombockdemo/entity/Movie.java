package com.slocoding.lombockdemo.lombockdemo.entity;

import lombok.*;

import java.net.URL;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private Long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    @Getter(AccessLevel.PROTECTED)
    private URL officialSite;
    private String language;
    @Getter(AccessLevel.PRIVATE)
    private final int minutes = 120;
}
