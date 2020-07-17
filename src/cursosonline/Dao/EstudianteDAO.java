
package cursosonline.Dao;

import cursosonline.entidades.Estudiante;
import java.util.List;


public interface EstudianteDAO {
    void ingresar(Estudiante estudiante);
    void actualizar(Estudiante estudiante);
    void eliminar(int id);
    List<Estudiante> getEstudiante();
}
