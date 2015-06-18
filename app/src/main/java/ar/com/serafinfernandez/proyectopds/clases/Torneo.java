package ar.com.serafinfernandez.proyectopds.clases;

import java.util.Date;

/**
 * Created by serafin on 16/06/15.
 */
public class Torneo {

    private Equipo equipos[];
    private Date fechaInicio;
    private Date fechaFin;
    private String nombre;

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public Torneo(String nombre, Equipo equipos[], Date fechaInicio, Date fechaFin) {
        this.equipos = equipos;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
