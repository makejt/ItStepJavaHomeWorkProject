package by.itstep.makejt.javastages.stage11.addtask01.model.logic;
public class NOK_NOD {

    public static int countNOD (int number1, int number2){

        int minNumber = Math.min(number1, number2);
        int NOD = 1;

        for (int i = 1; i < minNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0 && i > NOD) {
                NOD = i;
            }
        }
        return NOD;
    }

    public static int countNOK (int number1, int number2){
        return number1*number2/countNOD(number1, number2);
    }
}
