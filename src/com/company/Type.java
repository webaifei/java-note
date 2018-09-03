package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Type {
    public static void main(String[] args) {
        byte i = 1;
        short s = 190;
        int j = 1999;
        long l = 1999999;
        float f = 1.22f;
        double d = 1.222d;

        char w = 'w';

        boolean b = true;

        // 自动类型转换
        System.out.println((i + s));

        System.out.println("int + char: " + (i + w));
        // 数值类型和布尔类型无法自动转换
//        System.out.println("int + boolean: " + (w + b));

        System.out.println(f + d);

        // 强制类型转换

        System.out.println("char => int: " + (int) w);
        System.out.println("char code : " + w);
        System.out.println("int => code : " + (char) 118);

    }
}
