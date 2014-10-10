package br.com.schumaker.nogof.creational.simplefactory;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class BancoMySql implements Banco {

    @Override
    public boolean salvar() {
        //...
        return false;
    }

    @Override
    public boolean alterar() {
        //...
        return false;
    }

    @Override
    public List<?> buscar() {
        //...
        return null;
    }

    @Override
    public boolean excluir() {
        //...
        return false;
    }
}
