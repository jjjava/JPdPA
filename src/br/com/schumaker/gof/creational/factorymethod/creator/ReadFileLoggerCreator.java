package br.com.schumaker.gof.creational.factorymethod.creator;

import br.com.schumaker.gof.creational.factorymethod.AbstractCreator;
import br.com.schumaker.gof.creational.factorymethod.domain.Logger;
import br.com.schumaker.gof.creational.factorymethod.domain.ReadFileLogger;

/**
 *
 * @author Hudson Schumaker
 */
public class ReadFileLoggerCreator extends AbstractCreator {

    @Override
    public Logger createLogger() {
        ReadFileLogger logger = new ReadFileLogger();
        return logger;
    }
}