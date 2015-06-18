package ar.com.serafinfernandez.proyectopds.clases;

import java.util.Date;

/**
 * Created by serafin on 16/06/15.
 */
public class Partido {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Cancha cancha;
    private Date fechaHora;
    private Arbitro arbitro;
    private Deporte deporte;

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Cancha cancha, Date fechaHora, Arbitro arbitro, Deporte deporte) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cancha = cancha;
        this.fechaHora = fechaHora;
        this.arbitro = arbitro;
        this.deporte = deporte;
    }
}
