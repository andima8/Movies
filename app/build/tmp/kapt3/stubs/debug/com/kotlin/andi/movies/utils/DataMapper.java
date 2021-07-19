package com.kotlin.andi.movies.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/andi/movies/utils/DataMapper;", "", "()V", "mapEntitiesToGenreDomain", "Lcom/kotlin/andi/movies/domain/model/Genre;", "input", "Lcom/kotlin/andi/movies/data/source/local/entity/GenreEntity;", "mapEntitiesToMovieDomain", "Lcom/kotlin/andi/movies/domain/model/Movie;", "Lcom/kotlin/andi/movies/data/source/local/entity/MovieEntity;", "mapResponseToGenreEntities", "", "Lcom/kotlin/andi/movies/data/source/remote/response/GenresItem;", "mapResponseToMovieEntities", "Lcom/kotlin/andi/movies/data/source/remote/response/ResultsItem;", "genre", "", "app_debug"})
public final class DataMapper {
    @org.jetbrains.annotations.NotNull()
    public static final com.kotlin.andi.movies.utils.DataMapper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotlin.andi.movies.data.source.local.entity.GenreEntity> mapResponseToGenreEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.andi.movies.data.source.remote.response.GenresItem> input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.andi.movies.domain.model.Genre mapEntitiesToGenreDomain(@org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.data.source.local.entity.GenreEntity input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotlin.andi.movies.data.source.local.entity.MovieEntity> mapResponseToMovieEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.andi.movies.data.source.remote.response.ResultsItem> input, @org.jetbrains.annotations.NotNull()
    java.lang.String genre) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.andi.movies.domain.model.Movie mapEntitiesToMovieDomain(@org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.data.source.local.entity.MovieEntity input) {
        return null;
    }
    
    private DataMapper() {
        super();
    }
}