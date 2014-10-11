package br.com.schumaker.nogof.creational.multiton;

import br.com.schumaker.nogof.creational.multiton.domain.Camera;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Camera cam1 = Camera.getInstance(001);
        Camera cam2 = Camera.getInstance(002);

        System.out.println(cam1.getLocation());
        System.out.println(cam2.getLocation());
    }
}
