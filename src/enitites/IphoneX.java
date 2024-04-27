package enitites;

import Interfaces.ComparablePhones;

import java.util.HashMap;
import java.util.Map;

public class IphoneX extends Phone implements ComparablePhones {

    private final static Iphone11 nextPhone = new Iphone11();

    public IphoneX() {
        super(256, 15, 5.8, new String[]{
                "1 зарплата",
                "а11",
                "нет кнопочки",
                "фейс айди",
                "монобровь",
                "фишечка2"});
    }


    @Override
    public Phone getNextPhone() {
        return nextPhone;
    }

    @Override
    public HashMap<String, Boolean> compareWithNextPhone() {
        HashMap<String, Boolean> difference = new HashMap<>();
        String[] phoneFeatures = getNextPhone().getFeatures();
        String[] currentPhoneFeatures = getFeatures();
        int minOfFeat = Math.min(currentPhoneFeatures.length, phoneFeatures.length);
        int maxOfFeat = Math.max(currentPhoneFeatures.length, phoneFeatures.length);
        for (int i = 0; i < minOfFeat; i++) {
            String currentFeature = currentPhoneFeatures[i];
            String nextFeature = phoneFeatures[i];

            if (currentFeature.equalsIgnoreCase(nextFeature)) {
                difference.put(nextFeature, true);
            } else {
                difference.put(nextFeature, false);
            }
        }

        for (int i = minOfFeat; i < maxOfFeat; i++) {
            difference.put(phoneFeatures[i], false);
        }
        return difference;
    }

}
