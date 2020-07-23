
package cursosonline.Test;

import cursosonline.Dao.CursoDao;
import cursosonline.Dao.EstudianteDAO;
import cursosonline.Dao.EstudianteDaoImp;
import cursosonline.Dao.cursoDaoImp;
import cursosonline.Dao.cursoEstudianteDaoImp;
import cursosonline.Dao.cursoestudianteDAO;
import cursosonline.entidades.CursoEstudiante;

public class Prueba {
   

    public static void main(String[] args) {
        EstudianteDAO estudiaDAO = new EstudianteDaoImp();
        CursoDao curDAO = new cursoDaoImp();
        cursoestudianteDAO curestuDAO = new cursoEstudianteDaoImp();

        CursoEstudiante curestu = new CursoEstudiante(8, 2, 1);
        curestuDAO.ingresar(curestu);
        System.out.println(curestuDAO.getCurso_Estudi());
        
        //CursoDao cursoDao = new cursoDaoImp();
       // List<Estudiante>estudiantes = cursoDao.getEstudiantesPorCurso(1);
        //System.out.println(estudiantes);
        
       // EstudianteDAO estudianteDAO =  new EstudianteDaoImp();
       //List<Curso> cursos2 = estudianteDAO.getCursosPorEstudiante(2);
       //List<Curso> cursos1 = estudianteDAO.getCursosPorEstudiante(1);
        
     //   System.out.println(1);
      //  System.out.println();
      //  System.out.println(3);
        
       // estudianteDAO.ingresar(new Estudiante(0, "katheryn", "vera", "katherynmaylin@outlook.com"));
       // Estudiante estu=new Estudiante(4,"katheryn","vera","kv18@hotmail.com");
        //estudianteDAO.actualizar(estu);
        // Eliminar 
       // Estudiante estudiantes=new Estudiante(6,"katheryn","katheryn","katheryn");
      //   estudianteDAO.eliminar(6);
       
        
        // TODO code application logic here
        /*
        CursoDao  cursoD = new cursoDaoImp();
       
        //Curso cursos=new Curso(0,"Finanzas");
        //cursoD.ingresar(cursos);
        Curso cursos2=new Curso(9,"Finanzas");
        cursoD.eliminar(9);*/
       // for (Estudiante r : estudianteDAO.getEstudiante()){
      //      System.out.println(r.getId() + "-" + r.getNombres()+ "-"+ r.getApellidos()+ "-" + r.getEmail());
       // }
        
       /* for (Curso e : cursoD.getCursos()){
            System.out.println(e.getId() + "-" + e.getNombre());
            
    }*/
     
        }
    }

