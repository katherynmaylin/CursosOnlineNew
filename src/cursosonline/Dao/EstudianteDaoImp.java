package cursosonline.Dao;
import Utileria.Util;
import cursosonline.entidades.Estudiante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public List<Estudiante> getEstudiante() {
        
        List<Estudiante> estudiantes = new ArrayList<>();
        Connection conn;
          try {
              conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);
              String query = "SELECT * FROM public.estudiantes;";
              PreparedStatement stm = conn.prepareStatement(query);
              ResultSet rs = stm.executeQuery();
              while(rs.next()){
                  Estudiante estudiante = new Estudiante(rs.getInt(1),rs.getString(2), rs.getString(3),  rs.getString(4));
                  estudiantes.add(estudiante);
              }
              
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
    }

   

    

   
