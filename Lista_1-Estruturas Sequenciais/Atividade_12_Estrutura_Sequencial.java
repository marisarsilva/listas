/*12. A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos.

@Autor:Marisa_Rodrigues_da_Silva.

*/
import java.util.Scanner;

public class Atividade_12_Estrutura_Sequencial{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
      double anelAlimento, anel,quantFrango,precoAnel;
        
      System.out.print( "Insira quantos frangos: ");
      quantFrango = input.nextDouble();
      
       anel = 4.00;
       anelAlimento = 2*3.50;
       
       precoAnel = quantFrango* (anel+anelAlimento);
       System.out.print("O valor gasto para etiquetar todos os frango foi: "+ precoAnel);
       
       input.close();
    }
    
}