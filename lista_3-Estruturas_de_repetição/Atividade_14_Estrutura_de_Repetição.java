package Prontas;
/*14. Uma empresa classifica seus funcionários em três níveis de acordo com um índice de
produtividade. São eles (1) Excelente, (2) Bom e (3) Regular. Cada nível acrescenta um abono
ao salário base do funcionário, de acordo com a seguinte tabela:
 Excelente 80% do salário base;
 Bom 50% do salário base;
 Regular 30% do salário base.

O programa deve ler a matrícula do funcionário, seu salário base e seu nível de abono.
Calcular e imprimir o salário a ser pago (salário a ser pago é = salário base + abono). O
programa será encerrado quando for digitado 0 para matrícula.

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_14_Estrutura_de_Repetição {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            double abono = 0, salarioBase = 0;
            int matricula = 0;

            System.out.print("Insira a matrícula: ");
            matricula = input.nextInt();

            System.out.print("Insira o salário Base: ");
            salarioBase = input.nextDouble();

            System.out.print("Indide de Produtividade: \n[1] Excelente, \n[2] Bom, \n[3]Regular ");
            System.out.println("Insira o nível de bonificação: ");
            int indice = input.nextInt();

            if (indice == 1) {
                abono = 0.8 * salarioBase;
            } else if (indice == 2) {
                abono = 0.5 * salarioBase;
            } else if (indice == 3) {
                abono = 0.3 * salarioBase;
            }

            System.out.println("Para o funcionário de matricula nº:" + matricula + " o salário a ser pago é de Rs"
                    + (salarioBase + abono));

        }
    }
}