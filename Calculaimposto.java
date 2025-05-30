/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculaimposto;

import java.util.Scanner;

public class CalculaImposto {

    // Função que calcula o custo com imposto incluído
    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o custo do item ao usuário
        System.out.print("Digite o custo do item antes do imposto: ");
        double custo = scanner.nextDouble();

        // Solicita a taxa de imposto
        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = scanner.nextDouble();

        // Calcula o novo custo com imposto
        double custoComImposto = somaImposto(taxaImposto, custo);

        // Exibe o resultado
        System.out.printf("Custo com imposto: R$ %.2f\n", custoComImposto);

        scanner.close();
    }
}