/*6. Fazer um programa que receba um número e mostre se ele é positivo, negativo ou nulo (0).

@Autor:Marisa_Rodrigues_da_Silva.

*/
import java.util.Scanner;

import java.util.Scanner;

public class atividade_6 {
  public static void main(String[] args) {

     try(Scanner input = new Scanner (System.in)){
      
      int numero;
      
      System.out.print("Insira um número");
      numero = input.nextInt();
      
      if (numero % 2 == 0) {
        System.out.print("O numero inserido é positivo.");
      }if (numero % 2 != 0) {
        System.out.print("O numero inserido é negativo.");
      }if (numero == 0) {
        System.out.print("O numero inserido é nulo.");
      }
      input.close();
        

    }
  }
}