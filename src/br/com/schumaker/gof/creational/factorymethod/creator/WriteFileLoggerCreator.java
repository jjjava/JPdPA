package br.com.schumaker.gof.creational.factorymethod.creator;

import br.com.schumaker.gof.creational.factorymethod.AbstractCreator;
import br.com.schumaker.gof.creational.factorymethod.domain.Logger;
import br.com.schumaker.gof.creational.factorymethod.domain.WriteFileLogger;

/**
 *
 * @author Hudson Schumaker
 */
public class WriteFileLoggerCreator extends AbstractCreator {

    @Override
    public Logger createLogger() {
        WriteFileLogger logger = new WriteFileLogger();
        return logger;
    }
}
