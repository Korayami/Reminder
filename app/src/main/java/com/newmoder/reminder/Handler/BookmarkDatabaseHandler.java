package com.newmoder.reminder.Handler;

import com.newmoder.reminder.Entities.BookmarkEntity;

public class BookmarkDatabaseHandler implements SimpleDatabaseHandler<BookmarkEntity>{

    // CRUD-OPERATION: CREATE   <==     (CREATING NEW TABLE ENTRY IN THE DATABASE)
    @Override
    public boolean createEntry(BookmarkEntity entryPOJO) {
        return false;
    }

    // CRUD-OPERATION: READ     <==     (READING FROM TABLE ENTRY AND RETURNING A POJO )
    @Override
    public BookmarkEntity readEntry(long id){
        return null;
    }

    // CRUD-OPERATION: UPDATE   <==     (UPDATING A NOTE ENTRY DEPENDING ON DATE_UPDATE_TIME)
    @Override
    public boolean updateEntry(BookmarkEntity entryID) {
        return false;
    }

    // CRUD-OPERATION: DELETE   <==     (DELETING A NOTE ENTRY IN THE DATABASE)
    @Override
    public boolean removeEntry(long id){
        return false;
    }
}
