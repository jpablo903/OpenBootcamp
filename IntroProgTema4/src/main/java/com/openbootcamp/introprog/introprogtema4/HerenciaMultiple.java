package com.openbootcamp.introprog.introprogtema4;

/**
 *
 * @author Juan Pablo
 */
public class HerenciaMultiple {
     public static void main(String[] args) {
         Coche coche = new Coche();
         coche.sumaNumeros(1, 2);
         //coche.diHola();
        //Coche coche = new Coche();
        //Vehiculo vehiculo = new Vehiculo();
        //coche.setSonido("BRRR");
        
        
        //Coche cocheElectrico = new Coche();
        //cocheElectrico.velocidadMaxima = 14;
        //cocheElectrico.matricula = "ABC 1234 ES";
        
        //System.out.println(coche.getSonido());
    }
     
}
class Vehiculo{
//    int VelocidadMaxima;

//    public Vehiculo() {
//        System.out.println("Estoy en el Vehiculo");
//    }
    
    public void diHola(){
        System.out.println("Hola!");
    }
    
}

//class Motor{
//    String tipoMotor;
//    public Motor(){
//        System.out.println("Estoy en el motor");
//    }
//}

class Coche extends Vehiculo{
    public void diHola(){
        System.out.println("Soy un coche");
   }
    
    public int sumaNumeros(int a, int b){
        System.out.println("Soy el resultado de Int");
        return a+b;
    }
    
    public float sumaNumeros(float a, float b){
        System.out.println("Soy el resultado de Float");
        return a+b*(float)9.0;
    }
    public void sumaNumeros(double a, double b){
        System.out.println("Soy el resultado de Double");
        System.out.println(a+b);
    }

}
