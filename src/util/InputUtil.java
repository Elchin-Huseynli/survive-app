package util;

import java.util.Scanner;

public class InputUtil {
    public static byte inputTypeByte(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        byte input =  scanner.nextByte();
        return input;
    }

    public static int inputTypeInt(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        int input =  scanner.nextByte();
        return input;
    }
}
