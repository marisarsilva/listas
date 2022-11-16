/*7. Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3).

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class Atividade_7_Estrutura_Sequencial{
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        double notaUm,notaDois, notaTres, pesoUm,pesoDois,pesoTres,mediaP;
        
        pesoUm = 1;
        pesoDois = 2;
        pesoTres = 3;
        
        
       System.out.print( "Insira a primeira nota ");
        notaUm = input.nextDouble();
       
       System.out.print( "Insira a segunda nota ");
        notaDois = input.nextDouble();
       
       System.out.print( "Insira a terceira nota ");
        notaTres = input.nextDouble();
        
        mediaP =  ((notaUm*1)+(notaDois*2)+(notaTres*3))/(pesoUm+pesoDois+pesoTres);
        
       System.out.print("A média ponderadas das três notas é "+ mediaP);
       
       input.close();
    }
    
}