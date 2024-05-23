package enter_text;

import enitites.Phone;

import java.util.HashMap;

public class ComparePhones {

    public HashMap<String, Boolean> compareWithNextPhone(Phone phone) {
        HashMap<String, Boolean> difference = new HashMap<>();
        String[] phoneFeatures = phone.getNextPhone().getFeatures();
        String[] currentPhoneFeatures = phone.getFeatures();
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
        if (phoneFeatures.length < currentPhoneFeatures.length) {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(currentPhoneFeatures[i], false);
            }
        } else {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(phoneFeatures[i], false);
            }
        }
        return difference;
    }

    public HashMap<String, Boolean> compareWithPrevPhone(Phone phone) {
        HashMap<String, Boolean> difference = new HashMap<>();
        String[] phoneFeatures = phone.getPrevPhone().getFeatures();
        String[] currentPhoneFeatures = phone.getFeatures();
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
        if (phoneFeatures.length < currentPhoneFeatures.length) {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(currentPhoneFeatures[i], false);
            }
        } else {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(phoneFeatures[i], false);
            }
        }
        return difference;
    }

}
