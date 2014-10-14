package br.com.schumaker.gof.creational.builder.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class Veiculo {

    private String ano;
    private String cor;
    private String modelo;

    public Veiculo(String ano, String cor, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Veiculo() {
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String a) {
        ano = a;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        cor = c;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        modelo = m;
    }
}
