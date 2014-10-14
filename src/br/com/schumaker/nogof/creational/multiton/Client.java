package br.com.schumaker.nogof.creational.multiton;

import br.com.schumaker.nogof.creational.multiton.domain.Camera;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(Camera.getInstance(001).getLocation());
        System.out.println(Camera.getInstance(002).getLocation());
    }
}
