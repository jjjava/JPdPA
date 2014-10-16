package br.com.schumaker.gof.structural.composite;

import br.com.schumaker.gof.structural.composite.domain.Employee;
import br.com.schumaker.gof.structural.composite.domain.AbstractEmployee;
import br.com.schumaker.gof.structural.composite.domain.Boss;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        AbstractEmployee ceo, chefeMkt, chefeVendas, funMkt1, funMkt2, funVendas1;

        ceo = new Boss("Presidente", 200000);
        ceo.add(chefeMkt = new Boss("Chefe MKT", 100000));
        ceo.add(chefeVendas = new Boss("Chefe Vendas", 100000));


        chefeMkt.add(funMkt1 = new Employee("Funcionario MKT 1", 50000));
        chefeMkt.add(funMkt2 = new Employee("Funcionario MKT 2", 50000));

        chefeVendas.add(funVendas1 = new Employee("Funcionario Vendas 1", 50000));

        long salariosTotal = ceo.getSalarios();

        System.out.println(salariosTotal);
    }
}
