package com.openbootcamp.introprogtema3;

/**
 *
 * @author Juan Pablo
 */

public class IntroProgTema3 {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas");
        int resultado;
        resultado = suma(10,20,30);
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static int suma(int a, int b, int c){
       return a+b+c;
    }
}

class Coche{
        public int puertas = 4;
        
        public void AgregarPuerta(){
            this.puertas++;
        }
    }
