/*12. Faça um programa que leia vários números, quando o zero for digitado o programa será
finalizado. Mostre no final desse programa a soma dos números positivos, a soma dos
negativos e a soma total dos positivos e negativos juntos.


@autor: Marisa_Rodrigues_da_Silva

*/

import java.util.Scanner;

public class Atividade_12_Estruturas_de_Repetição {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero=0;
        int totalNumero=0, positivo=0, negativo=0;
              
        int i=1; 

        do{

           
            System.out.print(i+"-insira um número positivo ou negativo: ");
            numero = input.nextInt();

            if (numero > 0) {
                
                positivo+=numero;

            } else if (numero < 0) {
                negativo+=numero;
            }
            totalNumero = totalNumero + numero;

            i++;
        }while(numero!=0);
            
        

        System.out.print("A soma dos numeros positivos é igual a: " + positivo+"\n");
        System.out.print("A soma dos numeros negativos é igual a: " + negativo+"\n");
        System.out.print("A soma dos numeros positivos e negativos juntos é igual a: " + totalNumero+"\n");
        input.close();
    }

    
}
