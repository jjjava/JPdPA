package br.com.schumaker.nogof.creational.simplefactory;

/**
 *
 * @author Hudson Schumaker
 */
public class BancoSimpleFactory {

    public static final int ORACLE = 0;
    public static final int MYSQL = 1;

    public Banco getBanco(int tipoBanco) {
        if (tipoBanco == BancoSimpleFactory.ORACLE) {
            return new BancoOracle();
        } else if (tipoBanco == BancoSimpleFactory.MYSQL) {
            return new BancoMySql();
        } else {
            throw new IllegalArgumentException("Banco não suportado");
        }
    }
}
