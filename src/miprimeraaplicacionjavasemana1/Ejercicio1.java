/*1-.  Se  tienen  4  resistencias  en  paralelo  R1  =  5.1  ohm,  R2  =  68  ohm,  R3  =  75  ohm  y  R4  =  82  ohm;  
obtener  la  resistencia equivalente.*/


package miprimeraaplicacionjavasemana1;

public class Ejercicio1 {
    public static void main(String[] args){
         double R1, R2, R3, R4,sudeno,Reg;
         
         R1 = 5.1;
         R2 = 68;
         R3 = 75;
         R4 = 82;
         
         sudeno = ((1/R1)+(1/R2)+(1/R3)+(1/R4));
         
         Reg =1 /sudeno;
         System.out.println("La resistencia equivalente es: " + Reg);
     }
    
}
