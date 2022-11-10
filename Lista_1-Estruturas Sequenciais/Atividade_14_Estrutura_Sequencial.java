/*14. Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este sofreu um desconto de 10%. 

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class atividade14{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
      double preçoProduto, quantProduto, preçoTotal, desconto,preçoProdutoo;
        
      System.out.print( "Preço do Produto: ");
      preçoProduto = input.nextDouble();
      
      System.out.print( "Quantos de produtos: ");
      quantProduto = input.nextDouble();
      
      
       
      
      preçoProdutoo = quantProduto*preçoProduto;
      System.out.print(" Produto: " + preçoProdutoo);
      
      desconto = 0.1*preçoProdutoo;
      
      System.out.print(" Desconto: " + desconto);
      
      preçoTotal = preçoProdutoo-desconto;
      
      System.out.print(" O preço do produto subtraindo 10% é igual a: " + preçoTotal);
       
       
       
    }
    
}