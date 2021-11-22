package com.company.service.concretes.elasticsearch;

import com.company.dto.movie.MovieEsResponse;
import com.company.dto.movie.MovieEsSaveRequest;
import com.company.model.elasticsearch.MovieEs;
import com.company.repository.elasticsearch.MovieEsRepository;
import com.company.service.abstracts.elasticsearch.MovieEsService;
import com.company.service.adapter.MovieEsAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MovieEsServiceImpl implements MovieEsService {

    private final MovieEsRepository repository;
    private final MovieEsAdapter adapter;

    @Override
    public Mono<MovieEsResponse> save(MovieEsSaveRequest request) {
        MovieEs movieEs = adapter.map(request);
        return repository.save(movieEs).map(adapter::map);
    }

    @Override
    public Flux<MovieEsResponse> getAll() {
        return repository.findAll().map(adapter::map);
    }

    @Override
    public Flux<MovieEsResponse> getAllByCategoryId(String categoryId) {
        return repository.getAllByCategoryId(categoryId).map(adapter::map);
    }

    @Override
    public Mono<MovieEsResponse> findById(String id) {
        return repository.findById(id).map(adapter::map);
    }

}
