package academia;

import java.util.Date;
import java.util.Set;

public class Asignatura {
    private Integer id;
    private String nombre;
    private Profesor profesor;
    private Aula aula;
    private int horas;
    private Date inicio;
    private Date fin;
    private Set<Alumno> alumnos;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Aula getAula() {
        return aula;
    }

    public int getHoras() {
        return horas;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
//        // asignaturas actuales del alumno
//        Set<Asignatura> asignaturas = alumno.getAsignaturas();
//        
//        // 
//        if(!asignaturas.contains(this)){
//            alumnos.add(alumno);
//        }
        
    }
    public void removeAlumno(Alumno alumno){
        this.alumnos.remove(alumno);
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
    
    
}
