/*5. Faça um programa que leia dois números e informe se o primeiro é maior, menor ou igual
ao segundo.

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
      
      
      
      if (numeroUm > numeroDois){
           System.out.print("O primeiro numero é maior que o segundo.");
          
      } if(numeroUm == numeroDois){
          System.out.print("O primeiro e o segundo numeros são iguais.");
      }if(numeroUm < numeroDois){
          System.out.print("O primeiro numero é menor que o segundo.");
      }
    }
}