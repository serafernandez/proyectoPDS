package ar.com.serafinfernandez.proyectopds.clases;

import android.widget.Toast;

import java.util.Date;

/**
 * Created by serafin on 16/06/15.
 */
public class InscripcionTorneo {

    private Torneo torneo;
    private Equipo equipo;
    private Date fechaInicio;
    private Date fechaFin;
    private String capitan;
    private String telefonoCapitan;
    private String direccionCapitan;
    private String estado;
    private String motivo;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public String getTelefonoCapitan() {
        return telefonoCapitan;
    }

    public void setTelefonoCapitan(String telefonoCapitan) {
        this.telefonoCapitan = telefonoCapitan;
    }

    public String getDireccionCapitan() {
        return direccionCapitan;
    }

    public void setDireccionCapitan(String direccionCapitan) {
        this.direccionCapitan = direccionCapitan;
    }

    public InscripcionTorneo(String nombreTorneo, String nombreEquipo){
        torneo = new Torneo(nombreTorneo);
        equipo = new Equipo(nombreEquipo);
    }



    public String consultarEstadoTorneo(){
        // Busco en BD el torneo por el nombre y creo el objeto
        // Consulto el estado del torneo
        return "disponible";
    }

    public void consultarEquipo(){
        // Busco en BD el equipo por el nombre y creo el objeto
        // Corroboro los datos del equipo
    }

    public void generarSolicitudInscripcion(){
        // Guardar solicitud en BD
    }

}
