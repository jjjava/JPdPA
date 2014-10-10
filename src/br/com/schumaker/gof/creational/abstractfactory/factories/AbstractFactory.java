package br.com.schumaker.gof.creational.abstractfactory.factories;

import br.com.schumaker.gof.creational.abstractfactory.domain.Botao;
import br.com.schumaker.gof.creational.abstractfactory.domain.Janela;

/**
 *
 * @author Hudson Schumaker
 */
public interface AbstractFactory {

    public Janela createJanela();

    public Botao createBotao();
}
