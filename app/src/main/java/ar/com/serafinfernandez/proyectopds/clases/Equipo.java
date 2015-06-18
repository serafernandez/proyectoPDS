package ar.com.serafinfernandez.proyectopds.clases;

/**
 * Created by serafin on 16/06/15.
 */
public class Equipo {

    private Jugador juegadores[];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador[] getJuegadores() {
        return juegadores;
    }

    public void setJuegadores(Jugador[] juegadores) {
        this.juegadores = juegadores;
    }

    private String nombre;

    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public void mostrarDatos(){

    }

    public void informarActualizacionSolicitud(String motivo){
        // Enviar por email al capitan
    }

}
