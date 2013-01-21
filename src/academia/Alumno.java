package academia;

import java.util.Set;

public  class Alumno extends Persona{
    
    Set<Asignatura> asignaturasAlumno;

    public Set<Asignatura> getAsignaturas() {
        return asignaturasAlumno;
    }
    
    public Alumno(int id, String nombre, String direccion) {
        super(id, nombre, direccion);
        
    }    
    @Override
    public void addAsignatura(Asignatura asignatura){
        this.asignaturasAlumno.add(asignatura); 
        asignatura.addAlumno(this);
         
    }
    
    @Override
    public void removeAsignatura(Asignatura asignatura){
        this.asignaturasAlumno.remove(asignatura);
        asignatura.removeAlumno(this);
    }
}
