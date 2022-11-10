/*15. Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a comissão e o salário final do funcionário.*/
alcule e mostre a comissão e o salário final do funcionário.*/

import java.util.Scanner;
public class atividade115{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
      double salarioFixo, comissão, salarioFinal;
        
      System.out.print( "Salario Fixo: ");
      salarioFixo = input.nextDouble();
      
       comissão = 0.1*salarioFixo;
      salarioFinal = salarioFixo+comissão;
      

      System.out.print(" Salario final do funcionario com comissão é: "+salarioFinal);
       
       
       
    }
    
}




