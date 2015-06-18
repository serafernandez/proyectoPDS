package ar.com.serafinfernandez.proyectopds;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


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
        final TextView mostrarTexto = (TextView) findViewById(R.id.mostrarTexto);

        botonTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTexto.setText(texto.getText());
            }
        });

    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Prueba Catex");
        setSupportActionBar(toolbar);
    }


}
