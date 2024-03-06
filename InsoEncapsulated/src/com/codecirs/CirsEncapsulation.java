package com.codecirs;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CirsEncapsulation {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.print("Enter test case number: ");
        int testCase = info.nextInt();
        switch (testCase) {
            case 1:
                System.out.println("Test Case 1: Student under 18");
                Student student1 = new Student("Cirs Joy", "Inso", 17, false);
                System.out.println(student1);
                break;
            case 2:
                System.out.println("Test Case 2: Increase age of student1");
                Student student2 = new Student("Cirs Joy", "Inso", 17, false);
                student2.increaseAge();
                System.out.println(student2);
                break;
            case 3:
                System.out.println("Test Case 3: Student over 18");
                Student student3 = new Student("Cirs", "Inso", 19, false);
                System.out.println(student3);
                break;
            default:
                System.out.println("Invalid test case number.");
        }

        info.close();
    }
}