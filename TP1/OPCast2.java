package TP1;

public class OPCast2 {
public static void main(String[] args){
    int valor1=5, valor2=3, resultadoEntero;
    double decimal1=7.5, decimal2=2.0, resultadoDecimal;
            
    resultadoEntero=valor1/valor2;
    System.out.println("Resultado 1 X=A/B es " + resultadoEntero);
    resultadoEntero=(int)(valor1*decimal2)/(int)(decimal1/valor1);
    System.out.println("Resultado 2 Y=(int)(A*D)/(int)(C/A) es " + resultadoEntero);
    resultadoDecimal=valor1/valor2;
    System.out.println("Resultado 3 Y=A/B es " + resultadoDecimal);
    resultadoDecimal=(double)(valor1/valor2);
    System.out.println("Resultado 4 Y=(double)(A/B) es " + resultadoDecimal);
    resultadoDecimal=(double)valor1*decimal2/(int)decimal1;
    System.out.println("Resultado 5 Y=(double)A*D/(int)C es " + resultadoDecimal);
    resultadoDecimal=(double)valor1*decimal2;
    System.out.println("Resultado 6 Y=(double)A*D es " + resultadoDecimal);
    resultadoDecimal=(double)(valor1*decimal2)/(decimal1*(int)decimal2);
    System.out.println("Resultado 7 Y=(double)(A*D)/(C*(int)D) es " + resultadoDecimal);
    resultadoDecimal=valor1*(int)decimal2;
    System.out.println("Resultado 8 Y=A*(int)D es " + resultadoDecimal);
    resultadoDecimal=(int)(valor1*(int)decimal2);
    System.out.println("Resultado 9 Y=(int)(A*(int)D) es " + resultadoDecimal);
    }  
}
