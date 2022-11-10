package Prontas;
/*5. Construa um programa que leia o conjunto de 7 números inteiros e mostre qual foi o maior e o
menor valor fornecido.

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_5_Estrutura_de_Repetição {
  public static void main(String args[]) {
      
    Scanner input = new Scanner(System.in);
      
    int numero, maior=0, menor=999999, i=0;
     
    while( i<7){
         
      System.out.print((i+1)+"-Insira um número: ");
      numero = input.nextInt();

      if(i==0){
        maior = numero;
      }else if(numero> maior){
       maior= numero;
             
      }else if(numero< menor){
       menor= numero;
             
      }
    
      i++;
    }
    
    System.out.print("o maior numero inserido foi "+maior+ " e o menor "+menor);

   input.close();
  }
} 