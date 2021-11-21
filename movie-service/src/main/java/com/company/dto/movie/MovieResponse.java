package com.company.dto.movie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieResponse {

    private String id;
    private String name;
    private String code;
    private String categoryId;
    private String description;
    private String features;
    private Boolean active;
    private String image;
    private int viewCount;


}
