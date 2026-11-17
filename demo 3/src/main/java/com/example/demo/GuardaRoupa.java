
package com.example.demo;

/**
 * Sistema do guarda-roupa da Barbie.
 */
public class GuardaRoupa {

    private double orcamento;

    /**
     * Cria o guarda-roupa com um orçamento disponível.
     */
    public GuardaRoupa(double orcamento) {
        this.orcamento = orcamento;
    }

    /**
     * Calcula o preço de um look com desconto.
     * O desconto deve estar entre 0 e 100.
     */
    public double precoComDesconto(double preco, double percentual) {

        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Desconto inválido!");
        }

        return preco - (preco * percentual / 100);
    }

    /**
     * Diz se um look cabe no orçamento.
     * O orçamento inclui o valor exato.
     */
    public boolean cabeNoOrcamento(double preco) {
        return preco <= orcamento;
    }

    /**
     * Diz se um look é de gala.
     * Acima de 200 reais é gala.
     */
    public boolean ehDeGala(double preco) {
        return preco > 500.0;
    }

    /**
     * Registra uma compra e desconta do orçamento.
     */
    public void registrarCompra(double preco) {
        this.orcamento = this.orcamento - preco;
    }

    /**
     * Devolve o orçamento restante.
     */
    public double getOrcamento() {
        return orcamento;
    }
}
