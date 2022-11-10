/*13. Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá. Faça um algo ritmo para calcular quantos litros de água e de suco são necessários para se fazer X litros de refresco (informados pelo usuário).*/
import java.util.Scanner;

public class atividade13{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
      double aguaMineral, sucoMaracuja, quantRefresco,agua, suco;
        
      System.out.print( "Quantos litros de refrescos pretende fazer? ");
      quantRefresco = input.nextDouble();
      
      aguaMineral = 8;
      sucoMaracuja = 2;
      suco = (aguaMineral*quantRefresco)+(sucoMaracuja*quantRefresco);
      System.out.print("suco "+ suco);
       
      agua = quantRefresco*aguaMineral;

       System.out.print(" É necessário "+ agua+ " litros de agua para fazer"+ quantRefresco +"litros de refresco");
       
       
       
    }
    
}