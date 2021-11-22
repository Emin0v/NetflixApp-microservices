package com.company.service.concretes.mongo;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieSaveRequest;
import com.company.model.Movie;
import com.company.repository.mongo.MovieRepository;
import com.company.service.abstracts.mongo.MovieService;
import com.company.service.adapter.MovieAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;
    private final MovieAdapter adapter;

    @Override
    public Flux<MovieResponse> getAll() {
        return repository.findAll().map(adapter::map);
    }

    @Override
    public Flux<MovieResponse> getAllByCategoryId(String categoryId) {
        return repository.getAllByCategoryId(categoryId).map(adapter::map);
    }

    @Override
    public Mono<MovieResponse> saveMovie(MovieSaveRequest request) {
        Movie movie = adapter.map(request);
        return repository.save(movie).map(adapter::map);
    }
}
