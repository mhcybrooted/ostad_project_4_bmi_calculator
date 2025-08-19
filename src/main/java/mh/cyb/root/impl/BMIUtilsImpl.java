package mh.cyb.root.impl;

import mh.cyb.root.BMIUtils;

public class BMIUtilsImpl implements BMIUtils {
    @Override
    public double convertHeightToMeters(String height) {
        height = height.toLowerCase().replaceAll(" ", "");
        int ft = 0, in = 0;

        if (height.contains("ft")) {

            String[] ftSplit = height.split("ft");
            ft = Integer.parseInt(ftSplit[0]);

            if (ftSplit.length > 1 && ftSplit[1].contains("in")) {
                in = Integer.parseInt(ftSplit[1].replace("in", ""));
            }

        } else if (height.contains("in")) {
            in = Integer.parseInt(height.replace("in", ""));
        }

        int totalInches = ft * 12 + in;
        return totalInches * 0.0254;
    }

    @Override
    public String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal Weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    @Override
    public void printBMIResult(double bmi, String category) {
        int stars = (int) bmi;

        printStarsRecursive(stars);
        System.out.println();

        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Category: " + category);

        printStarsRecursive(stars);
        System.out.println();
    }

    @Override
    public void printStarsRecursive(int n) {
        if (n <= 0) return;

        System.out.print("*");
        printStarsRecursive(n - 1);
    }
}
