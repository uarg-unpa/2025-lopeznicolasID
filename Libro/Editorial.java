package Libro;

public class Editorial {

    private String nombre;
    private int anno;

    public Editorial(String nombre, int anno)
        {
            this.nombre=nombre;
            this.anno=anno;
        }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }

    public int getAnno(){
        return anno;
    }
    public void setAnno(int anno){
    this.anno=anno;
    }
    
}
