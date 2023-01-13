package com.driver;

public class Main {
  public static void main(String args[]) {
    B obj = new B();  // task 3
    System.out.println(obj.meth());

    System.out.println(obj.meth());  // task 5
  }
}

class A{

  public String meth(){      // task 1
    return "Invoking method from class A";
  }
}

class B extends A{  // task 2

  public String meth(){   // task 4
    return "Method is overridden in Extendend class B";
  }
}


