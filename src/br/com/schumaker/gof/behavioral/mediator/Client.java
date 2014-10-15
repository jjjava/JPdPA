/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.schumaker.gof.behavioral.mediator;

import br.com.schumaker.gof.behavioral.mediator.domain.UsuarioChat;
import br.com.schumaker.gof.behavioral.mediator.domain.UsuarioChatMobile;

/**
 *
 * @author Hudson
 */
public class Client {

    public static void main(String[] args) {
        MediatorCentral mediator = new MediatorCentral();

        UsuarioChat user1 = new UsuarioChat(mediator);
        UsuarioChat user2 = new UsuarioChat(mediator);
        UsuarioChatMobile userMobile1 = new UsuarioChatMobile(mediator);

        mediator.addUsuario(user1);
        mediator.addUsuario(user2);
        mediator.addUsuario(userMobile1);

        user1.send("Olá!");
        user2.send("Olá user chat!");
    }
}
