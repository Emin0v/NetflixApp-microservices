package com.company.service.abstracts.mongo;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieSaveRequest;
import reactor.core.publisher.Flux;

public interface MovieService {

    Flux<MovieResponse> getAll();

    Flux<MovieResponse> getAllByCategoryId(String categoryId);

    MovieResponse saveMovie(MovieSaveRequest request);


}
