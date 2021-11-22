package com.company.service.concretes;

import com.company.dto.category.CategoryResponse;
import com.company.dto.category.CategorySaveRequest;
import com.company.model.category.Category;
import com.company.repository.mongo.CategoryRepository;
import com.company.service.abstracts.CategoryService;
import com.company.service.adapter.CategoryAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;
    private final CategoryAdapter adapter;

    @Override
    public Flux<CategoryResponse> getAll() {
        return repository.findAll().map(adapter::map);
    }

    @Override
    public Mono<CategoryResponse> getById(String id) {
        return repository.findById(id).map(adapter::map);
    }

    @Override
    public Mono<CategoryResponse> save(CategorySaveRequest request) {
       Category category = adapter.map(request);
       category.setId(UUID.randomUUID().toString());
       return repository.save(category).map(adapter::map);
    }
}
