/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificanumero;

import java.util.Scanner;

public class VerificaNumero {

    // Função que retorna 'P' se o número for positivo, 'N' caso contrário
    public static char verificarPositivo(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chama a função e exibe o resultado
        char resultado = verificarPositivo(numero);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}