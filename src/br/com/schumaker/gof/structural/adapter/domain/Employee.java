package br.com.schumaker.gof.structural.adapter.domain;

import java.sql.ResultSet;

/**
 *
 * @author Hudson Schumaker
 */
public class Employee {

    private int nrFuncionario;
    private String nome;
    private String departamento;
    private double salario;

    public int getNrFuncionario() {
        return nrFuncionario;
    }

    public void setNrFuncionario(int nrFuncionario) {
        this.nrFuncionario = nrFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean create() {
        //implementação
        return true;
    }

    public boolean update() {
        //implementação
        return true;
    }

    public boolean delete() {
        //implementação
        return true;
    }

    public ResultSet search(String filter) {
        //implementação
        return null;
    }
}