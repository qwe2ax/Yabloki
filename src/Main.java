import enitites.Iphone14;
import enitites.Iphone15;
import enitites.IphoneX;
import compare.ComparePhones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        ComparePhones comparePhones = new ComparePhones();
        Iphone15 iphone15 = new Iphone15();
        Iphone14 iphone14 = new Iphone14();
        System.out.println(Arrays.toString(comparePhones.getDiffWithNextPhone(iphoneX)));
    }
}