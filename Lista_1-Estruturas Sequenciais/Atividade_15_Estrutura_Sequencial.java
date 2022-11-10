/*15. Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a comissão e o salário final do funcionário.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;
public class atividade115{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
      double salarioFixo, comissao, salarioFinal;
        
      System.out.print( "Salario Fixo: ");
      salarioFixo = input.nextDouble();
      
       comissao = 0.1*salarioFixo;
      salarioFinal = salarioFixo+comissao;
      

      System.out.print(" Salario final do funcionario com comissão é: "+salarioFinal);
       
       
       
    }
    
}




