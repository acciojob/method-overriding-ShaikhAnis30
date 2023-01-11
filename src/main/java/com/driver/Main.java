package com.driver;

public class Main {
  public static void main(String args[]) {
    B obj = new B();
//     System.out.println(obj.meth());
    obj.meth(); // called before Overriding
    // o/p : Invoking method from class A
    
    obj.meth(); // called after Overriding
    // o/p : Method is overridden in Extendend class B
  }
}

class A{
  public String meth(){
    String s = "Invoking method from class A";
    return s;
  }
}

class B extends A{
  @Override
  public String meth() {
    String s = "Method is overridden in Extendend class B";
    return s;
  }
}
