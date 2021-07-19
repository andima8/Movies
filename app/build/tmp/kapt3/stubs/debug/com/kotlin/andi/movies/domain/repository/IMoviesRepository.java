package com.kotlin.andi.movies.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&J\"\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/kotlin/andi/movies/domain/repository/IMoviesRepository;", "", "getGenre", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kotlin/andi/movies/vo/Resource;", "Landroidx/paging/PagedList;", "Lcom/kotlin/andi/movies/domain/model/Genre;", "getMovies", "Lcom/kotlin/andi/movies/domain/model/Movie;", "genre", "", "app_debug"})
public abstract interface IMoviesRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Genre>>> getGenre();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Movie>>> getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String genre);
}