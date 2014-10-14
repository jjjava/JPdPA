
package br.com.schumaker.nogof.creational.simplefactory.domain;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public interface Banco {
  public boolean salvar();
  public boolean alterar();
  public List<?> buscar();
  public boolean excluir();
}
