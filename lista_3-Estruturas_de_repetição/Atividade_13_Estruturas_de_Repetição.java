/* 13. Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem
para preenchimento de vagas no seu quadro de funcionários. Suponha que você seja o
programador dessa empresa, criar um programa que leia para cada candidato a idade, o sexo
e se tem experiência no serviço (S ou N). Para encerrar o programa, digite zero para idade.
Calcule e escreva:
 O número de candidatos do sexo feminino;
 O número de candidatos do sexo masculino;

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class Atividade_13_Estruturas_de_Repetição {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int masculino = 0, feminino = 0, experiência = 0, sexo = 0, sim = 0, não = 0, idade, i = 1;

    System.out.print(i+"-Qual sua idade?");
    idade = input.nextInt();
    while (idade > 0){

      
      System.out.print("Sexo: \n    [1] Masculino     \n    [2]Feminino ");
      sexo = input.nextInt();
      System.out.print("Você tem experiência no serviço: \n   [1]Sim  \n   [2]Não ");
      experiência = input.nextInt();

      if (sexo == 1) {
        masculino++;
      } else if (sexo == 2) {
        feminino++;
      }

      if (experiência == 1) {
        sim++;
      } else if (experiência == 2) {
        não++;
      }

      System.out.print(i+"-Qual sua idade?");
      idade = input.nextInt();

      i++;

    }
    
    

    
    System.out.println("Os canditatos entrevistados são: ");
    System.out.print(masculino + " candididato(s) do sexo masculino \n");
    System.out.print(feminino + " candididato(s) do sexo feminino \n");
   

    input.close();
  }

}