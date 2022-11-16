package Prontas;
/**2. Construa um programa que leia a quantidade (Q) e o preço (PR) de 7 produtos diferentes,
comprados por uma empresa, e apresente o total gasto por ela.

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_2_Estrutura_de_Repeticao{
    public static void main(String args[]) {
      
      Scanner input =  new Scanner(System.in);
    
     double quant, preco;
     int contador;
     
     double quantidade = 0;
     double precooTotal = 0;
     double totalGasto =0;
     contador = 1;
     
     
         
     while (contador < 7){
         System.out.print(contador+ " Produto: Quantidade do Produto-");
         quant = input.nextDouble();
         System.out.print(" Preço do proProduto- ");
         preço = input.nextDouble();
         
         quantidade= quantidade+quant;
         preçoTotal = quantidade*preço;
         totalGasto=totalGasto+preçoTotal;
         
         
         contador+=1;
       }
       /*totalGasto = quantidade*preçoTotal;*/
     
     System.out.print("O total gasto pela empresa foi de R$" + totalGasto + " Reais");
          
      input.close();
    }
}