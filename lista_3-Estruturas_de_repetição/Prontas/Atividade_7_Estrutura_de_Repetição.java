package Prontas;
/*7. Construa um programa que leia vários números inteiros e positivos, calculando ao final da
seqüência a soma e a média desses números. A seqüência termina quando o usuário entrar
com um valor negativo (esse valor não deve fazer parte de nenhum dos cálculos).

@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_7_Estrutura_de_Repetição {
    

    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {

            int totalNumero = 0, numero = 1, i = 1;          

            do{
                
                System.out.print("Insira numeros inteiros e positivos para calcular a soma e a média desses numeros: ");
                numero = input.nextInt();
                

                totalNumero+=numero;
                
                
                i++;
            }while (numero > 0);

            double media=totalNumero/(i-2);
            
            System.out.print("Foram inseridos " +(i-2)+ " números cuja soma é: " + totalNumero);
            System.out.print(" E a média entre eles é de: " + media);
            
           
        }

    }

    
}