/*5. Um motorista deseja colocar no seu tanque X R$ de gasolina. Escreva um algoritmo para ler o preço do litro da gasolina e o valor pago, e exibir quantos litros ele conseguiu colocar no tanque.

@Autor:Marisa_Rodrigues_da_Silva.

*/

import java.util.Scanner;

public class atividade5{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        double gasolina, litrosGasolina,preçoGasolina;
        
        gasolina = 1.50;
        
       System.out.print("Quanto você pagou na compra de gasolina: ");
        preçoGasolina = input.nextDouble();
        
        
        litrosGasolina = preçoGasolina/gasolina;
        
          
       System.out.print("Você Comprou "+ litrosGasolina+ " litros de gasolina");
    }
    
}
