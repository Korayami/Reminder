package com.newmoder.reminder.IO;

public abstract class DatabaseCommons {

    /****************************************************************************************/
    /*  NOTES TABLE                                                                         */
    /****************************************************************************************/
    protected static final String NOTES_TABLE_NAME = "NOTES";
    protected static final String NOTES_COLUMN_ID = "NOTE_ID";
    protected static final String NOTES_COLUMN_HEADING = "HEADING";
    protected static final String NOTES_COLUMN_CONTENT = "CONTENT";
    protected static final String NOTES_COLUMN_DATE_CREATED = "DATE_CREATED";
    protected static final String NOTES_COLUMN_DATE_LAST_UPDATED = "DATE_LAST_UPDATED";
    protected static final String NOTES_COLUMN_DATE_DELETED = "DATE_DELETED";
    protected static final String NOTES_COLUMN_USER_ID = "USER_ID";
    protected static final String NOTES_COLUMN_CATEGORY_ID = "CATEGORY_ID";
    protected static final String NOTES_COLUMN_VISIBLE = "VISIBLE";
    /***************************************************************************************/

    /****************************************************************************************/
    /*  BOOKMARKS                                                                         */
    /****************************************************************************************/
    protected static final String BOOKMARKS_TABLE_NAME = "BOOKMARKS";
    protected static final String BOOKMARKS_COLUMN_ID = "BOOKMARK_ID";
    protected static final String BOOKMARKS_COLUMN_HEADING = "HEADING";
    protected static final String BOOKMARKS_COLUMN_CONTENT = "CONTENT";
    protected static final String BOOKMARKS_COLUMN_DATE_CREATED = "DATE_CREATED";
    protected static final String BOOKMARKS_COLUMN_DATE_LAST_UPDATED = "DATE_LAST_UPDATED";
    protected static final String BOOKMARKS_COLUMN_DATE_DELETED = "DATE_DELETED";
    protected static final String BOOKMARKS_COLUMN_USER_ID = "USER_ID";
    protected static final String BOOKMARKS_COLUMN_CATEGORY_ID = "CATEGORY_ID";
    protected static final String BOOKMARKS_COLUMN_VISIBLE = "VISIBLE";
    /***************************************************************************************/

    /****************************************************************************************/
    /*  REMINDER                                                                        */
    /****************************************************************************************/
    protected static final String REMINDER_TABLE_NAME = "REMINDER";
    protected static final String REMINDER_COLUMN_ID = "REMINDER_ID";
    protected static final String REMINDER_COLUMN_HEADING = "HEADING";
    protected static final String REMINDER_COLUMN_CONTENT = "CONTENT";
    protected static final String REMINDER_COLUMN_DATE_CREATED = "DATE_CREATED";
    protected static final String REMINDER_COLUMN_DATE_LAST_UPDATED = "DATE_LAST_UPDATED";
    protected static final String REMINDER_COLUMN_DATE_DELETED = "DATE_DELETED";
    protected static final String REMINDER_COLUMN_USER_ID = "USER_ID";
    protected static final String REMINDER_COLUMN_CATEGORY_ID = "CATEGORY_ID";
    protected static final String REMINDER_COLUMN_NOTES_LINK_ID = "NOTES_LINK_ID";
    protected static final String REMINDER_COLUMN_VISIBLE = "VISIBLE";
    /***************************************************************************************/
}
