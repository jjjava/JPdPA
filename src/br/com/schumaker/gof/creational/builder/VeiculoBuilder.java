package br.com.schumaker.gof.creational.builder;

import br.com.schumaker.gof.creational.builder.domain.Veiculo;

/**
 *
 * @author Hudson Schumaker
 */
public interface VeiculoBuilder {
  public void builderEstrutura();
  public void builderMotor();
  public void builderRodas();
  public void bulderPortas();
  public Veiculo getVeiculo();
}