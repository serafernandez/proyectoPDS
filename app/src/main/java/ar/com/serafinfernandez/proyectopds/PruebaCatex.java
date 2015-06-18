package ar.com.serafinfernandez.proyectopds;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class PruebaCatex extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_catex);
        setToolbar();
        darFuncionalidad();
    }

    public void darFuncionalidad(){
        final EditText texto = (EditText) findViewById(R.id.texto);
        Button botonTexto = (Button) findViewById(R.id.botonTexto);
        final Activity self = this;
        botonTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(self, texto.getText().toString(), Toast.LENGTH_LONG).show();
                startActivity(new Intent(self, MainActivity.class));
            }
        });

    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Prueba Catex");
        setSupportActionBar(toolbar);
    }


}
