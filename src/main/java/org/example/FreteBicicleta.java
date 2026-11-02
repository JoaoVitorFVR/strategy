package org.example;

public class FreteBicicleta implements CalculoFrete {

    public float calcular(float distanciaKm, float pesoKg) {
        if (distanciaKm > 5.0f) {
            throw new IllegalArgumentException("Distância acima do limite da bicicleta");
        }
        else {
            return 3.0f + 1.0f * distanciaKm;
        }
    }
}
