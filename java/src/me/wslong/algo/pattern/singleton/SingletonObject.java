package me.wslong.algo.pattern.singleton;

public class SingletonObject {
  private static SingletonObject instance;
  private int n;

  private SingletonObject() {
  }

  public static SingletonObject getInstance() {
    if (instance == null) {
      instance = new SingletonObject();
    }

    return instance;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

}
