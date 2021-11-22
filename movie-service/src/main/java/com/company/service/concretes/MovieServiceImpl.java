package com.company.service.concretes;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieSaveRequest;
import com.company.model.Movie;
import com.company.model.MovieImage;
import com.company.repository.mongo.MovieRepository;
import com.company.service.abstracts.MovieService;
import com.company.service.adapter.MovieAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;
import java.util.stream.Collectors;

import static com.company.model.MovieImage.ImageType.NORMAL;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository;
    private final MovieAdapter adapter;

    @Override
    public Flux<MovieResponse> getAll() {
        return repository.findAll().map(adapter::map);
    }

    @Override
    public Flux<MovieResponse> getAllByCategoryId(String categoryId) {
        return repository.getAllByCategoryId(categoryId).map(adapter::map);
    }

    @Override
    @Transactional
    public Mono<MovieResponse> saveMovie(MovieSaveRequest request) {
        Movie movie = adapter.map(request);
        movie.setId(UUID.randomUUID().toString());
        movie.setImages(request.getImages().stream().map(url ->
                new MovieImage(NORMAL, url)
        ).collect(Collectors.toList()));
        return repository.save(movie).map(adapter::map);

    }
}
