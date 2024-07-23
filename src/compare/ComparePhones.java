package compare;

import enitites.Phone;

import java.util.Arrays;
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

    public StringBuilder[] getDiffWithNextPhone(Phone phone) {
        Phone phone1 = phone.getNextPhone();
        String[] featuresOfCurrentPhone = phone.getFeatures();
        StringBuilder[] result = new StringBuilder[featuresOfCurrentPhone.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new StringBuilder();
        }
        while (phone1 != null) {
            String[] featuresOfNextPhone = phone1.getFeatures();
            for (int i = 0; i < featuresOfCurrentPhone.length; i++) {
                if (!featuresOfCurrentPhone[i].equals(featuresOfNextPhone[i])) {
                    result[i].append(phone.getClass().getName()).append(": ").append(featuresOfCurrentPhone[i]).append(" ")
                            .append(phone1.getClass().getName()).append(": ").append(featuresOfNextPhone[i]).append("\n");
                } else {
                    result[i].append(featuresOfNextPhone[i]).append("\n");
                }
//                if (phone1.getNextPhone().getNextPhone() == null) {
//                    return result;
//                }
            }
            System.out.println(Arrays.toString(result));
            for (StringBuilder stringBuilder : result) {
                stringBuilder.setLength(0);
            }
            phone1 = phone1.getNextPhone();
        }

        return result;


    }

}
