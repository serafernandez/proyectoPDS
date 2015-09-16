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
import android.widget.Toast;

import ar.com.serafinfernandez.proyectopds.clases.InscripcionTorneo;


public class UIInscripcionTorneo extends ActionBarActivity {

    InscripcionTorneo inscripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion_torneo);
        setToolbar();
        setAcciones();
    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar)findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Inscripcion a Torneo Interuniversitario");
        setSupportActionBar(toolbar);
    }

    public void setAcciones(){
        Button botonAceptar = (Button) findViewById(R.id.botonAceptarInscripcionTorneo);
        Button botonCancelar = (Button) findViewById(R.id.botonCancelarInscripcionTorneo);
        final EditText nombreEquipo = (EditText) findViewById(R.id.nombreEquipo);
        final EditText nombreCapitan = (EditText) findViewById(R.id.nombreCapitan);
        final EditText telefonoCapitan = (EditText) findViewById(R.id.telefonoCapitan);
        final EditText direccionCapitan = (EditText) findViewById(R.id.direccionCapitan);


        final Activity self = this;

        botonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(self, "Inscipcion cancelada", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(self, MainActivity.class));
            }
        });

        botonAceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(nombreEquipo.getText().toString().equals(""))
                    Toast.makeText(self, "Debes completar el nombre del equipo", Toast.LENGTH_SHORT).show();
                else if(nombreCapitan.getText().toString().equals(""))
                    Toast.makeText(self, "Debes completar el nombre del capitan", Toast.LENGTH_SHORT).show();
                else if(telefonoCapitan.getText().toString().equals(""))
                    Toast.makeText(self, "Debes completar el telefono del capitan", Toast.LENGTH_SHORT).show();
                else if(direccionCapitan.getText().toString().equals(""))
                    Toast.makeText(self, "Debes completar la direccion del capitan", Toast.LENGTH_SHORT).show();
                else {
                    inscripcion = new InscripcionTorneo("Interuniversitario", "IUA");
                    String estado = inscripcion.consultarEstadoTorneo();
                    if (estado == "disponible") {
                        Toast.makeText(self, "Inscripcion enviada", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(self, MainActivity.class));
                    }
                }
            }
        });
    }
}
