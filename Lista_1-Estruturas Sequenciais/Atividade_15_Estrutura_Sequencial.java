/*15. Um funcion�rio recebe um sal�rio fixo mais 4% de comiss�o sobre as vendas. Fa�a um programa que receba o sal�rio fixo de um funcion�rio e o valor de suas vendas, calcule e mostre a comiss�o e o sal�rio final do funcion�rio.*/
alcule e mostre a comiss�o e o sal�rio final do funcion�rio.*/

import java.util.Scanner;
public class atividade115{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
      double salarioFixo, comiss�o, salarioFinal;
        
      System.out.print( "Salario Fixo: ");
      salarioFixo = input.nextDouble();
      
       comiss�o = 0.1*salarioFixo;
      salarioFinal = salarioFixo+comiss�o;
      

      System.out.print(" Salario final do funcionario com comiss�o �: "+salarioFinal);
       
       
       
    }
    
}




