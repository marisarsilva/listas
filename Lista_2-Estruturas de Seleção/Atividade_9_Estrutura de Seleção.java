/*9. Faça um programa que receba quatro notas de um aluno, calcule e imprima a média
aritmética das notas e a mensagem de aprovado para média superior ou igual a 7.0 ou a
mensagem de reprovado para média inferior a 7.0.

@Autor:Marisa_Rodrigues_da_Silva.

*/
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
     
     Scanner input =  new Scanner(System.in);
     
        int notaUm, notaDois, notaTres,notaQuatro;
        double media;
        String nomeAluno;
        
     System.out.print("Insira o nome do aluno: ");
     nomeAluno = input.nextLine();
     
     System.out.print("Insira a primeira nota do aluno: ");
     notaUm = input.nextInt();
     System.out.print("Insira a segunda nota do aluno: ");
     notaDois = input.nextInt();
     System.out.print("Insira a terceira nota do aluno: ");
     notaTres = input.nextInt();
     System.out.print("Insira a quarta nota do aluno: ");
     notaQuatro = input.nextInt();
     
     media = (notaUm + notaDois+ notaTres+notaQuatro)/4;
     
     if(media >= 7){
        System.out.print(" O aluno "+ nomeAluno+ " alcançou a média e está aprovado ");
     }else{
        System.out.print(" O aluno está não alcançou a média está reprovado "); 
     }
     
     
     
     
      
        
    }
}
