package by.itstep.makejt.javastages.stage11.addtask02.model.logic;

public class ArmstrongNumber {
    public static String findArmstrongNumber (int count){

        String msg = "There is not Armstrong number";

        if (count == 3) {
            msg = "Armstrong numbers: ";
            for (int i = 100; i <= 999; i++){
                if (Math.pow(i % 10, count) + Math.pow(i / 10 % 10, count) +
                        Math.pow(i / 100, count) == i) {
                    msg += i + ", ";
                }
            }
        } else if (count == 4){
            msg = "Armstrong numbers: ";
            for (int i = 1000; i <= 9999; i++) {
                if (Math.pow(i % 10, count) + Math.pow(i / 10 % 10, count) +
                        Math.pow(i / 100 % 10, count) + Math.pow(i / 1000, count) == i) {
                    msg += i + ", ";
                }
            }
        } else if (count == 5) {
            msg = "Armstrong numbers: ";
            for (int i = 10000; i <= 99999; i++) {
                if (Math.pow(i % 10, count) + Math.pow(i / 10 % 10, count) +
                        Math.pow(i / 100 % 10, count) + Math.pow(i / 1000 % 10, count) +
                        Math.pow(i / 10000, count) == i) {
                    msg += i + ", ";
                }
            }
        }

        return msg.replaceAll("\\s*,\\s*$", "");
    }
}
