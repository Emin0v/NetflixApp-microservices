package com.company.model.elasticsearch;

import com.company.model.MovieImage;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Document(indexName = "movie")
public class MovieEs {

    @Id
    private String id;
    private String name;
    private String code;
    private CategoryEs category;
    private String description;
    private String features;
    private Boolean active;
    private List<String> images;

}
