package com.example.BookMyshow_ApplicationProject.Dto;

import com.example.BookMyshow_ApplicationProject.Enum.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class ShowSeatResponseDto {


    private String seatNo;
    private SeatType seatType;
    private int price ;
}
