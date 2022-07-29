package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShoppingCart<T extends Product> {
  // storage for the cart's contents
  private Collection<T> items = new ArrayList<T>();

  public double total() {
    double result = 0.0;
    for (T item : items) {
      result += item.getPrice();
    }
    return result;
  }

  public void addItem(T item) {
    items.add(item);
  }

  public void removeItem(T item) {
    items.remove(item);
  }

  public Collection<T> allItems() {
    return Collections.unmodifiableCollection(items);
  }

  public int size() {
    return items.size();
  }
}