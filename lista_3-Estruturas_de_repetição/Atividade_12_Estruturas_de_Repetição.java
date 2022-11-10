/*12. Faça um programa que leia vários números, quando o zero for digitado o programa será
finalizado. Mostre no final desse programa a soma dos números positivos, a soma dos
negativos e a soma total dos positivos e negativos juntos.


@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;


public class Atividade_12_Estruturas_de_Repetição {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNumero, numero;
        
        se(numero!=0){
            System.out.println("insira um número positivo ou negativo");
            numero= input.nextInt();
            
            totalNumero=totalNumero+numero;


        }

        

        System.out.print("A soma dos numeros positivos e negativos juntos é igual a: "+somatotal);
    }

    private static void se(boolean b) {
    }
}
