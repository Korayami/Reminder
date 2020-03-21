package com.newmoder.reminder.Handler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.newmoder.reminder.Entities.NoteEntity;
import com.newmoder.reminder.IO.DatabaseCommons;
import com.newmoder.reminder.IO.DatabaseHelper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/********************************************************************************
 * HANDLER CLASS FOR CRUD-OPERATIONS BETWEEN DATABASE AND APPLICATION POJOS
********************************************************************************/
public class NoteDatabaseHandler extends DatabaseCommons implements SimpleDatabaseHandler<NoteEntity>{

    private Context context;
    private static SQLiteDatabase readableDatabase, writableDatabase;
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss", Locale.GERMAN);

    private static String[] projection = {
            NOTES_COLUMN_ID,
            NOTES_COLUMN_HEADING,
            NOTES_COLUMN_CONTENT,
            NOTES_COLUMN_DATE_CREATED,
            NOTES_COLUMN_DATE_DELETED,
            NOTES_COLUMN_DATE_LAST_UPDATED,
            NOTES_COLUMN_USER_ID,
            NOTES_COLUMN_CATEGORY_ID,
            NOTES_COLUMN_VISIBLE
    };

    public NoteDatabaseHandler(Context c) {
        this.context = c;
        readableDatabase = new DatabaseHelper(c).getReadableDatabase();
        writableDatabase = new DatabaseHelper(c).getWritableDatabase();
    }

    // CRUD-OPERATION: CREATE   <==     (CREATING NEW TABLE ENTRY IN THE DATABASE)
    @Override
    public long createEntry(NoteEntity entity){
        ContentValues values = new ContentValues();

        values.put(projection[0], entity.getID());
        values.put(projection[1], entity.getHEADING());
        values.put(projection[2], entity.getCONTENT());
        values.put(projection[3], dateFormat.format(entity.getDATE_CREATED()));
        values.put(projection[4], dateFormat.format(entity.getDATE_DELETED()));
        values.put(projection[5], dateFormat.format(entity.getDATE_LAST_UPDATED()));
        values.put(projection[6], entity.getUSER_ID());
        values.put(projection[7], entity.getCATEGORY_ID());
        values.put(projection[8], entity.isVISIBLE());
        long newRowID = writableDatabase.insert(NOTES_TABLE_NAME, null, values);

        // Heating up a toast
        Toast.makeText(this.context, "Note created!", Toast.LENGTH_SHORT).show();

        return newRowID;
    }

    // CRUD-OPERATION: READ     <==     (READING FROM TABLE ENTRY AND RETURNING A POJO )
    @Override
    public NoteEntity readEntry(long id){
        String selection = NOTES_COLUMN_ID + " = ?";
        String[] selectionArgs = {String.valueOf(id)};

        Cursor cursor = readableDatabase.query(
                NOTES_TABLE_NAME,           // table to query
                projection,                 // columns to return
                selection,                  // columns for where clause
                selectionArgs,              // values for where clause
                null,
                null,
                null

        );

        NoteEntity noteEntity = null;
        try {
            noteEntity = new NoteEntity(
                    cursor.getLong(cursor.getColumnIndex(NOTES_COLUMN_ID)),
                    cursor.getString(cursor.getColumnIndex(NOTES_COLUMN_HEADING)),
                    cursor.getString(cursor.getColumnIndex(NOTES_COLUMN_CONTENT)),
                    dateFormat.parse(cursor.getString(cursor.getColumnIndex(NOTES_COLUMN_DATE_CREATED))),
                    dateFormat.parse(cursor.getString(cursor.getColumnIndex(NOTES_COLUMN_DATE_DELETED))),
                    dateFormat.parse(cursor.getString(cursor.getColumnIndex(NOTES_COLUMN_DATE_LAST_UPDATED))),
                    cursor.getLong(cursor.getColumnIndex(NOTES_COLUMN_USER_ID)),
                    cursor.getLong(cursor.getColumnIndex(NOTES_COLUMN_CATEGORY_ID)),
                    Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(NOTES_COLUMN_VISIBLE)))
            );
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cursor.close();
        return noteEntity;
    }

    // CRUD-OPERATION: UPDATE   <==     (UPDATING A NOTE ENTRY DEPENDING ON DATE_UPDATE_TIME)
    @Override
    public boolean updateEntry(NoteEntity entity){
        String whereClause = NOTES_COLUMN_ID + " = ?";
        String[] whereClauseArgs = new String[]{String.valueOf(entity.getID())};
        ContentValues values = new ContentValues();

        values.put(projection[0], entity.getID());
        values.put(projection[1], entity.getHEADING());
        values.put(projection[2], entity.getCONTENT());
        values.put(projection[3], dateFormat.format(entity.getDATE_CREATED()));
        values.put(projection[4], dateFormat.format(entity.getDATE_DELETED()));
        values.put(projection[5], dateFormat.format(entity.getDATE_LAST_UPDATED()));
        values.put(projection[6], entity.getUSER_ID());
        values.put(projection[7], entity.getCATEGORY_ID());
        values.put(projection[8], entity.isVISIBLE());

        return writableDatabase.update(NOTES_TABLE_NAME, values, whereClause, whereClauseArgs) > 0;
    }

    // CRUD-OPERATION: DELETE   <==     (DELETING A NOTE ENTRY IN THE DATABASE)
    @Override
    public boolean removeEntry(long id){
        String whereClause = NOTES_COLUMN_ID + " = ?";
        String[] whereClauseArgs = new String[]{String.valueOf(id)};

        // Heating up a toast
        Toast.makeText(this.context, "Note deleted!", Toast.LENGTH_SHORT).show();

        return writableDatabase.delete(NOTES_TABLE_NAME, whereClause, whereClauseArgs) > 0;
    }
}
