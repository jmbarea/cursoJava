package academia;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Academia {

    private String nombre;
    private String direccion;
    
    private Map<Integer, Alumno> mapAlumnos;
    private Map<Integer, Profesor> mapProfesores;
    private Map<Integer, Asignatura> mapAsignaturas;
    private Map<String, Aula> mapAulas;
    
    public void addAlumno(Alumno alumno) {
        
        mapAlumnos.put(alumno.getId(), alumno);
    }
    
    public void removeAlumno(Integer idAlumno) {
        
        mapAlumnos.remove(idAlumno);
    }
    
    public void addProfesor(Profesor profesor) {
        
        mapProfesores.put(profesor.getId(), profesor);
    }
    
    public void removeProfesor(Integer idProfesor) {
        
        mapProfesores.remove(idProfesor);
    }
    
    public void addAsignatura(Asignatura asignatura) {
        
        mapAsignaturas.put(asignatura.getId(), asignatura);
        
        //asignatura.getProfesor().addAsignatura(asignatura);
        //asignatura.getAula().addAsignatura(asignatura);
    }
    
    public void removeAsignatura(Integer idAsignatura) {
        
        mapAsignaturas.remove(idAsignatura);
    }
    
    public void addAula(Aula aula) {
        
        mapAulas.put(aula.getNombre(), aula);
    }
    
    public void removeAula(String nombreAula) {
        
        mapAulas.remove(nombreAula);
    }
    
    public Set<Aula> aulasLibres(int hora) {
        
        Set<Aula> aulasLibres = new TreeSet<Aula>();
        GregorianCalendar gcInicio = new GregorianCalendar();
        GregorianCalendar gcFin = new GregorianCalendar();
        int horaInicio;
        int horaFin;
        
        aula:
        for(Aula aula : mapAulas.values()) {
            
            for(Asignatura asignatura : aula.getAsignaturas()) {
                
                gcInicio.setTime(asignatura.getInicio());
                gcFin.setTime(asignatura.getFin());
                horaInicio = gcInicio.get(Calendar.HOUR_OF_DAY);
                horaFin = gcFin.get(Calendar.HOUR_OF_DAY);
                
                if (hora >= horaInicio && hora < horaFin) {
                    
                    continue aula;
                }
            }
            aulasLibres.add(aula);
        }
        
        return aulasLibres;
    }

    
    //Getters y Setters:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Map<Integer, Alumno> getMapAlumnos() {
        return mapAlumnos;
    }

    public void setMapAlumnos(Map<Integer, Alumno> mapAlumnos) {
        this.mapAlumnos = mapAlumnos;
    }

    public Map<Integer, Profesor> getMapProfesores() {
        return mapProfesores;
    }

    public void setMapProfesores(Map<Integer, Profesor> mapProfesores) {
        this.mapProfesores = mapProfesores;
    }

    public Map<Integer, Asignatura> getMapAsignaturas() {
        return mapAsignaturas;
    }

    public void setMapAsignaturas(Map<Integer, Asignatura> mapAsignaturas) {
        this.mapAsignaturas = mapAsignaturas;
    }

    public Map<String, Aula> getMapAulas() {
        return mapAulas;
    }

    public void setMapAulas(Map<String, Aula> mapAulas) {
        this.mapAulas = mapAulas;
    }
    
}
