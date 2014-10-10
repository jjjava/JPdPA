package br.com.schumaker.nogof.creational.simplefactory;

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
