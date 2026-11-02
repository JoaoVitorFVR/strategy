package org.example;

public class CalculadoraFrete {

    private float distanciaKm;
    private float pesoKg;

    public CalculadoraFrete(float distanciaKm, float pesoKg) {
        if (distanciaKm < 0 || pesoKg < 0) {
            throw new IllegalArgumentException("Distância e peso não podem ser negativos");
        }
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
    }

    public float calcular(CalculoFrete calculo) {
        return calculo.calcular(distanciaKm, pesoKg);
    }
}
