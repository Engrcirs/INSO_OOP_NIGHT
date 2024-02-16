package com.codecirs;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = scanner.nextLine();

        if (JejeTypings(message)){
            System.out.println("JEJE!");
        }
        else {
            System.out.println("uWu");
        }
    }
    private static boolean JejeTypings(String message){
        String[] text = message.split("\\s+");
        for (String texts : text ){
            if (texts.length() > 1 && Character.isUpperCase(texts.charAt(1))) {
                return true;
            }
        }
        return false;
    }
}