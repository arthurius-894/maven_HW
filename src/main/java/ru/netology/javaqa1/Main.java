package ru.netology.javaqa1;

public class Main
{
    public static void main( String[] args )
    {
        BonusService service = new BonusService();

        int expected = 500;
        long actual = service.calculate(16_667, true);
        System.out.println(expected + " == ? == " + actual);
    }
}