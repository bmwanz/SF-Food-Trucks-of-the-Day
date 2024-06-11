package com.maxscrub.bw.sffoodtrucksoftheday.model;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TruckDataAccessObject_Impl implements TruckDataAccessObject {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTruck;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTrucks;

  public TruckDataAccessObject_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTruck = new EntityInsertionAdapter<Truck>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Truck`(`key`,`DayOrder`,`DayOfWeekStr`,`Location`,`LocationID`,`Start24`,`End24`,`Latitude`,`Longitude`,`OptionalText`,`Applicant`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Truck value) {
        stmt.bindLong(1, value.getKey());
        if (value.getDayOrder() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getDayOrder());
        }
        if (value.getDayOfWeekStr() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDayOfWeekStr());
        }
        if (value.getLocation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLocation());
        }
        if (value.getLocationID() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLocationID());
        }
        if (value.getStart24() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStart24());
        }
        if (value.getEnd24() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEnd24());
        }
        if (value.getLatitude() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLatitude());
        }
        if (value.getLongitude() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLongitude());
        }
        if (value.getOptionalText() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getOptionalText());
        }
        if (value.getApplicant() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getApplicant());
        }
      }
    };
    this.__preparedStmtOfDeleteAllTrucks = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM truck";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final Truck[] trucks, final Continuation<? super List<Long>> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfTruck.insertAndReturnIdsList(trucks);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllTrucks(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTrucks.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllTrucks.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getAllTrucks(final Continuation<? super List<Truck>> p0) {
    final String _sql = "SELECT * FROM truck ORDER BY Applicant ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Truck>>() {
      @Override
      public List<Truck> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final List<Truck> _result = new ArrayList<Truck>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Truck _item;
            _item = __entityCursorConverter_comMaxscrubBwSffoodtrucksofthedayModelTruck(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getTodayTrucksAlphabetical(final int dayOfWeek,
      final Continuation<? super List<Truck>> p1) {
    final String _sql = "SELECT * FROM truck WHERE ? = DayOrder ORDER BY Applicant ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, dayOfWeek);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Truck>>() {
      @Override
      public List<Truck> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final List<Truck> _result = new ArrayList<Truck>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Truck _item;
            _item = __entityCursorConverter_comMaxscrubBwSffoodtrucksofthedayModelTruck(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  private Truck __entityCursorConverter_comMaxscrubBwSffoodtrucksofthedayModelTruck(Cursor cursor) {
    final Truck _entity;
    final int _cursorIndexOfKey = cursor.getColumnIndex("key");
    final int _cursorIndexOfDayOrder = cursor.getColumnIndex("DayOrder");
    final int _cursorIndexOfDayOfWeekStr = cursor.getColumnIndex("DayOfWeekStr");
    final int _cursorIndexOfLocation = cursor.getColumnIndex("Location");
    final int _cursorIndexOfLocationID = cursor.getColumnIndex("LocationID");
    final int _cursorIndexOfStart24 = cursor.getColumnIndex("Start24");
    final int _cursorIndexOfEnd24 = cursor.getColumnIndex("End24");
    final int _cursorIndexOfLatitude = cursor.getColumnIndex("Latitude");
    final int _cursorIndexOfLongitude = cursor.getColumnIndex("Longitude");
    final int _cursorIndexOfOptionalText = cursor.getColumnIndex("OptionalText");
    final int _cursorIndexOfApplicant = cursor.getColumnIndex("Applicant");
    final Integer _tmpDayOrder;
    if (_cursorIndexOfDayOrder == -1) {
      _tmpDayOrder = null;
    } else {
      if (cursor.isNull(_cursorIndexOfDayOrder)) {
        _tmpDayOrder = null;
      } else {
        _tmpDayOrder = cursor.getInt(_cursorIndexOfDayOrder);
      }
    }
    final String _tmpDayOfWeekStr;
    if (_cursorIndexOfDayOfWeekStr == -1) {
      _tmpDayOfWeekStr = null;
    } else {
      _tmpDayOfWeekStr = cursor.getString(_cursorIndexOfDayOfWeekStr);
    }
    final String _tmpLocation;
    if (_cursorIndexOfLocation == -1) {
      _tmpLocation = null;
    } else {
      _tmpLocation = cursor.getString(_cursorIndexOfLocation);
    }
    final String _tmpLocationID;
    if (_cursorIndexOfLocationID == -1) {
      _tmpLocationID = null;
    } else {
      _tmpLocationID = cursor.getString(_cursorIndexOfLocationID);
    }
    final String _tmpStart24;
    if (_cursorIndexOfStart24 == -1) {
      _tmpStart24 = null;
    } else {
      _tmpStart24 = cursor.getString(_cursorIndexOfStart24);
    }
    final String _tmpEnd24;
    if (_cursorIndexOfEnd24 == -1) {
      _tmpEnd24 = null;
    } else {
      _tmpEnd24 = cursor.getString(_cursorIndexOfEnd24);
    }
    final String _tmpLatitude;
    if (_cursorIndexOfLatitude == -1) {
      _tmpLatitude = null;
    } else {
      _tmpLatitude = cursor.getString(_cursorIndexOfLatitude);
    }
    final String _tmpLongitude;
    if (_cursorIndexOfLongitude == -1) {
      _tmpLongitude = null;
    } else {
      _tmpLongitude = cursor.getString(_cursorIndexOfLongitude);
    }
    final String _tmpOptionalText;
    if (_cursorIndexOfOptionalText == -1) {
      _tmpOptionalText = null;
    } else {
      _tmpOptionalText = cursor.getString(_cursorIndexOfOptionalText);
    }
    final String _tmpApplicant;
    if (_cursorIndexOfApplicant == -1) {
      _tmpApplicant = null;
    } else {
      _tmpApplicant = cursor.getString(_cursorIndexOfApplicant);
    }
    _entity = new Truck(_tmpDayOrder,_tmpDayOfWeekStr,_tmpLocation,_tmpLocationID,_tmpStart24,_tmpEnd24,_tmpLatitude,_tmpLongitude,_tmpOptionalText,_tmpApplicant);
    if (_cursorIndexOfKey != -1) {
      final int _tmpKey;
      _tmpKey = cursor.getInt(_cursorIndexOfKey);
      _entity.setKey(_tmpKey);
    }
    return _entity;
  }
}
