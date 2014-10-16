package br.com.schumaker.gof.structural.bridge.domain;

/**
 *
 * @author Hudson Schumaker
 */
public class BaseList implements ListAbstraction {

    private ListImplementor implementor;

    @Override
    public void setImplementor(ListImplementor impl) {
        this.implementor = impl;
    }

    @Override
    public void add(String item) {
        this.implementor.addItem(item);
    }

    @Override
    public void add(String item, int position) {
        if (this.implementor.isSupportsOrdering()) {
            this.implementor.addItem(item, position);
        }
    }

    @Override
    public void remove(String item) {
        this.implementor.removeItem(item);
    }

    @Override
    public String get(int index) {
        return this.implementor.getItem(index);
    }

    @Override
    public int count() {
        return this.implementor.getNumberOfItems();
    }
}