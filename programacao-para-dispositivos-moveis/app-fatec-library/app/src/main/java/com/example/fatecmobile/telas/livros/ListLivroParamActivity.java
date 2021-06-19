package com.example.fatecmobile.telas.livros;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fatecmobile.R;
import com.example.fatecmobile.dbs.ControllerLivro;
import com.example.fatecmobile.modelos.LivroBean;

import java.util.List;

public class ListLivroParamActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    ListView ListaDeAlunos;
    List<LivroBean> livros;
    Button pesqTer;
    ArrayAdapter<LivroBean> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Thema Dark
        //setTheme(R.style.ThemeOverlay_AppCompat_Dark);

        setContentView(R.layout.activity_list_livros_param);
        final Context con = getBaseContext();
        final ControllerLivro controle = new ControllerLivro(con);
        ListaDeAlunos = (ListView) findViewById(R.id.listamer);
        ListaDeAlunos.setOnItemClickListener(this); // Clique no item
        ListaDeAlunos.setOnItemLongClickListener(this); //
        final EditText titulo = (EditText)findViewById(R.id.titulo);

        pesqTer = (Button) findViewById(R.id.btpesquisarLivros);
        pesqTer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String titulotring = titulo.getText().toString();
                LivroBean livro = new LivroBean();
                livro.setTitulo(titulotring);
                livros = controle.listarLivros(livro);
                adapter = new ArrayAdapter<>(con,android.R.layout.simple_list_item_1, livros);
                ListaDeAlunos.setAdapter(adapter);
            }
        });
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        // Código para trabalhar com o item que foi pressionado
        // position é a posição do item no adapter
        LivroBean livro = (LivroBean) parent.getItemAtPosition(position);
        Intent it = new Intent(ListLivroParamActivity.this, UptLivroActivity.class);
        it.putExtra("Livro",livro);
        startActivity(it);
        Toast.makeText(getApplicationContext(),"Item Pressionado :-" + position + " ID= " + livro.getId(),Toast.LENGTH_LONG).show();
        return true;
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Código para trabalhar com o item que foi clicado
        // position é a posição do item no adapter
        LivroBean livro = (LivroBean) parent.getItemAtPosition(position);
        Intent it = new Intent(ListLivroParamActivity.this, UptLivroActivity.class);
        it.putExtra("Livro",livro);
        startActivity(it);
        Toast.makeText(getApplicationContext(),"Item Click :-" + position + " ID= " + livro.getId(),Toast.LENGTH_LONG).show();
    }
}