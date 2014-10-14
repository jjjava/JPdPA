package br.com.schumaker.gof.creational.builder;

import br.com.schumaker.gof.creational.builder.domain.Veiculo;

/**
 *
 * @author Hudson Schumaker
 */
public class GeradorVeiculos {

    private VeiculoBuilder veiculoBuilder;

    public GeradorVeiculos(VeiculoBuilder veiculoBuilder) {
        this.veiculoBuilder = veiculoBuilder;
    }

    public Veiculo gerarVeiculo() {

        this.veiculoBuilder.builderEstrutura();
        this.veiculoBuilder.builderMotor();
        this.veiculoBuilder.builderRodas();
        this.veiculoBuilder.bulderPortas();

        return veiculoBuilder.getVeiculo();
    }
}