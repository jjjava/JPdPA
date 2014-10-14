package br.com.schumaker.gof.creational.factorymethod.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class ConnectionLogger implements Logger {

    @Override
    public void log(String mensagem) {
        System.err.println("Erro na conexão com o banco de dados: " + mensagem);
    }
}