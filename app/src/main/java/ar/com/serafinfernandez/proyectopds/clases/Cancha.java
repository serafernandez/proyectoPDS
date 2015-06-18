package ar.com.serafinfernandez.proyectopds.clases;

/**
 * Created by serafin on 16/06/15.
 */
public class Cancha {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public Cancha(String nombre){
        this.nombre = nombre;
    }
}
