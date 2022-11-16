/*5. Um motorista deseja colocar no seu tanque X R$ de gasolina. Escreva um algoritmo para ler o preço do litro da gasolina e o valor pago, e exibir quantos litros ele conseguiu colocar no tanque.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class Atividade_5_Estrutura_Sequencial{
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        double gasolina=1.50, litrosGasolina,preçoGasolina;

        System.out.println("Quanto você pagou na compra de gasolina: ");
        preçoGasolina = input.nextDouble();
        
        
        litrosGasolina = preçoGasolina/gasolina;
        
          
       System.out.print("Você Comprou "+ litrosGasolina+ " litros de gasolina");

       input.close();
        
    }
    
}
