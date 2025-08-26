/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

/**
 *
 * @author Koragem
 */
import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {
        
        //Algoritmo que lê 1 a 3 e exibe o nome da fruta correspondente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 3: ");
        int fruta = scanner.nextInt();
        
        
        switch (fruta) {
            case 1:
                System.out.println("Maçã");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Morango");
                break;
            default:
                System.out.println("Fruta inválida! Por favor, digite um número entre 1 e 3.");
        }

        //Algoritmo que lê de 1 a 5 e exibe o nome do jogo correspondente
        System.out.print("Digite um número entre 1 e 5: ");
        int jogo = scanner.nextInt();

        switch (jogo) {
            case 1:
                System.out.println("FIFA");
                break;
            case 2:
                System.out.println("Call of Duty");
                break;
            case 3:
                System.out.println("Minecraft");
                break;
            case 4:
                System.out.println("Fortnite");
                break;
            case 5:
                System.out.println("Valorant");
                break;
            default:
                System.out.println("Jogo inválido! Por favor, digite um número entre 1 e 5.");
        }

        //algoritmo que lê de 1 a 7 e exibe o dia da semana correspondente
        System.out.print("Digite um número entre 1 e 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido! Por favor, digite um número entre 1 e 7.");
        }
    }
}
