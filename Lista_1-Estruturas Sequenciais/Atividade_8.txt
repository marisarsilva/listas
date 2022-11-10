/*8. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina informe quanto será o valor arrecadado.*/


import java.util.Scanner;

public class atividade8{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
double p,m,g, valorArrecardadoP, valorArrecardadoM, valorArrecardadoG, totalArrecardado;
int quantP, quantM, quantG,totalCamisetas;
        
        p = 10;
        m = 12;
        g= 15;
        
        
       System.out.print( "Insira a quantidade de camisetas tamanho P: ");
        quantP = input.nextInt();
       
       System.out.print( "Insira a quantidade de camisetas tamanho M: ");
        quantM = input.nextInt();
       
       System.out.print( "Insira a quantidade de camisetas tamanho G: ");
        quantG = input.nextInt();
        
        totalCamisetas = quantP+quantM+quantG;
        
        valorArrecardadoP =  quantP*p;
        valorArrecardadoM = quantM*m;
        valorArrecardadoG = quantG*g;
        totalArrecardado =  valorArrecardadoP+valorArrecardadoM+valorArrecardadoG;
        
    System.out.print(" Foram vendidas um total de "+totalCamisetas+" camisetas, arrecardando um total de "+totalArrecardado+" reais");
    }
    
}

