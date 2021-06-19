package com.example.fatecmobile.telas;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
//import android.support.*;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fatecmobile.R;
import com.example.fatecmobile.modelos.UsuarioBean;
import com.example.fatecmobile.telas.livros.AddLivroActivity;
import com.example.fatecmobile.telas.livros.ListLivroActivity;
import com.example.fatecmobile.telas.livros.ListLivroParamActivity;
import com.example.fatecmobile.telas.usuario.AddUsuActivity;
import com.example.fatecmobile.telas.usuario.ListUsuActivity;
import com.example.fatecmobile.telas.usuario.ListUsuParamActivity;

public class MenuActivity extends AppCompatActivity {

    Button addUsu, addMer, listUsu, listMer, listUsuPar, listMerPar;
    TextView textUsuLogado;
    UsuarioBean usuLogado;
    String teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Thema Dark
        //setTheme(R.style.ThemeOverlay_AppCompat_Dark);

        setContentView(R.layout.activity_menu);
        Intent it = getIntent();
        usuLogado = (UsuarioBean) it.getSerializableExtra("UsuarioLogado");
        textUsuLogado = (TextView) findViewById(R.id.lbUsuLogado);
        textUsuLogado.setText("Usuario Logado: " + usuLogado.getLogin());

        listUsu = (Button) findViewById(R.id.btlistusu);
        listUsu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MenuActivity.this, ListUsuActivity.class);
                startActivity(it);
            }
        });

        listUsuPar = (Button) findViewById(R.id.btlistusuParam);
        listUsuPar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MenuActivity.this, ListUsuParamActivity.class);
                startActivity(it);
            }
        });

        addUsu = (Button) findViewById(R.id.btnovousu);
        addUsu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MenuActivity.this, AddUsuActivity.class);
                startActivity(it);
            }
        });

        //mercadorias
        listMer = (Button) findViewById(R.id.btlistmer);
        listMer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MenuActivity.this, ListLivroActivity.class);
                startActivity(it);
            }
        });

        listMerPar = (Button) findViewById(R.id.btlistParamMercadorias);
        listMerPar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MenuActivity.this, ListLivroParamActivity.class);
                startActivity(it);
            }
        });

        addMer = (Button) findViewById(R.id.btnovomer);
        addMer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MenuActivity.this, AddLivroActivity.class);
                startActivity(it);
            }
        });
    }

}
