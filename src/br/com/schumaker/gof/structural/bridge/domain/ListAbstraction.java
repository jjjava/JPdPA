package br.com.schumaker.gof.structural.bridge.domain;

/**
 *
 * @author Hudson Schumaker
 */
public interface ListAbstraction {
  public void setImplementor(ListImplementor impl);
  public void add(String item);
  public void add(String item, int position);
  public void remove(String item);
  public String get(int index);
  public int count();
}
