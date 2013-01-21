package academia;

import java.util.Set;

public class Aula {
    
    private String nombre;
    private int capacidad;
    private boolean tieneProyector;
    
    private Set<Asignatura> asignaturas;
    
    
    public void addAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }
    
    public void removeAsignatura(Asignatura asignatura) {
        asignaturas.remove(asignatura);
    }
    
    
    //Getters y Setters:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isTieneProyector() {
        return tieneProyector;
    }

    public void setTieneProyector(boolean tieneProyector) {
        this.tieneProyector = tieneProyector;
    }

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Set<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
