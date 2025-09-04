package TP2;

public class TestPersona {
    public static void main(String arg[]){
        //int numero;
        Persona persona1;
        Persona persona2;
        boolean esMayor;
        //Persona doctor-alumno,etc ... declaracion
        persona1=new Persona("Franco","Herrera",42,30505550);
        persona2=new Persona("Nicolas","Lopez",34,36105561);

        esMayor=persona1.mayorDeEdad();
        System.out.println(esMayor);   
    }
}
