package mh.cyb.root;

import mh.cyb.root.impl.BMIImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BMI bmiUtils = new BMIImpl();

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter height (e.g., 5ft10in, 4ft 2in, 10in, 5ft): ");
        String heightStr = sc.nextLine();

        System.out.println("\n");// for looking smart

        double heightInMeters = bmiUtils.convertHeightToMeters(heightStr);
        double bmi = weight / (heightInMeters * heightInMeters);

        String category = bmiUtils.getBMICategory(bmi);
        bmiUtils.printBMIResult(bmi, category);


    }
}