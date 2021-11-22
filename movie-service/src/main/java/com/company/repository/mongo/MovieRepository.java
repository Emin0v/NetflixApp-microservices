package com.company.repository.mongo;

import com.company.model.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {

    Flux<Movie> getAllByCategoryId(String id);
}
