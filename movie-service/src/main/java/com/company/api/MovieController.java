package com.company.api;

import com.company.dto.movie.MovieResponse;
import com.company.dto.movie.MovieSaveRequest;
import com.company.service.abstracts.MovieService;
import com.company.util.ApiPaths;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiPaths.MovieCtrl.CTRL)
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public Flux<MovieResponse> getAll() {
        return movieService.getAll();
    }

    @GetMapping("/category")
    public Flux<MovieResponse> getAllByCategoryId(@RequestParam String categoryId){
        return movieService.getAllByCategoryId(categoryId);
    }

    @PostMapping
    public Mono<MovieResponse> saveMovie(@RequestBody MovieSaveRequest request){
        return movieService.saveMovie(request);
    }


}
