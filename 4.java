/*
 * Monte um algoritmo em que o usuário poderá cadastrar e pesquisar hóspedes. O
algoritmo deve oferecer um menu com três opções ao usuário: 1- cadastrar; 2-
pesquisar; 3- sair. A opção “cadastrar” deve permitir que o usuário informe um
nome de hóspede, gravando-o em memória (máximo de 15 cadastros; caso atinja
essa quantidade, mostre “Máximo de cadastros atingido”). A opção “pesquisar” deve
permitir que o usuário informe um nome e, caso seja encontrado um nome
exatamente igual, mostre a mensagem “Hóspede (nome) foi encontrado no índice
(índice onde foi cadastrado)”. Se o nome não foi encontrado, mostre “Hóspede não
encontrado”. O algoritmo deve permitir que o usuário realize essas operações
repetidas vezes, até que use a opção “3”, que encerra o algoritmo.

 */

package pkg4;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] hospedes = new String[15];
        String nome;
        int opcao = 0;
        int indice;
                        
             
     
        while (opcao != 3) {
            Scanner menuSc = new Scanner(System.in);
                System.out.println("1 - Cadastrar \n2 - Pesquisar \n3 - Sair\n\nDigite uma opção: ");
                opcao = menuSc.nextInt();
                
            if (opcao == 1) {
                Scanner hospedeSc = new Scanner(System.in);
                    System.out.println("Digite o nome do hóspede para registrá-lo: ");
                    
                    for (int i = 0; i < 15; i++) {
                        if (hospedes[14] != null) {
                            System.out.println("\nMáximo de cadastros atingido\n");
                           
                            break;
                        }
                        
                        if (hospedes[i] == null) {
                            hospedes[i] = hospedeSc.next();
                            
                            break;
                        }
                    };
                    
                    System.out.println(Arrays.toString(hospedes) + "\n");
            };
            
            if (opcao == 2) {   
                Scanner nomeSc = new Scanner(System.in);
                    System.out.println("Digite o nome do hóspede para pesquisá-lo ");
                    nome = nomeSc.next();
                    
                indice = Arrays.asList(hospedes).indexOf(nome);
                
                if (indice == -1) {
                    System.out.println("\nHóspede não encontrado. Verifique se o nome foi digitado corretamente\n");
                } else {
                    System.out.println("\nHóspede '" + nome + "' encontrado no índice " + indice + "\n");
                };
            };
            
            if (opcao == 3) {
                break;
            };
        }
    }
}
