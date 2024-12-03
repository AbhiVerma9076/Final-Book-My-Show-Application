package com.example.BookMyshow_ApplicationProject.Convertors;

import com.example.BookMyshow_ApplicationProject.Dto.TheatreResponseDto;
import com.example.BookMyshow_ApplicationProject.Models.TheatreEntity;

import java.util.ArrayList;
import java.util.List;

public class TheatreConvertor {

    public static List<TheatreResponseDto> getListOfTheatreResponse(List<TheatreEntity> theatreEntityList){

        List<TheatreResponseDto> responseDtoList = new ArrayList<>();

        for(TheatreEntity theatre:theatreEntityList){
            TheatreResponseDto theatreResponseDto = TheatreResponseDto.builder().id(theatre.getId()).name(theatre.getName()).city(theatre.getCity()).address(theatre.getAddress()).build();
            responseDtoList.add(theatreResponseDto);
        }

        return responseDtoList;
    }
}
