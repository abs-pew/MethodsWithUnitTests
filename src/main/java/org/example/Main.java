package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(addNumbers(4, 5));

       System.out.println(isEven(2));

        System.out.println(multiplyNumbers(4, 5));

        System.out.println(changeToCapitalLetters("neuefische"));

        System.out.println(isPositive(5));

    }

    private static boolean isPositive(int num)
    {
        return num > 0;
    }

    public static String changeToCapitalLetters(String string)
    {
        return string.toUpperCase();
    }

    public static int multiplyNumbers(int num1, int num2)
    {
       return num1 * num2;
    }

    public static boolean isEven(int num)
    {
        return num % 2 == 0;
    }

    public static int addNumbers(int num1, int num2)
    {
        return num1 + num2;
    }
}