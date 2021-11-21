package com.company.model.category;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@EqualsAndHashCode(of = "id")
@Document(collection = "category")
public class Category {

    @Id
    private String id;
    private String name;
    private String code;

}
