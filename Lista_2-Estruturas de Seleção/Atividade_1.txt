/*1. Faça um programa que leia um número e informe se o dobro do número é maior que 35.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
     int numero, dobro;
      System.out.print("Insira um número");
      numero = input.nextInt();
      
      dobro = numero*2;
      
      if (dobro >=35){
           System.out.print("O dobro do número é maior que 35 ");
          
      }else{
            System.out.print("O dobro do número é menor que 35 ");
            
        };
     
    }
}