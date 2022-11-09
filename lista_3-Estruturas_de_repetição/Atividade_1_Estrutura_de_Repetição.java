/**1. Construa um programa que apresente o peso total que será carregado por um caminhão.
Sabe-se que esse caminhão carrega 7 caixas, com pesos diferentes. Será entrada do
programa o peso (P) de cada uma das caixas.

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_1_Estrutura_de_Repetição{
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
    
     double contador, caixa;
     double peso= 0;
     
     contador = 0;
     
     while (contador < 7){
         System.out.print("Insira o peso da caixa em quilos: ");
         caixa = input.nextDouble();
         
         peso = peso + caixa;
         contador+=1;
       }
     
     System.out.print("O caminhão carregará um total de: " + peso + " quilos");
          
      input.close();
    }
}


