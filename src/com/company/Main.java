package com.company;

public class Main {
    public static void main(String[] args) {
        A a = new A(2, 'b');
        a.log();

        B b = new B(3, 'c');
        b.log();
        b.showPartent();
        b.sayHello();
    }
}

class A {
    int i = 0;
    private int j = 1;
    char code = 'a';

    A(int i, char code) {
        i = i;
        code = code;
    }

    void log() {
        System.out.println(j);
        System.out.println(code);
    }
}

class B extends A {
    String name = "class-b";

    B(int i, char code) {
        super(i, code);
    }

//    override
    @Override
    void log() {
        System.out.println(this.name);
    }
    void showPartent() {
        System.out.println(super.i);
        // try to access the super-class's private property will occur an  error
        // System.out.println(j);
    }

    void sayHello() {
        System.out.println(name);
    }
}

