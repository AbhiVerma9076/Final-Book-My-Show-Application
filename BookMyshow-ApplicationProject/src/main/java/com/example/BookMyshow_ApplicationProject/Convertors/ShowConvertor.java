package com.example.BookMyshow_ApplicationProject.Convertors;

import com.example.BookMyshow_ApplicationProject.Dto.ShowResponseDto;
import com.example.BookMyshow_ApplicationProject.Models.ShowEntity;
import com.example.BookMyshow_ApplicationProject.Models.TheatreEntity;

import java.util.ArrayList;
import java.util.List;

public class ShowConvertor {


    public static List<ShowResponseDto> convertToResponseDtoList(List<ShowEntity> showEntities) throws Exception{
        List<ShowResponseDto> showResponseDtoList = new ArrayList<>();

        for (ShowEntity show : showEntities) {
            TheatreEntity theatre = show.getTheatre();
            ShowResponseDto showResponseDto = ShowResponseDto.builder().showDate(show.getShowDate()).showTime(show.getShowTime()).showId(show.getId()).movieName(show.getMovie().getName()).multiplier(show.getMultiplier()).theatre(theatre.getName()+" "+ theatre.getAddress()+" "+ theatre.getCity()).build();
            showResponseDtoList.add(showResponseDto);
        }

        return showResponseDtoList;
    }

}
