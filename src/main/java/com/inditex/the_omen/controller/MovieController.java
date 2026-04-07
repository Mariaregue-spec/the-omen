package com.inditex.the_omen.controller;

import com.inditex.the_omen.model.Movie;
import com.inditex.the_omen.repository.MovieRepository;
import com.inditex.the_omen.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class MovieController {

    private final MovieRepository movieRepository;
    private final MovieService movieService;

    public MovieController(MovieRepository movieRepository, MovieService movieService) {
        this.movieRepository = movieRepository;
        this.movieService = movieService;
    }

    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie newMovie){
        return movieService.addMovie(newMovie);
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovieById(@PathVariable int id){
        movieService.deleteMovie(id);
    }

    @GetMapping("/movies/ASC")
    public List<Movie> getAllByOrder(){
        return movieService.getAllByOrder();
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> findMovieById(@PathVariable int id){
        Optional<Movie> foundMovie = movieService.findMovie(id);
        if(foundMovie.isPresent()){
            return new ResponseEntity<>(foundMovie.get(), HttpStatus.FOUND);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovieById(@PathVariable int id, @RequestBody Movie updatedMovie){
        try {
            // actualizo los campos si existe el id en la Base de Datos
            Movie movie = movieService.updateMovie(id, updatedMovie);
            return new ResponseEntity<>(movie, HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }



}

