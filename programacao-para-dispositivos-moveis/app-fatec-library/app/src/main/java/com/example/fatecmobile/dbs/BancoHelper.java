package com.example.fatecmobile.dbs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoHelper extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "BIBLIOTECA.db";
    public static final String TABELAUSUARIOS = "USUARIOS";
    public static final String TABELALIVROS = "LIVROS";

    private static final int VERSAO_SCHEMA = 2;
    private final String S_CREATE;
    private final String S_CREATE2;

    public BancoHelper(Context context) {
        super(context, NOME_BANCO, null, VERSAO_SCHEMA);
        this.S_CREATE = "CREATE TABLE USUARIOS (ID INTEGER PRIMARY KEY AUTOINCREMENT,LOGIN TEXT,SENHA TEXT,STATUS TEXT,TIPO TEXT);";
        this.S_CREATE2 = "CREATE TABLE LIVROS (ID INTEGER PRIMARY KEY AUTOINCREMENT,TITULO TEXT,AUTOR TEXT,EDITORA TEXT,GENERO TEXT);";
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(S_CREATE);
        db.execSQL(S_CREATE2);
        db.execSQL("INSERT INTO USUARIOS values (1, 'pedro','pedro','ativo','admin')");
        db.execSQL("INSERT INTO LIVROS values (1, 'Clean Code','Uncle Bob','American IT','Programacao')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELAUSUARIOS);
        db.execSQL("DROP TABLE IF EXISTS " + TABELALIVROS);
        onCreate(db);
    }
}
