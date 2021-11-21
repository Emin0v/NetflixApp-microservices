package com.company.dto.movie;

import com.company.dto.category.CategoryResponse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MovieEsResponse {

    private String id;
    private String name;
    private String code;
    private CategoryResponse category;
    private String description;
    private String features;
    private Boolean active;
    private List<String> images;

}
