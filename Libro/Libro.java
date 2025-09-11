/*Grupo 2/12: Registro de un Libro. 
Crea una clase Libro con atributos: título, autor y editorial (objeto de clase Editorial con nombre y año). 
Puedes agregar otros atributos si lo consideras necesario. 
Incluye constructor completo, 
un método esReciente() (boolean, determina la condición para que sea reciente), 
un método cambiarEditorial() (void, para actualizar la editorial), 
un método contarPaginasEstimadas() (int, determina cómo calcularlo), y toString().
En main, una Scanner para leer datos de al menos dos libros (pueden crear más) e invoca los métodos para verificar si son recientes, 
cambiar la editorial y contar páginas estimadas.*/


package Libro;

public class Libro {
    
    private String titulo;
    private String autor;
    private Editorial editorial;
    private int paginas;

    public Libro(String titulo, String autor, Editorial editorial, int paginas)
        {
            this.titulo=titulo;
            this.autor=autor;
            this.editorial=editorial;
            this.paginas=paginas;
        }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
    this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
    this.autor=autor;
    }

    public String getPaginas(){
        return paginas;
    }
    public void setPaginas(int paginas){
    this.paginas=paginas;
    }

    public boolean esReciente(int anno)
    {
        if (anno>=2025)
            return true;
        else
            return false;
    }
    
    public void cambiarEditorial(String nuevaEditorial)
    {
        editorial.setNombre(nuevaEditorial);
    }

    public int contarPaginasEstimadas(){
            int paginas_Estimadas = 300;
            return (int) Math.ceil((double) paginas / paginas_Estimadas);
    }

    
}
