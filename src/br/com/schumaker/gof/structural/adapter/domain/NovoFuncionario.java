package br.com.schumaker.gof.structural.adapter.domain;

import java.sql.ResultSet;

/**
 *
 * @author Hudson Schumaker
 */
public class NovoFuncionario extends Funcionario {

    private Employee employee;

    public NovoFuncionario() {
        if (employee == null) {
            employee = new Employee();
        }
    }

    @Override
    public int getNrFuncionario() {
        return this.employee.getNrFuncionario();
    }

    @Override
    public void setNrFuncionario(int nrFuncionario) {
        this.employee.setNrFuncionario(nrFuncionario);
    }

    @Override
    public String getNome() {
        return this.employee.getNome();
    }

    @Override
    public void setNome(String nome) {
        this.employee.setNome(nome);
    }

    @Override
    public String getDepartamento() {
        return this.employee.getDepartamento();
    }

    @Override
    public void setDepartamento(String departamento) {
        this.employee.setDepartamento(departamento);
    }

    @Override
    public double getSalario() {
        return this.employee.getSalario();
    }

    @Override
    public void setSalario(double salario) {
        this.employee.setSalario(salario);
    }

    @Override
    public boolean salvar(Funcionario f) {
        this.employee.setNrFuncionario(f.getNrFuncionario());
        this.employee.setNome(f.getNome());
        this.employee.setDepartamento(f.getDepartamento());
        this.employee.setSalario(f.getSalario());
        return this.employee.create();
    }

    @Override
    public boolean atualizar(Funcionario f) {
        this.employee.setNrFuncionario(f.getNrFuncionario());
        this.employee.setNome(f.getNome());
        this.employee.setDepartamento(f.getDepartamento());
        this.employee.setSalario(f.getSalario());
        return this.employee.update();
    }

    @Override
    public boolean excluir(int nrFuncionario) {
        this.employee.setNrFuncionario(nrFuncionario);
        return this.employee.delete();
    }

    @Override
    public ResultSet listaFuncionarios() {
        return this.employee.search(null);
    }

    @Override
    public ResultSet bustaFuncionariosPorNome(String nome) {
        return this.employee.search("nome LIKE '%" + nome + "%'");
    }

    @Override
    public ResultSet bustaFuncionario(int nrFuncionario) {
        return this.employee.search("nrFuncionario = " + String.valueOf(nrFuncionario));
    }
}
