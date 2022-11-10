/* 4-  Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela
possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19
anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS 

@Autor:Marisa_Rodrigues_da_Silva.

*/

public class atividade4{
    public static void main(String args[]) {
     
      String nomePessoa = "Lanna" ;
      int anoNascimento = 1932;
      int anoAtual= 2022;
      
      int anosVida =anoAtual-anoNascimento;
      int diasVida =anosVida * 165;
      
      
      
      
      
      
      System.out.println(nomePessoa+" possui " +diasVida+ " dias de Vida");
      
        
    }
    
}
