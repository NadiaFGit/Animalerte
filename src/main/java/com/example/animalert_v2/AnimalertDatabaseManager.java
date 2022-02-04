package com.example.animalert_v2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AnimalertDatabaseManager extends SQLiteOpenHelper {

    //Database and Table
    private static final String DATABASE_NAME ="Animalert.db";
    private static final String TABLE_User="User";
    private static final String TABLE_Animal="Animal";


    public AnimalertDatabaseManager( Context context) {
        super(context, DATABASE_NAME,null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create tables
        String table1="CREATE TABLE "+TABLE_User+"(nomUser TEXT PRIMARY KEY, nom TEXT, prenom TEXT, courriel TEXT, password TEXT, telephone TEXT)";
        String table2="CREATE TABLE "+TABLE_Animal+"(Id INTEGER PRIMARY KEY AUTOINCREMENT, nomAnimal TEXT, description TEXT, categorie TEXT)";

        db.execSQL(table1);
        db.execSQL(table2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_User);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_Animal);
        onCreate(db);
    }
    //Ajout User
    public long insert_data_user(String nomuser, String nom, String prenom, String courriel, String password, String telephone) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nomuser", nomuser);
        values.put("nom", nom);
        values.put("prenom", prenom);
        values.put("courriel", courriel);
        values.put("password", password);
        values.put("telephone", telephone);
        return  db.insert(TABLE_User, null, values);

    }


    //Ajout Animal
    public long insert_data_animal(String nomAnimal, String description, String categorie) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues valuesAnimal = new ContentValues();
        valuesAnimal.put("nomAnimal", nomAnimal);
        valuesAnimal.put("description", description);
        valuesAnimal.put("categorie", categorie);

        return db.insert(TABLE_Animal, null, valuesAnimal);

    }
}
