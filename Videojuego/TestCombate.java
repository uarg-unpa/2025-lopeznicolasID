package Videojuego;

public class TestCombate {
        public static void main(String arg[]){
        
        Personaje personaje1;
        int vida;
        
        personaje1=new Personaje("Pepe",50,10,"Cuchillo");
       
        vida=personaje1.esAtaque();
        
        System.out.println(vida);   
    }

}
