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


public class UIRevisionSolicitudes extends ActionBarActivity {

    InscripcionTorneo inscripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revision_solicitudes);
        setToolbar();
        setAcciones();
    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Rechazar solicitud a equipo IUA");
        setSupportActionBar(toolbar);
    }

    public void setAcciones(){
        Button botonAceptar = (Button) findViewById(R.id.botonAceptarRechazoInscripcion);
        Button botonCancelar = (Button) findViewById(R.id.botonCancelarRechazoInscripcion);
        final EditText motivoRechazoInscripcion = (EditText) findViewById(R.id.motivoRechazo);


        final Activity self = this;

        botonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(self, "Rechazo cancelado", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(self, MainActivity.class));
            }
        });

        botonAceptar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!motivoRechazoInscripcion.getText().toString().equals("")){
                    inscripcion = new InscripcionTorneo("Interuniversitario", "IUA");
                    inscripcion.setMotivo("Falta de pago al cierre de inscripciones");
                    confirmarRechazo();
                    startActivity(new Intent(self, MainActivity.class));
                }else{
                    Toast.makeText(self, "Debe completar el motivo", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void confirmarRechazo(){
        inscripcion.setEstado("Rechazado");
        generarSolicitudRechazo();
    }
    public void generarSolicitudRechazo(){
        // Guardar en BD
        String estado = inscripcion.getEstado();
        inscripcion.getEquipo().informarActualizacionSolicitud(estado);
        Toast.makeText(this, "Solicitud rechazada", Toast.LENGTH_LONG).show();
    }

}
