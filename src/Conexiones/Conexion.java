
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static String url =  "jdbc:postgresql://localhost/CursosOnline";
    static String usuario="postgres";
    static String password="1234";

    static Connection conn = null;
    public static Connection conector() {
        
         
            
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(url,usuario, password);
            } catch (Exception e) {
                System.out.println("Ocurrio un error : "+e.getMessage());
            }
            System.out.println("La conexión se realizo sin problemas! => " + "Angelo silva pincay");
          return conn;  
    }
  public static void cerrar() throws SQLException {
      if (conn != null) {
         conn.close();
      }
   }
    
}
