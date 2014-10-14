package br.com.schumaker.gof.creational.abstractfactory.factories;

import br.com.schumaker.gof.creational.abstractfactory.domain.Botao;
import br.com.schumaker.gof.creational.abstractfactory.domain.Janela;
import br.com.schumaker.gof.creational.abstractfactory.domain.MacBotao;
import br.com.schumaker.gof.creational.abstractfactory.domain.MacJanela;

/**
 *
 * @author Hudson Schumaker
 */
public class MacFactory implements AbstractFactory {

    @Override
    public Janela createJanela() {
        MacJanela janela = new MacJanela();
        return janela;
    }

    @Override
    public Botao createBotao() {
        MacBotao botao = new MacBotao();
        return botao;
    }
}
