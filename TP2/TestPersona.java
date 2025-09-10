package TP2;

public class TestPersona {
    public static void main(String arg[]){

        Domicilio dom1=new Domicilio("Av. Rivadavia",12);
        Persona p1=new Persona("Laura",28,12345678,dom1);
        System.out.println(p1);
        System.out.println(p1.infoDomicilio());

        Persona p2=new Persona("Pedro");
        System.out.println(p2); //Domicilio referencia vacio
        
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
