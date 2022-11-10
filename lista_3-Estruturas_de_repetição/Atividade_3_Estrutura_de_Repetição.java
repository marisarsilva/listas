package Prontas;
/*3. Construa um programa que leia o número de horas trabalhadas diárias (NH) de um funcionário
por um período de 7 dias (ele trabalhou todos os 30 dias) e apresente o salário bruto recebido
por ele nesse período, sabendo que o valor do salário é R$ 10,00/hora trabalhada.

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_3_Estrutura_de_Repetição {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    double nh, salarioMes;
    double ht = 0;
    double salarioSete = 0;

    int contador = 1;

    while (contador <= 7) {
      System.out.print(contador + "-INSIRA A QUANTIDADE DE HORAS TRABALHADAS: ");
      nh = input.nextDouble();

      ht = ht + nh;

      salarioSete = ht * 10.00;

      contador += 1;
    }

    salarioMes = (30 * 8) * 10.00;

    System.out.println("o salario bruto referente as horas trabalhadas durante sete dias é de R$" + salarioSete + " reais");

    System.out.println("O salario bruto referente a trinta dias trabalahos é de R$" + salarioMes + " reais");

    input.close();
  }
}