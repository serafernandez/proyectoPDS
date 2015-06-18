package ar.com.serafinfernandez.proyectopds;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import ar.com.serafinfernandez.proyectopds.clases.Fixture;


public class GenerarFixture extends ActionBarActivity {

    Fixture fixture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generar_fixture);
        setToolbar();
        this.setAcciones();
    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        toolbar.setTitle("Armar fixture del torneo");
        setSupportActionBar(toolbar);
    }


    public void setAcciones(){
        TextView equipoLocal1 = (TextView) findViewById(R.id.equipoLocal1);
        TextView equipoVisitante1 = (TextView) findViewById(R.id.equipoVisitante1);
        TextView cancha1 = (TextView) findViewById(R.id.cancha1);
        TextView arbitro1 = (TextView) findViewById(R.id.arbitro1);
        TextView horario1 = (TextView) findViewById(R.id.horario1);

        TextView equipoLocal2 = (TextView) findViewById(R.id.equipoLocal2);
        TextView equipoVisitante2 = (TextView) findViewById(R.id.equipoVisitante2);
        TextView cancha2 = (TextView) findViewById(R.id.cancha2);
        TextView arbitro2 = (TextView) findViewById(R.id.arbitro2);
        TextView horario2 = (TextView) findViewById(R.id.horario2);

        TextView equipoLocal3 = (TextView) findViewById(R.id.equipoLocal3);
        TextView equipoVisitante3 = (TextView) findViewById(R.id.equipoVisitante3);
        TextView cancha3 = (TextView) findViewById(R.id.cancha3);
        TextView arbitro3 = (TextView) findViewById(R.id.arbitro3);
        TextView horario3 = (TextView) findViewById(R.id.horario3);

        TextView equipoLocal4 = (TextView) findViewById(R.id.equipoLocal4);
        TextView equipoVisitante4 = (TextView) findViewById(R.id.equipoVisitante4);
        TextView cancha4 = (TextView) findViewById(R.id.cancha4);
        TextView arbitro4 = (TextView) findViewById(R.id.arbitro4);
        TextView horario4 = (TextView) findViewById(R.id.horario4);

        fixture = new Fixture("Futbol");

        fixture.generarFixture();

        equipoLocal1.setText("Equipo Local: " + fixture.getPartidos()[0].getEquipoLocal().getNombre());
        equipoVisitante1.setText("Equipo Visitante: "+fixture.getPartidos()[0].getEquipoVisitante().getNombre());
        cancha1.setText("Cancha: "+fixture.getPartidos()[0].getCancha().getNombre());
        arbitro1.setText("Arbitro: "+fixture.getPartidos()[0].getArbitro().getNombre());
        horario1.setText("Fecha: " + fixture.getPartidos()[0].getFechaHora().toString());

        equipoLocal2.setText("Equipo Local: "+fixture.getPartidos()[1].getEquipoLocal().getNombre());
        equipoVisitante2.setText("Equipo Visitante: "+fixture.getPartidos()[1].getEquipoVisitante().getNombre());
        cancha2.setText("Cancha: "+fixture.getPartidos()[1].getCancha().getNombre());
        arbitro2.setText("Arbitro: "+fixture.getPartidos()[1].getArbitro().getNombre());
        horario2.setText("Fecha: "+fixture.getPartidos()[1].getFechaHora().toString());

        equipoLocal3.setText("Equipo Local: "+fixture.getPartidos()[2].getEquipoLocal().getNombre());
        equipoVisitante3.setText("Equipo Visitante: "+fixture.getPartidos()[2].getEquipoVisitante().getNombre());
        cancha3.setText("Cancha: "+fixture.getPartidos()[2].getCancha().getNombre());
        arbitro3.setText("Arbitro: "+fixture.getPartidos()[2].getArbitro().getNombre());
        horario3.setText("Fecha: "+fixture.getPartidos()[2].getFechaHora().toString());

        equipoLocal4.setText("Equipo Local: "+fixture.getPartidos()[3].getEquipoLocal().getNombre());
        equipoVisitante4.setText("Equipo Visitante: "+fixture.getPartidos()[3].getEquipoVisitante().getNombre());
        cancha4.setText("Cancha: "+fixture.getPartidos()[3].getCancha().getNombre());
        arbitro4.setText("Arbitro: "+fixture.getPartidos()[3].getArbitro().getNombre());
        horario4.setText("Fecha: "+fixture.getPartidos()[3].getFechaHora().toString());

    }

}
