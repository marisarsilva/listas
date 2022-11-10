/*10. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class atividade10{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
double quantQueijo, quantPresunto, quantHamburguer, quantSanduiches, quantQueijoo, quantPresuntoo, quantHamburguerr, fatiaQueijo,fatiaPresunto, fatiaHamburguer;
        
      System.out.print( "Insira a quantidade de sanduíches a serem feitas: ");
      quantSanduiches = input.nextDouble();
        
        quantQueijo = 2*50;
        quantQueijoo = quantQueijo*quantSanduiches;
        fatiaQueijo = quantSanduiches*2;
      
        
        quantPresunto =1*50;
        quantPresuntoo =quantPresunto *quantSanduiches;
        fatiaPresunto = quantSanduiches*1;
        
        quantHamburguer = 1*100 ;
        quantHamburguerr =  quantHamburguer *quantSanduiches;
        fatiaHamburguer = quantSanduiches*1;
       
      System.out.println( "É necessário comprar: ");
      System.out.println(quantQueijoo+ " gramas de queijo, que equivale a "+fatiaQueijo+ " fatias de queijo.");
      System.out.println(quantPresuntoo+ " gramas de Presunto, que equivale a "+fatiaPresunto+ " fatias de presunto.");
      System.out.println( quantHamburguerr+" gramas de Hamburguer, que equivale a " +fatiaHamburguer+ " hamburguer(s)");
      
       
    }
    
}