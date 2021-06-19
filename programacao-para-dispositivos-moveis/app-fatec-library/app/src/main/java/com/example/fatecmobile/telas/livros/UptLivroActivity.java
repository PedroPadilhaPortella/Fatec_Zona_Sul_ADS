package com.example.fatecmobile.telas.livros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fatecmobile.R;
import com.example.fatecmobile.dbs.ControllerLivro;
import com.example.fatecmobile.modelos.LivroBean;

public class UptLivroActivity extends AppCompatActivity {

    Button uptTer, delTer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Thema Dark
        //setTheme(R.style.ThemeOverlay_AppCompat_Dark);

        setContentView(R.layout.activity_upt_livros);
        final ControllerLivro controle = new ControllerLivro(getBaseContext());
        final EditText titulo = (EditText)findViewById(R.id.titulo);
        final EditText autor = (EditText)findViewById((R.id.autor));
        final EditText editora = (EditText)findViewById(R.id.editora);
        final EditText genero = (EditText)findViewById(R.id.genero);
        Intent it = getIntent();
        final LivroBean recuperado = (LivroBean) it.getSerializableExtra("Livro");
        titulo.setText(recuperado.getTitulo());
        autor.setText(recuperado.getAutor());
        editora.setText(recuperado.getEditora());
        genero.setText(recuperado.getGenero());

        uptTer = (Button) findViewById(R.id.btalterar);
        uptTer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();
                String generoString = genero.getText().toString();
                recuperado.setTitulo(tituloString);
                recuperado.setAutor(autorString);
                recuperado.setEditora(editoraString);
                recuperado.setGenero(generoString);
                String msg = controle.alterar(recuperado);
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });

        delTer = (Button) findViewById(R.id.btexcluir);
        delTer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String msg = controle.excluir(recuperado);
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });


    }
}
