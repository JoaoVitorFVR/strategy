package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaTest {

    @Test
    void deveCalcularFreteMoto() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteMoto(10.0f, 5.0f);
        assertEquals(25.0f, encomenda.getFrete());
    }

    @Test
    void deveCalcularFreteMotoNoLimiteDePeso() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteMoto(10.0f, 20.0f);
        assertEquals(25.0f, encomenda.getFrete());
    }

    @Test
    void naoDeveCalcularFreteMotoAcimaDoLimiteDePeso() {
        try {
            Encomenda encomenda = new Encomenda();
            encomenda.calcularFreteMoto(10.0f, 25.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso acima do limite da moto", e.getMessage());
        }
    }

    @Test
    void deveCalcularFreteBicicleta() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteBicicleta(4.0f, 2.0f);
        assertEquals(7.0f, encomenda.getFrete());
    }

    @Test
    void deveCalcularFreteBicicletaNoLimiteDeDistancia() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteBicicleta(5.0f, 2.0f);
        assertEquals(8.0f, encomenda.getFrete());
    }

    @Test
    void naoDeveCalcularFreteBicicletaAcimaDoLimiteDeDistancia() {
        try {
            Encomenda encomenda = new Encomenda();
            encomenda.calcularFreteBicicleta(6.0f, 2.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância acima do limite da bicicleta", e.getMessage());
        }
    }

    @Test
    void deveCalcularFreteCarro() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteCarro(10.0f, 20.0f);
        assertEquals(33.0f, encomenda.getFrete());
    }

    @Test
    void deveCalcularFreteExpresso() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteExpresso(10.0f, 5.0f);
        assertEquals(40.0f, encomenda.getFrete());
    }

    @Test
    void deveCalcularFreteRetirada() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteRetirada(10.0f, 5.0f);
        assertEquals(0.0f, encomenda.getFrete());
    }

    @Test
    void naoDeveCalcularFreteComDistanciaNegativa() {
        try {
            Encomenda encomenda = new Encomenda();
            encomenda.calcularFreteMoto(-1.0f, 5.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância e peso não podem ser negativos", e.getMessage());
        }
    }

    @Test
    void naoDeveCalcularFreteComPesoNegativo() {
        try {
            Encomenda encomenda = new Encomenda();
            encomenda.calcularFreteRetirada(10.0f, -5.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância e peso não podem ser negativos", e.getMessage());
        }
    }

    @Test
    void deveTrocarDeEstrategiaNaMesmaEncomenda() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFreteMoto(10.0f, 5.0f);
        assertEquals(25.0f, encomenda.getFrete());
        encomenda.calcularFreteExpresso(10.0f, 5.0f);
        assertEquals(40.0f, encomenda.getFrete());
    }

    @Test
    void deveCalcularFreteComEstrategiaInformada() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFrete(10.0f, 5.0f, new FreteCarro());
        assertEquals(25.5f, encomenda.getFrete());
    }

    @Test
    void deveCalcularFreteComEstrategiaPersonalizada() {
        Encomenda encomenda = new Encomenda();
        encomenda.calcularFrete(10.0f, 5.0f, (distanciaKm, pesoKg) -> 12.5f);
        assertEquals(12.5f, encomenda.getFrete());
    }

}