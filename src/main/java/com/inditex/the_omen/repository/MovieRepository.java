package com.inditex.the_omen.repository;

import com.inditex.the_omen.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
