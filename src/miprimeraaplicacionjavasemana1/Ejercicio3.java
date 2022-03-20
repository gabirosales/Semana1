/*3-.  Un  docente  universitario  gana  $8.00  la  hora  de  clase  y  ha  impartido  36  horas  en  un mes  de  clases.  Debemos  de  calcular  el  salario  del  docente  sabiendo  que  le  van  a descontar el 10% de  la renta. 
¿Cuánto ganara el docente al final deun mes de clases menos el descuento de la renta?*/

package miprimeraaplicacionjavasemana1;


public class Ejercicio3 {
     public static void main(String[] args){
         
         
         double salarioHora, tiempo, stotal, renta, totalR, totalF;
         
         salarioHora = 8.00;
         tiempo = 36;
         stotal = 8.00*36;
         renta = 0.1;
         totalR = stotal * renta;
         totalF = stotal - totalR;
         
         System.out.println("El salario sin descuento es: $" + stotal);
         System.out.println("El decuento es: $" + totalR);
         System.out.println("El salario con descuento es: $" + totalF);
         
  
     }
    
}
