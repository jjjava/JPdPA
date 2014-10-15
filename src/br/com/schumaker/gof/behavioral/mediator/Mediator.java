package br.com.schumaker.gof.behavioral.mediator;

import br.com.schumaker.gof.behavioral.mediator.domain.Usuario;

/**
 *
 * @author Hudson Schumaker
 */
public interface Mediator {

    public void send(String message, Usuario from);
}