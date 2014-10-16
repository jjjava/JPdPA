package br.com.schumaker.gof.structural.bridge;

import br.com.schumaker.gof.structural.bridge.domain.BaseList;
import br.com.schumaker.gof.structural.bridge.domain.ListAbstraction;
import br.com.schumaker.gof.structural.bridge.domain.ListImplementor;
import br.com.schumaker.gof.structural.bridge.domain.OrderedListImpl;

/**
 *
 * @author Hudson Schumaker
 */
public class Client {

    public static void main(String[] args) {
        ListImplementor list = new OrderedListImpl();
        ListAbstraction baseList = new BaseList();

        baseList.setImplementor(list);
        baseList.add("Hudson Schumaker");
        baseList.add("Humberto Schumaker");
        baseList.add("Hugo Schumaker");
        baseList.add("Henrique Schumaker");
        baseList.add("Nikolas Schumaker");
        baseList.add("Saulo Schumaker");
        baseList.add("Gabriel Schumaker");

        System.out.println(baseList.get(4));
    }
}
