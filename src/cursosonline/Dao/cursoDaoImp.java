
package cursosonline.Dao;

import Conexiones.Conexion;
import Utileria.Util;
import cursosonline.entidades.Curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cursoDaoImp implements CursoDao{
    


    @Override
    public List<Curso> getCursos() {
       List<Curso> cursos=new ArrayList<>();
       Connection conn;
        try {
           conn = Conexion.conector();
           String sql="select id, nombre from public.cursos;";
           PreparedStatement stm= conn.prepareStatement(sql);
           ResultSet rs=stm.executeQuery();
           while(rs.next()){
               Curso curso =new Curso(rs.getInt(1), rs.getString(2));
               cursos.add(curso);
               

                       }
        
      }catch (SQLException ex) {
            
              ex.printStackTrace();
         }
        return cursos;
    }
      public void ingresar(Curso cursos) {
        String query = "INSERT INTO public.cursos(nombre) VALUES (?);";
        Connection conn;
          try {
              conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);
              PreparedStatement stm = conn.prepareStatement(query);
              stm.setString(1, cursos.getNombre());
              stm.execute();
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
        
    @Override
    public void actualizar(Curso cursos) {
      String query = "UPDATE public.cursos SET nombre=? WHERE id=?;";
        Connection conn;
          try {
              conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);
              
              PreparedStatement stm = conn.prepareStatement(query);
              stm.setString(1, cursos.getNombre());
              stm.setInt(2, cursos.getId());
              stm.execute();
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
    @Override
    public void eliminar(int id) {
    String query = "DELETE FROM public.cursos WHERE id=?;";
        Connection conn;
          try {
              conn = DriverManager.getConnection(Util.url, Util.usuario, Util.password);
              
              PreparedStatement stm = conn.prepareStatement(query);
              stm.setInt(1,id);
              stm.execute();
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
   }
}
    

