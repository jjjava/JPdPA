package br.com.schumaker.nogof.creational.simplefactory;

import br.com.schumaker.nogof.creational.simplefactory.domain.Banco;

/**
 *
 * @author Hudson Schumaker
 */
public class Cliente {

    public static void main(String[] args) {
        BancoSimpleFactory factory = new BancoSimpleFactory();
        Banco banco = factory.getBanco(BancoSimpleFactory.MYSQL);
        banco.salvar();
    }
}
