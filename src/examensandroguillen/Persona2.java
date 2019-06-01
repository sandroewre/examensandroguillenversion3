/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensandroguillen;

/**
 *
 * @author labctr
 */
public class Persona2 {
    String Nombre= "Sandro";
    double Edad = 22; 
    double Peso = 86;
    double Altura = 1.78;
    public Persona2 (){
    
}
    public Persona2 (String Nombre,double Edad, double Peso, double Altura){
    
}
     public void setNombre(String Nombre){
         this.Nombre=Nombre;
    }
     public void setEdad(double Edad){
         this.Edad=Edad;
    }
    public void setPeso(double Peso){
         this.Peso=Peso;
    }
     public void setAltura(double Altura){
         this.Altura=Altura;
      }
      public String getNombre() {
        return Nombre;
    }
     public double getEdad() {
        return Edad;
         }
     public double getPeso() {
        return Peso;
    }
    public double getAltura() {
        return Altura;
    }
    public double MasaCorporal (){
      return Peso/(Altura*Altura);      
    }
}
