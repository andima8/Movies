package com.kotlin.andi.movies.data.source.local.room;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kotlin.andi.movies.data.source.local.entity.GenreEntity;
import com.kotlin.andi.movies.data.source.local.entity.MovieEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GenreEntity> __insertionAdapterOfGenreEntity;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGenreEntity = new EntityInsertionAdapter<GenreEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `genre_table` (`id`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GenreEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie_table` (`backdropPath`,`overview`,`originalLanguage`,`originalName`,`name`,`id`,`adult`,`posterPath`,`genre`) VALUES (?,?,?,?,?,nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        if (value.getBackdropPath() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBackdropPath());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOverview());
        }
        if (value.getOriginalLanguage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOriginalLanguage());
        }
        if (value.getOriginalName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOriginalName());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        stmt.bindLong(6, value.getId());
        final int _tmp;
        _tmp = value.getAdult() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        if (value.getPosterPath() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPosterPath());
        }
        if (value.getGenre() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getGenre());
        }
      }
    };
  }

  @Override
  public Object addGenre(final List<GenreEntity> genreEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGenreEntity.insert(genreEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object addMovie(final List<MovieEntity> movieEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movieEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public DataSource.Factory<Integer, GenreEntity> readGenre() {
    final String _sql = "SELECT * FROM genre_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, GenreEntity>() {
      @Override
      public LimitOffsetDataSource<GenreEntity> create() {
        return new LimitOffsetDataSource<GenreEntity>(__db, _statement, false, true , "genre_table") {
          @Override
          protected List<GenreEntity> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final List<GenreEntity> _res = new ArrayList<GenreEntity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final GenreEntity _item;
              final Integer _tmpId;
              if (cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = cursor.getInt(_cursorIndexOfId);
              }
              final String _tmpName;
              if (cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = cursor.getString(_cursorIndexOfName);
              }
              _item = new GenreEntity(_tmpId,_tmpName);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, MovieEntity> readMovie(final String genre) {
    final String _sql = "SELECT * FROM movie_table WHERE genre = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (genre == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, genre);
    }
    return new DataSource.Factory<Integer, MovieEntity>() {
      @Override
      public LimitOffsetDataSource<MovieEntity> create() {
        return new LimitOffsetDataSource<MovieEntity>(__db, _statement, false, true , "movie_table") {
          @Override
          protected List<MovieEntity> convertRows(Cursor cursor) {
            final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(cursor, "backdropPath");
            final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(cursor, "overview");
            final int _cursorIndexOfOriginalLanguage = CursorUtil.getColumnIndexOrThrow(cursor, "originalLanguage");
            final int _cursorIndexOfOriginalName = CursorUtil.getColumnIndexOrThrow(cursor, "originalName");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfAdult = CursorUtil.getColumnIndexOrThrow(cursor, "adult");
            final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(cursor, "posterPath");
            final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(cursor, "genre");
            final List<MovieEntity> _res = new ArrayList<MovieEntity>(cursor.getCount());
            while(cursor.moveToNext()) {
              final MovieEntity _item;
              final String _tmpBackdropPath;
              if (cursor.isNull(_cursorIndexOfBackdropPath)) {
                _tmpBackdropPath = null;
              } else {
                _tmpBackdropPath = cursor.getString(_cursorIndexOfBackdropPath);
              }
              final String _tmpOverview;
              if (cursor.isNull(_cursorIndexOfOverview)) {
                _tmpOverview = null;
              } else {
                _tmpOverview = cursor.getString(_cursorIndexOfOverview);
              }
              final String _tmpOriginalLanguage;
              if (cursor.isNull(_cursorIndexOfOriginalLanguage)) {
                _tmpOriginalLanguage = null;
              } else {
                _tmpOriginalLanguage = cursor.getString(_cursorIndexOfOriginalLanguage);
              }
              final String _tmpOriginalName;
              if (cursor.isNull(_cursorIndexOfOriginalName)) {
                _tmpOriginalName = null;
              } else {
                _tmpOriginalName = cursor.getString(_cursorIndexOfOriginalName);
              }
              final String _tmpName;
              if (cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = cursor.getString(_cursorIndexOfName);
              }
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final boolean _tmpAdult;
              final int _tmp;
              _tmp = cursor.getInt(_cursorIndexOfAdult);
              _tmpAdult = _tmp != 0;
              final String _tmpPosterPath;
              if (cursor.isNull(_cursorIndexOfPosterPath)) {
                _tmpPosterPath = null;
              } else {
                _tmpPosterPath = cursor.getString(_cursorIndexOfPosterPath);
              }
              final String _tmpGenre;
              if (cursor.isNull(_cursorIndexOfGenre)) {
                _tmpGenre = null;
              } else {
                _tmpGenre = cursor.getString(_cursorIndexOfGenre);
              }
              _item = new MovieEntity(_tmpBackdropPath,_tmpOverview,_tmpOriginalLanguage,_tmpOriginalName,_tmpName,_tmpId,_tmpAdult,_tmpPosterPath,_tmpGenre);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
