package com.ExceptionTry_Catch;

public class Main {

    public static void main(String[] args) {


        try {
            int i = 100/0;
            System.out.println(i);
            //ArithmeticException ist eine Ausnahme, die auftritt, wenn eine arithmetische Operation fehlschlägt.
        } catch (ArithmeticException e) {
           System.out.println("Sie können nicht 100 durch 0 teilen");
        }
    }
}
