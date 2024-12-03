package com.example.BookMyshow_ApplicationProject.Repository;

import com.example.BookMyshow_ApplicationProject.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    @Query(value = "SELECT * FROM movie_table WHERE name=:mName",nativeQuery = true)
    public MovieEntity findMovieByName(String mName);
}
