package com.company.service.abstracts.elasticsearch;

import com.company.dto.movie.MovieEsResponse;
import com.company.dto.movie.MovieEsSaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieEsService {

    Mono<MovieEsResponse> save(MovieEsSaveRequest request);

    Flux<MovieEsResponse> getAll();

    Flux<MovieEsResponse> getAllByCategoryId(String categoryId);

    Mono<MovieEsResponse> findById(String id);
}
