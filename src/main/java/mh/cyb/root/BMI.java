package mh.cyb.root;

public interface BMI {

    double convertHeightToMeters(String height);
    String getBMICategory(double bmi);
    void printBMIResult(double bmi, String category);
    void printStarsRecursive(int n);
}
