package me.wslong.algo.pattern.singleton;

public class SingletonTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SingletonObject so = SingletonObject.getInstance();
    int n = 1;
    so.setN(n);
    System.out.println(so.getN());

    SingletonObject so2 = SingletonObject.getInstance();
    so2.setN(100);

    System.out.println(so.getN());
  }

}
