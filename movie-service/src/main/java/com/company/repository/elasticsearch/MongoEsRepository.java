package com.company.repository.elasticsearch;

import com.company.model.elasticsearch.MovieEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface MongoEsRepository extends ReactiveElasticsearchRepository<MovieEs, String> {
}
