/*
Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos.
Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
Informe o valor de custo de cada produto, o valor de venda de cada produto, a 
média de preço de custo e de preço de venda.
 */
package ExerciciosJAVA;

import java.util.Scanner;

public class Exercicio22CustoVendaProdutos {

    
    public static void main(String[] args) {
        
        String produto;
        float pcusto;
        float pvenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        int i = 0;
        for (; i < 10; i++){
        
            System.out.println("Digite o nome do produto: ");
            produto = leitorScanner.nextLine();
        
            System.out.println("Digite o preco de custo: ");
            pcusto = leitorScanner.nextFloat();
        
            System.out.println("Digite o preco de venda: ");
            pvenda = leitorScanner.nextFloat();
                
            totalCusto = totalCusto + pcusto;
            totalVenda = totalVenda + pvenda; 
        
        if (pcusto == pvenda){
            
            System.out.println("Houve um empate entre o preco de custo e o preco"
                    + "de venda!");
            
                  
            } else{
                
                if(pcusto < pvenda) {
            
                    System.out.println("Houve lucro!");
                        }else{
            
                            System.out.println("Houve prejuizo!");
                        }       
           
            
                   }
        }
        
        System.out.println("A media do preco de custo é: " + (totalCusto / i));
        System.out.println("A media do preco de venda é: " + (totalVenda / i));
     }
        
        
        
    }
    

