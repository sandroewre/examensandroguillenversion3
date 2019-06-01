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
class Persona {
    String Nombre;
    double Edad;
    double Peso;
    double Altura;
    float Indicemasacorporal;
    
    public Persona (){
    
}
    public Persona(String Nombre,double Edad,double Peso,double Altura){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.Peso=Peso;
        this.Altura=Altura;
    
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
    public float calculeimc (){
        this.Indicemasacorporal= (float) (Peso/(Altura*Altura));
        // esta algoritmo esta convistiendo double o sea  (Peso/(Altura*Altura) a float (float)
        return  (float) (Peso/(Altura*Altura)); 
    }
    public String MostrarEstado(){
        if(Indicemasacorporal < 16){
            return " Muy por debajo del peso normal";
        }
        else if(Indicemasacorporal>16 && Indicemasacorporal< 18.5 ){
            return " con bajo peso";
        }
        else if(Indicemasacorporal>18.4 && Indicemasacorporal<25.1 ){
             return " peso normal";
         }
        
        
        else  if(Indicemasacorporal> 25 && Indicemasacorporal<30.1 ){
             return " sobrepeso";
         }             
        else if(Indicemasacorporal> 30 && Indicemasacorporal<40.1 ){
             return " Obeso";
         }  
        else{
             return " obesidad severa";
         }            
                   
        }
        }
