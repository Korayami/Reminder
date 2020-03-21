package com.newmoder.reminder.Entities;

import java.util.Date;

public class NoteEntity {

    private final long ID;
    private String HEADING;
    private String CONTENT;
    private final Date DATE_CREATED;
    private Date DATE_LAST_UPDATED;
    private Date DATE_DELETED;
    private final long USER_ID;
    private long CATEGORY_ID;
    private boolean VISIBLE;

    public NoteEntity(long id, String heading, String content, Date date_created, Date date_last_updated, Date date_deleted, long user_id, long category_id, boolean visible) {
        ID = id;
        HEADING = heading;
        CONTENT = content;
        DATE_CREATED = date_created;
        DATE_LAST_UPDATED = date_last_updated;
        DATE_DELETED = date_deleted;
        USER_ID = user_id;
        CATEGORY_ID = category_id;
        VISIBLE = visible;
    }


    public long getID() {
        return ID;
    }

    public String getHEADING() {
        return HEADING;
    }

    public void setHEADING(String HEADING) {
        this.HEADING = HEADING;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }

    public Date getDATE_CREATED() {
        return DATE_CREATED;
    }

    public Date getDATE_LAST_UPDATED() {
        return DATE_LAST_UPDATED;
    }

    public void setDATE_LAST_UPDATED(Date DATE_LAST_UPDATED) {
        this.DATE_LAST_UPDATED = DATE_LAST_UPDATED;
    }

    public Date getDATE_DELETED() {
        return DATE_DELETED;
    }

    public void setDATE_DELETED(Date DATE_DELETED) {
        this.DATE_DELETED = DATE_DELETED;
    }

    public long getUSER_ID() {
        return USER_ID;
    }

    public long getCATEGORY_ID() {
        return CATEGORY_ID;
    }

    public void setCATEGORY_ID(long CATEGORY_ID) {
        this.CATEGORY_ID = CATEGORY_ID;
    }

    public boolean isVISIBLE() {
        return VISIBLE;
    }

    public void setVISIBLE(boolean VISIBLE) {
        this.VISIBLE = VISIBLE;
    }
}
