/*10. Faça um programa que calcule e imprima o salário reajustado de um funcionário de acordo
com seguinte regra:
a. salários até R$ 300,00, reajuste de 50%
b. salários maiores que R$ 300,00, reajuste de 30%

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
        double salario, reajuste,reajustee;
        
        
     System.out.println("Reajuste Salarial ");   
     System.out.print("Insira o salario do funcionario ");
     salario = input.nextDouble();
     
     reajuste = (0.5*salario)+salario;
     reajustee = (0.3*salario)+salario;
    
    
      if(salario <= 300){
          System.out.print("O salario atual recebeu um reajuste de 50% e passou a ser "+ reajuste);
      } if(salario > 300){
        System.out.print("O salario atual recebeu um reajuste de 30% e passou a ser "+ reajuste);
     }
     
     
     
     
      
        
    }
}

