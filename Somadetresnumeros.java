/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somadetresnumeros;

import java.util.Scanner;

public class SomaTresNumeros {

    // Função que recebe três argumentos e retorna a soma
    public static int somaTresArgumentos(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Chama a função e exibe o resultado
        int resultado = somaTresArgumentos(num1, num2, num3);
        System.out.println("A soma dos três números é: " + resultado);

        scanner.close();
    }
}