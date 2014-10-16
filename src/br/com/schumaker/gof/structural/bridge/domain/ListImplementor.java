package br.com.schumaker.gof.structural.bridge.domain;

/**
 *
 * @author Hudson Schumaker
 */
public interface ListImplementor {
  public void addItem(String item);
  public void addItem(String item, int position);
  public void removeItem(String item);
  public int getNumberOfItems();
  public String getItem(int index);
  public boolean isSupportsOrdering();
}
