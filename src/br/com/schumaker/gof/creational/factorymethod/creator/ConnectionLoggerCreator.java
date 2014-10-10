package br.com.schumaker.gof.creational.factorymethod.creator;

import br.com.schumaker.gof.creational.factorymethod.AbstractCreator;
import br.com.schumaker.gof.creational.factorymethod.domain.ConnectionLogger;
import br.com.schumaker.gof.creational.factorymethod.domain.Logger;

/**
 *
 * @author Hudson Schumaker
 */
public class ConnectionLoggerCreator extends AbstractCreator {

    @Override
    public Logger createLogger() {
        ConnectionLogger logger = new ConnectionLogger();
        return logger;
    }
}
