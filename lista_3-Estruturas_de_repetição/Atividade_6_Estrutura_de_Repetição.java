/*6. Construa um programa que leia a quantidade (Q) e o preço (PR) de vários produtos diferentes,
comprados por uma empresa, e apresente o total gasto por ela. O final da lista de produtos
deverá ser indicado pelo usuário (escolha a maneira que preferir).

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_6_Estrutura_de_Repetição {
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            double quantProduto = 0, preçoProduto = 0, total=0, totalf=0, totalP=0;
            int i=1;
            char escolha= 'p';

            
           
            while(escolha !='n'){

                System.out.print((i++)+"-Insira a quantidade de produtos: ");
               quantProduto = input.nextInt();

                
             System.out.print((i++)+"-Insira o preço do produto: ");
             preçoProduto = input.nextDouble();

             totalP+=quantProduto;
             total=quantProduto*preçoProduto;
             totalf+=total;

             System.out.print(" Para encerrar a operação digite\n [s]Sim \n [n]Não\n");
             escolha=input.next().charAt(0);

             
            } 
            System.out.print(" A empresa comprou " + totalP + " produtos, que custaram um total de R$"+ totalf+"reais");
        }

    }
}

