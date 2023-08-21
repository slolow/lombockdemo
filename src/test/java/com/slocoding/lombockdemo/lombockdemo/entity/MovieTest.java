package com.slocoding.lombockdemo.lombockdemo.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie movie;

    @BeforeEach
    void setUp() throws MalformedURLException {
        movie = new Movie();
        movie.setTitle("The Lord of the Rings: ...");
        movie.setDescription("the second movie");
        movie.setCountry("New Zealand");
        movie.setRating(8);
        movie.setOfficialSite(new URL("https://de.wikipedia.org/wiki/Der_Herr_der_Ringe"));
        movie.setId(1L);
        movie.setLanguage("english");
    }

    @Test
    void getId() {
        assertNotNull(movie);
        assertEquals(1L, movie.getId());
    }

    @Test
    void setId() {
        assertNotNull(movie);
        movie.setId(2L);
        assertEquals(2L, movie.getId());
    }

    @Test
    void getTitle() {
        assertNotNull(movie);
        assertEquals("The Lord of the Rings: ...", movie.getTitle());
    }

    @Test
    void setTitle() {
        assertNotNull(movie);
        movie.setTitle("Minime");
        assertEquals("Minime", movie.getTitle());
    }

    @Test
    void getDescription() {
        assertNotNull(movie);
        assertEquals("the second movie", movie.getDescription());
    }

    @Test
    void setDescription() {
        assertNotNull(movie);
        movie.setDescription("small");
        assertEquals("small", movie.getDescription());
    }

    @Test
    void getCountry() {
        assertNotNull(movie);
        assertEquals("New Zealand", movie.getCountry());
    }

    @Test
    void setCountry() {
        assertNotNull(movie);
        movie.setCountry("Germany");
        assertEquals("Germany", movie.getCountry());
    }

    @Test
    void getRating() {
        assertNotNull(movie);
        assertEquals(8, movie.getRating());
    }

    @Test
    void setRating() {
        assertNotNull(movie);
        movie.setRating(10);
        assertEquals(10, movie.getRating());
    }

    @Test
    void getOfficialSite() {
        assertNotNull(movie);
        assertEquals("https://de.wikipedia.org/wiki/Der_Herr_der_Ringe", movie.getOfficialSite().toString());
    }

    @Test
    void setOfficialSite() throws MalformedURLException {
        assertNotNull(movie);
        movie.setOfficialSite(new URL("https://minime.de"));
        assertEquals("https://minime.de", movie.getOfficialSite().toString());
    }

    @Test
    void getLanguage() {
        assertNotNull(movie);
        assertEquals("english", movie.getLanguage());
    }

    @Test
    void setLanguage() {
        assertNotNull(movie);
        movie.setLanguage("german");
        assertEquals("german", movie.getLanguage());
    }
}