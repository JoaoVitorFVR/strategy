package org.example;

public class FreteMoto implements CalculoFrete {

    public float calcular(float distanciaKm, float pesoKg) {
        if (pesoKg > 20.0f) {
            throw new IllegalArgumentException("Peso acima do limite da moto");
        }
        else {
            return 5.0f + 2.0f * distanciaKm;
        }
    }
}
