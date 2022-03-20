/*5-. Un trabajador de la industria de la construcción gana $10 diarios en su jornada normal de  trabajo.
En  ciertas  ocasionesel  empleado  tiene  que  trabajar  horas extras  para cumplir con su trabajo. 
En el mes a acumulado 50 horas extras que se la pagan al 10% del valor del pago diario. 
¿Cuánto ganara el trabajador al final de un mes de trabajo? 
Tomar en consideración que al trabajador le descontaran el 10% en concepto de renta.*/



package miprimeraaplicacionjavasemana1;


public class Ejercicio5 {
    public static void main(String[] args){
        
        double salario, horasEx, renta, Exac, salarioM, salarioF;
        
        salario = 10;
        horasEx = 50;
        renta = 0.1;
        salarioM = salario * 30;
        Exac = horasEx * salario * (renta);
        salarioF = salarioM - Exac ;
        
        System.out.println("Salario mensual sin H/E: $ " + salarioM);
        System.out.println("Total H/E: $ " + Exac);
        System.out.println("Salario mensual con H/E: $ " + salarioF);
        
    }
    
}
