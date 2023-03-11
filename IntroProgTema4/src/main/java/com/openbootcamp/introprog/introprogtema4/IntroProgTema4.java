package com.openbootcamp.introprog.introprogtema4;

import lombok.var;

/**
 *
 * @author Juan Pablo
 */

public class IntroProgTema4 {

    public static void main(String[] args) {
        int numeroIf = -3;
        
        if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }else if(numeroIf > 0){
            System.out.println("Es numero es Positivo");
        }else{
            System.out.println("Es numero es 0");
        }
        
    //While
    
        int numeroWhile = 1;
        
        while(numeroWhile < 3){
        System.out.println("El numero While es " + numeroWhile);
        numeroWhile = numeroWhile +1;
      }
        
    //Do While
    
        do {
        System.out.println("El numero Do While es " + numeroWhile);
        numeroWhile = numeroWhile + 2;
    }while(numeroWhile < 3);
        
    //For
    for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){
        System.out.println("El numero for es: "+numeroFor);
    }
    
    var estacion = "Invierno";
   
   switch(estacion){
       case "Verano":
           System.out.println("Es Verano");
           break;
       case "Otoño":
           System.out.println("Es Otoño");
           break;
       case "Invierno":
           System.out.println("Es Invierno");
           break;
       case "Primavera":
           System.out.println("Es Primavera");
           break;
        default:
           System.out.println("Estoy en default");
       
   }
    
    }
}
