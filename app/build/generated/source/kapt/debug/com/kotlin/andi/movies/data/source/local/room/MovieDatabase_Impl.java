package com.kotlin.andi.movies.data.source.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDatabase_Impl extends MovieDatabase {
  private volatile MovieDao _movieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `genre_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie_table` (`backdropPath` TEXT NOT NULL, `overview` TEXT NOT NULL, `originalLanguage` TEXT NOT NULL, `originalName` TEXT NOT NULL, `name` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `adult` INTEGER NOT NULL, `posterPath` TEXT NOT NULL, `genre` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '092a7e206dc31b4a0ec2bf5acfa7027e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `genre_table`");
        _db.execSQL("DROP TABLE IF EXISTS `movie_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGenreTable = new HashMap<String, TableInfo.Column>(2);
        _columnsGenreTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGenreTable.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGenreTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGenreTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGenreTable = new TableInfo("genre_table", _columnsGenreTable, _foreignKeysGenreTable, _indicesGenreTable);
        final TableInfo _existingGenreTable = TableInfo.read(_db, "genre_table");
        if (! _infoGenreTable.equals(_existingGenreTable)) {
          return new RoomOpenHelper.ValidationResult(false, "genre_table(com.kotlin.andi.movies.data.source.local.entity.GenreEntity).\n"
                  + " Expected:\n" + _infoGenreTable + "\n"
                  + " Found:\n" + _existingGenreTable);
        }
        final HashMap<String, TableInfo.Column> _columnsMovieTable = new HashMap<String, TableInfo.Column>(9);
        _columnsMovieTable.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("overview", new TableInfo.Column("overview", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("originalLanguage", new TableInfo.Column("originalLanguage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("originalName", new TableInfo.Column("originalName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("adult", new TableInfo.Column("adult", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("posterPath", new TableInfo.Column("posterPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTable.put("genre", new TableInfo.Column("genre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieTable = new TableInfo("movie_table", _columnsMovieTable, _foreignKeysMovieTable, _indicesMovieTable);
        final TableInfo _existingMovieTable = TableInfo.read(_db, "movie_table");
        if (! _infoMovieTable.equals(_existingMovieTable)) {
          return new RoomOpenHelper.ValidationResult(false, "movie_table(com.kotlin.andi.movies.data.source.local.entity.MovieEntity).\n"
                  + " Expected:\n" + _infoMovieTable + "\n"
                  + " Found:\n" + _existingMovieTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "092a7e206dc31b4a0ec2bf5acfa7027e", "913618b464404fb9993b6dbe3ec2f61e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "genre_table","movie_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `genre_table`");
      _db.execSQL("DELETE FROM `movie_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MovieDao.class, MovieDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public MovieDao movieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }
}
