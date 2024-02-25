package main;

import main.NumberSystems.Binary;
import main.NumberSystems.Decimal;
import main.NumberSystems.Hexadecimal;
import main.NumberSystems.Octal;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface (Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Number System Converter");
        System.out.println();

        while(true) {
            System.out.println("[1] - Decimal");
            System.out.println("[2] - Binary");
            System.out.println("[3] - Octal");
            System.out.println("[4] - Hexadecimal");
            System.out.println("Type 'quit' to exit");
            System.out.print("Convert from? ");
            String command = scanner.nextLine();
            System.out.println();

            if (command.equals("quit")) {
                break;
            }

            switch (command) {
                case "1" -> {
                    System.out.print("Enter decimal number: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    Decimal decimalNum = new Decimal(num);

                    System.out.println(decimalNum);
                }

                case "2" -> {
                    System.out.print("Enter binary number: ");
                    String num = scanner.nextLine();
                    Binary binaryNum = new Binary(num);
                    if (binaryNum.isValidBinaryNumber()) {
                        System.out.println(binaryNum);
                    } else {
                        System.out.println("Invalid binary number!");
                    }
                }

                case "3" -> {
                    System.out.print("Enter octal number: ");
                    String num = scanner.nextLine();
                    Octal octalNum = new Octal(num);
                    if (octalNum.isValidOctalNumber()) {
                        System.out.println(octalNum);
                    } else {
                        System.out.println("Invalid octal number!");
                    }
                }

                case "4" -> {
                    System.out.print("Enter hexadecimal number: ");
                    String num = scanner.nextLine();
                    Hexadecimal hexaNum = new Hexadecimal(num);
                    if (hexaNum.isValidHexadecimalNumber()) {
                        System.out.println(hexaNum);
                    } else {
                        System.out.println("Invalid hexadecimal number!");
                    }
                }
            }

            System.out.println();
        }
    }
}
