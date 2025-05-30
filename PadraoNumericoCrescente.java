/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.padraonumericocrescente;

import java.util.Scanner;

public class PadraoNumericoCrescente {

    // Função que imprime o padrão desejado
    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
            return;
        }

        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Por favor, digite um número maior ou igual a 1.");
        } else {
            imprimirPadrao(n);
        }

        scanner.close();
    }
}