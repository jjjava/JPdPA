package br.com.schumaker.gof.creational.factorymethod;

import br.com.schumaker.gof.creational.factorymethod.domain.Logger;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class AbstractCreator {

    public abstract Logger createLogger();

    public Logger getLogger() {
        Logger logger = createLogger();
        return logger;
    }
}
