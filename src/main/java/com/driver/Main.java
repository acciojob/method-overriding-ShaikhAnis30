package com.driver;

public class Main {
  public static void main(String args[]) {
    B obj = new B();  // task 3
//    System.out.println(obj.meth());
    obj.meth();

//    System.out.println(obj.meth());  // task 5
    obj.meth(); // task 5
  }


  public static class A {
    public String meth(){      // task 1
      return "Invoking method from class A";
    }
  }


  public static class B extends A{  // task 2
    @Override
    public String meth(){    // task 4
      return "Method is overridden in Extendend class B";
    }
  }
}



