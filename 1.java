/*
 * Relativo ao atendimento de eventos, o hotel necessita de uma funcionalidade
que indique qual de seus dois auditórios é o mais adequado para um evento. O
auditório Alfa conta com 150 lugares e espaço para até 70 cadeiras adicionais. O
auditório Beta conta com 350 lugares, sem espaço para mais cadeiras. Desenvolva
um programa Java que receba o número de convidados do evento e faça uma
verificação sobre esse número: se for maior que 350 ou menor que zero, deverá ser
mostrada a mensagem “Número de convidados inválido”. Se o valor informado é
válido, deverá ser mostrado na tela qual dos auditórios é o mais adequado. No caso
do auditório Alfa, será preciso calcular ainda quantas cadeiras adicionais serão
necessárias, observando o limite citado anteriormente. 
 */

package pkg1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int convidados;
        
        Scanner entrada = new Scanner (System.in);
        
            System.out.println("Digite o número de convidados :");
            convidados = entrada.nextInt();
        
        entrada.close();
        
        if (convidados < 0 || convidados > 350) {
            System.out.println("Número de convidados inválido!");
        } else {
            if (convidados <= 220) {
                if (convidados <= 150) {
                    System.out.println("Use o auditório Alfa");
                } else {
                    System.out.println("Use o auditório Alfa, incluindo mais " + (convidados - 150) + " cadeiras adicionais");
                }
            }
            
            if (convidados > 220 && convidados <= 350) {
                System.out.println("Use o auditório Beta");
            }
        }
    }    
}
