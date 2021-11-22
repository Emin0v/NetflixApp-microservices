package com.company.service.adapter;

import com.company.dto.movie.MovieEsResponse;
import com.company.dto.movie.MovieEsSaveRequest;
import com.company.model.Movie;
import com.company.model.elasticsearch.MovieEs;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieEsAdapter {

    MovieEsResponse map(MovieEs movieEs);

    MovieEs map(MovieEsSaveRequest request);
}
