package org.paciente;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        paciente paciente = new paciente();

        System.out.println("Bem-vindo a calculadora de IMC");
        System.out.println("Digite seu peso:");

        Scanner sc = new Scanner(System.in);
        String peso = sc.nextLine();
        float convPeso = Float.parseFloat(peso);
        paciente.peso = convPeso;

        System.out.println("\nAgora sua altura:");
        String altura = sc.nextLine();
        float convAltura = Float.parseFloat(altura);
        paciente.altura = convAltura;

        System.out.format("\nSeu IMC é de %.2f", paciente.getDiagnostico());
    }
}