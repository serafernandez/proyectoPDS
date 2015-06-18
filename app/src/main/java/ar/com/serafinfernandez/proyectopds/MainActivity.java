package ar.com.serafinfernandez.proyectopds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        setBotones();
    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar)findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Tu Torneo");
        setSupportActionBar(toolbar);
    }

    public void setBotones(){
        Button botonEnviarSolicitud = (Button) findViewById(R.id.botonEnviarSolicitud);
        Button botonRechazarSolicitud = (Button) findViewById(R.id.botonRechazarSolicitud);
        Button botonGenerarFixture = (Button) findViewById(R.id.botonGenerarFixture);
        final Activity self = this;
        botonEnviarSolicitud.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(self, UIInscripcionTorneo.class));
            }
        });

        botonRechazarSolicitud.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(self, UIRevisionSolicitudes.class));
            }
        });

        botonGenerarFixture.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(self, GenerarFixture.class));
            }
        });
    }
}
