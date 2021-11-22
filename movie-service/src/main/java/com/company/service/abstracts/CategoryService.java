package com.company.service.abstracts;

import com.company.dto.category.CategoryResponse;
import com.company.dto.category.CategorySaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoryService {

    Flux<CategoryResponse> getAll();

    Mono<CategoryResponse> getById(String id);

    Mono<CategoryResponse> save(CategorySaveRequest request);
}
