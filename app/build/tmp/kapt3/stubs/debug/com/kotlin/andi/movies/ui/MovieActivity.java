package com.kotlin.andi.movies.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/kotlin/andi/movies/ui/MovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/kotlin/andi/movies/databinding/ActivityMovieBinding;", "dataMovies", "Lcom/kotlin/andi/movies/domain/model/Genre;", "genre", "", "movieViewModel", "Lcom/kotlin/andi/movies/viewmodel/MovieViewModel;", "getMovieViewModel", "()Lcom/kotlin/andi/movies/viewmodel/MovieViewModel;", "movieViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class MovieActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.kotlin.andi.movies.databinding.ActivityMovieBinding binding;
    private final kotlin.Lazy movieViewModel$delegate = null;
    private com.kotlin.andi.movies.domain.model.Genre dataMovies;
    private java.lang.String genre;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MOVIE = "extra_movie";
    @org.jetbrains.annotations.NotNull()
    public static final com.kotlin.andi.movies.ui.MovieActivity.Companion Companion = null;
    
    private final com.kotlin.andi.movies.viewmodel.MovieViewModel getMovieViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MovieActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/kotlin/andi/movies/ui/MovieActivity$Companion;", "", "()V", "EXTRA_MOVIE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}