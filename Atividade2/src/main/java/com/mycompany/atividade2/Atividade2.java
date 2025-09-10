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
        System.out.print("Digite um número entre 1 e 3: ");// pergunta um número
        int fruta = scanner.nextInt();// guarda o número escolhido
        
        
        switch (fruta) {
            case 1:
                System.out.println("Maçã");// mostra a resposta
                break;
            case 2:
                System.out.println("Banana");// mostra a resposta
                break;
            case 3:
                System.out.println("Morango");// mostra a resposta
                break;
            default:
                System.out.println("Fruta inválida! Por favor, digite um número entre 1 e 3.");// mostra caso escolher outro número
        }

        //Algoritmo que lê de 1 a 5 e exibe o nome do jogo correspondente
        System.out.print("Digite um número entre 1 e 5: ");// pede para digitar um numero
        int jogo = scanner.nextInt();

        switch (jogo) {
            case 1:
                System.out.println("FIFA");// mostra o jogo escolhido
                break;
            case 2:
                System.out.println("Call of Duty");// mostra o jogo escolhido
                break;
            case 3:
                System.out.println("Minecraft");// mostra o jogo escolhido
                break;
            case 4:
                System.out.println("Fortnite");//mostra o jogo escolhido
                break;
            case 5:
                System.out.println("Valorant");// mostra o jogo escolhido
                break;
            default:
                System.out.println("Jogo inválido! Por favor, digite um número entre 1 e 5.");//mostra caso escolher outro número
        }

        //algoritmo que lê de 1 a 7 e exibe o dia da semana correspondente
        System.out.print("Digite um número entre 1 e 7: ");// pede um numero
        int dia = scanner.nextInt();//guarda o numero

        switch (dia) {
            case 1:
                System.out.println("Domingo");//mostra o dia
                break;
            case 2:
                System.out.println("Segunda-feira");//mostra o dia
                break;
            case 3:
                System.out.println("Terça-feira");//mostra o dia
                break;
            case 4:
                System.out.println("Quarta-feira");//mostra o dia
                break;
            case 5:
                System.out.println("Quinta-feira");//mostra o dia
                break;
            case 6:
                System.out.println("Sexta-feira");//mostra o dia
                break;
            case 7:
                System.out.println("Sábado");//mostra o dia
                break;
            default:
                System.out.println("Dia inválido! Por favor, digite um número entre 1 e 7.");// mostra caso escolher outro número
        }
    }
}
