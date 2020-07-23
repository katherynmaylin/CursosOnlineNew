
package cursosonline.entidades;

import java.util.ArrayList;
import java.util.List;


public class Estudiante {
     private int id;
    private String nombres;
    private String apellidos;
    private String email;
    private List<Curso> cursos = new ArrayList<>();

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public Estudiante(){}
    public Estudiante(int id, String nombres, String apellidos, String email){
    
    this.id= id;
    this.nombres=nombres;
    this.apellidos=apellidos;
    this.email=email;
    
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", nombre=" + nombres + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
    
}
