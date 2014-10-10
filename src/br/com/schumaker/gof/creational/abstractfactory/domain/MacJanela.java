package br.com.schumaker.gof.creational.abstractfactory.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class MacJanela implements Janela {

    @Override
    public void setTitle(String title) {
        // lógina para o ambienta Mac OS X
        System.out.println("Titulo na janela Mac: " + title);
    }

    @Override
    public void paint() {
        // lógina para o ambienta Mac OS X
        System.out.println("Paint na janela Mac");
    }
}