package me.wslong.algo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Hello {
  public static void main(String[] args) {
    Class<?> demo = null;
    try {
      demo = Class.forName("me.wslong.algorithm.reflection.Person");
    } catch (Exception e) {
      e.printStackTrace();
    }
    Constructor<?> cons[] = demo.getConstructors();
    for (int i = 0; i < cons.length; i++) {
      System.out.println("构造方法：  " + cons[i]);
    }

    try {
      Method sayHello = demo.getMethod("sayHello", String.class);
      sayHello.invoke(demo.newInstance(), "Cloud Xi");
    } catch (InstantiationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SecurityException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

class Person {

  private String name;
  private int age;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public Person(int age) {
    this.age = age;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "[" + this.name + ", " + this.age + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void sayHello(String str) {
    System.out.println("Hello " + str);
  }

}