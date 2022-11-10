/*7. Construa um programa que leia vários números inteiros e positivos, calculando ao final da
seqüência a soma e a média desses números. A seqüência termina quando o usuário entrar
com um valor negativo (esse valor não deve fazer parte de nenhum dos cálculos).

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;



public class Atividade_7_Estrutura_de_Repetição {
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            
            int i=1;
            /*char proximo= 's';*/
            int totalNumero=0;
            double media=0;
            int numero=0;
            
           
          while(i>0){
             if(numero>0){

                    System.out.print((i++)+"-Insira numeros inteiros e positivos para calcular a soma e a média desses numeros: ");
                    numero = input.nextInt();
                
                    totalNumero=totalNumero+numero;
                }
                
            }

            media=totalNumero/i;
            
            System.out.print("Foram inseridos " +i+" números");
            System.out.print(" O valor da somas deles é: "+ totalNumero);
            System.out.print(" E a média entre eles é de " + media);
            /*

                
             System.out.print((i++)+"-Insira o preço do produto: ");
             preçoProduto = input.nextDouble();

             totalP+=quantProduto;
             total=quantProduto*preçoProduto;
             totalf+=total;

             System.out.print(" Para encerrar a operação digite\n [s]Sim \n [n]Não\n");
             escolha=input.next().charAt(0);

             
            } 
            System.out.print(" A empresa comprou " + totalP + " produtos, que custaram um total de R$"+ totalf+"reais");*/
        }

    }
}