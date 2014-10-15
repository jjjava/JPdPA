package br.com.schumaker.gof.behavioral.mediator.domain;

import br.com.schumaker.gof.behavioral.mediator.Mediator;

/**
 *
 * @author Hudson Schumaker
 */
public class UsuarioChatMobile extends Usuario {

    public UsuarioChatMobile(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("usuario chatMobile: " + message);
    }
}
