package br.com.schumaker.gof.behavioral.mediator.domain;

import br.com.schumaker.gof.behavioral.mediator.Mediator;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class Usuario {

    private Mediator mediator;

    public Usuario(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        this.mediator.send(message, this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);
}