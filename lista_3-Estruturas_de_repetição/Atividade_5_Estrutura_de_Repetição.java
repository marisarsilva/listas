/*5. Construa um programa que leia o conjunto de 7 números inteiros e mostre qual foi o maior e o
menor valor fornecido.*/

import java.util.Scanner;

public class Atividade_5_Estrutura_de_Repetição {
    public static void main(String args[]) {
      
      Scanner input = new Scanner(System.in);
      
      int numero;
      int maior=0;
      int menor=0;
     
     
     for (int i=0; i!=7; i=i+1){
         
         System.out.print((i+1)+"-Insira um número: ");
         numero = input.nextInt();
         if(i==0){
             maior = numero;
             menor= numero;
            }
         
         if(numero> maior){
             maior= numero;
             
           }if(numero< menor){
             menor= numero;
             
           }
        }
        
         System.out.print(" Maior " +maior);
         System.out.print(" Menor " +menor);
     
     input.close();
    }
}