package org.example;

public class FreteExpresso implements CalculoFrete {

    public float calcular(float distanciaKm, float pesoKg) {
        return 10.0f + 3.0f * distanciaKm;
    }
}
