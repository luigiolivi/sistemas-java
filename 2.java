/*
 *  Escreva um programa Java que faça a troca de quartos entre dois hospedes. É
preciso que ele receba o nome de um cliente e sua idade; o cliente a princípio será
hospedado no quarto A. Depois, o programa deve receber o nome de outro cliente
e sua idade; se o cliente for mais jovem, ficará no quarto B, mas, se a idade deste
for maior que a do primeiro cliente, ele ficará no quarto A e o primeiro cliente ficará
no quarto B. Além disso, se a pessoa mais velha for idosa (com 60 anos ou mais),
terá desconto de 40%. O programa deve mostrar ao final o nome do cliente que
ficou no quarto A e o desconto, se houver, e o nome do cliente que ficou no quarto
B.
 */

package pkg2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String primeiroNome;
        int primeiraIdade;
       
        String segundoNome;
        int segundaIdade;
        
        String quartoA;
        String quartoB;
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o nome do primeiro cliente: ");
            primeiroNome = entrada.next();
            quartoA = primeiroNome;
            
            System.out.println("Digite a idade do primeiro cliente: ");
            primeiraIdade = entrada.nextInt(); 
            
            System.out.println("\nDigite o nome do segundo cliente: ");
            segundoNome = entrada.next();
            
            System.out.println("Digite a idade do segundo cliente: ");
            segundaIdade = entrada.nextInt();
        entrada.close();
        
        if (segundaIdade <= primeiraIdade) {
            quartoB = segundoNome;
            
            if (primeiraIdade >= 60) {
                System.out.println("Quarto A: " + quartoA + ", com desconto de 40% \nQuarto B: " + quartoB);
            } else {
                System.out.println("Quarto A: " + quartoA + " \nQuarto B:" + quartoB);
            }
        } else {
            quartoA = segundoNome;
            quartoB = primeiroNome;
            
            if (segundaIdade >= 60) {
                System.out.println("Quarto A: " + quartoA + ", com desconto de 40% \nQuarto B: " + quartoB);
            } else {
                System.out.println("Quarto A: " + quartoA + " \nQuarto B:" + quartoB);
            }
        }
    }
}
