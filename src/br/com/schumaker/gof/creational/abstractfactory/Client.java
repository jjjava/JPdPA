package br.com.schumaker.gof.creational.abstractfactory;

import br.com.schumaker.gof.creational.abstractfactory.domain.Botao;
import br.com.schumaker.gof.creational.abstractfactory.domain.Janela;
import br.com.schumaker.gof.creational.abstractfactory.factories.AbstractFactory;
import br.com.schumaker.gof.creational.abstractfactory.factories.MSFactory;
import br.com.schumaker.gof.creational.abstractfactory.factories.MacFactory;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        AbstractFactory factory = null;
        if (System.getProperty("os.name").contains("Windows")) {
            factory = new MSFactory();
        } else {
            factory = new MacFactory();
        }

        Janela janela = factory.createJanela();
        janela.setTitle("Nova janela!");
        Botao botao = factory.createBotao();
        botao.setText("OK!");
    }
}
