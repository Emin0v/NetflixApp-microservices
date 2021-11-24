package com.company.api;

import com.company.dto.category.CategoryResponse;
import com.company.dto.category.CategorySaveRequest;
import com.company.service.abstracts.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public Flux<CategoryResponse> getAll(){
        return categoryService.getAll();
    }

    @GetMapping("/{categoryId}")
    public Mono<CategoryResponse> getById(@RequestParam String id) {
        return categoryService.getById(id);
    }

    @PostMapping
    public Mono<CategoryResponse> save(@RequestBody CategorySaveRequest request) {
        return categoryService.save(request);
    }
}
