/*11. A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários municipais.
O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um
algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o
empréstimo pode ou não ser concedido.

@Autor:Marisa_Rodrigues_da_Silva.

*/


import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
        double salarioBruto, prestaçao;
        
        
     System.out.println("Confira se você tem direito ao Empréstimo ");   
     System.out.print("Insira o salario Bruto: ");
     salarioBruto = input.nextDouble();
     
     
     System.out.print("Insira o valor da prestação: ");
     prestaçao = input.nextDouble();
     
     if(prestaçao > (0.3*salarioBruto)){
         System.out.print("Infelismente o empréstimo não pode ser concedido ");
         
     } else{
        System.out.print("O emprestimo será concedido");
     }
     
     
     
     
      
        
    }
}
