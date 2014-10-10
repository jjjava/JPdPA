package br.com.schumaker.gof.creational.factorymethod;

import br.com.schumaker.gof.creational.factorymethod.creator.ConnectionLoggerCreator;
import br.com.schumaker.gof.creational.factorymethod.creator.XMLLoggerCreator;
import br.com.schumaker.gof.creational.factorymethod.domain.Logger;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        AbstractCreator creator = new ConnectionLoggerCreator();

        Logger logger = creator.createLogger();
        logger.log("Erro no MySQL");
        
        creator = new XMLLoggerCreator();
        
        logger = creator.createLogger();
        logger.log("Teste.xml");
    }
}
