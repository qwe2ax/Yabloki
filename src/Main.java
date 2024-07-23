import enitites.Iphone13;
import enitites.Iphone14;
import enitites.Iphone15;
import enitites.Iphone10;
import compare.ComparePhones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Iphone10 iphone10 = new Iphone10();
        ComparePhones comparePhones = new ComparePhones();
        Iphone15 iphone15 = new Iphone15();
        Iphone14 iphone14 = new Iphone14();
        Iphone13 iphone13 = new Iphone13();
        System.out.println(Arrays.toString(comparePhones.getDiffWithPhone(iphone10, iphone15)));
//        System.out.println(Arrays.toString(comparePhones.getDiffWithIphone15(iphone10)));
    }
}