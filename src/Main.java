import enitites.*;
import compare.ComparePhones;
import util.PhoneInitializer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparePhones comparePhones = new ComparePhones();
        Phone[] phones = PhoneInitializer.initializePhones();
        comparePhones.getDiffWithIphone15(phones[0]);
    }
}