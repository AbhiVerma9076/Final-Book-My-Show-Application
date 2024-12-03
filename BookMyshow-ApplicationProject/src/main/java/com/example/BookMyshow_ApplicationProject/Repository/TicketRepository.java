package com.example.BookMyshow_ApplicationProject.Repository;

import com.example.BookMyshow_ApplicationProject.Models.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {


}
