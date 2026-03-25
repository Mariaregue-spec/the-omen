package com.inditex.the_omen.controller;

import com.inditex.the_omen.model.Movie;
import com.inditex.the_omen.repository.MovieRepository;
import com.inditex.the_omen.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieRepository movieRepository;
    private final MovieService movieService;

    public MovieController(MovieRepository movieRepository, MovieService movieService) {
        this.movieRepository = movieRepository;
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie newMovie){
        return movieService.addMovie(newMovie);
    }
}

