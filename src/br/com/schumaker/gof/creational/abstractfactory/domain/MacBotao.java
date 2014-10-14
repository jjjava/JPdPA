package br.com.schumaker.gof.creational.abstractfactory.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class MacBotao implements Botao {

    @Override
    public void setText(String text) {
        // lógica para o Mac OSX
        System.out.println("setText MacBotao: " + text);
    }

    @Override
    public void setClick() {
        // lógica para o Mac OSX
        System.out.println("click MacBotao");
    }
}
