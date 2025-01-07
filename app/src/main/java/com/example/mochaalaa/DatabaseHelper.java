package com.example.mochaalaa;



import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "UserDatabase.db";
    private static final String TABLE_NAME = "users";
    private static final String TABLE_CATEGORIES = "categories";
    private static final String TABLE_ITEMS = "items";



    //for users table
    private static final String COL_ID = "ID";
    private static final String COL_NAME = "NAME";
    private static final String COL_EMAIL = "EMAIL";
    private static final String COL_PASSWORD = "PASSWORD";
/*

    //for category table
    public static final String CATEGORY_ID = "category_id";
    public static final String CATEGORY_NAME = "category_name";


    // for items table
    public static final String ITEM_ID = "item_id";
    public static final String ITEM_NAME = "item_name";
    public static final String ITEM_PRICE = "item_price";
    public static final String ITEM_CATEGORY_ID = "category_id";

*/
    public DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL_NAME + " TEXT, " +
                COL_EMAIL + " TEXT, " +
                COL_PASSWORD + " TEXT)";
        db.execSQL(createTable);

       /* String CREATE_CATEGORIES_TABLE = "CREATE TABLE " + TABLE_CATEGORIES + " (" +
                CATEGORY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CATEGORY_NAME + " TEXT)";
        db.execSQL(CREATE_CATEGORIES_TABLE);

        String CREATE_ITEMS_TABLE = "CREATE TABLE " + TABLE_ITEMS + " (" +
                ITEM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ITEM_NAME + " TEXT, " +
                ITEM_PRICE + " REAL, " +
                ITEM_CATEGORY_ID + " INTEGER, " +
                "FOREIGN KEY (" + ITEM_CATEGORY_ID + ") REFERENCES " + TABLE_CATEGORIES + "(" + CATEGORY_ID + "))";
        db.execSQL(CREATE_ITEMS_TABLE);*/
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CATEGORIES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ITEMS);

        onCreate(db);
    }

    public boolean insertUser(String name, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NAME, name);
        contentValues.put(COL_EMAIL, email);
        contentValues.put(COL_PASSWORD, password);

        long result = db.insert(TABLE_NAME, null, contentValues);
        return result != -1;
    }

    public boolean checkUser(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE EMAIL = ?", new String[]{email});
        return cursor.getCount() > 0;
    }
    public boolean checkUser(String email, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE EMAIL = ? AND PASSWORD = ?",
                new String[]{email, password});
        return cursor.getCount() > 0;
    }
    //for homepage name :
    public String getUserName(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        String name = null;
        Cursor cursor = db.rawQuery("SELECT " + COL_NAME + " FROM " + TABLE_NAME + " WHERE EMAIL = ?", new String[]{email});
        if (cursor.moveToFirst()) {
            name = cursor.getString(0); // Get the name column
        }
        cursor.close();
        return name;
    }
//for profile :
    public Cursor getUserDetails(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT " + COL_ID + ", " + COL_NAME + ", " + COL_EMAIL + " FROM " + TABLE_NAME + " WHERE " + COL_EMAIL + " = ?", new String[]{email});
    }



/*
    // Method to get categories
    public Cursor getCategories() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_CATEGORIES, null);
    }
public void insertSampleData() {
    SQLiteDatabase db = this.getWritableDatabase();

    // Insert categories
    db.execSQL("INSERT INTO " + TABLE_CATEGORIES + " (" + CATEGORY_NAME + ") VALUES ('Iced Coffee')");
    db.execSQL("INSERT INTO " + TABLE_CATEGORIES + " (" + CATEGORY_NAME + ") VALUES ('Hot Coffee')");
    db.execSQL("INSERT INTO " + TABLE_CATEGORIES + " (" + CATEGORY_NAME + ") VALUES ('Breakfast')");

    // Insert items
    db.execSQL("INSERT INTO " + TABLE_ITEMS + " (" + ITEM_NAME + ", " + ITEM_PRICE + ", " + ITEM_CATEGORY_ID + ") " +
            "VALUES ('Iced Latte', 3.5, 1)");
    db.execSQL("INSERT INTO " + TABLE_ITEMS + " (" + ITEM_NAME + ", " + ITEM_PRICE + ", " + ITEM_CATEGORY_ID + ") " +
            "VALUES ('Hot Espresso', 2.5, 2)");
    db.execSQL("INSERT INTO " + TABLE_ITEMS + " (" + ITEM_NAME + ", " + ITEM_PRICE + ", " + ITEM_CATEGORY_ID + ") " +
            "VALUES ('Pancakes', 4.0, 3)");
}
    public Cursor getItemsByCategory(int categoryId) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_ITEMS + " WHERE " + ITEM_CATEGORY_ID + " = ?",
                new String[]{String.valueOf(categoryId)});
    }*/











}
