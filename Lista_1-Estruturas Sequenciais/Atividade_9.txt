/*9. Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.*/
import java.util.Scanner;

public class atividade9{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
double salarioFinal, salarioInicial, salarioAumento, aumento, calculo;
        
      System.out.print( "Insira o salário inicial: ");
      salarioInicial = input.nextDouble();
              
      aumento = 0.15;
      
      calculo = aumento * salarioInicial;
     
      salarioAumento = salarioInicial + calculo;
      
      System.out.print( "O salário inicial com aumneto de 15% é: " +salarioAumento);
       
       
    }
    
}