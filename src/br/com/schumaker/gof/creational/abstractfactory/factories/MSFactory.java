package br.com.schumaker.gof.creational.abstractfactory.factories;

import br.com.schumaker.gof.creational.abstractfactory.domain.Botao;
import br.com.schumaker.gof.creational.abstractfactory.domain.Janela;
import br.com.schumaker.gof.creational.abstractfactory.domain.MSBotao;
import br.com.schumaker.gof.creational.abstractfactory.domain.MSJanela;

/**
 *
 * @author Hudson Schumaker
 */
public class MSFactory implements AbstractFactory {

    @Override
    public Janela createJanela() {
        MSJanela janela = new MSJanela();
        return janela;
    }

    @Override
    public Botao createBotao() {
        MSBotao botao = new MSBotao();
        return botao;
    }
}
