package com.company.service.adapter;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieSaveRequest;
import com.company.model.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MovieAdapter {

    MovieResponse map(Movie request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "images", ignore = true)
    Movie map(MovieSaveRequest request);

}
