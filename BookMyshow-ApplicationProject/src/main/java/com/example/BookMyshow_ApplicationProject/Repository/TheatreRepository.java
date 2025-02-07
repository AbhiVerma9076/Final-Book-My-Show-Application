package com.example.BookMyshow_ApplicationProject.Repository;

import com.example.BookMyshow_ApplicationProject.Models.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreRepository  extends JpaRepository<TheatreEntity,Integer> {

    @Query(value = "SELECT * FROM theatre_table WHERE name=:tname",nativeQuery = true)
    public List<TheatreEntity> findByName (String tname);

    @Query(value = "SELECT * FROM theatre_table WHERE city=:tcity",nativeQuery = true)
    public List<TheatreEntity> findByCity (String tcity);

    @Query(value = "SELECT * FROM theatre_table WHERE name=:tname AND city=:tcity",nativeQuery = true)
    public TheatreEntity findTheatreByNameAndCity (String tname,String tcity);
}
