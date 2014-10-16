package br.com.schumaker.gof.structural.bridge.domain;

import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 */
public class OrderedListImpl implements ListImplementor {

    private ArrayList<String> items = new ArrayList<String>();

    @Override
    public void addItem(String item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    @Override
    public void addItem(String item, int position) {
        if (!items.contains(item)) {
            items.add(position, item);
        }
    }

    @Override
    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(items.indexOf(item));
        }
    }

    @Override
    public int getNumberOfItems() {
        return items.size();
    }

    @Override
    public String getItem(int index) {
        if (index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    @Override
    public boolean isSupportsOrdering() {
        return true;
    }
}