package com.slocoding.lombockdemo.lombockdemo.entity;

import lombok.*;

import java.net.URL;

/* @Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "minutes")
@EqualsAndHashCode(exclude = "minutes") */
@Data // @Data is a annotation that contains every annotations from above
public class Movie {

    private Long id;
    private String title;
    private String description;
    private String country;
    private int rating;
    private URL officialSite;
    private String language;
    private final int minutes = 120;
}
