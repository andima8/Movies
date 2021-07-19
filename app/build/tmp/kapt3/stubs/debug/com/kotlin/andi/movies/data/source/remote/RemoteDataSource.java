package com.kotlin.andi.movies.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/kotlin/andi/movies/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/kotlin/andi/movies/data/source/remote/api/ApiService;", "(Lcom/kotlin/andi/movies/data/source/remote/api/ApiService;)V", "genreList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kotlin/andi/movies/data/source/remote/ApiResponse;", "", "Lcom/kotlin/andi/movies/data/source/remote/response/GenresItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovies", "Lcom/kotlin/andi/movies/data/source/remote/response/ResultsItem;", "genre", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataSource {
    private final com.kotlin.andi.movies.data.source.remote.api.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object genreList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.kotlin.andi.movies.data.source.remote.ApiResponse<? extends java.util.List<com.kotlin.andi.movies.data.source.remote.response.GenresItem>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String genre, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.kotlin.andi.movies.data.source.remote.ApiResponse<? extends java.util.List<com.kotlin.andi.movies.data.source.remote.response.ResultsItem>>>> p1) {
        return null;
    }
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.kotlin.andi.movies.data.source.remote.api.ApiService apiService) {
        super();
    }
}