
package br.com.schumaker.gof.creational.prototype;

/**
 *
 * @author Hudson Schumaker
 */
public class Janela implements Cloneable {

    private String titulo;
    private int altura;
    private int largura;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public Janela clone() {
        try {
            return (Janela) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalArgumentException("Clone não suportado");
        }
    }
}
