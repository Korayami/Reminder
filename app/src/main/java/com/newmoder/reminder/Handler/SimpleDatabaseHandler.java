package com.newmoder.reminder.Handler;

public interface SimpleDatabaseHandler<T> {

    long createEntry(T entityObject);
    T readEntry(long entryID);
    boolean updateEntry(T entryID);
    boolean removeEntry(long id);
}
