/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensandroguillen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class ExamenSandroGuillen {

 
    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
       
           Scanner sc = new Scanner (System.in);
            int edad = 0 ;
            double altura = 0;
            double peso = 0;
        // este metodo es para ingresar los datos
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine ();
        boolean entradaValida=true;
           do{
               try{
             System.out.println("Ingrese su edad");
              edad = sc.nextInt();
             
             System.out.println("El numero ingresado es :" + edad);
             entradaValida=false;
        }
         catch(InputMismatchException ex){
               System.out.println(" Intente nuevamente: debe ingresar un decimal separado por ejemplo: 1,2,3,...,etc ") ;
               sc.nextLine();
               // hacer el import del error
                } 
           }while(entradaValida);
        //System.out.println("Ingrese su edad");
       
        
       boolean entradaValida1=true;
           do{
               try{
             System.out.println("Ingrese su PESO");
              peso = sc.nextDouble();
             
              
             System.out.println("El numero ingresado es :" + peso);
             entradaValida1=false;
        }
         catch(InputMismatchException ex){
               System.out.println(" Intente nuevamente: debe ingresar un decimal separado por ejemplo: 1,2,3,...,etc ") ;
               sc.nextLine();
               // hacer el import del error
                } 
           }while(entradaValida1);
           
            
      boolean entradaValida3=true;
           do{
               try{
             System.out.println("Ingrese su altura");
              altura = sc.nextDouble();
             
             System.out.println("El numero ingresado es :" + altura);
             entradaValida3=false;
        }
         catch(InputMismatchException ex){
               System.out.println(" Intente nuevamente: debe ingresar un decimal separado por ejemplo: 1,2,3,...,etc ") ;
               sc.nextLine();
               // hacer el import del error
                } 
           }while(entradaValida3);
           
        
        
        Persona persona1 = new Persona(nombre,edad,peso,altura);
        System.out.println("      Dato de la persona       ");
        System.out.println("Nombre es "+persona1.getNombre());
        System.out.println("edad es "+persona1.getEdad());
         
        System.out.println("peso  es "+persona1.getPeso());
        System.out.println("Altura es "+persona1.getAltura());
        System.out.println("Resultado de masa corporal de la persona es "+ persona1.calculeimc());
        System.out.println("Mensaje"+persona1.MostrarEstado());
         
       
        //Persona INC= new Persona("Juan",35,90,1.80);
   
         
//        
//        System.out.println("        Masa Corporal de la persona 1     ");  
//        System.out.println("Nombre = "+INC.getNombre());
//        System.out.println("Edad = "+INC.getEdad());
//        System.out.println("Peso = "+INC.getPeso());
//        System.out.println("Altura = "+INC.getAltura());
//        System.out.println("Altura = "+INC.MasaCorporal());
//        
//        Persona2 INC2= new Persona2();
        
        
//        System.out.println("        Masa Corporal de la persona 2     ");  
//        System.out.println("Nombre = "+INC2.getNombre());
//        System.out.println("Edad = "+INC2.getEdad());
//        System.out.println("Peso = "+INC2.getPeso());
//        System.out.println("Altura = "+INC2.getAltura());
//        System.out.println("Altura = "+INC2.MasaCorporal());
     
}
    }
    
