package com.company.repository.elasticsearch;

import com.company.model.elasticsearch.MovieEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import reactor.core.publisher.Flux;

public interface MovieEsRepository extends ReactiveElasticsearchRepository<MovieEs, String> {

    Flux<MovieEs> getAllByCategoryId(String id);

}
