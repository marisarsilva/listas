/* 8. Faça um programa que leia a altura e o sexo de uma pessoa, calcule e imprima seu peso
ideal, utilizando as seguintes fórmulas:
a. Para homens: (72.7 * h) – 58
b. Para mulheres: (62.1 * h) – 44.7 (h = altura).

@Autor:Marisa_Rodrigues_da_Silva.

*/


import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
        int sexo;
        double h,homens, mulheres;
        
     System.out.print("Digite [1] para homem, [2] para mulher: ");
     sexo = input.nextInt();
     
     System.out.print("Qual sua altura: ");
     h = input.nextDouble();
      
      if (sexo == 1){
          homens =(72.7*h)-58;
          System.out.print(" Para você que é homem, o peso ideal é: "+ homens);
        
        } if(sexo == 2){
            mulheres= (62.1*h) -44.7;
            System.out.print(" Para você que é mulher, o peso ideal é: "+ mulheres);
        }
    }
}

