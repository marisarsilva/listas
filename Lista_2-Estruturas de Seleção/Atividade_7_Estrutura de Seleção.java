/*7. Elabore um algoritmo que leia um número e mostre o número com a mensagem ‘é par’ ou
‘é ímpar’.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
        int numero;
     
      System.out.print("Insira um número: ");
      numero = input.nextInt();
      
      
      if (numero % 2 == 0){
          System.out.print("O número informado é par");
          
      } else{
          System.out.print("O numero informado é impar");
          
      }
    }
}
