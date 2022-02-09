package com.company;

public class MyClass<T extends Number> {
    T ob;

    MyClass(T ob) {
        this.ob = ob;
    }
    void showType(int x) {
        System.out.println(ob.getClass().getName());
        System.out.println(x);
    }
}
