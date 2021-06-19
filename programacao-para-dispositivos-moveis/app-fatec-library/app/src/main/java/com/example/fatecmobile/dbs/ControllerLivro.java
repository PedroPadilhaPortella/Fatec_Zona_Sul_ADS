package com.example.fatecmobile.dbs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.fatecmobile.modelos.LivroBean;

import java.util.ArrayList;
import java.util.List;

public class ControllerLivro {

    private static BancoHelper dbHelper = null;
    private static SQLiteDatabase db = null;

    public ControllerLivro(Context context) {
        if (dbHelper == null ) {
            dbHelper = new BancoHelper(context);
        }
    }

    public String inserir(LivroBean livro) {
        db = dbHelper.getWritableDatabase();
        ContentValues valores;
        long resultado;
        String retorno;
        valores = new ContentValues();
        valores.put("TITULO", livro.getTitulo());
        valores.put("AUTOR", livro.getAutor());
        valores.put("EDITORA", livro.getEditora());
        valores.put("GENERO", livro.getGenero());
        resultado = db.insert(BancoHelper.TABELALIVROS, null, valores);
        db.close();

        if (resultado == -1) {
            retorno = "Erro ao inserir registro";
        } else {
            retorno = "Registro Inserido com sucesso";
        }
        return retorno;
    }

    public String excluir(LivroBean livro) {
        String retorno = "Resgistro Excluir com Sucesso";
        String where = "ID = " + livro.getId();
        db = dbHelper.getReadableDatabase();
        db.delete(BancoHelper.TABELALIVROS,where,null);
        db.close();
        return retorno;
    }

    public String alterar(LivroBean livro) {
        db = dbHelper.getWritableDatabase();
        ContentValues valores;
        String retorno = "Registro Alterado com sucesso";
        String where = "ID = " + livro.getId();
        valores = new ContentValues();
        valores.put("TITULO", livro.getTitulo());
        valores.put("AUTOR", livro.getAutor());
        valores.put("EDITORA", livro.getEditora());
        valores.put("GENERO", livro.getGenero());
        db.update(BancoHelper.TABELALIVROS, valores,where,null);
        db.close();
        return retorno;
    }

    public List<LivroBean> listarLivros() {
        List<LivroBean> livros = new ArrayList<>();
        String selectQuery = "SELECT * FROM LIVROS" ;
        db = dbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                LivroBean livro = new LivroBean();
                livro.setId(""+cursor.getInt(0));
                livro.setTitulo(cursor.getString(1));
                livro.setAutor(cursor.getString(2));
                livro.setEditora(cursor.getString(3));
                livro.setGenero(cursor.getString(4));
                livros.add(livro);
            } while (cursor.moveToNext());
        }
        return livros;
    }

        public List<LivroBean> listarLivros(LivroBean livroEntrada) {
        List<LivroBean> livros = new ArrayList<>();
        String parametro = livroEntrada.getTitulo();
        String selectQuery = "SELECT ID, TITULO, AUTOR, EDITORA, GENERO FROM LIVROS WHERE TITULO LIKE ?" ;
        String[] whereArgs = new String[] { "%" + parametro + "%"  };
        db = dbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, whereArgs);
        if (cursor.moveToFirst()) {
            do {
                LivroBean livro = new LivroBean();
                livro.setId(""+cursor.getInt(0));
                livro.setTitulo(cursor.getString(1));
                livro.setAutor(cursor.getString(2));
                livro.setEditora(cursor.getString(3));
                livro.setGenero(cursor.getString(4));
                livros.add(livro);
            } while (cursor.moveToNext());
        }
        return livros;
    }

    public LivroBean validarLivro(LivroBean livroEntrada) {
        LivroBean livro = new LivroBean();
        String titulo = '"' + livroEntrada.getTitulo().trim() + '"';
        String autor = '"' + livroEntrada.getAutor().trim() + '"';
        String editora = '"' + livroEntrada.getEditora().trim() + '"';
        String genero = '"' + livroEntrada.getGenero().trim() + '"';

        String selectQuery = "SELECT ID, TITULO, AUTOR, EDITORA, GENERO FROM LIVROS WHERE TITULO = ? AND GENERO = ? " ;
        String[] whereArgs = new String [] {titulo, genero};
        db = dbHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, whereArgs);
        livro.setTitulo("0 = " + titulo + "1 = " + genero);
        if (cursor.moveToFirst()) {
            do {
                livro.setId(""+cursor.getInt(0));
                livro.setTitulo(cursor.getString(1));
                livro.setAutor(cursor.getString(2));
                livro.setEditora(cursor.getString(3));
                livro.setGenero(cursor.getString(4));
            } while (cursor.moveToNext());
        }
        return livro;
    }

    public List<LivroBean> listarLivrosTeste() {
        List<LivroBean> livros = new ArrayList<>();
        for (int i = 0; i < 10; i++ ) {
            LivroBean livro = new LivroBean();
            livro.setId(" Id " + i);
            livro.setTitulo(" Titulo " + i);
            livro.setAutor("  " + i);
            livro.setEditora(" CPF " + i);
            livro.setGenero(" Genero " + i);

            livros.add(livro);
        }
        return livros;
    }



}
