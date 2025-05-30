/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversordehorario;

import java.util.Scanner;

public class ConversorHorario {

    // Função que converte hora no formato 24 para 12
    public static Object[] converterPara12(int hora, int minuto) {
        char periodo;
        int novaHora;

        if (hora >= 12) {
            periodo = 'P'; // P.M.
            novaHora = (hora == 12) ? 12 : hora - 12;
        } else {
            periodo = 'A'; // A.M.
            novaHora = (hora == 0) ? 12 : hora; // Meia-noite é 12 A.M.
        }

        return new Object[]{novaHora, minuto, periodo};
    }

    // Função que exibe o horário convertido
    public static void mostrarResultado(int novaHora, int minuto, char periodo) {
        System.out.printf("Horário convertido: %d:%02d %c.M.\n", novaHora, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            // Ler hora e minuto
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();

            System.out.print("Digite os minutos (0-59): ");
            int minuto = scanner.nextInt();

            // Validação simples
            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Horário inválido! Tente novamente.");
                continue;
            }

            // Converter horário
            Object[] resultado = converterPara12(hora, minuto);
            int novaHora = (int) resultado[0];
            int novoMinuto = (int) resultado[1];
            char periodo = (char) resultado[2];

            // Mostrar resultado
            mostrarResultado(novaHora, novoMinuto, periodo);

            // Perguntar se deseja continuar
            System.out.print("Deseja converter outro horário? (S/N): ");
            resposta = scanner.next().toUpperCase();

        } while (resposta.equals("S"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}