/*2. Faça um programa que leia um número e informe se a metade do número é menor que 12

@Autor:Marisa_Rodrigues_da_Silva.

.*/

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
     int numero, metade;
      System.out.print("Insira um número: ");
      numero = input.nextInt();
      
      metade = numero/2;
      
      if (metade < 12){
           System.out.print("A metade do número informado é menor que 12. ");
          
      } else{
              System.out.print("A metade do número informado é maior que 12.");
            
        }
     
    }
}