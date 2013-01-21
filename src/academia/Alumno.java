package academia;

import java.util.Set;

public  class Alumno extends Persona{
    
    Set<Asignatura> asignaturas;

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    
    public Alumno(int id, String nombre, String direccion) {
        super(id, nombre, direccion);
        
    }    
    @Override
    public void addAsignatura(Asignatura asignatura){
        this.asignaturas.add(asignatura);
    }
    
    @Override
    public void removeAsignatura(Asignatura asignatura){
        this.asignaturas.remove(asignatura);
    }
}
