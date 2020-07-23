package cursosonline.Dao;
import Utileria.Util;
import cursosonline.entidades.Curso;
import cursosonline.entidades.Estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstudianteDaoImp implements EstudianteDAO{

   
    @Override
    public void ingresar(Estudiante estudiante) {
        String query = "INSERT INTO public.estudiantes(nombres, apellidos, email) VALUES (?, ?, ?);";
        Connection conn;
          try {
              conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);
              
              PreparedStatement stm = conn.prepareStatement(query);
              stm.setString(1, estudiante.getNombres());
              stm.setString(2, estudiante.getApellidos());
              stm.setString(3, estudiante.getEmail());
              stm.execute();
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
    @Override
    public void actualizar(Estudiante estudiante) {
      
        Connection conn;
          try {
              conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);
                String query = "UPDATE public.estudiantes SET nombres=?, apellidos=?, email=? WHERE id=?";
              
              PreparedStatement stm = conn.prepareStatement(query);
              stm.setString(1, estudiante.getNombres());
              stm.setString(2, estudiante.getApellidos());
              stm.setString(3, estudiante.getEmail());
              stm.setInt(4, estudiante.getId());
              stm.execute();
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
    @Override
    public void eliminar(int id) {
       
        Connection conn;
          try {
              
              conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);
              String query = "DELETE FROM public.estudiantes WHERE id=?";
              PreparedStatement stm = conn.prepareStatement(query);
              stm.setInt(1,id);
              stm.execute();
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

    @Override
    public List<Curso> getCursosPorEstudiante(int estudianteId) {
        String query = "SELECT cursos.id, cursos.nombre"
	             +"FROM public.cursos "
	             +"inner join cursos_estudiantes on cursos.id = cursos_estudiantes.cursos_id"
	             +"where estudiantes_id=?;";
        
         List<Curso> cursos = new ArrayList<Curso>();
        Connection con;
        try {
            con = DriverManager.getConnection(Util.url, Util.usuario, Util.password);

            PreparedStatement stm = con.prepareStatement(query);
            stm.setInt(1, estudianteId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Curso curso = new Curso(rs.getInt(1), rs.getString(2));
                cursos.add(curso);
            }

        } catch (SQLException ex) {
            Logger.getLogger(EstudianteDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cursos;
    }

    @Override
    public List<Estudiante> getEstudiante() {
        String sql = "SELECT id, nombres, apellidos, email FROM estudiantes";
        List<Estudiante> estudiante = new ArrayList<>();
        Connection con;

        try {
            con = DriverManager.getConnection(Util.url, Util.usuario, Util.password);

            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Estudiante estudiant = new Estudiante(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                estudiante.add(estudiant);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return estudiante;
    }
    }

  





