/*
 * Monte um programa Java que mostre na tela em formato de tabela os
quartos ocupados e os desocupados. Considere que o hotel tem 4 andares e 3
quartos por andar. Primeiro, o usuário registrará os quartos ocupados,
informando para cada ocupação o número do apartamento (andar de 1 a 4 e
número de quarto de 1 a 3). O programa deverá questionar “Deseja informar
outra ocupação? (S/N)” e o usuário poderá informar quantos quartos quiser, até
que responda “N” a essa pergunta. Em seguida, o programa mostrará uma
tabela, em que o primeiro andar é o inferior e o último, o superior, marcando
com X o quarto ocupado.

 */

package pkg5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hotel[][] = new String[3][4];
        int andar = 0;
        int quarto = 0;
        char continuar = 'S';
        
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                hotel[i][j] = "desocupado";
            }
        }
        
        while (continuar == 'S' || continuar == 's') {
            Scanner entrada = new Scanner(System.in);
                System.out.println("\nDigite o andar: ");
                andar = entrada.nextInt();
                
                while (andar < 1 || andar > 3) {
                    System.out.println("\nInválido. Digite um número entre 1 e 3: ");
                    andar = entrada.nextInt();
                }
                
                System.out.println("\nDigite o quarto: ");
                quarto = entrada.nextInt();
                while (quarto < 1 || quarto > 4) {
                    System.out.println("\nInválido. Digite um número entre 1 e 4: ");
                    quarto = entrada.nextInt();
                }
                
                hotel[andar - 1][quarto - 1] = "X";
                
                System.out.println("\nDeseja informar outra ocupação? (S/N): ");
                continuar = entrada.next().charAt(0);
        }
        
        for (int i = (hotel.length -1); i >= 0; i--) {
            System.out.println(Arrays.toString(hotel[i]));
        }
    }
}

