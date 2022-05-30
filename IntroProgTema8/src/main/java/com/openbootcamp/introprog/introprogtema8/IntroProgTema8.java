package com.openbootcamp.introprog.introprogtema8;

/**
 *
 * @author Juan Pablo
 */

public class IntroProgTema8 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan Pablo");
        persona.setEdad(31);
        persona.setTelefono(1155663344);
        
        System.out.println("Mi nombre es: "+persona.getNombre()+" y tengo " + persona.getEdad()+" años.");
        System.out.print("Mi telefono es: "+ persona.getTelefono());
    }
    
    
}
class Persona{
        private int Edad;
        private String Nombre;
        private int Telefono; 

        public int getEdad() {
            return Edad;
        }

        public void setEdad(int Edad) {
            this.Edad = Edad;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public int getTelefono() {
            return Telefono;
        }

        public void setTelefono(int Telefono) {
            this.Telefono = Telefono;
        }
        
        
    }
