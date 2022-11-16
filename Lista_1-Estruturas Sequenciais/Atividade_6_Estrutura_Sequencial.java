/*6. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já desconte o peso do prato.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class Atividade_6_Estrutura_Sequencial{
    
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);

        double quiloPrato=12.00, balanca, valorPagar;
        
        
       System.out.print( "Qual o peso do prato ");
        balanca = input.nextDouble();
        
        valorPagar =  quiloPrato*balanca;
        
       System.out.print("O Preço a pagar pela refeição é R$: " +valorPagar+ " reais");
       
       input.close();
    }
    

    
}
  