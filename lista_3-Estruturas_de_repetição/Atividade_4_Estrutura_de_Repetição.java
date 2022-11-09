/*4. Construa um programa que leia o conjunto de 7 números inteiros e mostre qual foi o maior
valor fornecido.

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_4_Estrutura_de_Repetição {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
       
        int numero=0, maior = 0, menor = 999999, i=1;

        while (i <= 7) {
            System.out.print((i)+"-Digite um número: ");
            numero = input.nextInt();

            if (i<1) {
                maior = numero; 
                menor = numero;
            } else if (numero > maior) {
              maior = numero;
            }else if (numero < menor) {
             menor = numero;
            }
            
               
            
            i++;
        }
        System.out.print("o numero maior é "+maior);
        input.close();
    }
}
