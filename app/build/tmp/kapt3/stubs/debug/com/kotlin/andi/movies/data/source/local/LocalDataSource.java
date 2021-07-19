package com.kotlin.andi.movies.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000fJ\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/kotlin/andi/movies/data/source/local/LocalDataSource;", "", "movieDao", "Lcom/kotlin/andi/movies/data/source/local/room/MovieDao;", "(Lcom/kotlin/andi/movies/data/source/local/room/MovieDao;)V", "addGenre", "", "genreEntity", "", "Lcom/kotlin/andi/movies/data/source/local/entity/GenreEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addMovie", "movieEntity", "Lcom/kotlin/andi/movies/data/source/local/entity/MovieEntity;", "getGenre", "Landroidx/paging/DataSource$Factory;", "", "getMovies", "genre", "", "app_debug"})
public final class LocalDataSource {
    private final com.kotlin.andi.movies.data.source.local.room.MovieDao movieDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addGenre(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.andi.movies.data.source.local.entity.GenreEntity> genreEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.DataSource.Factory<java.lang.Integer, com.kotlin.andi.movies.data.source.local.entity.GenreEntity> getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.andi.movies.data.source.local.entity.MovieEntity> movieEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.DataSource.Factory<java.lang.Integer, com.kotlin.andi.movies.data.source.local.entity.MovieEntity> getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String genre) {
        return null;
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.data.source.local.room.MovieDao movieDao) {
        super();
    }
}