package mh.cyb.root;

public interface BMIUtils {

    double convertHeightToMeters(String height);
    String getBMICategory(double bmi);
    void printBMIResult(double bmi, String category);
    void printStarsRecursive(int n);
}
