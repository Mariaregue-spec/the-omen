package com.inditex.the_omen.service;

import com.inditex.the_omen.model.Movie;
import com.inditex.the_omen.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie newMovie){
        return movieRepository.save(newMovie);
    }
}
