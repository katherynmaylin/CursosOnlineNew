
package cursosonline.Dao;

import cursosonline.entidades.CursoEstudiante;
import java.util.List;

public interface cursoestudianteDAO {
    List<CursoEstudiante> getCurso_Estudi();
	public void ingresar(CursoEstudiante curestu);
	public void actualizar(CursoEstudiante curestu);
	public void eliminar(int id);
}
