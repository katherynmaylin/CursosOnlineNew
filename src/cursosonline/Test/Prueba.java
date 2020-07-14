
package cursosonline.Test;

import cursosonline.Dao.CursoDao;
import cursosonline.Dao.cursoDaoImp;
import cursosonline.entidades.Curso;

public class Prueba {

    public static void main(String[] args) {
        // TODO code application logic here
        CursoDao  cursoD = new cursoDaoImp();
       
        //Curso cursos=new Curso(0,"Finanzas");
        //cursoD.ingresar(cursos);
        Curso cursos2=new Curso(9,"Finanzas");
        cursoD.eliminar(9);
        for (Curso e : cursoD.getCursos()){
            System.out.println(e.getId() + "-" + e.getNombre());
            
    }
    }
}
