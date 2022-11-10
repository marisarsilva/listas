/*11. Faça um programa que leia a idade e a altura de várias pessoas. Calcule e informe a média
das alturas das pessoas com mais de 50 anos. Para encerrar o programa digite zero para
idade.

@autor: Marisa_Rodrigues_da_Silva

*/
import java.util.Scanner;

public class Atividade_11_Estruturas_de_Repetição{
    public static void main(String[]arg){
        try(Scanner input = new Scanner(System.in)){
            
            int idade=0;
            double altura,totalAltura=0,totalIdade=0, mediaIdade,mediaAltura;

            int i=0;

            while(idade!=(-1)){
                System.out.print("Insira sua idade: ");
                idade= input.nextInt();

                System.out.print("Insira sua altura: ");
                altura = input.nextDouble();

                totalAltura=totalAltura+altura;
                totalIdade= totalIdade+idade;



                i++;

            }
            mediaIdade=totalIdade/i;
            mediaAltura=totalAltura/i;

            System.out.print("foram "+(i=i+1)+"entrevistados, cuja média de idade foi de "+mediaIdade+" e a media de Altura de "+mediaAltura);
        }

    }
}