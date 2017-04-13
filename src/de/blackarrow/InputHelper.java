package de.blackarrow;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Max on 24.02.15.
 */
public class InputHelper {

    /**
     * Reads a value as string from console input
     *
     * @return String value or null if something went wrong
     */
    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        String out = scanner.nextLine();
        return out;
    }

    /**
     * Reads a value as int from console input
     * @param errorMessage message printed if input was no int
     * @return positive int value or -1 if something went wrong
     */
    public static int readInt(String errorMessage) {
       Scanner scanner = new Scanner(System.in);
        int out = -1;

        try {
            out = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println(errorMessage);
        }
        return out;
    }

    /**
     * Reads a value as int from console input
     * @return positive int value or -1 if something went wrong
     */
    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int out = -1;

        try {
            out = scanner.nextInt();
        } catch (NoSuchElementException e){
//            do nothing if exception is thrown
        }

        return out;
    }

    /**
     * Reads a value as double from console input
     * @return positive int value or -1 if something went wrong
     */
    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        double out = -1;

        try {
            out = scanner.nextDouble();
        } catch (NoSuchElementException e){
//            do nothing if exception is thrown
        }

        return out;
    }

}
