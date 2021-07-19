package com.kotlin.andi.movies.data.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fH\'J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/andi/movies/data/source/local/room/MovieDao;", "", "addGenre", "", "genreEntity", "", "Lcom/kotlin/andi/movies/data/source/local/entity/GenreEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addMovie", "movieEntity", "Lcom/kotlin/andi/movies/data/source/local/entity/MovieEntity;", "readGenre", "Landroidx/paging/DataSource$Factory;", "", "readMovie", "genre", "", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addGenre(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.andi.movies.data.source.local.entity.GenreEntity> genreEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object addMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.andi.movies.data.source.local.entity.MovieEntity> movieEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM genre_table")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.kotlin.andi.movies.data.source.local.entity.GenreEntity> readGenre();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table WHERE genre = :genre ")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.kotlin.andi.movies.data.source.local.entity.MovieEntity> readMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String genre);
}