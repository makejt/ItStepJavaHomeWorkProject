package by.itstep.makejt.javalesson.lesson30.model.logic;

public class Fibanachi {

//    public static int getFibanachiNumber(int index) {
//
//        if (index <= 0){
//            return -1;
//        }
//
//        int first = 0;
//        int second = 1;
//        int fib = second + first;
//
//        if (index == 1 || index == 2) {
//            return index - 1;
//        }
//
//        for (int i = 3; i < index; i++) {
//            first = second;
//            second = fib;
//            fib = second + first;
//        }
//        return fib;
//    }

    public static int getFib(int index) {
// base-case
        if (index <= 2) {
            return index - 1;
      }
// recursion-case
            return getFib(index - 1) + getFib(index - 2);

        }


}
