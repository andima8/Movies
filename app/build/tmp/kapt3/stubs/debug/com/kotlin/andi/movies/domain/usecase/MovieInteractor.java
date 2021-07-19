package com.kotlin.andi.movies.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/kotlin/andi/movies/domain/usecase/MovieInteractor;", "Lcom/kotlin/andi/movies/domain/usecase/MovieUseCase;", "IMoviesRepository", "Lcom/kotlin/andi/movies/domain/repository/IMoviesRepository;", "(Lcom/kotlin/andi/movies/domain/repository/IMoviesRepository;)V", "getGenre", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kotlin/andi/movies/vo/Resource;", "Landroidx/paging/PagedList;", "Lcom/kotlin/andi/movies/domain/model/Genre;", "getMovies", "Lcom/kotlin/andi/movies/domain/model/Movie;", "genre", "", "app_debug"})
public final class MovieInteractor implements com.kotlin.andi.movies.domain.usecase.MovieUseCase {
    private final com.kotlin.andi.movies.domain.repository.IMoviesRepository IMoviesRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Movie>>> getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String genre) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Genre>>> getGenre() {
        return null;
    }
    
    public MovieInteractor(@org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.domain.repository.IMoviesRepository IMoviesRepository) {
        super();
    }
}