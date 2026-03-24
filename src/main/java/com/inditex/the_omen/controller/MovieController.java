package com.inditex.the_omen.controller;

import com.inditex.the_omen.model.Movie;
import com.inditex.the_omen.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
}

