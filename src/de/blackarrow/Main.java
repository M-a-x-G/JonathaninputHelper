package de.blackarrow;

public class Main {

    public static void main(String[] args) {

        System.out.print("Irgentwas:  ");
        String string = InputHelper.readString();
        System.out.println("-> " + string);

        System.out.print("Nur eine Zahl: ");
        int integer = InputHelper.readInt("Das ist keine zahl");
        System.out.println("-> " + integer);

        System.out.print("Nur eine zweite Zahl: ");
        int integer2 = InputHelper.readInt();
        System.out.println("-> " + integer2);

    }
}
