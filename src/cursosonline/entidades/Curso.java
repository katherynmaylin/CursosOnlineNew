
package cursosonline.entidades;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    int id;
    String nombre;
    private List<Estudiante> estudiantes= new ArrayList<>();
    
    
     public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public Curso() {}
    public Curso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + '}';
    }
  }
   
    

