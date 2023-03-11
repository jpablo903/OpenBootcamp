package com.openbootcamp.introprog.introprogtema4;

/**
 *
 * @author Juan Pablo
 */

public class Herencia {
     public static void main(String[] args) {
        Coche coche = new Coche();
        //Vehiculo vehiculo = new Vehiculo();
        coche.setSonido("BRRR");
        
        
        //Coche cocheElectrico = new Coche();
        //cocheElectrico.velocidadMaxima = 14;
        //cocheElectrico.matricula = "ABC 1234 ES";
        
        System.out.println(coche.getSonido());
    }
     
}
abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;

    abstract public String getSonido();

    abstract public void setSonido(String sonido);
    
    
    //public boolean compruebaMatricula(String matricula){
    //    if (matricula == "XXX"){
    //    return true;
    //    }
        
    //    return false;
    //};

    public Vehiculo() {
        System.out.println("Estoy en el constructor");
    }
}


class Coche extends Vehiculo {

    
    public String getSonido() {
        
        return ("Soy un super sonido: ") + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    
}

class Moto extends Vehiculo{

    
    public String getSonido() {
        return this.sonido;
    }
    
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    
}
