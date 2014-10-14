package br.com.schumaker.gof.creational.factorymethod.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class XMLLogger implements Logger {

    @Override
    public void log(String mensagem) {
        System.err.println("Erro em XML: " + mensagem);
    }
}
