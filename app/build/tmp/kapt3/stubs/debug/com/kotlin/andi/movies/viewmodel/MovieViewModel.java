package com.kotlin.andi.movies.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\u000fR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kotlin/andi/movies/viewmodel/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCase", "Lcom/kotlin/andi/movies/domain/usecase/MovieUseCase;", "(Lcom/kotlin/andi/movies/domain/usecase/MovieUseCase;)V", "getGenre", "Landroidx/lifecycle/LiveData;", "Lcom/kotlin/andi/movies/vo/Resource;", "Landroidx/paging/PagedList;", "Lcom/kotlin/andi/movies/domain/model/Genre;", "getGetGenre", "()Landroidx/lifecycle/LiveData;", "getMovie", "Lcom/kotlin/andi/movies/domain/model/Movie;", "genre", "", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Genre>>> getGenre = null;
    private final com.kotlin.andi.movies.domain.usecase.MovieUseCase movieUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Genre>>> getGetGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Movie>>> getMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String genre) {
        return null;
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.domain.usecase.MovieUseCase movieUseCase) {
        super();
    }
}