/*3. Faça um programa que leia dois números e informe apenas se o primeiro é maior que o
segundo.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
     int numeroUm,numeroDois;
     
      System.out.print("Insira um número: ");
      numeroUm = input.nextInt();
      
       System.out.print("Insira um número: ");
      numeroDois = input.nextInt();
      
      
      
      if (numeroUm > numeroDois){
           System.out.print("O primeiro número é maior que o segundo ");
          
      } else{
          System.out.print("O segundo numero é maior");
      }
    }
}