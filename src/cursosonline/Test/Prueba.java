
package cursosonline.Test;

import cursosonline.Dao.CursoDao;
import cursosonline.Dao.EstudianteDAO;
import cursosonline.Dao.EstudianteDaoImp;
import cursosonline.Dao.cursoDaoImp;
import cursosonline.entidades.Curso;
import cursosonline.entidades.Estudiante;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        EstudianteDAO estudianteDAO =  new EstudianteDaoImp();
       // estudianteDAO.ingresar(new Estudiante(0, "katheryn", "vera", "katherynmaylin@outlook.com"));
       // Estudiante estu=new Estudiante(4,"katheryn","vera","kv18@hotmail.com");
        //estudianteDAO.actualizar(estu);
        // Eliminar 
        Estudiante estudiantes=new Estudiante(6,"katheryn","katheryn","katheryn");
         estudianteDAO.eliminar(6);
       
        
        // TODO code application logic here
        /*
        CursoDao  cursoD = new cursoDaoImp();
       
        //Curso cursos=new Curso(0,"Finanzas");
        //cursoD.ingresar(cursos);
        Curso cursos2=new Curso(9,"Finanzas");
        cursoD.eliminar(9);*/
        for (Estudiante r : estudianteDAO.getEstudiante()){
            System.out.println(r.getId() + "-" + r.getNombres()+ "-"+ r.getApellidos()+ "-" + r.getEmail());
        }
        
       /* for (Curso e : cursoD.getCursos()){
            System.out.println(e.getId() + "-" + e.getNombre());
            
    }*/
     
        }
    }

