package com.company.service.abstracts;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieSaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {

    Flux<MovieResponse> getAll();

    Flux<MovieResponse> getAllByCategoryId(String categoryId);

    Mono<MovieResponse> saveMovie(MovieSaveRequest request);

}
