package com.openbootcamp.introprog.introprogtema9;

/**
 *
 * @author Juan Pablo
 */

public class IntroProgTema9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 32;
        cliente.nombre = "Juan Pablo";
        cliente.telefono = 1155664433;
        cliente.credito = "Credito SA";
        
        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);
 
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;

        
}

class Cliente extends Persona{
    String credito;
}

class Trabajador extends Persona{
    int salario;
}
