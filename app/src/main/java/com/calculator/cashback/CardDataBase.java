package com.calculator.cashback;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kt_ki on 8/11/2017.
 */

public class CardDataBase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "CardDatabase.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CARD_TABLE_NAME = "card_details_table";
    private static final String CARD_COLUMN_ID = "id";
    private static final String CARD_COLUMN_NAME = "card_name";
    private static final String CARD_COLUMN_CATAGORY = "card_category";
    private static final String CARD_COLUMN_PERCENTAGES = "card_percentage";
    private static final String CARD_COLUMN_LOGO = "card_logo";

    private static CardDataBase dataBase = null;

    CardDataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    static CardDataBase getInstance(Context context){
        if (dataBase == null){
            dataBase = new CardDataBase(context.getApplicationContext());
        }
        return dataBase;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table " + CARD_TABLE_NAME +
                        "(" + CARD_COLUMN_ID + " integer not null primary key, " +
                        CARD_COLUMN_NAME + " text," +
                        CARD_COLUMN_CATAGORY + " text," +
                        CARD_COLUMN_PERCENTAGES + " text, " +
                        CARD_COLUMN_LOGO + " integer," +
                        ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }


}
