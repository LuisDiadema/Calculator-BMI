package org.paciente;

public class paciente {
    float peso;
    float altura;

    public double getDiagnostico() {
        float calculo = peso/(altura * altura);
        return calculo;
    }
}