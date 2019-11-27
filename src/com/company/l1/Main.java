package com.company.l1;

import sun.awt.geom.AreaOp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Локальные переменные должны быть инициализороны перед вызовом
        int x = 0;
        System.out.println(x + "Variable X must been inicialized");
        //Масивы и поля объектов переменные могут быть не проинициализороны перед вызовом
        //Массивы
        //FIXME Single array
        // -1
        // -2
        // -3
        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[6]); // -->>0 хотя иниц-но  только до 5 го элемента


        int[] k[] = {{7}, {66}}; // так тоже можно объявить массив
        System.out.println("Default init " + Arrays.deepToString(k));

        //  Объекты
        Object[] o = new Object[3];
        System.out.println(o[0]);

//TODO 1 arrays
        // Многокерные массивы (массыва массивов)
        System.out.println("Многокерные массивы (массыва массивов)");
        int[][][] m = new int[3][2][4];
        System.out.println(Arrays.deepToString(m));
        m[0][0] = new int[10];
        System.out.println(Arrays.deepToString(m));
        m[1][1] = new int[20];
        System.out.println(Arrays.deepToString(m));
        // STRINGS

        //FIXME строки это класы er
        // -1 сслылосный тип а не примитив
        // -многие путают из таких комтпукций Integer i = new Integer();

        String s1 = "Hello";  // "Hello" - это литерал для строк
        System.out.println(s1.toUpperCase());
        // тоже что и
        String s2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'}, 0, 5);
        System.out.println(s2);

    }
}
