
package cursosonline.Dao;

import cursosonline.entidades.Curso;
import java.util.List;


public interface CursoDao {
    List<Curso> getCursos();
      public void ingresar(Curso cursos);

    public void actualizar(Curso cursos);

    public void eliminar(int id);
}
