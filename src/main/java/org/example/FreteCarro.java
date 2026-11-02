package org.example;

public class FreteCarro implements CalculoFrete {

    public float calcular(float distanciaKm, float pesoKg) {
        return 8.0f + 1.5f * distanciaKm + 0.5f * pesoKg;
    }
}
