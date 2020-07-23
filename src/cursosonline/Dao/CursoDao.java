
package cursosonline.Dao;

import cursosonline.entidades.Curso;
import cursosonline.entidades.Estudiante;
import java.util.List;


public interface CursoDao {
    void ingresar(Curso cursos);
    void actualizar(Curso cursos);
    void eliminar(int id);
    List<Curso> getCurso();
    List<Estudiante> getEstudiantesPorCurso(int cursoId);

   
    
}
