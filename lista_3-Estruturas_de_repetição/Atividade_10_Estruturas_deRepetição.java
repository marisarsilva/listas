/*10. Construa um programa que leia as informações de: horas trabalhadas (HT), valor da hora
trabalhada (VH). Calcule e apresente o salário líquido de dez empregados de uma empresa,
baseado nas tabelas abaixo.
OBS: Salário Líquido = Salário Bruto – INSS – Imposto de Renda
a) INSS = 11% do salário bruto
b) Imposto de Renda  após descontar o INSS usar esse valor e ler a alíquota do imposto
de renda na tabela abaixo

Salário Bruto – INSS Alíquota Deduzir
Até $900 Isento
De $900 até $1800 15% $135
Mais que $1800 27,5% $360

@Autor:Marisa_Rodrigues_da_Silva;
*/

import java.util.Scanner;

public class Atividade_10_Estruturas_deRepetição {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ht = 0, vh = 0, salirioLiquido;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Trabalhador " + (i) + "-Insira as Horas Trabalhadas: ");
            ht = input.nextDouble();
            System.out.print("              Insira o Valor das Horas Trabalhadas: ");
            vh = input.nextDouble();

            double salaroBruto = ht * vh;
            double descontoInss = salaroBruto * 11 / 100;
            double salarioMenor = salaroBruto - descontoInss;

            if (salarioMenor <= 900) {

                System.out.println(
                        " O trabalhador foi isento do imposto de renda e seu salario Liquido é R$" + salarioMenor
                                + " reais.\n");

            } else if (salarioMenor > 900 & salarioMenor <= 1800) {

                salirioLiquido = salarioMenor - 135;
                System.out.println("Foi descontado o valor de 135,00 de imposto de renda e seu salario Liquido é R$"
                        + salirioLiquido + " reais.\n");

            } else if (salarioMenor > 1800) {

                salirioLiquido = salarioMenor - 360;
                System.out.println("Foi descontado o valor de 360,00 de imposto de renda e seu salario Liquido é R$"
                        + salirioLiquido + " reais.\n");

            }
        }
        

        input.close();
    }
}
