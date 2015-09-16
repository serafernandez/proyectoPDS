package ar.com.serafinfernandez.proyectopds.clases;

import java.util.Date;

/**
 * Created by serafin on 16/06/15.
 */
public class Fixture {
    private Equipo[] equipos = new Equipo[4];
    private Cancha[] canchas = new Cancha[1];
    private Arbitro[] arbitros = new Arbitro[2];
    private Deporte deporte;
    private Partido[] partidos = new Partido[4];

    public Fixture( String deporte ){
        this.deporte = new Deporte(deporte);
        this.verificaDisponibilidadEquipo();
        this.verificarDisponibilidadArbitro();
        this.verificarDisponibilidadCancha();
        this.planificarPartidos();
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }

    public Arbitro[] getArbitros() {
        return arbitros;
    }

    public void setArbitros(Arbitro[] arbitros) {
        this.arbitros = arbitros;
    }

    public Cancha[] getCanchas() {
        return canchas;
    }

    public void setCanchas(Cancha[] canchas) {
        this.canchas = canchas;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public void verificaDisponibilidadEquipo(){
        // Consulto en BD por equipos con disponibilidad
        this.equipos[0] = new Equipo("IUA");
        this.equipos[1] = new Equipo("UNC");
        this.equipos[2] = new Equipo("UTN");
        this.equipos[3] = new Equipo("UCC");
    }

    public void verificarDisponibilidadCancha(){
        this.canchas[0] = new Cancha("La cancha de Tito");
    }

    public void verificarDisponibilidadArbitro(){
        this.arbitros[0] = new Arbitro("Pedro Aznar");
        this.arbitros[1] = new Arbitro("Freddie Mercury");
    }

    public void planificarPartidos(){
        this.partidos[0] = new Partido(this.equipos[1], this.equipos[3], this.canchas[0], new Date("23/07/2015 15:25"), this.arbitros[1], this.deporte);
        this.partidos[1] = new Partido(this.equipos[0], this.equipos[2], this.canchas[0], new Date("24/07/2015 15:25"), this.arbitros[0], this.deporte);
        this.partidos[2] = new Partido(this.equipos[1], this.equipos[3], this.canchas[0], new Date("25/07/2015 15:25"), this.arbitros[1], this.deporte);
        this.partidos[3] = new Partido(this.equipos[1], this.equipos[3], this.canchas[0], new Date("26/07/2015 15:25"), this.arbitros[0], this.deporte);

    }

    public void generarFixture(){

    }
}