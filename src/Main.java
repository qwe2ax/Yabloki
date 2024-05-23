import enitites.IphoneX;
import enter_text.ComparePhones;
public class Main {
    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        ComparePhones comparePhones = new ComparePhones();
        System.out.println(comparePhones.compareWithNextPhone(iphoneX));
    }
}