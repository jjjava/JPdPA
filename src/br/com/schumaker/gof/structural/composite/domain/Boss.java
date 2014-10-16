package br.com.schumaker.gof.structural.composite.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Hudson Schumaker
 */
public class Boss extends AbstractEmployee {

    private List<AbstractEmployee> subordinados = new ArrayList<AbstractEmployee>();

    public Boss(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
        this.leaf = false;
    }

    @Override
    public int getSalario() {
        return salario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public boolean add(AbstractEmployee e) throws NoSuchElementException {
        this.subordinados.add(e);
        return true;
    }

    @Override
    public void remove(AbstractEmployee e) throws NoSuchElementException {
        this.remove(e);
    }

    @Override
    public List<AbstractEmployee> subordinados() {
        return this.subordinados;
    }

    @Override
    public AbstractEmployee getChild(String s) {
        for (int i = 0; i < subordinados.size(); i++) {
            if (subordinados.get(i).getNome().equals(s)) {
                return subordinados.get(i);
            }
        }

        return null;
    }

    @Override
    public int getSalarios() {
        int soma = salario;
        for (int i = 0; i < subordinados.size(); i++) {
            System.out.println(subordinados.get(i).nome);
            soma += subordinados.get(i).getSalarios();
        }
        return soma;
    }
}