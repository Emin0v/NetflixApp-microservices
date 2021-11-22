package com.company.service.adapter;

import com.company.dto.category.CategoryResponse;
import com.company.dto.category.CategorySaveRequest;
import com.company.model.category.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryAdapter {

    CategoryResponse map(Category category);

    Category map(CategorySaveRequest request);

}
