package com.company.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "movie")
@EqualsAndHashCode(of = "id")
public class Movie implements Serializable {

    @Id
    private String id;
    private String name;
    private String code;
    private String categoryId;
    private String description;
    private String features;
    private Boolean active;
    private List<MovieImage> images;

}
