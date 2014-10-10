package br.com.schumaker.gof.creational.abstractfactory.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class MSBotao implements Botao {

    @Override
    public void setText(String text) {
        // lógica para o ambiente Windows
        System.out.println("setText MSBotao: " + text);
    }

    @Override
    public void setClick() {
        // lógica para o ambiente Windows
        System.out.println("click MSBotao");
    }
}
