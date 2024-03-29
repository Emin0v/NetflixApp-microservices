package com.company.dto.category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorySaveRequest {

    private String id;
    private String name;
    private String code;

}
