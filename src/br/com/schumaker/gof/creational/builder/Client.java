package br.com.schumaker.gof.creational.builder;

import br.com.schumaker.gof.creational.builder.domain.Veiculo;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        VeiculoBuilder veiculoBuilder = new CarroBuilder();
        GeradorVeiculos gerador = new GeradorVeiculos(veiculoBuilder);
        Veiculo veiculo = gerador.gerarVeiculo();
    }
}
