package by.itstep.makejt.javalesson.lesson30.controller;

import by.itstep.makejt.javalesson.lesson30.model.logic.Fibanachi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input index");
        int index = scanner.nextInt();

//        int n = Fibanachi.getFibanachiNumber(index);
//        System.out.println(n);

        int n = Fibanachi.getFib(index);
        System.out.println(n);


    }
}
