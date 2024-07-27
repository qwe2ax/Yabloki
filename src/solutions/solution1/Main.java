package solutions.solution1;

import solutions.solution1.enitites.*;
import solutions.solution1.compare.PhoneComparison;
import solutions.solution1.util.PhoneInitializer;

public class Main {
    public static void main(String[] args) {
        PhoneComparison phoneComparison = new PhoneComparison();
        Phone[] phones = PhoneInitializer.initializePhones();
        phoneComparison.getDiffWithPhone(phones[0], phones[6]);
    }
}