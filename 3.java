/*
 * Escreva um programa Java que receba o valor padrão de uma diária e em
seguida receba vários nomes de hóspedes e suas idades. Caso a idade do
hóspede seja menor de 4 anos, ele não paga hospedagem – nesses casos, é
preciso que seja mostrada na tela a mensagem “(Nome do hóspede) possui
gratuidade”. Hóspedes com mais de 80 anos pagam metade – então dever ser
mostrado na tela “(Nome do hóspede) paga meia”. O usuário informará hóspedes
até digitar a palavra “PARE”, que interrompe a entrada de dados. Ao fim, o
programa deve mostrar a quantidade de gratuidades, a quantidade de meias
hospedagens e o valor total, considerando todos os hóspedes informados
 */

package pkg3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float diaria = 0.0f;
        float total = 0.0f;
        String nome = "";
        int idade = 0;
        int gratuidades = 0;
        int meias = 0;

        Scanner diariaSc = new Scanner (System.in);
            System.out.println("Digite o valor da diária: ");
            diaria = diariaSc.nextFloat();
            
        while (!nome.equals("PARE")) {
            Scanner hospedeSc = new Scanner (System.in);
                System.out.println("Digite o nome do hóspede: ");
                nome = hospedeSc.next();
                
            if (nome.equals("PARE")) {
                break;
            }

                System.out.println("Digite a idade do hóspede:");
                idade = hospedeSc.nextInt();
                
            if (idade <= 4) {
                gratuidades++;
            };

            if (idade >= 80) {
                total += (diaria / 2);
                meias++;
            };

            if (idade > 4 && idade < 80) {
                total += diaria;
            };
        };

        System.out.println("Valor total de hospedagens: " + total + "; " + gratuidades + " gratuidades(s) e " + meias + " meia(s)");
    }
}
