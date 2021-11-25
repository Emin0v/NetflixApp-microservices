package com.company.service.adapter;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieResponse.MovieResponseBuilder;
import com.company.dto.movie.MovieSaveRequest;
import com.company.model.Movie;
import com.company.model.Movie.MovieBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-25T10:59:56+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class MovieAdapterImpl implements MovieAdapter {

    @Override
    public MovieResponse map(Movie request) {
        if ( request == null ) {
            return null;
        }

        MovieResponseBuilder movieResponse = MovieResponse.builder();

        movieResponse.id( request.getId() );
        movieResponse.name( request.getName() );
        movieResponse.code( request.getCode() );
        movieResponse.categoryId( request.getCategoryId() );
        movieResponse.description( request.getDescription() );
        movieResponse.features( request.getFeatures() );
        movieResponse.active( request.getActive() );

        return movieResponse.build();
    }

    @Override
    public Movie map(MovieSaveRequest request) {
        if ( request == null ) {
            return null;
        }

        MovieBuilder movie = Movie.builder();

        movie.name( request.getName() );
        movie.code( request.getCode() );
        movie.categoryId( request.getCategoryId() );
        movie.description( request.getDescription() );
        movie.features( request.getFeatures() );
        movie.active( request.getActive() );

        return movie.build();
    }
}
