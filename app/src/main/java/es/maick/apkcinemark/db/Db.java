package es.maick.apkcinemark.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Db extends SQLiteOpenHelper {

    SQLiteDatabase db;
    String SQL;

    public Db(@Nullable Context context ) {
        super(context, "Cinemark.db", null, 1);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Usuario ( id integer, Nombres text, Apellidos text, Correo text, Telefono text, Genero txt, FechaNacimiento text, Dni text, Ciudad text, Teatro text, GeneroPelicula text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
