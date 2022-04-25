package by.itstep.makejt.javalesson.lesson31.model.logic;

// recursion-code
// 5! = 5 * 4!
// 4! = 4 * 3!
// 3! = 3 * 2!
// 2! = 2 * 1!

// base-code
// 1! = 1
// 0! = 1

import javax.naming.PartialResultException;

public class NumberLogic {

//    public static int zero() {
//        return 1;
//    }
//
//    public static int first() {
//        return 1;
//    }
//
//    public static int second() {
//        return 2 * first();
//    }
//
//    public static int third() {
//        return 3 * second();
//    }
//
//    public static int fourth() {
//        return 4 * third();
//    }
//
//    public static int fifth() {
//        return 5 * fourth();
//    }


    public static int factorial(int n) {

        // защита
        if (n < 0) {
            return -1;
        }

        // base-code
        if (n <= 1) {
            return 1;
        }

        // recursion-code
        return n * factorial(n - 1);
    }

    // СУММА ЦИФР ЧИСЛА
    // 0 ... 9 base case
    // f (12345) = 5 + f (1234) = 4 + f(123) = 3 + f (12) = 2 + f (1)


    public static int getSumOfDigits(int n) {
        // passive fool-prove
        if (n < 0) {
            return -1;
        }

        // active fool-prove

        n = n >= 0 ? n : -n;

        //  base-case
        if (n < 10) {
            return n;
        }

        return n % 10 + getSumOfDigits(n / 10);

    }

    // 1 подход
    public static int sumElements(int[] array) throws Exception {

        //  base-case
        // length == 1 , array [0]

        // f ({1 2 3 4 5 6}) = 6 + f ({1 2 3 4 5}) = 5 + f ({1 2 3 4})

        // passive fool-prove
        if (array == null || array.length == 0) {
            throw new Exception();
        }


        //  base-case
        if (array.length == 1) {
            return array[0];
        }

        // recursion-code

        int size = array.length - 1;
        int[] temp = new int[array.length - 1];

        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }

        return array[array.length - 1] + sumElements(temp);

    }

//
//    public static void main(String[] args) {
//
//        try {
//            sumElements()
//        }
//
//    }
//

    // 2 подход - через индекс

    // base-case index = 1, array [0]
    // recursion-code
    // f ({1 2 3 4 5 6}, 0 = 1 + f ({1 2 3 4 5 6}, 1) = 2 + f {1 2 3 4 5 6}, 2)


    public static int sumElements2(int[] array, int index) {
        return sumElements2(array, 0);
    }

    public static int sumElements(int[] array, int index) {
        if (index == array.length - 1) {
            return array[array.length - 1];
        }

        return array[index] = sumElements(array, 1);

    }
    // true
    // (1234567, 28) = (123456, 21) = (12345, 15) = (1234, 10) = (123, 6) = (12, 3) = (1, 1)
    // false

    // base n == m == 0 true
    //


    public static boolean isEquals(int n, int m) {
        if (n == 0) {
            if (m != 0) {
                return false;
            }
            return true;
        }
        int t = n % 10;
        return isEquals(n / 10, m - t);

    }

    // степень двойки? 1 2 4 8 16 32
    // base-case 1 true
    //

    // recursion-code

    // (8) = f (8/2) = f (4/2) + f (2)
    //

    public static boolean checkEquals (int number){
        if (number == 2) {
        return true;
        }

        if (number % 2 != 0){
            return  false;

        }

        return checkEquals(number / 2);

    }

    public static boolean checkEquals (int number, int degree){
        if (number == degree) {
            return true;
        }

        if (number % degree != 0){
            return  false;

        }

        return checkEquals(number / degree, degree);

    }




}
