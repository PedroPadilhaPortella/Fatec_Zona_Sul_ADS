package com.example.fatecmobile.telas.livros;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fatecmobile.R;
import com.example.fatecmobile.dbs.ControllerLivro;
import com.example.fatecmobile.modelos.LivroBean;

import java.util.List;

public class ListLivroActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    ListView ListaLivros;
    List<LivroBean> livros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_livros);
        final ControllerLivro controle = new ControllerLivro(getBaseContext());
        ListaLivros = findViewById(R.id.listamer);
        livros = controle.listarLivros();
        ArrayAdapter<LivroBean> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, livros);
        ListaLivros.setAdapter(adapter);
        ListaLivros.setOnItemClickListener(this);
        ListaLivros.setOnItemLongClickListener(this);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        LivroBean livro = (LivroBean) parent.getItemAtPosition(position);
        Intent it = new Intent(ListLivroActivity.this, UptLivroActivity.class);
        it.putExtra("Livro",livro);
        startActivity(it);
        Toast.makeText(getApplicationContext(),"Item Pressionado :-" + position + " ID= " + livro.getId(),Toast.LENGTH_LONG).show();
        return true;
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        LivroBean livro = (LivroBean) parent.getItemAtPosition(position);
        Intent it = new Intent(ListLivroActivity.this, UptLivroActivity.class);
        it.putExtra("Livro",livro);
        startActivity(it);
        Toast.makeText(getApplicationContext(),"Item Click :-" + position + " ID= " + livro.getId(),Toast.LENGTH_LONG).show();
    }
}
