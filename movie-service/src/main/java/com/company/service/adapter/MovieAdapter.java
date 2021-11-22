package com.company.service.adapter;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieSaveRequest;
import com.company.model.Movie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieAdapter {

    MovieResponse map(Movie request);

    Movie map(MovieSaveRequest request);

}
