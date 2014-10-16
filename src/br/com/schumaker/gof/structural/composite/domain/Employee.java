package br.com.schumaker.gof.structural.composite.domain;

import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Hudson Schumaker
 */
public class Employee extends AbstractEmployee {


    public Employee(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
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
        throw new NoSuchElementException("Employee não pode adicionar outro compomente");
    }

    @Override
    public void remove(AbstractEmployee e) throws NoSuchElementException {
        throw new NoSuchElementException("Employee não pode remover outro compomente");
    }

    @Override
    public List<AbstractEmployee> subordinados() {
        return null;
    }

    @Override
    public AbstractEmployee getChild(String s) {
        return null;
    }

    @Override
    public int getSalarios() {
        return salario;
    }
}
