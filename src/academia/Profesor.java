package academia;

import java.util.Set;

public class Profesor extends Persona {

    Set<Asignatura> asignaturasProfesor;

    public Set<Asignatura> getAsignaturas() {
        return asignaturasProfesor;
    }

    public Profesor(int id, String nombre, String direccion) {
        super(id, nombre, direccion);
    }

    @Override
    public void addAsignatura(Asignatura asignatura) {
        this.asignaturasProfesor.add(asignatura);
    }

    @Override
    public void removeAsignatura(Asignatura asignatura) {
        this.asignaturasProfesor.remove(asignatura);
    }
}
