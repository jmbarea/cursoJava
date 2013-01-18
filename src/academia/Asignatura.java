package academia;

import java.util.Date;
import java.util.Set;

public class Asignatura {
    Integer id;
    String nombre;
    Profesor profesor;
    Aula aula;
    int horas;
    Date inicio;
    Date fin;
    Set<Alumno> alumnos;
    
    public void addAlumno(Alumno alumno){
        
    }
    public void removeAlumno(Alumno alumno){
        
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
    
    
}
