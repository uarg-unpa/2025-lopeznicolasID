package TP2;
//clase Persona clasifica a un grupo general
public class Persona {
//atributos, caracteristicas que describen a la persona... tmb son sustantivos
    String nombre;
    String apellido;
    int edad;
    int dni;
    //boolean esMayor;

//Constructor. Nos permite construir al objeto particular FUNCIONES-
    public Persona(String nombre, String apellido, int edad, int dni)
    {
        //a la izq es el ATRIBUTO, a la derecha el parametro que asignamos
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni;
    }

    public boolean mayorDeEdad()
    {
        if (edad>=18)
            return true;
        else
            return false;
    }

//metodos gets y sets
    public String getNombre(){
        return nombre;
        //OPCION: return this nombre;
        // get=obtener y set=modificar
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
    this.apellido=apellido;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
    this.edad=edad;
    }

    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
    this.dni=dni;
    }
//otras operaciones
}