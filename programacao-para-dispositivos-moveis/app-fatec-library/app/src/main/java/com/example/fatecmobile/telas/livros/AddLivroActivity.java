package com.example.fatecmobile.telas.livros;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fatecmobile.R;
import com.example.fatecmobile.dbs.ControllerLivro;
import com.example.fatecmobile.modelos.LivroBean;

public class AddLivroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_livros);
        final ControllerLivro controle = new ControllerLivro(getBaseContext());
        Button Inserir = (Button) findViewById(R.id.btinserirLivro);

        Inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText titulo  = findViewById(R.id.titulo);
                EditText autor  = findViewById((R.id.autor));
                EditText editora = findViewById(R.id.editora);
                EditText genero   = findViewById(R.id.genero);

                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();
                String generoString = genero.getText().toString();

                LivroBean livro = new LivroBean();
                livro.setId("");
                livro.setTitulo(tituloString);
                livro.setAutor(autorString);
                livro.setEditora(editoraString);
                livro.setGenero(generoString);
                String msg = controle.inserir(livro);
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });
    }
}
