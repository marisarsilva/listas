/* 3-A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto' deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.*/


public class atividade3 {
    public static void main(String args[]) {
      double umPao = 0.12;
      double umaBroa = 1.50;
      
      /** adicione a quantidade de pão e broas para fazer o cáulculo**/
      int quantPao = 2 ;
      int quantBroa = 2;
      
      double vendaPao = quantPao * umPao;
      double vendaBroa = quantBroa * umaBroa;
      
      double totalVenda = vendaPao + vendaBroa;
      
      double poupança = 0.10 * totalVenda;
      double poupança2 = totalVenda - poupança;
      
            
      System.out.println("A padaria Hotpão vendeu em broas " + vendaBroa + " reais e em pães "+ vendaPao+" reais que juntos somam um total de " + totalVenda); 
      System.out.println(" 10% desse valor" + poupança + " vai para a poupança; restando " + poupança2 + " para a compra de insumos e entre outras atividades inerentes");
        
    }
    
}
