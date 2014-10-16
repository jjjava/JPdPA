package br.com.schumaker.gof.structural.composite.domain;

import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Hudson Schumaker
 */
public abstract class AbstractEmployee {

    protected String nome;
    protected int salario;
    protected boolean leaf = true;

    public abstract int getSalario();
    public abstract String getNome();
    public abstract boolean add(AbstractEmployee e)throws NoSuchElementException;
    public abstract void remove(AbstractEmployee e)throws NoSuchElementException;
    public abstract List<AbstractEmployee> subordinados();
    public abstract AbstractEmployee getChild(String s);
    public abstract int getSalarios();
    public boolean isLeaf() {
        return leaf;
    }
}