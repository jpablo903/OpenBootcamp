package com.openbootcamp.IntroProgramacion;

import lombok.experimental.var;

/**
 *
 * @author Juan Pablo
 */

public class Estaciones {
    public static void main(String[] args) {
    String estacion = "Primavera";
    
    if (estacion == "Primavera"){
        System.out.println("Es Primavera");
    } else if (estacion == "Verano"){
    System.out.println("Es Verano");
    }else{
        System.out.println("Es otra estacion");
    }
    
    //--------------------------------
    int contador = 2;
    
    while(contador>2){
        System.out.println("While " + contador);
        contador = contador -1;
        
        //Mi codigo sigue por aqui
    }
    //---------------------------------
    do {
        System.out.println("Do while "+contador);
        contador = contador -1;
    }while(contador > 2);
    
    for (int Contador = 1; Contador <= 10; Contador = Contador +1){
        System.out.println("For "+Contador);
    }
    
   int valores[]={10, 20, 30, 40, 50};
   for(int i = 0; i< valores.length; i++ ){
       System.out.println("Imprime el array con for: "+ valores[i]);
   }
    
   var estaciones = "primavera";
   
   switch(estaciones){
       case "verano":
           System.out.println("Es Verano");
           break;
        case "invierno":
           System.out.println("Es invierno");
           break;
        default:
           System.out.println("Estoy en default");
       
   }
   
}
}
