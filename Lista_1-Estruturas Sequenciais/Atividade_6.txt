/*6. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já desconte o peso do prato.*/

import java.util.Scanner;

public class atividade6{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        double quiloRefeiçao, balança, valorPagar;
        
        quiloRefeiçao = 12.00;
        
        
        
       System.out.print( "Qual o peso do prato ");
        balança = input.nextDouble();
        
        valorPagar =  quiloRefeiçao*balança;
        
       System.out.print("O Preço a pagar pela refeição é R$: " +valorPagar+" reais");
    }
    
}
  