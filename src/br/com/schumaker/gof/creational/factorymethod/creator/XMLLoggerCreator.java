package br.com.schumaker.gof.creational.factorymethod.creator;

import br.com.schumaker.gof.creational.factorymethod.AbstractCreator;
import br.com.schumaker.gof.creational.factorymethod.domain.Logger;
import br.com.schumaker.gof.creational.factorymethod.domain.XMLLogger;

/**
 *
 * @author Hudson Schumaker
 */
public class XMLLoggerCreator extends AbstractCreator {

    @Override
    public Logger createLogger() {
        XMLLogger logger = new XMLLogger();
        return logger;
    }
}
