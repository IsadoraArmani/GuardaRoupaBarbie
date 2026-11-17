package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class GuardaRoupaTeste {

        private GuardaRoupa Barbie;

        @BeforeEach
        void preparar() {
            Barbie = new GuardaRoupa(500.00);
        }

        @Test
        @DisplayName("10% de desconto em 500 = 450")
        void precoComDesconto() {
            assertEquals(450.00,
                    Barbie.precoComDesconto(500, 10), 0.01);
        }

        @Test
        @DisplayName("Desconto negativo lança exceção")
        void descontoNegativo() {
            assertThrows(IllegalArgumentException.class, () ->
                    Barbie.precoComDesconto(500, -10));
        }

        @Test
        @DisplayName("Desconto acima de 100 lança exceção")
        void descontoAcimaDe100() {
            assertThrows(IllegalArgumentException.class, () ->
                    Barbie.precoComDesconto(500, 110));
        }

        @Test
        @DisplayName("Preço abaixo do orçamento")
        void cabeAbaixoDoOrcamento() {
            assertTrue(Barbie.cabeNoOrcamento(400));
        }

        @Test
        @DisplayName("Preço igual ao orçamento")
        void cabeIgualAoOrcamento() {
            assertTrue(Barbie.cabeNoOrcamento(500));
        }

        @Test
        @DisplayName("Preço abaixo de 500 não é gala")
        void galaAbaixoDe200() {
            assertFalse(Barbie.ehDeGala(499));
        }

        @Test
        @DisplayName("Preço exatamente 500 não é gala")
        void galaIgualA200() {
            assertFalse(Barbie.ehDeGala(500));
        }

        @Test
        @DisplayName("Preço acima de 500 é gala")
        void galaAcimaDe200() {
            assertTrue(Barbie.ehDeGala(501));
        }
    }