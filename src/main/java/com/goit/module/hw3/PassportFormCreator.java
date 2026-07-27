package com.goit.module.hw3;

import java.util.Scanner;

public class PassportFormCreator {

    public void createForms(){

        int moonMonths = 10;

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine()) * moonMonths;

        System.out.println(name + " " + surname + " " + age);
        System.out.println(name.toUpperCase() + "\n" + surname.toUpperCase() + "\n" + age);
        scanner.close();
    }

    public static void main(String[] args) {
        PassportFormCreator formCreator = new PassportFormCreator();
        formCreator.createForms();
    }
}
