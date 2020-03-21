package com.newmoder.reminder.Handler;

import com.newmoder.reminder.Entities.ReminderEntity;

public class ReminderDatabaseHandler implements SimpleDatabaseHandler<ReminderEntity>{
    @Override
    public boolean createEntry(ReminderEntity entityObject) {
        return false;
    }

    @Override
    public ReminderEntity readEntry(long entryID) {
        return null;
    }

    @Override
    public boolean updateEntry(ReminderEntity entryID) {
        return false;
    }

    @Override
    public boolean removeEntry(long id) {
        return false;
    }
}
