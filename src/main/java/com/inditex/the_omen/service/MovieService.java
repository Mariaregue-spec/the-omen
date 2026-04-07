package com.inditex.the_omen.service;

import com.inditex.the_omen.model.Movie;
import com.inditex.the_omen.repository.MovieRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
        System.out.println("Película eliminada correctamente");
    }

    public List<Movie> getAllByOrder() {
        return movieRepository.findAll(Sort.by(Sort.Direction.ASC, "titulo"));
    }

    public Optional<Movie> findMovie(int id) {
        return movieRepository.findById(id);
    }

    public Movie updateMovie(int id, Movie updatedMovie){
        // verificamos que aún existe la película después de rellenar el formulario
        Optional<Movie> foundMovie = movieRepository.findById(id);
        if(foundMovie.isPresent()){
            Movie existingMovie = foundMovie.get();

            // actualizamos los campos
            existingMovie.setTitulo(updatedMovie.getTitulo());
            existingMovie.setAnio(updatedMovie.getAnio());
            existingMovie.setRating(updatedMovie.getRating());
            existingMovie.setPoster(updatedMovie.getPoster());
            existingMovie.setSinopsis(updatedMovie.getSinopsis());

            // guardar la película
            return movieRepository.save(existingMovie);
        }

        // si no existe la película enviar un mensaje de error al usuario
        throw new RuntimeException("No se encontro la película con el id: " + id);
    }
}
