package br.com.schumaker.gof.structural.adapter.domain;

import java.sql.ResultSet;

/**
 *
 * @author Hudson Schumaker
 */
public class Funcionario {

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

    public boolean salvar(Funcionario f) {
        //implementação
        return true;
    }

    public boolean atualizar(Funcionario f) {
        //implementação
        return true;
    }

    public boolean excluir(int nrFuncionario) {
        //implementação
        return true;
    }

    public ResultSet listaFuncionarios() {
        //implementação
        return null;
    }

    public ResultSet bustaFuncionariosPorNome(String nome) {
        //implementação
        return null;
    }

    public ResultSet bustaFuncionario(int nrFuncionario) {
        //implementação
        return null;
    }
}