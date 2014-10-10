package br.com.schumaker.gof.creational.factorymethod.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class WriteFileLogger implements Logger {

    @Override
    public void log(String mensagem) {
        System.err.println("Erro na escrita do arquivo: " + mensagem);
    }
}
