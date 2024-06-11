package com.maxscrub.bw.sffoodtrucksoftheday.model;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TruckDatabase_Impl extends TruckDatabase {
  private volatile TruckDataAccessObject _truckDataAccessObject;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Truck` (`key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `DayOrder` INTEGER, `DayOfWeekStr` TEXT, `Location` TEXT, `LocationID` TEXT, `Start24` TEXT, `End24` TEXT, `Latitude` TEXT, `Longitude` TEXT, `OptionalText` TEXT, `Applicant` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4dba264b2a496390e769df8ee2a47e00')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Truck`");
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTruck = new HashMap<String, TableInfo.Column>(11);
        _columnsTruck.put("key", new TableInfo.Column("key", "INTEGER", true, 1));
        _columnsTruck.put("DayOrder", new TableInfo.Column("DayOrder", "INTEGER", false, 0));
        _columnsTruck.put("DayOfWeekStr", new TableInfo.Column("DayOfWeekStr", "TEXT", false, 0));
        _columnsTruck.put("Location", new TableInfo.Column("Location", "TEXT", false, 0));
        _columnsTruck.put("LocationID", new TableInfo.Column("LocationID", "TEXT", false, 0));
        _columnsTruck.put("Start24", new TableInfo.Column("Start24", "TEXT", false, 0));
        _columnsTruck.put("End24", new TableInfo.Column("End24", "TEXT", false, 0));
        _columnsTruck.put("Latitude", new TableInfo.Column("Latitude", "TEXT", false, 0));
        _columnsTruck.put("Longitude", new TableInfo.Column("Longitude", "TEXT", false, 0));
        _columnsTruck.put("OptionalText", new TableInfo.Column("OptionalText", "TEXT", false, 0));
        _columnsTruck.put("Applicant", new TableInfo.Column("Applicant", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTruck = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTruck = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTruck = new TableInfo("Truck", _columnsTruck, _foreignKeysTruck, _indicesTruck);
        final TableInfo _existingTruck = TableInfo.read(_db, "Truck");
        if (! _infoTruck.equals(_existingTruck)) {
          throw new IllegalStateException("Migration didn't properly handle Truck(com.maxscrub.bw.sffoodtrucksoftheday.model.Truck).\n"
                  + " Expected:\n" + _infoTruck + "\n"
                  + " Found:\n" + _existingTruck);
        }
      }
    }, "4dba264b2a496390e769df8ee2a47e00", "16efdcd94685c3ec1401755a29a14df5");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Truck");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Truck`");
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
  public TruckDataAccessObject truckDataObject() {
    if (_truckDataAccessObject != null) {
      return _truckDataAccessObject;
    } else {
      synchronized(this) {
        if(_truckDataAccessObject == null) {
          _truckDataAccessObject = new TruckDataAccessObject_Impl(this);
        }
        return _truckDataAccessObject;
      }
    }
  }
}
