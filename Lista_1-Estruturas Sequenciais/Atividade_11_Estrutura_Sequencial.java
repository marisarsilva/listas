/*11. A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra. Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de impostos.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class Atividade_11_Estrutura_Sequencial{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
double quantHoras, salarioBaseNormal, quantExtras, salarioExtra, salarioBruto, desconto, salarioLiquido;
        
      System.out.print( "Insira a quantidade de horas normais trabalhadas: ");
      quantHoras = input.nextDouble();
      salarioBaseNormal = quantHoras*10.00;
      
      System.out.print( "Insira a quantidade de horas extras trabalhadas: ");
      quantExtras = input.nextDouble();
      salarioExtra = quantExtras*15.00;
       
      
         
      salarioBruto = salarioBaseNormal+ salarioExtra;
      System.out.println( "Salario Bruto: " + salarioBruto);
      
      desconto = salarioBruto*10/100;
      System.out.println( "Desconto: "+ desconto);
      
      salarioLiquido = salarioBruto - desconto;
      System.out.println( "Salário Liquido: "+ salarioLiquido);
       
      input.close();
    }
    
}
