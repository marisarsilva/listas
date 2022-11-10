package Prontas;
/* 8. Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10 e cresce 3
centímetros por ano. Construa um programa que calcule e apresente quantos anos serão
necessários para que Felisberto seja maior que Anacleto.

@Autor:Marisa_Rodrigues_da_Silva;

*/

import java.util.Scanner;

public class Atividade_8_Estruturas_de_Repetição {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tamanhoA = (1.50 * 100);
        double tamanhoF = (1.10 * 100);
        int anos = 0;

        while (tamanhoF <= tamanhoA) {
            tamanhoA += 2;
            tamanhoF += 3;
            anos++;

        }
        System.out.println("Serão necessarios " + anos + " anos para que Felisberto seja maior que Anacleto.");

        input.close();
    }

}
