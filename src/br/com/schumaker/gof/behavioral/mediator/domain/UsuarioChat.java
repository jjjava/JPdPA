package br.com.schumaker.gof.behavioral.mediator.domain;

import br.com.schumaker.gof.behavioral.mediator.Mediator;

/**
 *
 * @author Hudson Schumaker
 */
public class UsuarioChat extends Usuario {

    public UsuarioChat(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("usuario chat: " + message);
    }
}
