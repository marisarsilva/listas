/*9. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

@Autor:Marisa_Rodrigues_da_Silva.

*/
import java.util.Scanner;

public class Atividade_9_Estrutura_Sequencial{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
double salarioInicial, salarioAumento, aumento, calculo;
        
      System.out.print( "Insira o salário inicial: ");
      salarioInicial = input.nextDouble();
              
      aumento = 0.15;
      
      calculo = aumento * salarioInicial;
     
      salarioAumento = salarioInicial + calculo;
      
      System.out.print( "O salário inicial com aumneto de 15% é: " +salarioAumento);
       
      input.close();
    }
    
}