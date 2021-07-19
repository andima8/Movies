package com.kotlin.andi.movies.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0016J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t0\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kotlin/andi/movies/data/MovieRepository;", "Lcom/kotlin/andi/movies/domain/repository/IMoviesRepository;", "remoteDataSource", "Lcom/kotlin/andi/movies/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/kotlin/andi/movies/data/source/local/LocalDataSource;", "(Lcom/kotlin/andi/movies/data/source/remote/RemoteDataSource;Lcom/kotlin/andi/movies/data/source/local/LocalDataSource;)V", "getGenre", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kotlin/andi/movies/vo/Resource;", "Landroidx/paging/PagedList;", "Lcom/kotlin/andi/movies/domain/model/Genre;", "getMovies", "Lcom/kotlin/andi/movies/domain/model/Movie;", "genre", "", "app_debug"})
public final class MovieRepository implements com.kotlin.andi.movies.domain.repository.IMoviesRepository {
    private final com.kotlin.andi.movies.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.kotlin.andi.movies.data.source.local.LocalDataSource localDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Genre>>> getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.kotlin.andi.movies.vo.Resource<androidx.paging.PagedList<com.kotlin.andi.movies.domain.model.Movie>>> getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String genre) {
        return null;
    }
    
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.data.source.local.LocalDataSource localDataSource) {
        super();
    }
}