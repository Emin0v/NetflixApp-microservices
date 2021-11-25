package com.company.service.adapter;

import com.company.dto.category.CategoryResponse;
import com.company.dto.category.CategoryResponse.CategoryResponseBuilder;
import com.company.dto.category.CategorySaveRequest;
import com.company.model.category.Category;
import com.company.model.category.Category.CategoryBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-25T10:59:56+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class CategoryAdapterImpl implements CategoryAdapter {

    @Override
    public CategoryResponse map(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponseBuilder categoryResponse = CategoryResponse.builder();

        categoryResponse.id( category.getId() );
        categoryResponse.name( category.getName() );

        return categoryResponse.build();
    }

    @Override
    public Category map(CategorySaveRequest request) {
        if ( request == null ) {
            return null;
        }

        CategoryBuilder category = Category.builder();

        category.id( request.getId() );
        category.name( request.getName() );
        category.code( request.getCode() );

        return category.build();
    }
}
