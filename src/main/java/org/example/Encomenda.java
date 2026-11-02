package org.example;

public class Encomenda {

    private float frete;

    public float getFrete() {
        return frete;
    }

    public void calcularFreteMoto(float distanciaKm, float pesoKg) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distanciaKm, pesoKg);
        this.frete = calculadora.calcular(new FreteMoto());
    }

    public void calcularFreteBicicleta(float distanciaKm, float pesoKg) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distanciaKm, pesoKg);
        this.frete = calculadora.calcular(new FreteBicicleta());
    }

    public void calcularFreteCarro(float distanciaKm, float pesoKg) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distanciaKm, pesoKg);
        this.frete = calculadora.calcular(new FreteCarro());
    }

    public void calcularFreteExpresso(float distanciaKm, float pesoKg) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distanciaKm, pesoKg);
        this.frete = calculadora.calcular(new FreteExpresso());
    }

    public void calcularFreteRetirada(float distanciaKm, float pesoKg) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distanciaKm, pesoKg);
        this.frete = calculadora.calcular(new FreteRetirada());
    }

    public void calcularFrete(float distanciaKm, float pesoKg, CalculoFrete calculo) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distanciaKm, pesoKg);
        this.frete = calculadora.calcular(calculo);
    }
}
