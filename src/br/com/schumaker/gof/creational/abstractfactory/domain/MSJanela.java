package br.com.schumaker.gof.creational.abstractfactory.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class MSJanela implements Janela {

    @Override
    public void setTitle(String title) {
        // lógica para o ambiente Windows
        System.out.println("Titulo na janela MS: " + title);
    }

    @Override
    public void paint() {
        // lógica para o ambiente Windows
        System.out.println("Paint na janela M$");
    }
}