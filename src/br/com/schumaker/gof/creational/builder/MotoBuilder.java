package br.com.schumaker.gof.creational.builder;

import br.com.schumaker.gof.creational.builder.domain.Veiculo;

/**
 *
 * @author Hudson Schumaker
 */
public class MotoBuilder implements VeiculoBuilder {

    @Override
    public void builderEstrutura() {
        // Regras do veículo
    }

    @Override
    public void builderMotor() {
        // Regras do veículo
    }

    @Override
    public void builderRodas() {
        // Regras do veículo
    }

    @Override
    public void bulderPortas() {
        // Regras do veículo
    }

    @Override
    public Veiculo getVeiculo() {
        // Regras do veículo
        return new Veiculo();
    }
}
