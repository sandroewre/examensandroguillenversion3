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
public class LecturaDatos {
    public static int LeerEnteros (){
       Scanner sc = new Scanner (System.in);
      do{
          try{
              int numero = sc.nextInt();
              return numero;
          }
          catch(InputMismatchException ex){
              System.out.println("Error: intente nuevamente");
              sc.nextLine();
          }
      }while(true);
    }
    public static float LeerFloat (){
        Scanner sc = new Scanner (System.in);
      do{
          try{
              float numero = sc.nextFloat();
              return numero;
          }
          catch(InputMismatchException ex){
              System.out.println("Error: intente nuevamente");
              sc.nextLine();
          }
      }while(true);
    }
}
