/*9. Em um cinema, certo dia, cada espectador respondeu a um questionário, que perguntava a
sua idade (ID) e a opinião em relação ao filme (OP), seguindo os seguintes critérios:

Opinião Significado
A Ótimo
B Bom
C Regular
D Ruim

O final da pesquisa será indicado quando a idade do usuário for informada como negativa
(idade inexistente).
Construa um programa que, lendo esses dados, calcule e apresente:
 Quantidade de pessoas que respondeu a pesquisa
 Média de idade das pessoas que responderam a pesquisa
 Porcentagem de cada uma das respostas */

import java.util.Scanner;

public class Atividade_9_Estruturas_de_Repetição {
       public static void main(String[] args) {

              try (Scanner input = new Scanner(System.in)) {

                     int opiniao, idade = 0, quantPessoas = 0, mediaIdade = 0;
                     char escolha = 's';
                     double otimo = 0, bom = 0, ruim = 0, regular = 0, media=0;

                     while (escolha != 'n') {

                            System.out.print("Insira sua idade: ");
                            idade = input.nextInt();

                            System.out.println("Insira \n(1) ótimo \n(2) bom \n(3) regular e \n(4) ruim ");
                            opiniao = input.nextInt();

                            if (opiniao == 1) {
                                   otimo ++;
                            } else if (opiniao == 2) {
                                   bom ++;
                            } else if (opiniao == 3) {
                                   regular ++;
                            } else if (opiniao == 4) {
                                   ruim ++;
                            }
                            quantPessoas++;
                            mediaIdade= mediaIdade+idade;
                            media= mediaIdade/quantPessoas;
                            

                            System.out.print(" Para encerrar a operação digite\n [s]Sim \n [n]Não\n");
                            escolha = input.next().charAt(0);
                     }
                     
                     System.out.print("Foram entrevistadas " + quantPessoas + " pessoas, com média de idade de "
                                   + media + " anos,  dos quais: \n");

                     otimo = otimo * 100 / quantPessoas;
                     System.out.print(otimo + "% dos entrevistados responderam Otimo. \n");
                     bom = bom * 100 / quantPessoas;
                     System.out.print(bom + "% dos entrevistados responderam Bom. \n");
                     regular = regular * 100 / quantPessoas;
                     System.out.print(regular + "% dos entrevistados responderam Regular. \n");
                     ruim = ruim * 100 / quantPessoas;
                     System.out.print(ruim + "% dos entrevistados responderam Ruim. \n");

                     input.close();
              }

       }
}