/*4. Faça um programa que leia dois números e informa se o primeiro é igual ao segundo.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
     int numeroUm,numeroDois;
     
      System.out.print("Insira um número: ");
      numeroUm = input.nextInt();
      
       System.out.print("Insira outro número: ");
      numeroDois = input.nextInt();
      
      
      
      if (numeroUm == numeroDois){
           System.out.print("Os números inseridos são iguais ");
          
      } else{
          System.out.print("Os numeros inseridos são diferentes");
      }
    }
}
