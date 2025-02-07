package com.example.BookMyshow_ApplicationProject.Repository;


import com.example.BookMyshow_ApplicationProject.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    @Query(value = "select * from user_table WHERE mobileNo=:UsermobileNo", nativeQuery = true)
    public UserEntity findUserByMobileNo(String UsermobileNo);

    @Query(value = "SELECT * FROM user_table WHERE name=:Username",nativeQuery = true)
    public List<UserEntity> findUserByName(String Username);
}
