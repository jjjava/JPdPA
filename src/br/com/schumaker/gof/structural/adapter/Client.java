package br.com.schumaker.gof.structural.adapter;

import br.com.schumaker.gof.structural.adapter.domain.Funcionario;
import br.com.schumaker.gof.structural.adapter.domain.NovoFuncionario;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        Funcionario f = new NovoFuncionario();
        f.setNome("Carlos");
        f.getNome();
    }
}
