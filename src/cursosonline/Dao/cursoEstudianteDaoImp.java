
package cursosonline.Dao;
import Utileria.Util;
import cursosonline.entidades.CursoEstudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cursoEstudianteDaoImp implements cursoestudianteDAO{
   
    public List<CursoEstudiante> getCurso_Estudi() {
        List<CursoEstudiante> estudiante = new ArrayList<>();
        Connection con;

        try {
            con = DriverManager.getConnection(Util.url, Util.usuario, Util.password);

            String sql = "SELECT id, cursos_id, estudiantes_id\r\n"
                    + "	FROM public.cursos_estudiantes;";

            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                CursoEstudiante estudiant = new CursoEstudiante(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                estudiante.add(estudiant);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiante;

    }

   
    
    @Override
    public void ingresar(CursoEstudiante curestu) {

        String query = "INSERT INTO public.cursos_estudiantes(id, cursos_id, estudiantes_id)VALUES (?, ?, ?)";
        Connection conn;
        try {
            conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);

            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, curestu.getId());
            stm.setInt(2, curestu.getCursos_id());
            stm.setInt(3, curestu.getEsudiantes_id());

            stm.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    public void actualizar(CursoEstudiante curestu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


