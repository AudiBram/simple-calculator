package org.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }

    }
}