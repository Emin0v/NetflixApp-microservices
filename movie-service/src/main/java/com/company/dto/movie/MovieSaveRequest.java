package com.company.dto.movie;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class MovieSaveRequest {

    private String name;
    private String code;
    private String categoryId;
    private String description;
    private String features;
    private Boolean active;
    private List<String> images;

}
