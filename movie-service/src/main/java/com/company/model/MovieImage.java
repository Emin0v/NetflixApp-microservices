package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieImage {

    private ImageType imageType;
    private String url;

    public enum ImageType{
        FEATURE, NORMAL
    }
}
